abstract class Shakes {

    protected int price;
    protected String milk;
    protected String sweeteningAgent;
    protected String ingredient1;
    protected String ingredient2;
    protected String topping1;

    abstract void addName();
    abstract void addMilk();
    abstract void addIng1();
    abstract void addIng2();
    abstract void addSweet();
    abstract void addTopping1();
    abstract void addPrice();
    abstract ShakeProduct getShakeProduct();
    abstract void changeMilk(String milktype);
    abstract void Toppings(String toppings);
}
