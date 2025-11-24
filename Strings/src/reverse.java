import javax.crypto.spec.PSource;
import java.util.Arrays;

public class reverse {
    static void main() {
        String name = "Sahil";
        char[] ch = name.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start+=1;
            end-=1;
        }
        System.out.println(new String(ch));
    }
}
