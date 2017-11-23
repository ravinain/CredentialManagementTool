package com.dev.mediocre.model.bos;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ravi Nain on 11/18/2017.
 */
@Entity
public class UserSecurityInfo {

    @Id
    private String userId;
    private String securityQuestion1;
    private String securityAnswer1;
    private String securityQuestion2;
    private String securityAnswer2;
    private String securityQuestion3;
    private String securityAnswer3;
    private String securityQuestion4;
    private String securityAnswer4;
    private String securityQuestion5;
    private String securityAnswer5;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSecurityQuestion1() {
        return securityQuestion1;
    }

    public void setSecurityQuestion1(String securityQuestion1) {
        this.securityQuestion1 = securityQuestion1;
    }

    public String getSecurityAnswer1() {
        return securityAnswer1;
    }

    public void setSecurityAnswer1(String securityAnswer1) {
        this.securityAnswer1 = securityAnswer1;
    }

    public String getSecurityQuestion2() {
        return securityQuestion2;
    }

    public void setSecurityQuestion2(String securityQuestion2) {
        this.securityQuestion2 = securityQuestion2;
    }

    public String getSecurityAnswer2() {
        return securityAnswer2;
    }

    public void setSecurityAnswer2(String securityAnswer2) {
        this.securityAnswer2 = securityAnswer2;
    }

    public String getSecurityQuestion3() {
        return securityQuestion3;
    }

    public void setSecurityQuestion3(String securityQuestion3) {
        this.securityQuestion3 = securityQuestion3;
    }

    public String getSecurityAnswer3() {
        return securityAnswer3;
    }

    public void setSecurityAnswer3(String securityAnswer3) {
        this.securityAnswer3 = securityAnswer3;
    }

    public String getSecurityQuestion4() {
        return securityQuestion4;
    }

    public void setSecurityQuestion4(String securityQuestion4) {
        this.securityQuestion4 = securityQuestion4;
    }

    public String getSecurityAnswer4() {
        return securityAnswer4;
    }

    public void setSecurityAnswer4(String securityAnswer4) {
        this.securityAnswer4 = securityAnswer4;
    }

    public String getSecurityQuestion5() {
        return securityQuestion5;
    }

    public void setSecurityQuestion5(String securityQuestion5) {
        this.securityQuestion5 = securityQuestion5;
    }

    public String getSecurityAnswer5() {
        return securityAnswer5;
    }

    public void setSecurityAnswer5(String securityAnswer5) {
        this.securityAnswer5 = securityAnswer5;
    }
}
