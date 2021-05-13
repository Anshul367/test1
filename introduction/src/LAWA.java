public class LAWA{
	
		  public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong by aanchal367
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  // type number
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   //print number
		    else  
		        System.out.println("Not armstrong number");   
		   
		}  	}  
