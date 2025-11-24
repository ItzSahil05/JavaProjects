import java.util.Scanner;

public class countCharacter {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        char[] strch = str.toCharArray();
        System.out.print("Enter character you want to check: ");
        char ch = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < strch.length; i++) {
            if (strch[i]==ch){
                count+=1;
            }
        }
        System.out.println(ch+" appears "+count+" times");
    }
}
