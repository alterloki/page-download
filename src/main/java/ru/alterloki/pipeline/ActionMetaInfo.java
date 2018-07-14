package ru.alterloki.pipeline;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class ActionMetaInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private ActionType actionType;

    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="action_meta_info_params", joinColumns=@JoinColumn(name="param_id"))
    private Map<String, String> params = new HashMap<>();

    public ActionMetaInfo() {
    }

    public ActionMetaInfo(ActionType actionType) {
        this.actionType = actionType;
    }

    public void setParam(String name, String value) {
        params.put(name, value);
    }

    public void removeParam(String name) {
        params.remove(name);
    }

    public ActionType getActionType() {
        return actionType;
    }
}
