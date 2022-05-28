package penguin.enums.hash.inherit;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class Md5 extends HashAlgParent {
    @Override
    public String hash(String message) {
        return Hashing.md5()
                .hashString(message, StandardCharsets.UTF_8)
                .toString();
    }

    @Override
    public String decode(String hashedMessage) {
        return null;
    }

    public String getName() {
        return "MD5";
    }
}
