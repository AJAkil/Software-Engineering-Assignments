public class ComputerC extends Computers {

    public ComputerC(MemoryC Memory, ProcessorC Processor) {
        this.screenWidth = 550;
        this.screenHeight = 430;
        this.MMU = Memory;
        this.CPU = Processor;
        MMU.setMMUname("MMUC");
        CPU.setCPUname("CPUC");
    }

    @Override
    double getScreenWidth() {
        return this.screenWidth;
    }

    @Override
    double getScreenHeight() {
        return this.screenHeight;
    }

    @Override
    String getCPUname() {
        return CPU.getCPUname();
    }

    @Override
    String getMMUname() {
        return MMU.getMMUname();
    }
}
