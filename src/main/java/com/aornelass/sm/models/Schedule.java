package com.aornelass.sm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalTime;
import java.util.List;

@Document(collection = "schedules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id private String scheduleId;
    @DocumentReference(collection = "courses", lazy = true)
    private Course course;
    @DocumentReference(collection = "instructors", lazy = true)
    private Instructor instructor;
    private List<String> days;
    private LocalTime timeStart;
    private LocalTime timeEnd;
}
