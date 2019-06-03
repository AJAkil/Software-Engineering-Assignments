public class ComputerFactory {

    //uses getComputer method to get object of the type Computers
    public Computers getComputer(String computerType){

        if(computerType.equalsIgnoreCase("ComputerA")){
            return new ComputerA();
        }else if(computerType.equalsIgnoreCase("ComputerB")){
            return new ComputerB();
        }else if(computerType.equalsIgnoreCase("ComputerC")){
            return new ComputerC();
        }
        return null;
    }
}
