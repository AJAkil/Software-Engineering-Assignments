public class ComputerB extends Computers {

    public ComputerB() {
        this.screenWidth = 350;
        this.screenHeight = 250;
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
