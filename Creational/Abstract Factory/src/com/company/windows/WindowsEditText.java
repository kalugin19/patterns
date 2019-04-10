package com.company.windows;

import com.company.EditText;

import javax.swing.*;
import java.awt.*;

public class WindowsEditText implements EditText {
    @Override
    public JTextField render() {
        JTextField textField = new JTextField();
        textField.setSize(100, 30);
        textField.setText("Windows");
        textField.setFont(new Font(Font.MONOSPACED, Font.BOLD, 43));
        return textField;
    }
}
