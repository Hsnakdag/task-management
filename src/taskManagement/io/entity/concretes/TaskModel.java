package taskManagement.io.entity.concretes;

import java.util.Date;

public class TaskModel {

    private int    id;
    private double budget;
    private String name;
    private Date   deadline;
    private String status;
    private String explanation;
    private int    subTaskId;


    public int getId() {
        return this.id;
    }

    public int getSubTaskId() {
        return subTaskId;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(final double budget) {
        this.budget = budget;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return this.deadline;
    }

    public void setDeadline(final Date deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(final String explanation) {
        this.explanation = explanation;
    }

    public void setSubTaskId(final int subTaskId) {
        this.subTaskId = subTaskId;
    }
}
