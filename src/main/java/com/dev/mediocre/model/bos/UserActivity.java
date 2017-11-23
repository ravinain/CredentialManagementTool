package com.dev.mediocre.model.bos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by Ravi Nain on 11/18/2017.
 */
@Entity
public class UserActivity {

    @Id
    private Long id;
    private String userId;
    private Timestamp activityTs;
    private String activityDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getActivityTs() {
        return activityTs;
    }

    public void setActivityTs(Timestamp activityTs) {
        this.activityTs = activityTs;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }
}
