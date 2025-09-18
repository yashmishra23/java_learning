package execption.example;

public class ExpetionDemo {

	public static void main(String[] args) {
		try{
			int a=3;int b=0;int c;
		c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handeled");
		}
		catch(NullPointerException e) {
			System.out.println("Exception handeled");
		} 
		System.out.println("The result is printed");
	
	}
}
