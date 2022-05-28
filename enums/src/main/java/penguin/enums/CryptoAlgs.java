package penguin.enums;

public enum CryptoAlgs {
    DEFAULT {
        @Override
        public String cypher(String message) {
            return "NOT SUPPORTED CYPHER";
        }
    },
    RSA {
        @Override
        public String cypher(String message) {
            return "RSA CYPHER";
        }
    },
    DSA {
        @Override
        public String cypher(String message) {
            return "DSA CYPHER";
        }
    };

    public abstract String cypher(String message);
}
