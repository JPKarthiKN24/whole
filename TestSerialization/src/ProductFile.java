import java.util.ArrayList;
import java.util.List;

public class ProductFile{
public static void main(String[] args) {
   String filePath = "/home/mano/temp/product.dat";
   List<ProductRecord> list = new ArrayList<>();
   list.add(new ProductRecord(111, "Amitryptyline", "Amiline", "Torrent",
      10, 5, 13.35f));
   // ...dummy data

   list.add(new ProductRecord(191, "Amlodipine", "Amdepin",
      "ZydusCadila", 18, 6, 20.90f));
   ProductFileStream pf=new ProductFileStream();
   pf.writeToFile(list, filePath);
   List<ProductRecord> products=pf.readFromFile(filePath);
   printlist(products);

}

public static void printlist(List<ProductRecord> list) {
   System.out.printf("%-7s%-20s%-20s%-20s%-10s%-10s%-10s\n", "Code",
      "Generic", "Name", "Company", "Stock", "Reorder", "Unit Price");
   for (ProductRecord p : list) {
      System.out.printf("%-7d%-20s%-20s%-20s%-10d%-10d%.2f\n",
      p.getProductCode(), p.getComposition(), p.getProductName(),
      p.getCompany(), p.getStockQuantity(), p.getReorderLevel(),
      p.getUnitPrice());
      }
   }
}