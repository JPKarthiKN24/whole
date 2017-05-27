import java.util.Scanner;

public class MainController implements Cloneable {

	private String password;
	private static Scanner sc;

	public MainController(String password) {
		this.password = password;
	}

	public String getPassWord() {
		return password;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		MainController mc1 = new MainController("password1");
		try {
			MainController mc2 = (MainController) mc1.clone();
			System.out.println(mc1.getPassWord());
			System.out.println(mc2.getPassWord());
			sc = new Scanner(System.in);
			System.out.print("Give new password :");
			MainController mc3 = new MainController(sc.nextLine());

			mc2=mc3;
			//mc2 = (MainController) mc3.clone();
			//System.out.println(mc1.hashCode());
			//System.out.println(mc2.hashCode());
			//System.out.println(mc3.hashCode());
			

			if ((mc1.getPassWord()).equals(mc2.getPassWord())) {
				System.out.println("Old password. Try a new one.");

			} else {
				System.out.println("Password Changed successfully. :)");
				System.out.println("New password :" + mc2.getPassWord());
				System.out.println("Old password :" + mc1.getPassWord());
			}
		} catch (CloneNotSupportedException e) {
			System.out.println("Exception occured.");
		}

	}

}
