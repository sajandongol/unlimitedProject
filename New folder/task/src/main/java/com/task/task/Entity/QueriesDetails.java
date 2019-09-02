package com.task.task.Entity;

public class QueriesDetails {

    User user;
    Queries queries;

    public QueriesDetails(){}

    public QueriesDetails(User user, Queries queries) {
        this.user = user;
        this.queries = queries;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Queries getQueries() {
        return queries;
    }

    public void setQueries(Queries queries) {
        this.queries = queries;
    }
}
