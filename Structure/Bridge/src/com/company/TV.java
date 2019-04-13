package com.company;

public class TV implements IDevice {

    private int maxChannel = 500;
    private int channel = 1;
    private int currentVolume = 40;
    private boolean on = false;

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
        return currentVolume;
    }

    @Override
    public void setVolume(int percent) {
        if (on){
            if (percent<=100 && percent >=0){
                currentVolume = percent;
            } else if (percent > 100){
                currentVolume = 100;
            } else {
                currentVolume = 0;
            }
        } else {
            System.out.println("TV is disable");
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (on){
            if (channel > 0 && channel <= maxChannel){
                this.channel = channel;
            } else  if (channel > maxChannel){
                this.channel = maxChannel;
            } else {
                this.channel = 1;
            }
        } else {
            System.out.println("TV is disable");
        }

    }

    @Override
    public void printStatus() {
        if (on){
            System.out.println("===================================================");
            System.out.println("TV");
            System.out.println("Channel: "+ channel);
            System.out.println("Volume: "+ currentVolume);
            System.out.println("===================================================");
        } else {
            System.out.println("TV is disable");
        }
    }
}
