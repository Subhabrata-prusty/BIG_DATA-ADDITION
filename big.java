import java.math.*;
class Big_Data{

	public static void addition()//addition function
	{
         BigInteger b1,b2,result;//BigInteger class objects
         b1=new BigInteger("123456789");//initialization of objects using constructor 
         b2=new BigInteger("23456789098765432");
         result=b1.add(b2);//add function is used operate 
         System.out.println("addition="+result);
	
	}

	public static void main(String[] args) {
		
		addition();//call to void addition function
	}
}