public class ComputerFactoryC extends AbstractFactory {

    //uses getComputer method to get object of the type Computers
    public Computers getComputer(String computerType) {

        if (computerType.equalsIgnoreCase("ComputerC")) {
            return new ComputerC(new MemoryC(), new ProcessorC());
        }
        return null;
    }
}
