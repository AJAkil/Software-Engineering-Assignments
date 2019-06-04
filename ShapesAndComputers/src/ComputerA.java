public class ComputerA extends Computers {

    public ComputerA(MemoryA Memory, ProcessorA Processor) {
        this.screenWidth = 200;
        this.screenHeight = 200;
        this.CPU = Processor;
        this.MMU = Memory;
        MMU.setMMUname("MMUA");
        CPU.setCPUname("CPUA");
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

    @Override
    String getName() {
        return "ComputerA";
    }
}
