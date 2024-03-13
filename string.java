
public class string  {
    public static void main(String[] args) {
        String text = "type here to search";
        StringBuilder oddChars = new StringBuilder();
        text = text.replaceAll("\\s", "");
        for (int i = 0; i < text.length(); i++) 
        {
            if (i % 2 == 0)
            {
                oddChars.append(text.charAt(i));
            }
        }
        System.out.println(oddChars.toString());
    }
  }
