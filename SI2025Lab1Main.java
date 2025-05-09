import java.util.*;

enum Priority {
    LOW, MEDIUM, HIGH
}

class Task {
    private String name;
    private boolean isCompleted;
    private Priority priority;
    private String category;

    public Task(String name, Priority priority, String category, boolean isCompleted) {
        this.name = name;
        this.priority = priority;
        this.category = category;
        this.isCompleted = isCompleted;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return name + " [" + category + "] - Priority: " + priority + (isCompleted ? " [Completed]" : " [Pending]");
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name, Priority priority, String category, boolean isCompleted) {
        tasks.add(new Task(name, priority, category, isCompleted));
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // MISSING FEATURES:

    // 1. Remove a task by name
    public void removeTask(String name) {
        // TODO: Implement removal logic
    }

    // 2. Find all completed tasks
    public List<Task> printCompletedTasks() {
        // TODO: Implement logic to return completed tasks
        for (Task task : tasks){
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }

        return new ArrayList<>();
    }

    // 3. List tasks sorted by name
    public void sortTasksByName() {
        Collections.sort(tasks, Comparator.comparing(Task::getName));
    }

    // 4. Sort tasks by priority
    public void sortTasksByPriority() {
        // TODO: Implement sorting by priority logic
    }

    // 5. Filter tasks by category
    public List<Task> filterByCategory(String category) {
        // TODO: Implement filtering logic
        return new ArrayList<>();
    }

    // 6. Find the highest-priority unfinished task
    public List<Task> getMostUrgentTasks() {
        // TODO: Implement logic to find most urgent tasks
        return new ArrayList<>();
    }

    // 7. Count tasks per category
    public Map<String, Integer> countTasksPerCategory() {
        // TODO: Implement counting logic
        return new HashMap<>();
    }

    // 8. Mark a task as completed by name
    public void markTaskCompleted(String name) {
        // TODO: Implement completion logic
    }

    // 9. Mark all tasks in a category as completed
    public void markCategoryCompleted(String category) {
        // TODO: Implement bulk completion logic
        for (Task task : tasks){
            if (task.getCategory().equals(category)){
                task.setCompleted(true);
            }
        }
    }
}


public class SI2025Lab1Main {
    public static void main(String[] args) {
        /***
         * Se upotrebeni vekje kreiranite TaskManager's, dodaden e samo dali e isCompleted vo prvi i treti task.
         */
        TaskManager manager = new TaskManager();
        manager.addTask("Write report", Priority.HIGH, "Work", false);
        manager.addTask("Submit assignment", Priority.MEDIUM, "School", false);
        manager.addTask("Buy groceries", Priority.LOW, "Personal", false);

        // MISSING: Calls to the new methods that will be implemented

        manager.printTasks();
        manager.sortTasksByName();
        manager.printCompletedTasks();
        manager.printTasks();
        manager.markCategoryCompleted("School");
        manager.printTasks();
    }
}