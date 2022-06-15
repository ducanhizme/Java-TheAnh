package Product;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Product implements ProductDao,SearchDao{
    List<MainProduct> listProducts;
    static final String FILE_PATH ="sanpham.dat";
    public static final String REGEX ="\\|";


    public Product(){
        listProducts = new ArrayList<>();
    }
    @Override
    public void add() {
        checkFile(true);
        System.out.println("Enter product id: ");
        String id = new Scanner(System.in).nextLine();
        System.out.println("Enter product name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter product price:");
        double price = new Scanner(System.in).nextDouble();
        System.out.println("Enter product color:");
        String color = new Scanner(System.in).nextLine();
        MainProduct product = new MainProduct(id,name,price,color);
        this.listProducts.add(product);
        FileUtils.writeToFile(FILE_PATH,listProducts);
    }

    @Override
    public void edit() {
        checkFile(true);
        System.out.println("Enter product id to edit: ");
        String id = new Scanner(System.in).nextLine();
        for(MainProduct e : this.listProducts){
            if(e.getId().equalsIgnoreCase(id)){
                System.out.println("Enter new id product: ");
                String idNew = new Scanner(System.in).nextLine();
                e.setId(idNew);
                break;
            }else{
                System.out.println("Id dont exists");
            }
        }
        FileUtils.writeToFile(FILE_PATH,this.listProducts);

    }
    @Override
    public void delete() {
        checkFile(true);
        System.out.println("Enter product id to delete: ");
        String idDelete = new Scanner(System.in).nextLine();
        for(MainProduct e : this.listProducts){
            if(e.getId().equalsIgnoreCase(idDelete)){
                this.listProducts.remove(e);
                break;
            }else{
                System.out.println("Id dont exists");
            }
        }
        FileUtils.writeToFile(FILE_PATH,listProducts);
    }

    @Override
    public void searchBy(String name) {
        checkFile(false);
        for(MainProduct e : this.listProducts){
            if(e.getName().equalsIgnoreCase(name)){
                System.out.println(e);
            }
        }
    }

    @Override
    public void searchBy(double price) {
        checkFile(false);
        for(MainProduct e : this.listProducts){
            if(Double.compare(e.getPrice(),price)==0){
                System.out.println(e);
            }
        }
    }

    public void checkFile(boolean attach){
        if(new File(FILE_PATH).exists()){
            this.listProducts.clear();
            this.listProducts = FileUtils.readFromFile(FILE_PATH);
            if(attach){
                File file = new File(FILE_PATH);
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                writer.print("");
                writer.close();
            }
        }

    }

    public void sortByPrice(){
        checkFile(true);
        this.listProducts.sort(Collections.reverseOrder(Comparator.comparingDouble((MainProduct o) -> o.getPrice())));
        FileUtils.writeToFile(FILE_PATH,listProducts);

    }
    public void showProduct(){
        checkFile(false);
        for (MainProduct e: this.listProducts) {
            System.out.println(e);
        }
    }
}
