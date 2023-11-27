package d6prob;

public class Television implements Electronics{
    @Override
    public boolean Switchable(boolean isSwitch) {
        if(isSwitch) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean PlaySount(boolean isPlaying) {
        return false;
    }

    @Override
    public boolean Display(boolean isOn) {
        return false;
    }

    @Override
    public boolean CookingUtensil(boolean isCooking) {
        return false;
    }
}
