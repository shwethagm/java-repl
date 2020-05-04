import java.util.Scanner;

class PositiveNumber{
  public void getPositive(){

  Scanner scanner=new Scanner(System.in);
 
  while(true){
 System.out.println("Enter the number");

      System.out.println("Input a number");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break;
    } else if (number < 0) {
        System.out.println("Unfit number");
        continue;
    }

    System.out.println(number * number);
}
}
}
