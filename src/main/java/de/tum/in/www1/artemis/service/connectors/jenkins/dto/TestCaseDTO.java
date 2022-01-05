package de.tum.in.www1.artemis.service.connectors.jenkins.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TestCaseDTO {

    private String name;

    private String classname;

    private double time;

    private List<TestCaseDetailMessageDTO> failures = new ArrayList<>();

    private List<TestCaseDetailMessageDTO> errors = new ArrayList<>();

    private List<TestCaseDetailMessageDTO> successInfos = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public List<TestCaseDetailMessageDTO> getFailures() {
        return failures;
    }

    public void setFailures(List<TestCaseDetailMessageDTO> failures) {
        this.failures = failures;
    }

    public List<TestCaseDetailMessageDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<TestCaseDetailMessageDTO> errors) {
        this.errors = errors;
    }

    public List<TestCaseDetailMessageDTO> getSuccessInfos() {
        return successInfos;
    }

    public void setSuccessInfos(List<TestCaseDetailMessageDTO> successInfos) {
        this.successInfos = successInfos;
    }

    @JsonIgnore
    public boolean isSuccessful() {
        return CollectionUtils.isEmpty(errors) && CollectionUtils.isEmpty(failures);
    }
}
