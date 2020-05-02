
import java.util.Scanner;
class SpeedingTicket{

  public void getTicket(){

    int num;
    
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number");

num=Integer.valueOf(scanner.nextLine());

 //num=Integer.valueof(scanner.nextLine());

 if(num>120){
   System.out.println("Speeding ticket!");
 }
   }
 }