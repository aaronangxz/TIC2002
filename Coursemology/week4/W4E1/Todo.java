package Coursemology.week4.W4E1;

public class Todo extends Task {
    protected boolean isDone;
    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public boolean isDone() {
        return isDone;
    }
}