package com.example.databinding.expression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;

import com.example.databinding.ObjectBindingActivity;
import com.example.databinding.R;
import com.example.databinding.databinding.ActivityExpressionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expression);

        ActivityExpressionBinding binding = DataBindingUtil.setContentView(ExpressionActivity.this, R.layout.activity_expression);


        Student hasan = new Student("mehedi", 13);

        List<Student> students = new ArrayList<>();

        students.add(hasan);

        Map<String, Integer> namvsAge = new HashMap<>();
        namvsAge.put(hasan.getName(),hasan.getAge());

        binding.setStudents(students);
        binding.setNamvsAge(namvsAge);


    }

    public class Student{
        String name;
        int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
