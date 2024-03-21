package kata_rang_6.Stop_gninnipS_My_sdroW;

public class StoGninnipSMydroW {
    public static void main(String[] args) {
        System.out.println(spinWord("Hey wollef sroirraw"));
    }
    public static String spinWord(String sentence){
        String [] words = sentence.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words){
            if(word.length() > 5){
                stringBuilder.append(reverseString(word)).append(" ");
            }else{
                stringBuilder.append(word).append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static String reverseString(String str){

        return new StringBuilder(str).reverse().toString();
    }
}
