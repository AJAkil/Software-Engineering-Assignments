public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        Shakes sobj = new ChocolateShakeBuilder();
        sobj.Toppings("candy");
        sobj.changeMilk("almond milk");
        sobj.Toppings("candy");


        director.produceShake(sobj);

        ShakeProduct p1 = sobj.getShakeProduct();

        p1.PrintComponents();

        System.out.println(p1.getPrice());
    }

}
