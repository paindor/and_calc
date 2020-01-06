package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grade);
        final Context _this = GradeActivity.this;
        final TextView avg = findViewById(R.id.avg);


       /* class Grade{
            int math;
            int kor;
            int eng;
            int avg;

            public int getAvg() {
                return avg;
            }

            public void setAvg(int avg) {
                this.avg = avg;
            }

            public int getMath() {
                return math;
            }

            public void setMath(int math) {
                this.math = math;
            }

            public int getKor() {
                return kor;
            }

            public void setKor(int kor) {
                this.kor = kor;
            }

            public int getEng() {
                return eng;
            }

            public void setEng(int eng) {
                this.eng = eng;
            }
        }*/
       // final Grade gr = new Grade();


        findViewById(R.id.btn_avg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int kor = (Integer.parseInt(findViewById(R.id.kor).toString()));
               int math=(Integer.parseInt(findViewById(R.id.math).toString()));
               int eng=(Integer.parseInt(findViewById(R.id.eng).toString()));

               int avgg = (kor+ math + eng) /3;
                                     
               avg.setText(avgg +"");




            }
        });
    }
}