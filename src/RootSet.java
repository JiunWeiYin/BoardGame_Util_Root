import java.util.HashMap;

public class RootSet {
    private HashMap<String, Root> rootList = new HashMap<>();

    public void put(String key, Root root) {
        this.rootList.put(key, root);
    }

    public void print() {
        System.out.println("字根\t\t|\t字根意思\t|\t\t本課有此字根的單字");
        for (String key : this.rootList.keySet()) {
            Root root = this.rootList.get(key);
            String vocabulary = "";
            if (root.Vocabulary != null) {
                vocabulary = String.join(",", root.Vocabulary);
            }
            System.out.println(root.Name + "\t\t|\t" + root.Definition + "\t\t|\t" + vocabulary);
        }
    }

    public boolean isEmpty() {
        return rootList.isEmpty();
    }
}