
import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) throws Exception {
        HashMap <String, String> names = new HashMap<>();
        names.put("Mathew", "Matt");
        names.put("Michael", "Mix");
        names.put("Arthur", "Artie");

        System.out.println(names.get("Mathew"));
    }

}
