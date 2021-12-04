import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int number = 0;
        for (int i = 0; i <= 10; i++){
            // for 10 coffees a week, dang that's a lot of coffee.
            number += i ;
        }
        return number;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0.00;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    // { "drip coffee", "cappuccino", "latte", "mocha" }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }


    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "," + " there are " + customers.size() + " people ahead of you.");
        customers.add(userName);
    }
}