import java.util.Scanner;
class ExitingLoop{

  public void exitLoop(){
    int number = 1;

    while (true) {
        number = number + 1;

        if (number >= 5) {
            break;
        }

        if (number < 5) {
            continue;
        }

        System.out.print(number + " ");
    }

    System.out.print(number + " ");
}
}