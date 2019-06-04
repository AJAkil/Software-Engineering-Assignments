public class ComputerFactoryB extends AbstractFactory {
    //uses getComputer method to get object of the type Computers
    public Computers getComputer(String computerType) {

        if (computerType.equalsIgnoreCase("ComputerB")) {
            return new ComputerB(new MemoryB(), new ProcessorB());
        }
        return null;
    }
}
