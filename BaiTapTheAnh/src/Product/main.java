package Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Product pr = new Product();
        while(true){
            System.out.println("1.Enter product: ");
            System.out.println("2.Show products: ");
            System.out.println("3.Edit product: ");
            System.out.println("4.Delete product: ");
            System.out.println("5.Search product by name: ");
            System.out.println("6.Search product by price: ");
            System.out.println("7.Sort by product price");
            System.out.println("0.Exit");
            System.out.println("Your choice: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    pr.add();
                    break;
                case 2:
                    pr.showProduct();
                    break;
                case 3:
                    pr.edit();
                    break;
                case 4:
                    pr.delete();
                    break;
                case 5:
                    System.out.println("Enter name to search: ");
                    String name = new Scanner(System.in).nextLine();
                    pr.searchBy(name);
                    break;
                case 6:
                    System.out.println("Enter price to search: ");
                    double price = new Scanner(System.in).nextDouble();
                    pr.searchBy(price);
                    break;
                case 7:
                    pr.sortByPrice();
                    break;
            }
            if (choice ==0){
                return;
            }
        }
    }
}
