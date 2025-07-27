package FactoryPattern;
public class DSAFactory {
    public static algorithm getAlgorithm(String type) {
        switch (type.toLowerCase()) {
            case "sort":
                return new Bubblesort();
            case "search":
                return new BinarySearch();
            default:
                throw new IllegalArgumentException("Unknown algorithm: " + type);
        }
    }
}