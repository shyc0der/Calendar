package com.example.calendar;

;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button edit,delete,add;
    TextView day;CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edit=findViewById(R.id.editq);
         delete=findViewById(R.id.deleteq);
       add=findViewById(R.id.addq);
       calendarView=findViewById(R.id.calendar);
       day=findViewById(R.id.day);
       calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
String Date= dayOfMonth + "-"
                       + (month + 1) + "-" + year;

           day.setText(Date);}
       });
    }




}
