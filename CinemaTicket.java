import java.util.Scanner;
public class CinemaTicket
{
    static double base_price;
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your corresponding age group: 1.Child 2.Adult 3.Senior");
        int age=input.nextInt();
        System.out.println("Enter corresponding movie language: 1.Hindi 2.English");
        int language=input.nextInt();
        input.nextLine();
        System.out.println("Does the customer have student id? (yes/no)");
        String student=input.nextLine(); 
        System.out.println("Is it a festival? (yes/no)");
        String festival=input.nextLine();
        switch(age)
        {
            case 1: 
            base_price=150;
            break;
            
            case 2:
            base_price=250;
            break;
            
            case 3:
            base_price=200;
            break;
            
            default:
            System.out.println("invalid input");
            break;
        }
        
        switch(language)
        {
            case 1:
            base_price=base_price+50;
            break;
            
            case 2:
            base_price=base_price+100;
        }
        if(student=="yes")
        {
            base_price=base_price-(base_price*0.2);
        }
        if(festival=="yes")
        {
            base_price=base_price-(base_price*0.15);
        }
        
        System.out.println("The movie ticket is Rs"+base_price);
    }
}