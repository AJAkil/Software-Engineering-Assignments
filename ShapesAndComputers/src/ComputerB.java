public class ComputerB extends Computers {

    public ComputerB(MemoryB Memory,ProcessorB Processor) {
        this.screenWidth = 350;
        this.screenHeight = 250;
        this.MMU = Memory;
        this.CPU = Processor;
        MMU.setMMUname("MMUB");
        CPU.setCPUname("CPUB");
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
