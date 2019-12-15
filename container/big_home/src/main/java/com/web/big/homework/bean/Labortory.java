package com.web.big.homework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Labortory {
    private Integer labId;
    private String labName;
    private Teacher labTeacher;
    private Major major;
    private String labStudentName;
    private Integer labStatus;
    private String labProject;
    private Integer labStudentNumber;

}
