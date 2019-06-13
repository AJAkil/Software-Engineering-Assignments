import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void Options() {

        System.out.println("Press Q to quit the this menu");
        System.out.println("Press O to start an order");
        System.out.println("Press E to end an order");

    }

    public static void shakesMenu() {

        System.out.println("Here are the choices:" + "\n");
        System.out.println("NB: YOU CANNOT CHANGE AN ORDER ONCE IT IS PLACED.");
        System.out.println("################ MENU ################" + "\n");
        System.out.println("SHAKE               PRICE(base Price)");
        System.out.println("1.Chocolate_Shake   Tk 230");
        System.out.println("2.Coffee_Shake      Tk 230");
        System.out.println("3.Strawberry_Shake  Tk 200");
        System.out.println("4.Vanilla_Shake     Tk 190");
        System.out.println("5.Zero_Shake        Tk 240");
        System.out.println();
        System.out.println("Press the corresponding number of the shake you want to order.");
        System.out.println("Press E to end order.Press P to Quit the shake menu after Ending an order." + "\n");
        System.out.println("################ xxxx ################");

    }

    public static void milkOptions() {

        System.out.println("Here are your milk options:");
        System.out.println("1.Regular");
        System.out.println("2.Almond Milk");
    }

    public static void toppingOptions() {

        System.out.println("You have the listed toppings:");
        System.out.println("TOPPING   PRICE");
        System.out.println("1.Candy   Tk 50");
        System.out.println("2.Cookie  Tk 40");
        System.out.println("Enter the corresponding number of the topping you want to add to the shake: " + "\n");

    }

    public static void addingMilk(Director director) {

        Scanner scannerObj = new Scanner(System.in);
        String menuChoice;

        System.out.println("If you are lactose Intolerant you can go for Almond Milk(adds 60Tk per shake)");
        System.out.println("Do you want to make shake lactose free?");
        System.out.println("Press Y for YES N for NO");


        while (true) {

            menuChoice = scannerObj.nextLine();

            if (menuChoice.equals("Y")) {

                director.milkChanger("Almond milk");
                System.out.println();
                System.out.println("you have chosen Almond milk. Your shake is now lactose free." + "\n");
                break;

            } else if (menuChoice.equals("N")) {

                director.milkChanger("regular");
                break;

            } else {
                System.out.println("Wrong Choice. Please try again." + "\n");
            }

        }

    }

    public static void addingToppings(Director director) {

        Scanner scannerObj = new Scanner(System.in);
        String menuChoice;
        boolean toppings = false;

        System.out.println("You can add a single topping to the shake. Do you want to add one?");

        System.out.println("Press Y for YES N for NO");

        while (true) {

            menuChoice = scannerObj.nextLine();

            if (menuChoice.equals("Y")) {

                while (true) {

                    toppingOptions();

                    menuChoice = scannerObj.nextLine();

                    if (menuChoice.equalsIgnoreCase("1")) {

                        director.toppingsAdder("candy");
                        System.out.println("You Have chosen Candy as your topping.");
                        System.out.println("Your order is recorded." + "\n");
                        toppings = true;
                        break;

                    } else if (menuChoice.equalsIgnoreCase("2")) {

                        director.toppingsAdder("cookie");
                        System.out.println("You have chosen Cookie as your topping.");
                        System.out.println("Your order is recorded." + "\n");
                        toppings = true;
                        break;

                    } else {

                        System.out.println("Wrong Choice. Please try again!" + "\n");
                    }
                }

            } else if (menuChoice.equals("N")) {

                System.out.println("Your order is recorded." + "\n");
                break;

            } else {

                System.out.println("Wrong Choice. Please try again!" + "\n");
            }

            if (toppings) break;
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
        ArrayList<Shakes> Orders = new ArrayList<Shakes>();

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Welcome To ShakeShack!!!" + "\n");

        while (true) {

            Options();

            menuChoice = scannerObj.nextLine();

            if (menuChoice.equals("Q")) {

                System.out.println("Thanks for the visit. We hope you had a great shake!!");
                break;

            } else if (menuChoice.equals("O")) {

                while (true) {

                    shakesMenu();

                    menuChoice = scannerObj.nextLine();

                    if (menuChoice.equals("1")) {

                        shakeobj = new ChocolateShakeBuilder();
                        director.setShake(shakeobj);
                        countOrder++;

                        milkOptions();
                        addingMilk(director);
                        addingToppings(director);
                        director.produceShake();
                        Orders.add(director.getShake());

                    } else if (menuChoice.equals("2")) {

                        shakeobj = new CoffeeShakeBuilder();
                        director.setShake(shakeobj);
                        countOrder++;

                        milkOptions();
                        addingMilk(director);
                        addingToppings(director);
                        director.produceShake();
                        Orders.add(director.getShake());

                    } else if (menuChoice.equals("3")) {

                        shakeobj = new StrawberryShakeBuilder();
                        director.setShake(shakeobj);
                        countOrder++;

                        milkOptions();
                        addingMilk(director);
                        addingToppings(director);
                        director.produceShake();
                        Orders.add(director.getShake());

                    } else if (menuChoice.equals("4")) {

                        shakeobj = new VanillaShakeBuilder();
                        director.setShake(shakeobj);
                        countOrder++;

                        milkOptions();
                        addingMilk(director);
                        addingToppings(director);
                        director.produceShake();
                        Orders.add(director.getShake());

                    } else if (menuChoice.equals("5")) {

                        shakeobj = new ZeroShakeBuilder();
                        director.setShake(shakeobj);
                        countOrder++;

                        milkOptions();
                        addingMilk(director);
                        addingToppings(director);
                        director.produceShake();
                        Orders.add(director.getShake());

                    } else if (menuChoice.equalsIgnoreCase("E")) {

                        if (countOrder == 0) {

                            System.out.println("You have to place at least an order before closing the order!" + "\n");

                        } else {

                            System.out.println("Your Order has been placed. The details are: ");

                            System.out.println("################ ORDER DETAILS ################" + "\n");

                            for (int i = 0; i < Orders.size(); i++) {

                                System.out.println("#Shake No: " + (i + 1));

                                p = Orders.get(i).getShakeProduct();
                                p.PrintComponents();
                                totalBill = totalBill + p.getPrice();

                                System.out.println();
                            }

                            System.out.println("TOTAL: Tk" + totalBill);
                            System.out.println("################ xxxx ################" + "\n");

                            checker = countOrder;
                            totalBill = 0;
                            countOrder = 0;

                            Orders = new ArrayList<Shakes>();

                        }

                    } else if (menuChoice.equals("O")) {

                        System.out.println("You cannot open an order while an order is taking place. Do you want to add something to the order?" + "\n");
                        System.out.println("Press Y for yes N for no" + "\n");

                        menuChoice = scannerObj.nextLine();

                        if (menuChoice.equals("Y")) {

                            continue;

                        } else if (menuChoice.equals("N")) {

                            if (countOrder == 0) {

                                System.out.println("You have to place at least an order" + "\n");

                            } else {

                                System.out.println();

                                System.out.println("################ ORDER DETAILS ################" + "\n");

                                System.out.println("Your Order has been placed.The details are: " + "\n");

                                for (int i = 0; i < Orders.size(); i++) {

                                    System.out.println("Shake No: " + (i + 1));
                                    System.out.println();

                                    p = Orders.get(i).getShakeProduct();
                                    p.PrintComponents();
                                    totalBill = totalBill + p.getPrice();

                                    System.out.println();
                                }

                                System.out.println("TOTAL: Tk" + totalBill);
                                System.out.println("################ xxxx ################" + "\n");

                                checker = countOrder;
                                totalBill = 0;
                                countOrder = 0;

                                Orders = new ArrayList<Shakes>();
                            }


                        }

                    } else if (menuChoice.equals("P")) {

                        if (checker != 0) {

                            checker = 0;
                            System.out.println("Thanks for Ordering");
                            break;
                        } else System.out.println("You should press E to end order Then quit the menu.");

                    } else {

                        System.out.println("Wrong Choice. Please try again by choosing from the list!");
                    }
                }
            } else if (menuChoice.equals("E")) {

                System.out.println("Exiting order only works when you enter the ordering menu. Please try again and start ordering with O" + "\n");

            } else {

                System.out.println("Wrong Choice. Please try again by choosing from the list!");

            }


        }

    }

}
