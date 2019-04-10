package com.company.windows;

import com.company.Button;
import com.company.EditText;
import com.company.UIFactory;

public class WindowsFactory implements UIFactory {


    private static WindowsFactory windowsFactory;

    private WindowsFactory() {
    }

    public static  UIFactory newInstance(){
        if (windowsFactory == null){
            windowsFactory = new WindowsFactory();
        }
        return windowsFactory;
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public EditText createEditText() {
        return new WindowsEditText();
    }
}
