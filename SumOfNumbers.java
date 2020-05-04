import java.util.Scanner;

class SumOfNumbers{

  public void getSum(){

    Scanner input=new Scanner(System.in);
    int sum=0;

    while(true)
    {
      System.out.println("Enter the number");
      int num=Integer.valueOf(input.nextLine());
      if(num==0){
        
        break;
          }
      sum=sum+num;
        continue;
      }
       System.out.println(sum);
    }
   
  }
