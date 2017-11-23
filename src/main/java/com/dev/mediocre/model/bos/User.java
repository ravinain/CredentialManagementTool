package com.dev.mediocre.model.bos;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Ravi Nain on 11/18/2017.
 */
@Entity
public class User {

    @Id
    private String userId;
    private String password;
    private boolean activeFlag;
    private Timestamp accountOpenTs;
    private Timestamp lastAccessedTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Timestamp getAccountOpenTs() {
        return accountOpenTs;
    }

    public void setAccountOpenTs(Timestamp accountOpenTs) {
        this.accountOpenTs = accountOpenTs;
    }

    public Timestamp getLastAccessedTs() {
        return lastAccessedTs;
    }

    public void setLastAccessedTs(Timestamp lastAccessedTs) {
        this.lastAccessedTs = lastAccessedTs;
    }
}
