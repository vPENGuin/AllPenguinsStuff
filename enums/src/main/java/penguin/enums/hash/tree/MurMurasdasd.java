package penguin.enums.hash.tree;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class MurMurasdasd extends HashAlgParent {

    @Override
    public String hash(String message) {
        return Hashing.murmur3_32_fixed()
                .hashString(message, StandardCharsets.UTF_8)
                .toString();
    }

    @Override
    public String decode(String hashedMessage) {
        return null;
    }

    public String getName() {
        return "MURMUR";
    }
}
