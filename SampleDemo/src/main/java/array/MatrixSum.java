package array;
import java.util.*;
public class MatrixSum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
        int[] a=new int[size];
        System.out.println("Enter elements");
        	for(int i=0;i<size;i++)
        	{
        		a[i]=scanner.nextInt();
        	}
        	System.out.println("Array");
        	for(int i=0;i<size;i++)
        	{
        		System.out.println(a[i]);
        		
        	}
}

}
