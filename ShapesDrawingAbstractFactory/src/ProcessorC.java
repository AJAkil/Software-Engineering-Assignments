public class ProcessorC extends Processor {
    @Override
    void setCPUname(String CPUname) {
        this.CPUname = CPUname;
    }

    @Override
    String getCPUname() {
        return this.CPUname;
    }
}
