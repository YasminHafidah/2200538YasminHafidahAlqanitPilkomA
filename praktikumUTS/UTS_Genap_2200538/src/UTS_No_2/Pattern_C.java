
package UTS_No_2;
public class Pattern_C {
    Pattern_C(int rows){
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
