/**
 * Created by Clue on 2/12/2017.
 */
public class RandomCharacter {

     String getRandomCharacter(){
        String randomChar;
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        randomChar = alphabet[(int)(Math.random()*26)] + "";

        return randomChar;
    }
    public static void main(String[] args){
        RandomCharacter rand = new RandomCharacter();
        for(int i=0; i<10;i++)
        System.out.println(rand.getRandomCharacter());
    }
}
