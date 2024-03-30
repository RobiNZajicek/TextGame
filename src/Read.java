import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
    private String path = "Map.txt";
    private ArrayList<String> lr = new ArrayList<>();
    BufferedReader br;

    public void inputs() {
        try {
            br = new BufferedReader(new FileReader(path));
            String s;
            while ((s = br.readLine()) != null) {
                lr.add(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getLr() {
        return lr;
    }

    public String getOnePart(int i) {
        return lr.get(i);
    }

    @Override
    public String toString() {
        return "Input{" + "list=" + lr + '}';
    }
}
