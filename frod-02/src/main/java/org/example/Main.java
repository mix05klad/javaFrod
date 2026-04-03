package org.example;

public class Main {
    public static void main(String[] args) {

        // Δημιουργία πίνακα βαθμών για τον φοιτητή
        double[] grades = {8.0, 7.0, 9.0};

        // Δημιουργία αντικειμένου Student
        Student student = new Student("Giorgos", 20, grades);

        // Κλήση των μεθόδων για εμφάνιση ονόματος, ηλικίας και μέσου όρου
        student.displayInfo();
    }
}