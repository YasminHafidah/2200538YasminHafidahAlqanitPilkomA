package UTS_No_1;
import java.util.Scanner;
public class no1 {
    public static int reverse_bilangan(int bilangan){
        int reverse = 0;
        
        while(bilangan!=0){
            reverse = reverse*10 + bilangan%10; 
            bilangan = bilangan/10; 
        }     
        return reverse;
    }
    
    public static void validation_palindrom(int bilangan, int reverse){
        if(reverse == bilangan){
            System.out.println(bilangan+ " adalah palindrom");
        }else{
            System.out.println(bilangan+ " bukan palindrom");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Masukkan tiga digit integer : ");
        Scanner input = new Scanner (System.in);
        int bilangan = input.nextInt(); 
        
        validation_palindrom(bilangan, reverse_bilangan(bilangan));
    }
    
}
