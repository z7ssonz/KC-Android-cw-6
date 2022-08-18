package com.example.cw6;

public class Student {

         private String studentName;
         private int studentAge;
         private int studentGrade;
         private int studentImg;

    public String getStudentNamel() {
        return studentName;
    }

    public void setStudentNamel(String studentNamel) {
        this.studentName = studentNamel;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }

    public Student(String studentNamel, int studentAge, int studentGrade, int studentImg) {
        this.studentName = studentNamel;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentImg = studentImg;

    }


}
