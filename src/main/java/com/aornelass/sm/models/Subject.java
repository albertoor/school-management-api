package com.aornelass.sm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "subjects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id private String subjectId;
    private String name;
    @DocumentReference(collection = "courses", lazy = true)
    private Course course;
}
