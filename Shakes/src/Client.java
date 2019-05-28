import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void Options(){

        System.out.println("Press Q to quit the menu");
        System.out.println("Press O to start an order");
        System.out.println("Press E to end an order");

    }

    public static void shakesMenu(){

        System.out.println("You have to place an order before closing it.Here are the choices:"+"\n");
        System.out.println("SHAKE               PRICE(base Price)");
        System.out.println("1.Chocolate_Shake   Tk 230");
        System.out.println("2.Coffee_Shake      Tk 230");
        System.out.println("3.Strawberry_Shake  Tk 200");
        System.out.println("4.Vanilla_Shake     Tk 190");
        System.out.println("5.Zero_Shake        Tk 240");
        System.out.println();
        System.out.println("Press the corresponding number of the shake you want to order.Press E to end order.Press Q to Quit the shake menu after placing an order");

    }

    public static void milkOptions(){

        System.out.println("Here are your milk options:");
        System.out.println("1.Regular");
        System.out.println("2.Almond Milk"+"\n");
    }

    public static void toppingOptions(){

        System.out.println("You have the listed toppings:");
        System.out.println("TOPPING   PRICE");
        System.out.println("1.Candy   Tk 50");
        System.out.println("2.Cookie  Tk 40");
        System.out.println("Enter the corresponding number of the topping you want to add to the shake: "+"\n");

    }

    public static void addingMilk(Shakes shakeobj){

        Scanner scannerObj = new Scanner(System.in);
        String menuChoice;

        System.out.println("If you are lactose Intolerant you can go for Almond Milk(adds 60Tk per shake)");
        System.out.println("Do you want to make shake lactose free?");
        System.out.println("Press Y for YES N for NO"+"\n");



        while(true){

            menuChoice = scannerObj.nextLine();

            if(menuChoice.equalsIgnoreCase("y")){

                shakeobj.changeMilk("Almond milk");
                break;

            }else if(menuChoice.equalsIgnoreCase("n")){

                shakeobj.changeMilk("regular");
                break;

            }else{
                System.out.println("Wrong Choice. Please try again.");
            }

        }

    }

    public static void addingTopings(Shakes shakeobj){

        Scanner scannerObj = new Scanner(System.in);
        String menuChoice;

        System.out.println("Do you want to add Toppings?");

        System.out.println("Press Y for YES N for NO");

        while(true){

            menuChoice = scannerObj.nextLine();

            if(menuChoice.equalsIgnoreCase("y")){

                toppingOptions();

                menuChoice  = scannerObj.nextLine();

                if(menuChoice.equalsIgnoreCase("1")){

                    shakeobj.Toppings("candy");
                    break;

                }else if(menuChoice.equalsIgnoreCase("2")){

                    shakeobj.Toppings("cookie");
                    break;

                }else{

                    System.out.println("Wrong Choice. Please try again");
                }

            }else if(menuChoice.equalsIgnoreCase("n")){

                System.out.println("Your order is recorded");
                break;

            }else{

                System.out.println("Wrong Choice. Please try again!");
            }
        }

    }

    public static void main(String[] args) {

        Director director = new Director();
        Shakes shakeobj;
        String menuChoice;
        ShakeProduct p;
        int countOrder = 0;
        int totalBill = 0;
        int checker = 0;
        ArrayList<Shakes>Orders = new ArrayList<Shakes>();

        Scanner scannerObj = new Scanner(System.in);

        while (true){

            System.out.println("Welcome To ShakeShack!!");

            Options();

            menuChoice = scannerObj.nextLine();

            if(menuChoice.equals("Q")){

                break;

            }else if(menuChoice.equals("O")){

                while(true){

                    shakesMenu();

                    menuChoice = scannerObj.nextLine();

                    if(menuChoice.equals("1")){

                        shakeobj = new ChocolateShakeBuilder();
                        countOrder++;

                        milkOptions();

                        addingMilk(shakeobj);

                        addingTopings(shakeobj);

                        Orders.add(shakeobj);
                        director.produceShake(shakeobj);

                    }else if(menuChoice.equals("2")){

                        shakeobj = new CoffeeShakeBuilder();

                        countOrder++;

                        milkOptions();
                        addingMilk(shakeobj);
                        addingTopings(shakeobj);

                        Orders.add(shakeobj);
                        director.produceShake(shakeobj);

                    }else if(menuChoice.equals("3")){

                        shakeobj = new StrawberryShakeBuilder();

                        countOrder++;

                        milkOptions();
                        addingMilk(shakeobj);
                        addingTopings(shakeobj);

                        Orders.add(shakeobj);
                        director.produceShake(shakeobj);

                    }else if(menuChoice.equals("4")){

                        shakeobj = new VanillaShakeBuilder();

                        countOrder++;

                        milkOptions();
                        addingMilk(shakeobj);
                        addingTopings(shakeobj);

                        Orders.add(shakeobj);
                        director.produceShake(shakeobj);

                    }else if(menuChoice.equals("5")){

                        shakeobj = new ZeroShakeBuilder();

                        countOrder++;

                        milkOptions();
                        addingMilk(shakeobj);
                        addingTopings(shakeobj);

                        Orders.add(shakeobj);
                        director.produceShake(shakeobj);

                    }else if(menuChoice.equalsIgnoreCase("E")){

                        if(countOrder==0){

                            System.out.println("you have to place at least an order");

                        }else{

                            System.out.println("Your Order has been placed.The details are: ");

                            for(int i =0;i<Orders.size();i++){

                                System.out.println("#Shake No: "+(i+1));

                                p = Orders.get(i).getShakeProduct();
                                p.PrintComponents();
                                totalBill = totalBill+p.getPrice();

                                System.out.println();
                            }

                            System.out.println("TOTAL: "+totalBill);
                            System.out.println();

                            checker = countOrder;
                            totalBill = 0;
                            countOrder = 0;

                            Orders = new ArrayList<Shakes>();

                        }

                    }else if(menuChoice.equals("O")){

                        System.out.println("You cannot open an order while an order is taking place. Do you want to add something to the order?");
                        System.out.println("Press Y for yes N for no");

                        menuChoice = scannerObj.nextLine();

                        if(menuChoice.equalsIgnoreCase("y")){

                            continue;

                        }else if(menuChoice.equalsIgnoreCase("n")){

                            if(countOrder==0){

                                System.out.println("you have to place at least an order"+"\n");

                            }else{

                                System.out.println("Your Order has been placed.The details are: "+"\n");

                                for(int i =0;i<Orders.size();i++){

                                    System.out.println("Shake No: "+(i+1));
                                    System.out.println();

                                    p = Orders.get(i).getShakeProduct();
                                    p.PrintComponents();
                                    totalBill = totalBill+p.getPrice();

                                    System.out.println();
                                }

                                System.out.println("TOTAL: Tk"+totalBill);
                                System.out.println();

                                totalBill = 0;
                                countOrder = 0;

                                Orders = new ArrayList<Shakes>();
                            }


                        }

                    }else if(menuChoice.equals("Q")){

                        if(checker!=0) break;

                    }
                }



            }


        }

    }

}
