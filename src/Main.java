import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String InputString = "autobiography,biology";
        String[] InputStrArray = InputString.split(",");

        // Read Root data
        List<Root> rootList = readRoot();

        // Search root
        RootSet resultRootList = searchRoot(InputStrArray, rootList);

        resultRootList.print();
    }

    private static RootSet searchRoot(String[] InputStrArray, List<Root> rootList) {
        RootSet resultRootList = new RootSet();
        for (int i = 0; i < rootList.size(); i++) {
            Root root = rootList.get(i);
            for (int j = 0; j < InputStrArray.length; j++) {
                if (InputStrArray[j].contains(root.Name)) {
                    root.AddVocabulary(InputStrArray[j]);
                    resultRootList.put(root.Name, root);
                }
            }
        }
        return resultRootList;
    }

    private static List<Root> readRoot() {
        ArrayList<Root> rootList = null;
        try {
            rootList = new ArrayList<>();
            InputStreamReader isr = new InputStreamReader(new FileInputStream("src/source/root.csv"));//檔案讀取路徑
            BufferedReader reader = new BufferedReader(isr);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] item = line.split(",");
                rootList.add(new Root(item));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rootList;
    }
}
