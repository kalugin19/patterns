package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LinuxButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Linux Button!");
        label.setOpaque(true);
        label.setBackground(new Color(192, 164, 164));
        label.setFont(new Font("Dialog", Font.ITALIC, 32));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);
        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.setBackground(Color.GREEN);
        button.setFont(Font.getFont("italic"));
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }

}
