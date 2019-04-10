package com.company;

import com.company.linux.LinuxFactory;
import com.company.windows.WindowsFactory;

import javax.swing.*;
import java.awt.*;

public class Dialog {

    private JFrame jFrame;
    private JPanel jPanel;
    private static final String LINUX = "linux";
    private static final String WINDOWS = "windows";

     private UIFactory factory(){
        String OS = System.getProperty("os.name").toLowerCase();
        if (OS.contains(LINUX)){
            return LinuxFactory.newInstance();
        } else if (OS.contains(WINDOWS)){
            return WindowsFactory.newInstance();
        } else {
            throw new RuntimeException("Unknown OS");
        }
    }

    void showDialog(){
         jFrame = new JFrame();
         jPanel = new JPanel();
         Button button = factory().createButton();
         EditText editText = factory().createEditText();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
        jPanel.add(editText.render());
        jPanel.add(button.render());
        jFrame.setSize(640, 400);
        jFrame.setVisible(true);
    }

}
