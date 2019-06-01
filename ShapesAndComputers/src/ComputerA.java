public class ComputerA extends Computers {

    public ComputerA() {
        this.screenWidth = 200;
        this.screenHeight = 200;
    }

    @Override
    double getScreenWidth() {
        return this.screenWidth;
    }

    @Override
    double getScreenHeight() {
        return this.screenHeight;
    }

}
