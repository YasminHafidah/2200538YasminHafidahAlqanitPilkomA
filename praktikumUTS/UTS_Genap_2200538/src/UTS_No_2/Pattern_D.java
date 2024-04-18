package UTS_No_2;

public class Pattern_D {
    Pattern_D(int rows){
        int j,k,i;
         for(i=rows;i>=1;i--){
            for(k=0;k<rows-i;k++){
                System.out.print("  ");
            }
            for(j=1;j<=rows;j++){
                System.out.print(j + " ");
                if(i==j){
                    break;
                }
            }
            System.out.println();
        }
        
    }
}
