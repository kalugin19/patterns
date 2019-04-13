package com.company;

public class BasicRemote implements IRemote {

    private final IDevice device;

    public BasicRemote(IDevice device) {
        this.device = device;
    }

    @Override
    public void increase() {
        int volume = device.getVolume() + 10;
        device.setVolume(volume);
    }

    @Override
    public void decrease() {
        int volume = device.getVolume() - 10;
        device.setVolume(volume);
    }

    @Override
    public void up() {
        int channel = device.getChannel() + 1;
        device.setChannel(channel);
    }

    @Override
    public void down() {
        int channel = device.getChannel() - 1;
        device.setChannel(channel);
    }

    @Override
    public void enable() {
        if (!device.isEnabled()){
            device.enable();
        }
    }

    @Override
    public void disable() {
        if (device.isEnabled()){
            device.disable();
        }
    }

    @Override
    public void info() {
        device.printStatus();
    }
}
