public class GetSet{
	private String tester;
	
	public String getTester(){
		return tester;
	}
	
	public void setTester(String a){
		this.tester=a;
	}
}

class Testing{
	public static void main(String [] args){
		GetSet yo = new GetSet();
		yo.setTester("It works!");
		System.out.println(yo.getTester());
	}
}