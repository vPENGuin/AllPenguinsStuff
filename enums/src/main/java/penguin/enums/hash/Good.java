package penguin.enums.hash;

public class Good {
    public static void main(String[] args) {
        String message = "zdraste, ya tut budu podolshe";

        String alg = "CRC32";
        HashAlg hashAlg = HashAlg.valueOf(alg);
        System.out.println(hashAlg.hash(message));

        System.out.println("----------- Randoming 10 times -----------");
        for (int i = 0; i < 10; i++) {
            HashAlg secureAlg = HashAlg.getRandomSecureAlg();
            System.out.println(secureAlg + " " + secureAlg.hash(message));
        }
    }
}
