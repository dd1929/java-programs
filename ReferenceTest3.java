import java.util.Scanner;

public class Phone{
	String name;
	int RAM;
	int InternalStorage;
	public final int BatteryStorage = 1200;
	public String Company;
	public final String Android = "GingerBread";
	public final int ReleaseYear = 2011;
	public void setName (String w){
		name = w;
	}
	public void setRAM (int x){
		RAM = x;
	}
	public void setInternalStorage (int y){
		InternalStorage = y;
	}
	public void setCompany (String z){
		Company = z;
	}
	public String getName(){
		return name;
	}
	public int getRAM(){
		return RAM;
	}
	public int getInternalStorage(){
		return InternalStorage;
	}
	public String getCompany () {
		return Company;
	}
	Phone (String p, String q) {
		this.setName(p);
		this.setCompany(q);
	}
	Phone (int r, int s){
		this.setRAM(r);
		this.setInternalStorage(s);
	}
}
		
class ReferenceTest{
	public static void main(String[] args) {
		System.out.println("Enter name of phone:");
		Scanner names = new Scanner(System.in);
		String nms = names.nextLine();
		System.out.println("Enter company of phone:");
		Scanner companies = new Scanner(System.in);
		String cmps = companies.nextLine();
		System.out.println("Enter RAM of phone:");
		Scanner rams = new Scanner(System.in);
		int rms = rams.nextInt();
		System.out.println("Enter Internal Storage of phone:");
		Scanner ints = new Scanner(System.in);
		int is = ints.nextInt();
		Phone phone;
		phone = new Phone(nms, cmps);
		phone.setName(nms);
		phone.setCompany(cmps);
		Phone phone2;
		phone2 = new Phone(rms, is);
		phone2.setRAM(rms);
		phone2.setInternalStorage(is);
		System.out.println("Specifications:");
		System.out.println("Phone name:" + phone.getName());
		System.out.println("RAM:" + phone2.getRAM() + " Mhz");
		System.out.println("Internal Storage:" + phone2.getInternalStorage() + " MB");
		System.out.println("Company:" + phone.getCompany());
		System.out.println("Battery: " + phone.BatteryStorage + " mah");
		System.out.println("Android version: " + phone.Android);
		System.out.println("Released in: " + phone.ReleaseYear);
	}
}