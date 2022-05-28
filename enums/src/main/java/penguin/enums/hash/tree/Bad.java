package penguin.enums.hash.tree;

import java.util.HashMap;

public class Bad {
    public static void main(String[] args) {
        String message = "zdraste, ya tut budu podolshe";

        HashAlgParent murmur = new MurMurasdasd();
        HashAlgParent md5 = new Md5();
        HashAlgParent sha256 = new Sha256();
        HashAlgParent crc32 = new Crc32();

        HashMap<String, HashAlgParent> algMap = new HashMap<>();
        algMap.put(murmur.getName(), murmur);
        algMap.put(md5.getName(), md5);
        algMap.put(sha256.getName(), sha256);
        algMap.put(crc32.getName(), crc32);

        String alg = "CRC32";

        HashAlgParent hashAlg = algMap.get(alg);
        String hashed = hashAlg.hash(message);
        System.out.println(hashed);
    }
}
