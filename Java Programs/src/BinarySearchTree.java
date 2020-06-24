
public class BinarySearchTree {

	
	private static void Sorted(int a[],int start,int end)
	{
		if(start>end)
			return ;
		Sorted(a, start*2+1,end);
		System.out.print(a[start]+ "  ");
		Sorted(a, start*2+2, end);
	}
	public static void main(String[] args) 
	{
		int a[] = {4, 2, 5, 1, 3}; 
        
        Sorted(a, 0,a.length-1); 
	}
}
