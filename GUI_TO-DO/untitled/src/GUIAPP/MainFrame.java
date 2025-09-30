package GUIAPP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private JTextField taskField;
    private JButton addButton;
    private JButton deleteButton ;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;


    public MainFrame() {

        setTitle("To-Do List App");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

         taskField = new JTextField(20);
         addButton = new JButton("Add Task");
         deleteButton = new JButton("Delete Task");
         listModel = new DefaultListModel<>();
         taskList = new JList<>(listModel);


        JPanel topPanel = new JPanel();
        topPanel.add(taskField);
        topPanel.add(addButton);
        add(topPanel,BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane,BorderLayout.CENTER);


         JPanel bottomPanel = new JPanel();
         bottomPanel.add(deleteButton);
         add(bottomPanel,BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskField.setText("");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });


    }
}