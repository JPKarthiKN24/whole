import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductFileStream {

   public void writeToFile(List<ProductRecord> list, String file) {
      ObjectOutputStream outStream = null;
      try {
         outStream = new ObjectOutputStream(new FileOutputStream(file));
         for (ProductRecord p : list) {
            outStream.writeObject(p);
         }

      } catch (IOException ioException) {
         System.err.println("Error opening file.");
      } catch (NoSuchElementException noSuchElementException) {
         System.err.println("Invalid input.");
      } finally {
         try {
            if (outStream != null)
               outStream.close();
         } catch (IOException ioException) {
            System.err.println("Error closing file.");
         }
      }
   }

   public List<ProductRecord> readFromFile(String file) {
      List<ProductRecord> list = new ArrayList<>();
      ObjectInputStream inputStream = null;
      try {
         inputStream = new ObjectInputStream(new FileInputStream(file));
         while (true) {
            ProductRecord p = (ProductRecord) inputStream.readObject();
            list.add(p);
         }
      } catch (EOFException eofException) {
         return list;
      } catch (ClassNotFoundException classNotFoundException) {
         System.err.println("Object creation failed.");
      } catch (IOException ioException) {
         System.err.println("Error opening file.");
      } finally {
         try {
            if (inputStream != null)
               inputStream.close();
         } catch (IOException ioException) {
            System.err.println("Error closing file.");
         }
      }
      return list;
   }

}