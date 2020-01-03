package com.hgqapp.mybatis.generator.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author hougg
 * @version 1.0.0
 * @since 2019/12/25 16:42
 */
public class MybatisGeneratorDialog extends DialogWrapper {
    private final Project myProject;
    private JPanel myRootPanel;
    private JLabel modelLabel;
    private JTextField modelTextField;
    private JButton modelChooseButton;
    private JLabel mapperLabel;
    private JTextField mapperTextField;
    private JButton mapperChooseButton;

    public  MybatisGeneratorDialog(final Project project) {
        super(project, true);
        myProject = project;
        setTitle("MyBatis Generator");
        setOKButtonText("Ok...");
        init();
    }

    public void handle() {
        System.out.println(modelTextField.getText());
        System.out.println(mapperTextField.getText());
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return myRootPanel;
    }

    @Override
    protected String getHelpId() {
        return "MybatisGeneratorDialog";
    }

}
