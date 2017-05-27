import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DataFileStream {
	
	public void writeToFile(List<StudentDetail> list, String file) {
	      ObjectOutputStream os = null;
	      try {
	         os = new ObjectOutputStream(new FileOutputStream(file));
	         for (StudentDetail p : list) {
	            os.writeObject(p);
	         }

	      } catch (IOException ie) {
	         System.err.println("Error opening file.");
	      } catch (NoSuchElementException nsee) {
	         System.err.println("Invalid input.");
	      } finally {
	         try {
	            if (os != null)
	               os.close();
	         } catch (IOException ie) {
	            System.err.println("Error closing file.");
	         }
	      }
	   }

	   public List<StudentDetail> readFromFile(String file) {
	      List<StudentDetail> list = new ArrayList<>();
	      ObjectInputStream inputStream = null;
	      try {
	         inputStream = new ObjectInputStream(new FileInputStream(file));
	         while (true) {
	        	 StudentDetail p = (StudentDetail) inputStream.readObject();
	            list.add(p);
	         }
	      } catch (EOFException eofe) {
	         return list;
	      } catch (ClassNotFoundException cnfe) {
	         System.err.println("Object creation failed.");
	      } catch (IOException ioe) {
	         System.err.println("Error opening file.");
	      } finally {
	         try {
	            if (inputStream != null)
	               inputStream.close();
	         } catch (IOException ioe) {
	            System.err.println("Error closing file.");
	         }
	      }
	      return list;
	   }

}
