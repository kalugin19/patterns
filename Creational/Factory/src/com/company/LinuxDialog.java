package com.company;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
