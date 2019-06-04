public class FactoryProducer {
    public  static AbstractFactory getFactory(String Choice){
        if(Choice.equalsIgnoreCase("ComputerA")){
                return new ComputerFactoryA();
        } else if (Choice.equalsIgnoreCase("ComputerB")) {
                return new ComputerFactoryB();
        }else if(Choice.equalsIgnoreCase("ComputerC")){
                return new ComputerFactoryC();
        }
        return null;
    }
}
