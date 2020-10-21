package machine;
public class MachinePrint {

    int Water;
    int milk;
    int coffeeBeans;
    int disCups;
    int money;
    String choice;
    int fillFirst;
    int fillSecond;
    int fillThird;
    int fillFourth;

    public MachinePrint(int water, int milk, int coffeeBeans, int disCups, int money) {
        Water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disCups = disCups;
        this.money = money;
    }

    public int getWater() {
        return Water;
    }

    public void setWater(int water) {
        Water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisCups() {
        return disCups;
    }

    public void setDisCups(int disCups) {
        this.disCups = disCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int getFillFirst() {
        return fillFirst;
    }

    public void setFillFirst(int fillFirst) {
        this.fillFirst = fillFirst;
    }

    public int getFillSecond() {
        return fillSecond;
    }

    public void setFillSecond(int fillSecond) {
        this.fillSecond = fillSecond;
    }

    public int getFillThird() {
        return fillThird;
    }

    public void setFillThird(int fillThird) {
        this.fillThird = fillThird;
    }

    public int getFillFourth() {
        return fillFourth;
    }

    public void setFillFourth(int fillFourth) {
        this.fillFourth = fillFourth;
    }

    public String printInfo(String a) {
        switch (a) {
            case "remaining":
                System.out.println( Water + " of water\n" + milk + " of milk\n" + coffeeBeans + " of coffee beans\n"
                        + disCups + " of dispoable cups\n" + "$" + money + " of money\n");
                    break;


            case "buy":
                String ch = getChoice();
                try {
                    switch (ch) {
                        case "1":
                            if (Water >= 250 && coffeeBeans >= 16 && disCups > 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Water -= 250;
                                coffeeBeans -= 16;
                                money += 4;
                                disCups--;

                            } else {
                                System.out.print("Sorry, not enough ");
                                System.out.print((Water < 250) ? "water!" : "");
                                System.out.print((coffeeBeans < 16) ? "coffee beans!" : "");
                                System.out.println((disCups < 1) ? "disposable cups!" : "");
                            }
                            break;

                        case "2":
                            if (Water >= 350 && milk >= 75 && coffeeBeans >= 20 && disCups > 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                money += 7;
                                disCups--;
                            } else {
                                System.out.print("Sorry, not enough ");
                                System.out.print((Water < 350) ? "water!" : "");
                                System.out.print((milk < 75) ? "milk!" : "");
                                System.out.print((coffeeBeans < 20) ? "coffee beans!" : "");
                                System.out.println((disCups < 1) ? "disposable cups!" : "");
                            }
                            break;

                        case "3":
                            if (Water >= 200 && milk >= 100 && coffeeBeans >= 12 && disCups > 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                money += 6;
                                disCups--;
                            } else {
                                System.out.print("Sorry, not enough ");
                                System.out.print((Water < 200) ? "water!" : "");
                                System.out.print((milk < 100) ? "milk!" : "");
                                System.out.print((coffeeBeans < 12) ? "coffee beans!" : "");
                                System.out.println((disCups < 1) ? "disposable cups!" : "");
                            }
                            break;
                        case "back":
                            break;
                    }
                }  catch(Exception NoSuchElementException){
                        System.out.println("404");
                }
                break;

            case "fill":


                setWater(getWater()+ getFillFirst());

                setMilk(getMilk()+ getFillSecond());

                setCoffeeBeans(getCoffeeBeans()+ getFillThird());

                setDisCups(getDisCups()+ getFillFourth());


                break;

            case "take":

                System.out.println("I gave you $"+ getMoney());
                setMoney(0);

                System.out.println();
                    break;

            case "exit":
              break;
        }
            return  "";
    }
}

