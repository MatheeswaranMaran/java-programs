import java.util.Scanner;
public class firstRepeatAndNonRepeat{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
	name.toLowerCase();
        char firstRepeat = '\0';
        char firstNonRepeat = '\0';
        boolean repeated = false;
        boolean nonRepeated = false;
        int[] frequency = new int[256];
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            frequency[c]++;
        }
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(frequency[c]==1 && !nonRepeated){
                firstNonRepeat = c;
                nonRepeated = true;
            }
            else if(frequency[c]>1 && !repeated){
                firstRepeat = c;
                repeated = true;
            }
            if(repeated && nonRepeated){
                break;
            }
        }
        if(nonRepeated){
            System.out.println("First Non Repeated Letter is " + firstNonRepeat);
        }
        else{
            System.out.println("There is no non repeated letters.");
        }
        if(repeated){
            System.out.println("First Repeated Letter is " + firstRepeat);
        }
        else{
            System.out.println("There is no repeated letters.");
        }
    }
}