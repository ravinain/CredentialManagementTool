package com.dev.mediocre.model.bos;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ravi Nain on 11/18/2017.
 */
@Entity
public class ConfidentialInfoUserKey {

    @Id
    private String userId;
    private String encryptionKey;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }
}
