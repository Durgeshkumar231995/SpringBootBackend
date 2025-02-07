package com.java.in.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectEngineerResponseBO {

    private String projectName;
    private String projectCode;
    private String engineerName;
    private String email;
    private String temp;
    private String loc;

    public ProjectEngineerResponseBO(String projectName, String projectCode, String engineerName, String email) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.engineerName = engineerName;
        this.email = email;
    }

    public ProjectEngineerResponseBO(String projectName, String engineerName) {
        this.projectName = projectName;
        this.engineerName = engineerName;
    }


}
