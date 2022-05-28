package penguin.enums.hash;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;

public enum HashAlg {
    SHA256(true) {
        @Override
        public String hash(String message) {
            return Hashing.sha256()
                    .hashString(message, StandardCharsets.UTF_8)
                    .toString();
        }
    },
    MD5(false) {
        @Override
        public String hash(String message) {
            return Hashing.md5()
                    .hashString(message, StandardCharsets.UTF_8)
                    .toString();
        }
    },
    MURMUR(true) {
        @Override
        public String hash(String message) {
            return Hashing.murmur3_32_fixed()
                    .hashString(message,StandardCharsets.UTF_8)
                    .toString();
        }
    },
    CRC32(true) {
        @Override
        public String hash(String message) {
            return Hashing.crc32()
                    .hashString(message,StandardCharsets.UTF_8)
                    .toString();
        }
    };

    private final boolean secure;

    HashAlg(boolean secure) {
        this.secure = secure;
    }

    public static HashAlg getRandomSecureAlg() {
        Random random = new Random();
        ArrayList<HashAlg> secured = new ArrayList<>();
        for (HashAlg hashAlg : values()) {
            if (hashAlg.secure) {
                secured.add(hashAlg);
            }
        }
        int randomIndex = random.nextInt(secured.size());
        return secured.get(randomIndex);
    }

    public abstract String hash(String message);
}
