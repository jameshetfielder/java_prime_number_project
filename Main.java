import java.util.Scanner;
public class Main {

    static boolean primeNum(int num, int divisor) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num % divisor == 0)
            return false;
        if (divisor * divisor > num){
            return true;
        }
        return primeNum(num, divisor + 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if (primeNum(num , 2)){
            System.out.print(num + " is prime number.");
        }
        else
            System.out.print(num + " is not prime number.");
        }
    }
