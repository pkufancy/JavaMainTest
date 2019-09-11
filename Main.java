public class Main {
    public static void main(String[] args) {
        String s = null;
        boolean result = "a".equals(s);
        
        //YYYY[MM[DD[HH[MM[SS[.S[S[S[S]]]]]]]]][+/-ZZZZ].
        //s = s.replaceAll("([|^&])(\\d{4,14})(\\.\\d{1,4})?\\+1[10][30]0([|^&])", "$1$2$3$4");
        System.out.println("SUCCESS");
    }
}