
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ContactUI extends JFrame {

    private JTextField nameField, phoneField, emailField, searchField;
    private JComboBox<String> categoryBox;
    private JTable table;
    private DefaultTableModel model;
    private ContactService service;

    public ContactUI() {
        service = new ContactService();

        setTitle("Contact Manager");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new DefaultTableModel(new String[]{"Nome", "Telefone", "Email", "Categoria"}, 0);
        table = new JTable(model);

        loadTable();

        nameField = new JTextField(10);
        phoneField = new JTextField(10);
        emailField = new JTextField(10);
        categoryBox = new JComboBox<>(new String[]{"Familia", "Trabalho", "Amigos"});

        JButton addBtn = new JButton("Adicionar");
        JButton removeBtn = new JButton("Excluir");

        addBtn.addActionListener(e -> addContact());
        removeBtn.addActionListener(e -> removeContact());

        JPanel form = new JPanel();
        form.add(new JLabel("Nome"));
        form.add(nameField);
        form.add(new JLabel("Telefone"));
        form.add(phoneField);
        form.add(new JLabel("Email"));
        form.add(emailField);
        form.add(categoryBox);
        form.add(addBtn);
        form.add(removeBtn);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void loadTable() {
        model.setRowCount(0);
        for (Contact c : service.getAll()) {
            model.addRow(new Object[]{c.getName(), c.getPhone(), c.getEmail(), c.getCategory()});
        }
    }

    private void addContact() {
        Contact c = new Contact(
                nameField.getText(),
                phoneField.getText(),
                emailField.getText(),
                categoryBox.getSelectedItem().toString()
        );
        service.add(c);
        loadTable();
    }

    private void removeContact() {
        int row = table.getSelectedRow();
        if (row >= 0) {
            service.remove(row);
            loadTable();
        }
    }
}
