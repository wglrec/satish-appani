
public class CommonElementsInArray 
{
		    public static void main(String args[])
		    {
		        int a[] = {1,2,3,4,5,6};
		        int b[] = {2,3,4,5,9,12};
		        int index1 = 0;
		        int index2 = 0;
		        while(true) 
		        {
//		            if(index1 >= a.length || index2 >= b.length) 
//		            {
//		                break;
//		            }
		            if(a[index1] == b[index2])
		            {
		                System.out.print(a[index1]);
		                System.out.print("  ");
		                index1=index1+1;
		            } 
		            else if(a[index1] > b[index2]) 
		            {
		                index2=index2+1;
		            }
		            else 
		            {
		            	  index1=index1+1;
		            }
		        }
		         
		    }
}
