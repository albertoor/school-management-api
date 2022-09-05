package com.aornelass.sm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id private String courseId;
    private String courseName;
    private String description;
    private int schoolYear;
    @DBRef
    List<Subject> subjectList;
}
