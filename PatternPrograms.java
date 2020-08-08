package practice;
import java.io.IOException;
import java.util.*;


public class PatternPrograms{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Enter row:- ");
		int row=sc.nextInt();
		do {
			System.out.println("1.Right triangle pattern");
			System.out.println("2.Left triangle pattern");
			System.out.println("3.Triangle pattern");
			System.out.println("4.Diamond pattern");
			System.out.println("5.Sandglass Pattern");
			System.out.println("Enter choice:- ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				rightTrianglePattern(row); 
				break;
			case 2:
				leftTrianglePattern(row);
				break;
			case 3:
				TrianglePattern(row);
				break;
			
			case 4:
				Diamond(row);
				break;
			case 5:
				SandglassPattern(row);
				break;
			}
		
		
		System.out.println("Do you want to continue(y/n):- ");
	}while(sc.next().equalsIgnoreCase("y"));	
}
	
	
	
	public static void rightTrianglePattern(int row) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftTrianglePattern(int row) {
			for(int i=0;i<row;i++) {
				for(int j=row-i;j>=0;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	
	public static void TrianglePattern(int row) {
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void Diamond(int row) {
		int space=row-1,i,j;
		for (j = 1; j<= row; j++)  
		{  
			for (i = 1; i<= space; i++)  
			{  
				System.out.print(" ");  
			}  
			space--;  
			for (i = 1; i <= 2 * j - 1; i++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
			for (i = 1; i<= space; i++)  
		{  
			System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
			System.out.print("*");  
		}  
			System.out.println("");  
		}  
	
	}
	
	public static void SandglassPattern(int row) {
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=row-1;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=row-1;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		sc.close();
	}
}