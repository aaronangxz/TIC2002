package Coursemology.week4.W4E1;

public class Deadline extends Todo {
    protected String by;
    public Deadline(String description,String date) {
        super(description);
        this.by = date;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String date) {
        by = date;
    }
}