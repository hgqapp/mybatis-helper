package com.hgqapp.mybatis.generator.actions;

import com.hgqapp.mybatis.generator.ui.MybatisGeneratorDialog;
import com.intellij.database.psi.DbTableImpl;
import com.intellij.dvcs.DvcsUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.application.AccessToken;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vcs.VcsNotifier;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * @author hougg
 * @version 1.0.0
 * @since 2019/12/24 13:48
 */
public class GeneratorAction extends AnAction {

    @Override
    public void update(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        Presentation presentation = e.getPresentation();
        // 如果没有打开 Project，则隐藏菜单
        if (project == null) {
            presentation.setVisible(false);
            return;
        }
        PsiElement[] selectedElements = e.getData(LangDataKeys.PSI_ELEMENT_ARRAY);
        if (selectedElements == null || selectedElements.length == 0) {
            presentation.setVisible(false);
            return;
        }
        for (PsiElement selectedElement : selectedElements) {
            if (!(selectedElement instanceof DbTableImpl)) {
                presentation.setVisible(false);
                return;
            }
        }

    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        MybatisGeneratorDialog dialog = new MybatisGeneratorDialog(project);
        if (!dialog.showAndGet()) {
            return;
        }
        new Task.Backgroundable(project, "xxxx", false) {
            @Override
            public void run(@NotNull ProgressIndicator indicator) {
                dialog.handle();
            }
        }.queue();
    }
}
