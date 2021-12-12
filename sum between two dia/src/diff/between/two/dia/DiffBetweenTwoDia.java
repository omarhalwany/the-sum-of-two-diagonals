
package diff.between.two.dia;

import java.util.Scanner;

public class DiffBetweenTwoDia {
    public static void main(String[] args) {
    int ltr=0;
        int rtl=0;
        int[][]Sshite = new int[3][3];
        for (int x=0;x<3;x++){
        for (int y=0 ;y<3;y++){
        Scanner sc =new Scanner (System.in);
            System.out.println("FILL THE FUCKEN MATRIX");

           Sshite[x][y]=sc.nextInt();
           
        
        }
        
        
        }
        
       
         for (int x=0;x<3;x++){
        for (int y=0 ;y<3;y++){
       if (x==y){
       
       ltr =Sshite[x][y]+ltr;
       
       }
       if (x+y==2){
       
       rtl =Sshite[x][y]+rtl;
       
       }
        
        }
        
        
        }
       
        
       
        int sum =rtl+ltr ;
        System.out.println(sum);
         
         
    }
    
}
