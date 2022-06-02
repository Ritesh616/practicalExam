package com.example.ritesh_prac_16_2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;
class PickerDialog extends AppCompatActivity
{
    // Variable Declaration
    Button dateBtn, timeBtn;
    EditText dateTxt, timeTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_dialog);
        // Bind XML References
        dateBtn = findViewById(R.id.dateButton);
        timeBtn = findViewById(R.id.timeButton);
        dateTxt = findViewById(R.id.dateValue);
        timeTxt = findViewById(R.id.timeValue);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void openDatePicker(View view)
    {
        // Create Calendar Instance
        final Calendar calendarObject = Calendar.getInstance();
        // Get Date Values
        int myYear = calendarObject.get(Calendar.YEAR);
        int myMonth = calendarObject.get(Calendar.MONTH);
        int myDay = calendarObject.get(Calendar.DAY_OF_MONTH);
        // Instantiate DatePickerDialog
        DatePickerDialog datePickerDialog = new
                DatePickerDialog(PickerDialog.this, new
                DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker view, int year, int
                            month, int dayOfMonth)
                    {
                        // Set the current date values to date edit text
                        dateTxt.setText(dayOfMonth + " - " + (month + 1) + " - " + year);
                    }
                }, myYear, myMonth, myDay);
        // Display DatePickerDialog
        datePickerDialog.show();
    }
    public void openTimePicker(View view)
    {
        // Create Calendar Instance
        final Calendar calendarObj = Calendar.getInstance();
        // Get Current Time Values
        int myHour = calendarObj.get(Calendar.HOUR_OF_DAY);
        int myMinute = calendarObj.get(Calendar.MINUTE);
        // Instantiate TimePickerDialog
        TimePickerDialog timePickerDialog = new
                TimePickerDialog(PickerDialog.this, new
                TimePickerDialog.OnTimeSetListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute)
                    {
                        // Set the current date values to time edit text
                        timeTxt.setText(hourOfDay + " : " + minute);
                    }
                }, myHour, myMinute, false);
        // Display TimePickerDialog
        timePickerDialog.show();
    }
}
