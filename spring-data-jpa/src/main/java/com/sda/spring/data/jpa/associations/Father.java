package com.sda.spring.data.jpa.associations;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "father")
@Entity
public class Father {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "father_id")
    private List<Son> sonList = new ArrayList<>();

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Son> getSonList() {
        return sonList;
    }

    public void addSon(Son son) {
        this.sonList.add(son);
    }
}
