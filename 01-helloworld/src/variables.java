
public class variables {
	static int i=10; //static vars can be created at level not in a method
	
	public static void main(String[] args) {
		int a=10;
		System.out.println("Value of a = "+(a+2)+"\n");
		
		byte minbyteval = Byte.MIN_VALUE;
		byte maxbyteval = Byte.MAX_VALUE;
		System.out.println("Min Byte Val =" + minbyteval);
		System.out.println("Max Byte Val =" + maxbyteval+"\n");
		
		short minshortval = Short.MIN_VALUE;
		short maxshortval = Short.MAX_VALUE;
		System.out.println("Min Short Val =" + minshortval);
		System.out.println("Max Short Val =" + maxshortval+"\n");
		
		int minintval = Integer.MIN_VALUE;
		int maxintval = Integer.MAX_VALUE;
		System.out.println("Min Integer Val =" + minintval);
		System.out.println("Max Integer Val =" + maxintval+"\n");
		
		System.out.println("Min Long Val =" + Long.MIN_VALUE);
		System.out.println("Max Long Val =" + Long.MAX_VALUE+"\n");
		
		float val1=3.2f; // always specify 'f' at the end for float as default is double
		double val2=3.2;
		int val3=7/2;
		float val4=7/2; //output is 3.0 because 7 and 2 are integers
		float val5=7f/2; //output is 3.5 as 7f is float
		double val6=7.0/2.0; //output is 3.5 
		System.out.println("val3="+val3);
		System.out.println("val4="+val4);
		System.out.println("val5="+val5);
		System.out.println("val6"+val6);
		
		//defining constant variables
		final int p=2;
		//below throws an error as p is constant variable
		//p=p+1; 
		System.out.println("P : "+(p+1)); //allowed as it does not change val of p
		System.out.println("P : "+p);
		
		//declaring float vals
		//below throws error, by default in Java decimal vals are double
		//float x = 3.14;
		float x = 3.14f;
	}
}
