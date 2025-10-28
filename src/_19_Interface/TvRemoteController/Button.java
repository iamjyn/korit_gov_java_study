package _19_Interface.TvRemoteController;

import _19_Interface.TvRemoteController.Press;
import _19_Interface.TvRemoteController.Down;

/*
* extends 단일상속
* implements 다중상속
*/
public abstract class Button implements _19_Interface.TvRemoteController.Press, Up, _19_Interface.TvRemoteController.Down {
    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {

    }

    @Override
    public void onDown() {

    }

}
