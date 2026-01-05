

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contacts;
    private ContactRepository repository;

    public ContactService() {
        repository = new ContactRepository();
        contacts = repository.load();
    }

    public List<Contact> getAll() {
        return contacts;
    }

    public void add(Contact contact) {
        contacts.add(contact);
        repository.save(contacts);
    }

    public void update() {
        repository.save(contacts);
    }

    public void remove(int index) {
        contacts.remove(index);
        repository.save(contacts);
    }

    public List<Contact> search(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
}
