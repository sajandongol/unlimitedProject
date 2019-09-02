package com.task.task.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Queries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long userId;
    private String queries;

    public Queries() {}

    public Queries(Long userId, String queries) {
        this.userId = userId;
        this.queries = queries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getQueries() {
        return queries;
    }

    public void setQueries(String queries) {
        this.queries = queries;
    }

    @Override
    public String toString() {
        return "Queries{" +
                "id=" + id +
                ", userId=" + userId +
                ", queries='" + queries + '\'' +
                '}';
    }
}
