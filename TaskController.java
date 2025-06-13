package com.example.tasktracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // Home Page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // View All Tasks
    @GetMapping("/tasks")
    public String viewTasks(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    // Show Add Task Form
    @GetMapping("/add-task")
    public String addTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "add-task";
    }

    // Add or Save New Task
    @PostMapping("/add-task")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    // Show Edit Task Form
    @GetMapping("/edit-task/{id}")
    public String editTaskForm(@PathVariable Long id, Model model) {
        Task existingTask = taskRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid task ID: " + id));
        model.addAttribute("task", existingTask);
        return "edit-task";
    }

    // Update Task
    @PostMapping("/update-task/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute("task") Task updatedTask) {
        Task existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask != null) {
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDueDate(updatedTask.getDueDate());
            existingTask.setCompleted(updatedTask.isCompleted());
            taskRepository.save(existingTask);
        }
        return "redirect:/tasks";
    }

    // Delete Task
    @GetMapping("/delete-task/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
        return "redirect:/tasks";
    }

    // Mark Task as Complete
    @GetMapping("/complete-task/{id}")
    public String completeTask(@PathVariable Long id) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setCompleted(true);
            taskRepository.save(task);
        }
        return "redirect:/tasks";
    }
}
