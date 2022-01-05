package de.tum.in.www1.artemis.service.connectors.bitbucket.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BitbucketUserDTO {

    private String user;

    private Set<String> groups = new HashSet<>();

    public String getUser() {
        return user;
    }

    public void setUser(String username) {
        this.user = username;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    /**
     * needed for Jackson
     */
    public BitbucketUserDTO() {
    }

    public BitbucketUserDTO(String username, Set<String> groups) {
        this.user = username;
        this.groups = groups;
    }
}
