package com.example.Payroll;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could Not find employee with ID: "+id);
    }
}
