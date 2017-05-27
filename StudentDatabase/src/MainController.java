import java.util.ArrayList;
import java.util.List;

public class MainController {

public static void main(String[] args) {
   String filePath = "/home/mano/temp/studatabase.dat";
   List<StudentDetail> l = new ArrayList<>();
   l.add(new StudentDetail(111, "Karthik", 15,"Shanmugam", "Salem"));

   l.add(new StudentDetail(191, "Deva", 14,"Maris","Chennai"));
   DataFileStream dfs=new DataFileStream();
   dfs.writeToFile(l, filePath);
   List<StudentDetail> l1=dfs.readFromFile(filePath);
   printlist(l1);

}

public static void printlist(List<StudentDetail> list) {
   System.out.printf("%-7s%-20s%-20s%-20s%-10s\n","StudentId", "Name", "Age", "FatherName", "Address");
   for (StudentDetail p : list) {
      System.out.printf("%-7d%-20s%-20s%-20s%-10d\n",p.getStuId(), p.getName(), p.getAge(),p.getFatherName(), p.getAddress());
      }
   }
}