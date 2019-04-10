package com.company.windows;

import com.company.Button;

import javax.swing.*;
import java.awt.*;

public class WindowsButton implements Button {

    @Override
    public JButton render() {
        JButton button;
        button = new JButton("Windows");
        button.setFont(new Font(Font.MONOSPACED, Font.BOLD, 43));
        button.addActionListener(e -> System.exit(0));
        return button;
    }
}
