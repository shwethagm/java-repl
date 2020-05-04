import java.util.Scanner;
class CountAndSum{

  public void getCountAndSum(){

    Scanner input=new Scanner(System.in);

    int countOfNumberInput=0;
    int sum=0;

    while(true){

      System.out.println("Enter the number");

      int num=Integer.valueOf(input.nextLine());

      if(num==0){
        break;
      }
      countOfNumberInput=countOfNumberInput+1;
      sum=sum+num;

    }
    System.out.println("countOfNumberInput"+countOfNumberInput);
        System.out.println("sum"+sum);

  }
}