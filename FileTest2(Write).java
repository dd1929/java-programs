import java.io.*;
import java.util.*;

public class FileTest {
	public static void main(String[] args) {
		try{
		Formatter hw = new Formatter("//storage//emulated//0//Jvdroid//Test Files//HelloWorld.txt");
		hw.format("%s %s %n", "Hello", "World!");
		hw.format("%s %s %s %n", "How", "Are", "You?");
		hw.close();
		}catch (Exception e){
			System.out.println(e);
		}finally{
		}
	}
}