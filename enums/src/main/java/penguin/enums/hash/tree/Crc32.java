package penguin.enums.hash.tree;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class Crc32 extends HashAlgParent {
    @Override
    public String hash(String message) {
        return Hashing.crc32()
                .hashString(message,StandardCharsets.UTF_8)
                .toString();
    }

    @Override
    public String decode(String hashedMessage) {
        return null;
    }

    public String getName() {
        return "CRC32";
    }
}
