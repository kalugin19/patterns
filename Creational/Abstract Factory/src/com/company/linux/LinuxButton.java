package com.company.linux;

import com.company.Button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LinuxButton implements Button {
    @Override
    public JButton render() {
        JButton button;
        button = new JButton("Linux");
        button.setBorderPainted(false);
        button.setBackground(Color.cyan);
        button.setFont(new Font(Font.SERIF, Font.ITALIC, 38));
        button.addActionListener(e -> System.exit(0));
        return button;
    }
}
