package com.todolist.demo.model;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoTask {

    private long id;
    private long usersID;
    private String content;
    private boolean done;

    public TodoTask() {

    }

    public TodoTask(long id, long usersID, String content, boolean done) {
        this.id = id;
        this.usersID = usersID;
        this.content = content;
        this.done = done;
    }
    @Id
    @GeneratedValue

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUsersID() {
        return usersID;
    }

    public void setUsersID(long usersID) {
        this.usersID = usersID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
