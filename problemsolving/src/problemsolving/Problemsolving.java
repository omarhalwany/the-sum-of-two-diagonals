
package problemsolving;

import java.util.Scanner;

public class Problemsolving {
    public static void main(String[] args) {
    
        int [][] array =new int [3][3];
        
   int d1=0;
   int d2=0;

   Scanner sc =new Scanner (System.in);        
        
        System.out.println("insert the number of rows and coul");
        int n =sc.nextInt();
        for (int x=0 ; x<n;x++){
        
        for (int y=0 ; y<n;y++){
        
            System.out.println("FILL THE ARRAY");
            array[x][y]=sc.nextInt() ;
            
            if (x==y)
            
            d1=array[x][y]+d1;
            
          if (x== n-y-1)
            
            d2=array[x][y]+d2;
            
            
        
        
        
        }
    }
        
            System.out.println(d1);
 System.out.println(d2);
        
        
        

        
}
}