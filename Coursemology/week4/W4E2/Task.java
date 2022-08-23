package Coursemology.week4.W4E2;

public class Task {
    protected String description;
    public Task(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    //TODO: Add your code here
    @Override
    public String toString() {
        return "description: " + description;
    }
}