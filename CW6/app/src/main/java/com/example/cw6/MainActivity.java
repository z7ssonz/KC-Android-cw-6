package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> student = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student s1 = new Student("yousef",14,10.R.drawable.boy1);
        Student s2 = new Student("salman", 13,10,R.drawable.boy2);
        Student s3 = new Student("majed", 15,11,R.drawable.boy3);

        student.add(s1);
        student.add(s2);
        student.add(s3);



    }

}