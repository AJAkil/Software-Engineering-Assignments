public class Director {

    Shakes shakebuilder;

    public void produceShake(Shakes shake){

        shakebuilder = shake;

        shakebuilder.addName();
        shakebuilder.addMilk();
        shakebuilder.addIng1();
        shakebuilder.addIng2();
        shakebuilder.addSweet();
        shakebuilder.addTopping1();
        shakebuilder.addPrice();

    }
}
