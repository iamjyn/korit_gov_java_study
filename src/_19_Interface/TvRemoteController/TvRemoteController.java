package _19_Interface.TvRemoteController;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelUp channelUp;
    private ChannelDown channelDown;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelUp channelUp, ChannelDown channelDown, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUp = channelUp;
        this.channelDown = channelDown;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDown.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDown.onDown();
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUp.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelDown.onUp();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }






}
