package com.company;

public class SplitSystem  implements IDevice{

    private boolean on = false;
    private int temperature = 19;
    private int minTemperature = 16;
    private int maxTemperature = 30;
    private int maxMode = 3;
    private int mode = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return temperature;
    }

    @Override
    public void setVolume(int percent) {
        if (on){
            if (percent >= minTemperature && percent <= maxTemperature){
                temperature = percent;
            }
        } else {
            System.out.println("Split is disabled");
        }
    }

    @Override
    public int getChannel() {
        return mode;
    }

    @Override
    public void setChannel(int channel) {
        if (on){
            if (channel >= 1 && channel <= maxMode){
                mode = channel;
            }
        } else {
            System.out.println("Split is disabled");
        }
    }

    @Override
    public void printStatus() {
        if (on){
            System.out.println("===================================================");
            System.out.println("Split System");
            System.out.println("Mode: "+ mode);
            System.out.println("Temperature: " + temperature + "C");
            System.out.println("===================================================");
        } else {
            System.out.println("TV is disable");
        }
    }
}
