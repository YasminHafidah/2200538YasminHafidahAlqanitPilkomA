package UTS_No_2;
public class Pattern_A {
    Pattern_A(int rows){
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=rows;j++){
                System.out.print(j+" ");
                if(i==j){
                    break;
                }
            }
            System.out.println();
        }
    }
}
