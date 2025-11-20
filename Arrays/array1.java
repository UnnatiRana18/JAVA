import java.util.*;

public class array1 {

    public static void main(String args[]){

        int [][] numbers= new int[3][4];

        Scanner sc = new  Scanner(System.in);
        System.out.printf("rows:");
        int row = sc.nextInt();
         System.out.printf("col");
        int col=sc.nextInt();

         System.out.printf("elements :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
                
            }
        }
        System.out.printf("value to find:");
        int x=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(x==numbers[i][j]) {
                System.out.printf("found at %d , %d",i,j);
            
               }
               else{
                    System.out.println("not found");
                }
            }   
        }

    }
    
}
