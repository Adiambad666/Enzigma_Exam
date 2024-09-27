package com.example.exam2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID  id;

    @NotBlank(message = "Assigned To is mandatory")
    private String assignedTo;

    @NotBlank(message = "Status is mandatory")
    private String status;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @NotBlank(message = "Priority is mandatory")
    private String priority;

    private String comments;

    // Getters and Setters
    public UUID  getId() { return id; }
    public void setId(UUID  id) { this.id = id; }
    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}
