import java.util.Scanner;
class ComparingNumbers{

  public void compareTwoNumber(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the numbers");
    int num1=Integer.valueOf(scanner.nextLine());
        int num2=Integer.valueOf(scanner.nextLine());
        if(num1>num2){
          System.out.println(num1 +"is greater than "+num2);
        }
        else if(num1<num2){
                    System.out.println(num1 +"is smaller than "+num2);

        }else{
                    System.out.println(num1 +"is equal t0 "+num2);

        }


  }
}