import java.util.Scanner;
public class eleven
{
    static double tax;
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you annual income: ");
        double income=input.nextDouble();
        if (income>0 && income<=500000)
        {
            tax=0.01;
        }
        else if(income>=500001 && income<=700000)
        {
            tax=0.1;
        }
        else if(income>=700001 && income<=1000001)
        {
            tax=0.2;
        }
        else if(income>=1000001 && income<=2000000)
        {
            tax=0.3;
        }
        else if(income>=2000001 && income<=5000000)
        {
            tax=0.36;
        }
        else if(income>=5000001)
        {
            tax=0.36;
        }
        
        double income_tax=tax*income;
        System.out.println("Your income tax is "+income_tax);
    }
}