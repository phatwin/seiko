package dev.songpola.seiko.task;

import dev.songpola.seiko.task.model.TaskModel;

import javax.swing.*;
import java.awt.*;

public class TaskList extends JPanel {
    private final TaskModel model = new TaskModel();
    private final JList<String> taskList;

    public TaskList() {
        super(new BorderLayout());
        taskList = new JList<>(model);
        var scrollPane = new JScrollPane(taskList);
        taskList.setFocusable(false);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void addTask(String task) {
        model.addTask(task);
    }

    public void removeTask(int index) {
        model.removeTask(index);
    }

    public void markTaskAsCompleted(int index) {
        model.markTaskAsCompleted(index);
    }

    public int getSelectedIndex() {
        return taskList.getSelectedIndex();
    }
}
