public class countingVowelsConsonants {
    static void main() {
        String name1 = "skjncAoaieiairoeuwr";
        String name = name1.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowels += 1;
            } else {
                consonants+=1;
            }
        }
        System.out.println("Vowels: "+vowels+" , "+"Consonants: "+consonants);
    }
}
