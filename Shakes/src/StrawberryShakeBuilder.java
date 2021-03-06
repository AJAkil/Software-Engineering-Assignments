public class StrawberryShakeBuilder extends Shakes {
    ShakeProduct shakeproduct = new ShakeProduct();

    public StrawberryShakeBuilder(){
        this.milk = "Regular";
        this.sweeteningAgent = "sugar";
        this.ingredient1 = "strawberry_syrup";
        this.ingredient2 = "strawberry_icecream";
        this.price = 200;
        this.topping1 = null;
    }

    @Override
    void addMilk() {
        shakeproduct.addComponent("Milk: "+milk);
    }

    @Override
    void addIng1() {
        shakeproduct.addComponent(ingredient1);
    }

    @Override
    void addIng2() {
        shakeproduct.addComponent(ingredient2);
    }

    @Override
    void addSweet() {
        shakeproduct.addComponent(sweeteningAgent);
    }

    @Override
    void addTopping1() {
        shakeproduct.addComponent(topping1);
    }

    @Override
    ShakeProduct getShakeProduct() {
        return shakeproduct;
    }


    @Override
    void addName() {
        shakeproduct.addComponent("Strawberry_Shake");
    }

    @Override
    void addPrice() {

        String extraMessage = null;

        if(topping1!=null && milk.equalsIgnoreCase("regular")){

            if(topping1.equalsIgnoreCase("candy")){

                extraMessage = "Increase of Price by 50Tk due to candy Topping.";

            }else{

                extraMessage = "Increase of Price by 40Tk due to cookie Topping.";
            }

        }else if(topping1==null && milk.equalsIgnoreCase("Almond milk")){

            extraMessage = "Increase of Price by 60Tk due to Almond Milk";

        }else if(topping1!=null && milk.equalsIgnoreCase("Almond Milk")){

            if(topping1.equalsIgnoreCase("candy")){

                extraMessage = "Increase of Price by 110Tk due to Almond Milk(60Tk) and candy(50Tk) toppings.";

            }else{

                extraMessage = "Increase of Price by 100Tk due to Almond Milk(60Tk) and cookie(40Tk) toppings.";
            }
        }


        if(extraMessage!=null){

            shakeproduct.addComponent("Price:Tk "+Integer.toString(price)+"\n"+extraMessage);
        }else{

            shakeproduct.addComponent("Price:Tk "+Integer.toString(price));
        }

    }

    @Override
    void changeMilk(String milktype) {

        if(milktype.equalsIgnoreCase("Regular")){

            this.price = 200;
            this.milk = "Regular";


        }else if(milktype.equalsIgnoreCase("Almond Milk")){

            this.milk = "Almond Milk";
            this.price = this.price+60;

        }else{

            System.out.println("Sorry,your choice is not available. Please choose from the listings");

        }

    }

    @Override
    void Toppings(String toppings) {

        if(topping1==null){

            if(toppings.equalsIgnoreCase("candy")){

                this.topping1 = "candy";
                this.price = this.price+50;


            }else if(toppings.equalsIgnoreCase("cookie")){

                this.topping1 = "cookie";
                this.price = this.price+40;

            }else{

                System.out.println("Sorry,your choice is not available. Please choose from the listings");
            }

        }
    }
}
