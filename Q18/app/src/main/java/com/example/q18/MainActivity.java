package com.example.q18;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextRollNo;

    public static final String DATABASE_name = "myDataBase";
    SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase = openOrCreateDatabase(DATABASE_name, 0, null);
//      we have to execute following line only first time
     createTable();
        editTextName = findViewById(R.id.name);
        editTextRollNo = findViewById(R.id.roll);

        findViewById(R.id.insert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addStudent();
            }
        });

        findViewById(R.id.display).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayStudent();
            }
        });

        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteStudent();
            }
        });
    }

    private void createTable(){
        String query = "CREATE TABLE students (rollNo INTEGER NOT NULL, name varchar (200) NOT NULL);";
        mDatabase.execSQL(query);
    }

    //    Insertion Operation
    private void addStudent() {
        String name = editTextName.getText().toString();
        String roll = editTextRollNo.getText().toString();

        if(roll.isEmpty()) {
            editTextRollNo.setError("Name can't be empty");
            editTextRollNo.requestFocus();
            return;
        }
        if(name.isEmpty()) {
            editTextName.setError("Name can't be empty");
            editTextName.requestFocus();
            return;
        }

        String insertQuery = "INSERT INTO students(rollNo, name)"+"VALUES (?, ?)";
        mDatabase.execSQL(insertQuery, new String[]{roll, name});
        Toast.makeText(this, "Student Added", Toast.LENGTH_SHORT).show();


    }

    //    Displaying the Data
    private void displayStudent(){
        Cursor c = mDatabase.rawQuery("SELECT * FROM students", null);
        StringBuffer buffer = new StringBuffer();
        while (c.moveToNext()){
            buffer.append("Roll No. : ").append(c.getString(0)).append("\n");
            buffer.append("Name. : ").append(c.getString(1)).append("\n");
        }

        Toast.makeText(MainActivity.this, "All Records : \n "+buffer.toString(), Toast.LENGTH_LONG).show();
    }

    //    Deletion operation
    private void deleteStudent(){
        String roll = editTextRollNo.getText().toString();
        String deleteQuery = "DELETE FROM students WHERE rollNo = ?";
        mDatabase.execSQL(deleteQuery, new String[]{roll});
        Toast.makeText(this, "Row deleted!!!", Toast.LENGTH_SHORT).show();
    }
}