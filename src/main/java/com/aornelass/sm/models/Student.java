package com.aornelass.sm.models;

import com.aornelass.sm.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id private String studentId;
    private String fName;
    private String lName;
    private String career;
    private Gender gender;
    private String email;
    private String password;
    private String phone;
    private LocalDate dob;
    private boolean status;
}
