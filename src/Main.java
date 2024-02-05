import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set = fillHashSet(set);

        String element = "element";

        set.add(element);

        boolean isPartOfSet = set.contains(element);

        System.out.println("The Element \" " + element + " \" is part of set? " + "\n" + isPartOfSet);
    }

    private static HashSet<String> fillHashSet(HashSet<String> set) {
        set.add("uno");
        set.add("due");
        set.add("tre");
        return set;
    }
}