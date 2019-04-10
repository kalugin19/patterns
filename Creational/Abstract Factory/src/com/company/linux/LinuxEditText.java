package com.company.linux;

import com.company.EditText;

import javax.swing.*;
import java.awt.*;

public class LinuxEditText implements EditText {

    @Override
    public JTextField render() {
        JTextField textField = new JTextField();
        textField.setSize(130, 40);
        textField.setText("Linux");
        textField.setBackground(Color.GRAY);
        textField.setFont(new Font(Font.SERIF, Font.ITALIC, 38));
        return textField;
    }
}
