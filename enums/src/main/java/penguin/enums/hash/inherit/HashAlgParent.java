package penguin.enums.hash.inherit;

public abstract class HashAlgParent {
    public abstract String hash(String message);

    public abstract String decode(String hashedMessage);

    public abstract String getName();
}
