package ObjectorientedProgramming.Abstraction.MultipleInheritanceInterface;

public class Mobilephone implements Call ,Camera,MusicPlayer{
    public void startcall(String number){

        System.out.println("enter number ");
    }

    @Override
    public void endcall() {
        System.out.println("fjewiundsh");
    }

    @Override
    public void clickPhoto() {

    }

    @Override
    public void showPhoto() {

    }

    @Override
    public void startmusic() {

    }

    @Override
    public void stopmusic() {

    }
}
