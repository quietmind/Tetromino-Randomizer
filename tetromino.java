import java.util.ArrayList;
import java.util.Random;
 
public class HelloWorld{
 
     public static void main(String []args){
       
        //variables
        char[] pieces = {'O', 'I', 'S', 'Z', 'L', 'J', 'T'};
        ArrayList<Character> bag = new ArrayList<Character>();
        int refillBag;
        Random randomGenerator = new Random();
       
        for(int reFillBag = 0; reFillBag < 10; reFillBag++){
            bag = fillBag(pieces, bag);
           
            while(!bag.isEmpty() ){
                int temp = randomGenerator.nextInt(bag.size());
                System.out.print(bag.get(temp));
                bag.remove(temp);
            }
           
        }
       
     }
    
public static ArrayList<Character> fillBag(char[] array, ArrayList<Character> ArrayList){
   
    for(int i = 0; i < array.length; i ++){
        ArrayList.add(array[i]);
    }
    return ArrayList;
}
 
}