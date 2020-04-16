import java.util.ArrayList;
import java.util.HashMap;

public class Root {
    String Name;
    String Definition;
    ArrayList<String> Vocabulary = new ArrayList<>();

    public Root(String[] raw) {
        if (raw.length >= 1) this.Name = raw[0];
        if (raw.length >= 2) this.Definition = raw[1];
    }

    public void print() {
        if (Name != null) System.out.println("Root Name:\t" + this.Name);
        if (Definition != null) System.out.println("Root Definition:\t" + this.Definition);
        if (Vocabulary != null) System.out.println("Root Vocabulary:\t" + String.join(",", this.Vocabulary));
        if (!this.isEmpty()) System.out.println("------------------------------------");
    }

    private boolean isEmpty() {
        return Name.isEmpty() || Definition.isEmpty();
    }

    public void AddVocabulary(String vocabulary) {
        this.Vocabulary.add(vocabulary);
    }
}

