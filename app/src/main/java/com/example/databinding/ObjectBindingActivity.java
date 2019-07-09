package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityObjectBindingBinding;

public class ObjectBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_binding);

        ActivityObjectBindingBinding bindingBinding = DataBindingUtil.setContentView(ObjectBindingActivity.this, R.layout.activity_object_binding);

        bindingBinding.setTextOne("TextBinding One");

        bindingBinding.setAStudent(new Student("Mehedi", 22));

        bindingBinding.setHandler(new EventHandler());

    }

    public class EventHandler{
        public void handlerClick(String name){
            Toast.makeText(ObjectBindingActivity.this,name, Toast.LENGTH_LONG).show();
        }
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
