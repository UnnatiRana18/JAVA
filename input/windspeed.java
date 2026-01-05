import java.util.*;
public class windspeed {
    public static void main(String args[]){

        /*(Calm): < 1 mph .
(Light Breeze): 4-7 mph 
(Moderate Breeze): 13-18 mph
(Strong Breeze): 25-31 mph
(Gale): 39-46 mph 
(Storm): 55-63 mph 
(Hurricane): 74+ mph

 */
        Scanner kbrd= new Scanner(System.in);
        int wind = kbrd.nextInt();

        if(wind<1){
            System.out.println("calm");
        }
        else if(wind>=4 && wind<=7){
             System.out.println("Light Breeze");
        }
        else if(wind>13 && wind<18){
             System.out.println("Moderate Breeze");
        }
        else if(wind>25 && wind <31){
             System.out.println("Strong Breeze");
        }
        else if(wind>39 && wind <46){
            System.out.println("Gale");
        }
        else if(wind>55 && wind<63){
             System.out.println("Storm");
        }
        else if(wind>74){
             System.out.println("Hurricane");
        }
    }
    

}
