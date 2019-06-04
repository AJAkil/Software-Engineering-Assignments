abstract class Computers {

    protected double screenWidth;
    protected double screenHeight;
    protected Processor CPU;
    protected MemoryUnit MMU;

    abstract double getScreenWidth();
    abstract double getScreenHeight();
    abstract String getCPUname();
    abstract String getMMUname();
    abstract String getName();
}
