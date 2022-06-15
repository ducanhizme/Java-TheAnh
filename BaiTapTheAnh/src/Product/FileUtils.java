package Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeToFile(String path, List<MainProduct> list){
        for (MainProduct e: list){
            try{
                FileWriter fw = new FileWriter(path,true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(e.toString());
                bw.newLine();
                bw.close();
            } catch (IOException error) {
                System.out.println("Some thing went wrong");
            }
        }


    }

    public static List<MainProduct> readFromFile(String path){
        List<MainProduct> listLine = new ArrayList<>();
        try  {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            while (true){
                line = br.readLine();
                if(line ==null){
                    break;
                }
                String file [] = line.split(Product.REGEX);
                String id = file[0];
                String name = file[1];
                double price = Double.parseDouble(file[2]);
                String color = file[3];
                listLine.add(new MainProduct(id,name,price,color));
            }
        } catch (IOException e) {
            System.out.println("Some thing went wrong");
        }
        return listLine;
    }
}
