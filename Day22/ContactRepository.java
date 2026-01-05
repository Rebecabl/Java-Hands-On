
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {

    private final String FILE_PATH = "data/contacts.csv";

    public List<Contact> load() {
        List<Contact> contacts = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) return contacts;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                contacts.add(Contact.fromCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public void save(List<Contact> contacts) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Contact c : contacts) {
                pw.println(c.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
