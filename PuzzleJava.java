import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    Random random = new Random();


    //a method that will generate and return an array
    // with 10 random numbers between 1 and 20 inclusive
    public void get10Rolls(){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            results.add(random.nextInt(20)+1);
        }
        System.out.println(results);
    }


    //an array that contains all 26 letters of the alphabet
    //Generate a random index between 0-25, and use it to pull a 
    //random letter out of the array
    //Return the random letter.
    public static String getRandomLetter(){
        String[] myArr = {"a","b","c","d","e","f","g","h",
                            "i","j","k","l","m","n","o","p","q",
                            "r","s","t","u","v","w","x","y","z"};
        Random rand = new Random();
        int n = rand.nextInt(26);
        return myArr[n];
    }


    //a method that uses the previous method to create
    // a random string of eight characters, and return that string
    public String generatePassword(){
        String result="";
        for(int i=0; i<8; i++){
            result+=getRandomLetter();
        }
        return result;
    }


    //a method that uses the previous method to create a 
    //random string of eight characters, and return that string
    public void getNewPasswordSet(int val){
        String[] results;
        results = new String[val];
        for(int i=0; i<val; i++){
            results[i] = generatePassword();
        }
        System.out.println(Arrays.toString(results));
    }
}