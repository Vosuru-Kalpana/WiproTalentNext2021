import java.util.Scanner;
public class Even_Odd
{
    pblic static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        if(num%2==0)
            System.out.println("the number is Even");
        else
            System.out.println(" the number is Odd");
    }
}