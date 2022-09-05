package com.aornelass.sm.models;

import com.aornelass.sm.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "instructors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    @Id private String instructorId;
    private String fName;
    private String lName;
    private Gender gender;
    private String email;
    private String password;
    private String phone;
    private LocalDate dob;
    @DBRef
    List<Course> courses;
}
