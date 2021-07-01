import java.util.*;

public class PasswordKeeper {
	public static void main(String[] args){
		String name;
		String username;
		String password;
		String yn;
		Passwords pw = new Passwords();
	    ArrayList<Passwords> data = new ArrayList<Passwords>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to run the program? (type 'run' if yes, type 'no' if no)");
		String run = sc.nextLine();
		while(run.equals("run") || run.equals("Run")){
			System.out.println("Do you want to keep a password (type 'keep'), see stored passwords (type 'see') or remove a password (type 'remove')?");
		System.out.println("Type 'exit' to close the program.");
			String input = sc.nextLine();
			if (input.equals("see") || input.equals("See")){
				for(int x = 0; x < data.size(); x++){
					System.out.println(data.get(x).name + ": Username - " + data.get(x).username + ", Password - " + data.get(x).password);
				}
			}
			else if (input.equals("keep") || input.equals("Keep")){
				System.out.println("What is the password for?");
				name = sc.nextLine();
				System.out.println("Username (type '-' if not applicable):");
				username = sc.nextLine();
				System.out.println("Password:");
				password = sc.nextLine();
				pw = new Passwords(name, username, password);
				data.add(pw);
				System.out.println("Your password has been stored.");
				System.out.println(data.get(data.size() - 1).name + ": Username - " + data.get(data.size() - 1).username + "; Password - " + password);
			}
			else if(input.equals("exit") || input.equals("Exit")){
				System.out.println("Are you sure? (type 'yes' or 'no')");
				yn = sc.nextLine();
				if(yn.equals("yes")){
					run = "no";
				}
			}
			else if(input.equals("remove") || input.equals("Remove")){
				System.out.println("Type the number beside the entry you want to remove:");
				for(int x = 0; x < data.size(); x++){
					System.out.println(x + " " + data.get(x).name + ": Username - " + data.get(x).username + ", Password - " + data.get(x).password);
				}
				int rem = sc.nextInt();
				data.remove(rem);
				System.out.println("The entry has been removed. Currently stored data:");
				for(int x = 0; x < data.size(); x++){
					System.out.println(data.get(x).name + ": Username - " + data.get(x).username + ", Password - " + data.get(x).password);
				}
			}	
		}
	}
}

class Passwords {
	String name;
	String username;
	String password;
	Passwords() {
	}
	Passwords(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
}