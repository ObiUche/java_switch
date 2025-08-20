import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        switch(value){
            case 0:{
                System.out.println("Zero");
                break;
            }
            case 1:{
                System.out.println("One");
                break;
            }
            case 2:{
                System.out.println("two");
                break;
            }
            default:{
                System.out.println("Nothing");
                break;
            }
        }

    }
}
