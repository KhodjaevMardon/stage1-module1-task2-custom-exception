package com.epam.mjc.exception;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(Long studentId) {
        super("Could not find student with ID " + studentId);
    }
}
