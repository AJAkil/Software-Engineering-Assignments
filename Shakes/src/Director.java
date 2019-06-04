public class Director {

    private Shakes shakebuilder;

    public void milkChanger(String milktype) {
        shakebuilder.changeMilk(milktype);
    }

    public void toppingsAdder(String toppings) {
        shakebuilder.Toppings(toppings);
    }

    public Shakes getShake() {
        return shakebuilder;
    }

    public void setShake(Shakes shake) {
        this.shakebuilder = shake;
    }

    public void produceShake() {

        shakebuilder.addName();
        shakebuilder.addMilk();
        shakebuilder.addIng1();
        shakebuilder.addIng2();
        shakebuilder.addSweet();
        shakebuilder.addTopping1();
        shakebuilder.addPrice();

    }
}
