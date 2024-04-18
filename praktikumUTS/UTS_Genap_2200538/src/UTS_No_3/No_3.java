package UTS_No_3;
import java.util.Scanner;
public class No_3 {
    public static int reverse(int number){
        int reverse = 0;

        while(number!=0){
            reverse = reverse*10 + number%10; 
            number = number/10; 
        }     
        return reverse;
    }

    public static boolean isPalindrome(int number, int reverse){
        return reverse == number;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan bilangan : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isPalindrome(number,reverse(number))==true){
            System.out.println("Bilangan "+number+" merupakan palindrom");
        }else{
            System.out.println("Bilangan "+number+" bukan merupakan palindrom");
        }
    }
    
}
