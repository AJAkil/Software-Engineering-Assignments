public class ZeroShakeBuilder extends Shakes {


    ShakeProduct shakeproduct = new ShakeProduct();

    public ZeroShakeBuilder(){
        this.milk = "Regular";
        this.sweeteningAgent = "Sweetener";
        this.ingredient1 = "vanilla_flavoring";
        this.ingredient2 = "sugar_free_jello";
        this.price = 240;
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
    void addTopping2() {
        shakeproduct.addComponent(topping2);
    }

    @Override
    ShakeProduct getShakeProduct() {
        return shakeproduct;
    }

    @Override
    void addName() {
        shakeproduct.addComponent("Zero_Shake");
    }

    @Override
    void addPrice() {

        String extraMessage = null;

        if(topping1!=null && topping2!=null && milk.equalsIgnoreCase("regular")){

            extraMessage = "Increase of Price by 90Tk due to candy(50Tk) and cookie(40Tk) toppings.";

        }else if(topping1!=null && topping2!=null && milk.equalsIgnoreCase("almond milk")){

            extraMessage = "Increase of Price by 150Tk due to Almond Milk(60Tk) and candy(50Tk) and cookie(40Tk) toppings.";

        }else if(topping1!=null && milk.equalsIgnoreCase("regular")){

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

            this.price = 240;
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

        }else if(topping1!=null && topping2==null){

            if(topping1.equalsIgnoreCase(toppings)){

                System.out.println("You have already added this topping");

            }else{

                if(toppings.equalsIgnoreCase("candy")){

                    this.topping2 = "candy";
                    this.price = this.price+50;


                }else if(toppings.equalsIgnoreCase("cookie")){

                    this.topping2 = "cookie";
                    this.price = this.price+40;

                }else{

                    System.out.println("Sorry,your choice is not available. Please choose from the listings");
                }
            }


        }else if(topping1!=null && topping2!=null){

            System.out.println("You have already added maximum topping");
        }

    }
}
