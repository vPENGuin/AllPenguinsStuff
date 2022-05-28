package penguin.enums.hash.tree;

public abstract class HashAlgParent {
    public abstract String hash(String message);

    public abstract String decode(String hashedMessage);

    public abstract String getName();
}
