package com.guiDesigner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Blackberry {
    public JTextField tasks;
    public JButton btn;
    public JList toDoList;
    public JPanel panel;

    ArrayList<String> taskList = new ArrayList<String>();

    public Blackberry() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskList.add(tasks.getText());
                for(int i = 0; i < taskList.size(); i++) {
                    toDoList.setListData(taskList.toArray());   // .setListData Constructs a read-only ListModel from an array.
                }                                               // .toArray() pārveido ArrayList uz Array.

            }
        });
    }
}
