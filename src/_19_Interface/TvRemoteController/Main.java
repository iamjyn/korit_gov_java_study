package _19_Interface.TvRemoteController;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUp(),
                new ChannelDown(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onDownVolumeDownButton();

    }
}
