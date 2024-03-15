package calculator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = List.of(
                new Item("Bubblegum", 2f, 202f),
                new Item("Toffee", 0.2f, 118f),
                new Item("Ice cream", 5f, 2250f),
                new Item("Milk chocolate", 4f, 1680f),
                new Item("Doughnut", 2.5f, 1075f),
                new Item("Pancake", 3.2f, 80f)
        );

        Store cornerShop = new Store(items);
        System.out.println(cornerShop.earningsReport());
        System.out.println("Staff expenses:");
        cornerShop.setStaffExpenses(scanner.nextInt());
        System.out.println("Other expenses:");
        cornerShop.setOtherExpenses(scanner.nextInt());
        System.out.println(cornerShop.netIncomeReport());
    }
}
