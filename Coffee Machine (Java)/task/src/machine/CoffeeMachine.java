package machine;

import java.util.Scanner;
import java.util.*;


public class CoffeeMachine {
    private static class machineStorage {
        private static int water = 400;
        private static int milk = 540;
        private static int beans = 120;
        private static int cash = 550;

        private static int cups = 9;

        public void setWater(int water) {
            machineStorage.water += water;
        }

        public void setMilk(int milk) {
            machineStorage.milk += milk;
        }

        public void setBeans(int beans) {
            machineStorage.beans += beans;
        }

        public void setCups(int cups) {
            machineStorage.cups += cups;
        }

        public void setCash(int cash) {
            machineStorage.cash += cash;
        }

        public void withdrawCash() {
            machineStorage.cash -= machineStorage.cash;
        }

        public void useWater(int water) {
            machineStorage.water -= water;
        }

        public void useMilk(int milk) {
            machineStorage.milk -= milk;
        }

        public void useBeans(int beans) {
            machineStorage.beans -= beans;
        }

        public void useCups(int cups) {
            machineStorage.cups -= cups;
        }


        public boolean checkEResource() {
            boolean check = true;
            if (this.water < espresso.water || this.milk < espresso.beans || this.cups < espresso.cups) {
                check = false;
            }

                if (this.water < espresso.water) {
                    System.out.println("Sorry, not enough water!");
                    check = false;
                }
            else if (this.water < espresso.beans){
                System.out.println("Sorry, not enough beans!");
                check = false;
            }
            else if (this.water < espresso.cups) {
                System.out.println("Sorry, not enough cups!");
                check = false;
            }
            return check;
        }

        public boolean checkLResource() {
            boolean check = true;
            if (this.water < latte.water || this.beans < latte.beans || this.cups < latte.cups | this.milk < latte.milk) {
                check = false;
            }
            if (this.water < latte.water) {
                System.out.println("Sorry, not enough water!");
                check = false;
            }
            else if (this.water < latte.milk) {
                System.out.println("Sorry, not enough milk!");
                check = false;
            }
            else if (this.water < latte.beans) {
                System.out.println("Sorry, not enough beans!");
                check = false;
            }
            else if (this.water < latte.cups) {
                System.out.println("Sorry, not enough cups!");
                check = false;
            }
            return check;
        }

        public boolean checkCResource() {
            boolean check = true;
            if (this.water < cappucino.water || this.beans < cappucino.beans || this.cups < cappucino.cups | this.milk < cappucino.milk) {
                check = false;
            }
             if (this.water < cappucino.water) {
                 System.out.println("Sorry, not enough water!");
                 check = false;
             }
            else if (this.water < cappucino.milk) {
                 System.out.println("Sorry, not enough milk!");
                 check = false;
             }
            else if (this.water < cappucino.beans) {
                 System.out.println("Sorry, not enough beans!");
                 check = false;
             }
            else if (this.water < cappucino.cups) {
                 System.out.println("Sorry, not enough cups!");
                 check = false;
             }
            return check;
        }
    }




private class espresso {
    static int water = 250;
    static int beans = 16;
    static int price = 4;
    static int cups = 1;


}

private class latte {
    static int water = 350;
    static int milk = 75;
    static int beans = 20;

    static int price = 7;
    static int cups = 1;


}


private class cappucino {
    static int water = 200;
    static int milk = 100;
    static int beans = 12;
    static int price = 6;
    static int cups = 1;

}


    public static void main(String[] args) {
        int waterReserve;
        int milkReserve;
        int coffeeBeansReserve;
        int neededWater = 200;
        int neededMilk = 50;
        int neededCofeeBeans = 15;
        int coffeeNumber;
        String option = new String();


        String action = new String();
        Scanner sc = new Scanner(System.in);
        machineStorage ms = new machineStorage();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action = sc.nextLine();
        boolean a = true;
        while (a) {
            if (action.equals("buy")) {

                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                option = sc.nextLine();
                if (option.equals("1")) {
                    if (ms.checkEResource()) {
                        System.out.println("I have enough resources, making you a coffee!");
                        ms.setCash(espresso.price);
                        ms.useWater(espresso.water);
                        ms.useBeans(espresso.beans);
                        ms.useCups(espresso.cups);
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();

                    } else {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();
                    }

                } else if (option.equals("2")) {
                    if (ms.checkLResource()) {
                        System.out.println("I have enough resources, making you a coffee!");
                        ms.setCash(latte.price);
                        ms.useWater(latte.water);
                        ms.useMilk(latte.milk);
                        ms.useBeans(latte.beans);
                        ms.useCups(latte.cups);
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();

                    } else {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();
                    }
                } else if (option.equals("3")) {
                    if (ms.checkCResource()) {
                        System.out.println("I have enough resources, making you a coffee!");
                        ms.setCash(cappucino.price);
                        ms.useWater(cappucino.water);
                        ms.useMilk(cappucino.milk);
                        ms.useBeans(cappucino.beans);
                        ms.useCups(cappucino.cups);
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();

                    } else {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = sc.next();
                    }
                } else if (option.equals("back")) {
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    action = sc.next();
                }
            } else if (action.equals("fill")) {


                System.out.println("Write how many ml of water you want to add:");
                ms.setWater(sc.nextInt());
                System.out.println("Write how many ml of milk you want to add:");
                ms.setMilk(sc.nextInt());
                System.out.println("Write how many grams of coffee beans you want to add:");
                ms.setBeans(sc.nextInt());
                System.out.println("Write how many disposable cups you want to add:");
                ms.setCups(sc.nextInt());

                System.out.println("Write action (buy, fill, take, remaining, exit):");
                action = sc.next();

            } else if (action.equals("take")) {

                System.out.println("I gave you " + machineStorage.cash + "\n");
                ms.withdrawCash();
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                action = sc.next();


            } else if (action.equals("remaining")) {
                System.out.println("The coffee machine has:\n" +
                        machineStorage.water + " of water\n" +
                        machineStorage.milk + " of milk\n" +
                        machineStorage.beans + " of coffee beans\n" +
                        machineStorage.cups + " disposable cups\n" +
                        machineStorage.cash + " of money");

                System.out.println("Write action (buy, fill, take, remaining, exit):");
                action = sc.next();
            } else if (action.equals("exit")) {
                return;
            }
        }
    }
    }

