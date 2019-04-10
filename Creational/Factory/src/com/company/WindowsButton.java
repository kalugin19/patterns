package com.company;

import javax.swing.*;
import java.awt.*;


public class WindowsButton  implements Button {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Windows Button!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);
        frame.setSize(640, 400);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.setFont(new Font(Font.MONOSPACED, Font.BOLD, 43));
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
}
