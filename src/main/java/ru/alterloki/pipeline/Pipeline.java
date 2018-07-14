package ru.alterloki.pipeline;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Pipeline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(targetEntity=ActionMetaInfo.class)
    private List<ActionMetaInfo> metaInfos = new ArrayList<>();

    public Pipeline() {
    }

    public Pipeline(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addAction(ActionMetaInfo actions) {
        metaInfos.add(actions);
    }

    public List<ActionMetaInfo> getActionMetaInfos() {
        return metaInfos;
    }
}
