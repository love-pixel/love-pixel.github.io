package com.web.big.homework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher  {
    private Integer teacherId;
    private String teacherName;
    private String teacherIntroduce;
    private Major major;
}
