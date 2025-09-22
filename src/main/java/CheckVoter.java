public class CheckVoter {
    public static void main(String[] args) {
        int a = 10, b = 12, c = 8;
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
