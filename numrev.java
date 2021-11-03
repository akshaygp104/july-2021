package mock;

public class numrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int reverse =0;
int remainder=0;
int number =123456;
while(number>=1)
{
remainder=number%10;
reverse=reverse*10+remainder;
number=number/10;
		
}	
		
		
		
		System.out.println("the reverse of the number is "+reverse);
		


}
	
}