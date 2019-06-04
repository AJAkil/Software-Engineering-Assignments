public class ProcessorA extends Processor {
    @Override
    String getCPUname() {
        return this.CPUname;
    }

    @Override
    void setCPUname(String CPUname) {
        this.CPUname = CPUname;
    }
}
