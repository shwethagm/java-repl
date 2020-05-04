import java.util.Scanner;

class NumberOfNumbers{

  public void getZero(){

    Scanner input=new Scanner(System.in);
    int numberEntry=0;

    while(true)
    {
      System.out.println("Enter the number");
      int num=Integer.valueOf(input.nextLine());
      if(num==0){
        System.out.println(numberEntry);
        break;
            

      }
      numberEntry=numberEntry+1;
    }
  }
}