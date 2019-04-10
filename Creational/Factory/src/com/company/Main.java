package com.company;

public class Main {

    private static final String LINUX = "linux";
    private static final String WINDOWS = "windows";

    public static void main(String[] args) {
        Dialog dialog = getDialog();
        dialog.renderWindow();
    }

    private static Dialog getDialog(){
        String OS = System.getProperty("os.name").toLowerCase();
        if (OS.equals(LINUX)){
            return new LinuxDialog();
        } else if (OS.equals(WINDOWS)){
            return new WindowsDialog();
        } else {
            throw new RuntimeException("Unknown OS");
        }
    }
}
