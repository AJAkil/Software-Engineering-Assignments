public class ComputerFactory {

    //uses getComputer method to get object of the type Computers
    public Computers getComputer(String computerType) {

        if (computerType.equalsIgnoreCase("ComputerA")) {
            return new ComputerA(new MemoryA(), new ProcessorA());
        } else if (computerType.equalsIgnoreCase("ComputerB")) {
            return new ComputerB(new MemoryB(), new ProcessorB());
        } else if (computerType.equalsIgnoreCase("ComputerC")) {
            return new ComputerC(new MemoryC(), new ProcessorC());
        }
        return null;
    }
}
