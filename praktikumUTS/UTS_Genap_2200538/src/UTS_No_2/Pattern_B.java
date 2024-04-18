package UTS_No_2;
public class Pattern_B {
    Pattern_B(int rows){
        int i,j;
        for(i=rows;i>=1;i--){
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
