package com.example.ajman.gpa_alsulamik1_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView displayLabel;
private EditText subject1,subject2,subject3,subject4,subject5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayLabel=(TextView) findViewById(R.id.displayGPA);
        subject1=(EditText)findViewById(R.id.editText2);
        subject2=(EditText)findViewById(R.id.editText3);
        subject3=(EditText)findViewById(R.id.editText4);
        subject4=(EditText)findViewById(R.id.editText5);
        subject5=(EditText)findViewById(R.id.editText6);
    }
    public void ComputeGPA(View view) {
        RelativeLayout main=(RelativeLayout)findViewById(R.id.container);
        int gpa=-1,gpa1=-1,gpa2=-1,gpa3=-1,gpa4=-1;
        String grade=subject1.getText().toString();
        if(grade.equals("A+")){gpa=100;}else if(grade.equals("A")){gpa=95;}else if(grade.equals("A-")){gpa=90;}
        else if(grade.equals("B+")){gpa=85;}else if(grade.equals("B")){gpa=80;}else if(grade.equals("B-")){gpa=75;}
       else if(grade.equals("C")){gpa=50;}else if(grade.equals("D")){gpa=25;}else if(grade.equals("F")){gpa=0;}
       else {subject1.setTextColor(Color.RED);}
        String grade1=subject2.getText().toString();
        if(grade1.equals("A+")){gpa1=100;}else if(grade1.equals("A")){gpa1=95;}else if(grade1.equals("A-")){gpa1=90;}
        else if(grade1.equals("B+")){gpa1=85;}else if(grade1.equals("B")){gpa1=80;}else if(grade1.equals("B-")){gpa1=75;}
        else if(grade1.equals("C")){gpa1=50;}else if(grade1.equals("D")){gpa1=25;}else if(grade1.equals("F")){gpa1=0;}
        else {subject2.setTextColor(Color.RED);}
        String grade2=subject3.getText().toString();
        if(grade2.equals("A+")){gpa2=100;}else if(grade2.equals("A")){gpa2=95;}else if(grade2.equals("A-")){gpa2=90;}
        else if(grade2.equals("B+")){gpa2=85;}else if(grade2.equals("B")){gpa2=80;}else if(grade2.equals("B-")){gpa2=75;}
        else if(grade2.equals("C")){gpa2=50;}else if(grade2.equals("D")){gpa2=25;}else if(grade2.equals("F")){gpa2=0;}
        else {subject3.setTextColor(Color.RED);}
        String grade3=subject4.getText().toString();
        if(grade3.equals("A+")){gpa3=100;}else if(grade3.equals("A")){gpa3=95;}else if(grade3.equals("A-")){gpa3=90;}
        else if(grade3.equals("B+")){gpa3=85;}else if(grade3.equals("B")){gpa3=80;}else if(grade3.equals("B-")){gpa3=75;}
        else if(grade3.equals("C")){gpa3=50;}else if(grade3.equals("D")){gpa3=25;}else if(grade3.equals("F")){gpa3=0;}
        else {subject4.setTextColor(Color.RED);}
        String grade4=subject5.getText().toString();
        int totalgpa=-1;
        if(grade4.equals("A+")){gpa4=100;}else if(grade4.equals("A")){gpa4=95;}else if(grade4.equals("A-")){gpa4=90;}
        else if(grade4.equals("B+")){gpa4=85;}else if(grade4.equals("B")){gpa4=80;}else if(grade4.equals("B-")){gpa4=75;}
        else if(grade4.equals("C")){gpa4=50;}else if(grade4.equals("D")){gpa4=25;}else if(grade4.equals("F")){gpa4=0;}
        else {subject5.setTextColor(Color.RED);}
        if(gpa>=0&&gpa1>=0&&gpa2>=0&&gpa3>=0&&gpa4>=0){
         totalgpa=(gpa+gpa1+gpa2+gpa3+gpa4)/5;
        displayLabel.setText("Your GPA is "+ totalgpa);}
        else Toast.makeText(MainActivity.this,"grades are not correct", Toast.LENGTH_SHORT).show();
        if(totalgpa<60&&totalgpa>=0){
main.setBackgroundColor(Color.RED);
        }
        if(totalgpa>60&&totalgpa<80){
            main.setBackgroundColor(Color.YELLOW);
        }
        if(totalgpa>80){
            main.setBackgroundColor(Color.GREEN);

        }
        Button button = (Button)findViewById(R.id.button);
        if(button.getText()=="Clearform"){
            finish();
            startActivity(getIntent());
        }
        else button.setText("Clearform");
    }
}
