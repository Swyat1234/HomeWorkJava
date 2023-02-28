package HomeWork220223;

public class SymbolsInString {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] strArray = str.toCharArray();
        for (Character symbol : alphabet) {
            int count = 0;
            for (char elem : strArray) {
                if (symbol == elem) {
                    count++;
                }
            }
            System.out.println(symbol + " " + count);
        }
    }
}


