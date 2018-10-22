
package assignment11;

import java.util.Scanner;
public class Assignment11 {
  public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.print("enter no of lines : ");
int n = console.nextInt();
for(int i=0;i<n; i++)
{
    for (int j= 0; j<=i; j++)
        
    {
        System.out.print("*");
    }
    System.out.println("");
}
    }
    
}
