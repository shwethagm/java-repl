import java.util.Scanner;

class SumOfNumbers{

  public void getCount(){

    Scanner input=new Scanner(System.in);
    int numberEntry=0;

    while(true)
    {
      System.out.println("Enter the number");
      int num=Integer.valueOf(input.nextLine());
      if(num==0){
        
        break;
          }
      else if(num < 0){
      numberEntry=numberEntry+1;

      }
      else if(num >0){
        continue;
      }
    }
    System.out.println(numberEntry);
  }
}