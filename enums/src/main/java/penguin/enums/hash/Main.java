package penguin.enums.hash;

public class Main {
    public static void main(String[] args) {
        String message = "zdraste, ya tut budu podolshe";
        for (int i = 0; i < 10; i++) {
            HashAlg randomSecureAlg = HashAlg.getRandomSecureAlg();
            System.out.println(randomSecureAlg + " " + randomSecureAlg.hash(message));
        }

        String alg = "SHA256";
    }
}
