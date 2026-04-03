package org.example;

class Student extends Person {
    private double[] grades; // πίνακας βαθμών

    // Constructor
    public Student(String name, int age, double[] grades) {
        super(name, age); // κλήση του constructor της Person
        this.grades = grades;
    }
    // Μέθοδος υπολογισμού μέσου όρου
    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    // Override της displayInfo για εμφάνιση και μέσου όρου

    public void displayInfo() {
        System.out.println("name: "+super.getName());
        System.out.println("age: "+super.getAge());
        System.out.println("Average: " + calculateAverage());
    }
}
