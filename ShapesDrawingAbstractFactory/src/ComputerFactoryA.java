public class ComputerFactoryA extends AbstractFactory {

    //uses getComputer method to get object of the type Computers
    public Computers getComputer(String computerType) {

        if (computerType.equalsIgnoreCase("ComputerA")) {
            return new ComputerA(new MemoryA(), new ProcessorA());
        }
        return null;
    }

}
