package com.svlugovoy.estore.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 07.05.2016.
 */
public class Authorities {

    @Id
    @GeneratedValue
    private int authoritiesId;
    private String username;
    private String authority;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAuthoritiesId() {
        return authoritiesId;
    }

    public void setAuthoritiesId(int authoritiesId) {
        this.authoritiesId = authoritiesId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
