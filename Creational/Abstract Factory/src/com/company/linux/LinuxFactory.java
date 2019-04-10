package com.company.linux;

import com.company.Button;
import com.company.EditText;
import com.company.UIFactory;

public class LinuxFactory implements UIFactory {

    private static LinuxFactory linuxFactory;

    private LinuxFactory(){
    }

    public static  UIFactory newInstance(){
        if (linuxFactory == null){
            linuxFactory = new LinuxFactory();
        }
        return linuxFactory;
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public EditText createEditText() {
        return new LinuxEditText();
    }
}
