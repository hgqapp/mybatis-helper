package com.hgqapp.mybatis.generator.ui;

import javax.swing.*;

/**
 * @author hougg
 * @version 1.0.0
 * @since 2019/12/25 16:42
 */
public class SelectedForm {
    private JPanel container;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField txtMapper;
    private JLabel lblModule;
    private JLabel lblMapper;
    private JButton chsModel;
    private JButton chsMapper;
    private JTextField txtModel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SelectedForm");
        frame.setContentPane(new SelectedForm().container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
