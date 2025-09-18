package execption.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExectionDemo1 {
	public void divide() throws ArithmeticException,FileNotFoundException{
		FileReader fr =new FileReader("abc.text");}
		int a=7;int b=0;int c=a/b;
	public static void main(String[] args) throws FileNotFoundException{
		ExectionDemo1 ed=new ExectionDemo1();
			ed.divide();
			
		System.out.println("1");
	}

}
