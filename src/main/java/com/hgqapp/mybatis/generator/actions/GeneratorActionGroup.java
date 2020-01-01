package com.hgqapp.mybatis.generator.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 菜单组
 * @author hougg
 * @version 1.0.0
 * @since 2019/12/24 13:04
 */
public class GeneratorActionGroup extends DefaultActionGroup {


    @NotNull
    @Override
    public AnAction[] getChildren(@Nullable AnActionEvent e) {
        return new AnAction[0];
    }
}
