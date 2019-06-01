public class ComputerC extends Computers {

    public ComputerC() {
        this.screenWidth = 550;
        this.screenHeight = 430;
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
