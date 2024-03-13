
public class string  {
    public static void main(String[] args) {
        String text = "type here to search";
        for (int i = 1; i < text.length(); i += 2) {
            System.out.print(text.charAt(i));
        }
    }
}