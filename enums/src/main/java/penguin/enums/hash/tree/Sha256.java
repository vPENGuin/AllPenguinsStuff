package penguin.enums.hash.tree;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class Sha256 extends HashAlgParent {
    @Override
    public String hash(String message) {
        return Hashing.sha256()
                .hashString(message, StandardCharsets.UTF_8)
                .toString();
    }

    @Override
    public String decode(String hashedMessage) {
        return null;
    }

    public String getName() {
        return "SHA256";
    }
}
