 package com.example.ritesh_prac_26;

 import android.os.AsyncTask;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     // creating variables for our edittext, button and dbhandler
     private EditText courseNameEdt, courseTracksEdt, courseDurationEdt, courseDescriptionEdt;
     private Button addCourseBtn;
     private DBHandler dbHandler;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         // initializing all our variables.
         courseNameEdt = findViewById(R.id.idName);
         courseTracksEdt = findViewById(R.id.idRoll);
         courseDurationEdt = findViewById(R.id.idCourse);
         courseDescriptionEdt = findViewById(R.id.idDivision);
         addCourseBtn = findViewById(R.id.idAddStudent);

         // creating a new dbhandler class
         // and passing our context to it.
         dbHandler = new DBHandler(MainActivity.this);

         // below line is to add on click listener for our add course button.
         addCourseBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 new Downloader().execute();

                 // below line is to get data from all edit text fields.
                 String courseName = courseNameEdt.getText().toString();
                 String courseTracks = courseTracksEdt.getText().toString();
                 String courseDuration = courseDurationEdt.getText().toString();
                 String courseDescription = courseDescriptionEdt.getText().toString();

                 // validating if the text fields are empty or not.
                 if (courseName.isEmpty() && courseTracks.isEmpty() && courseDuration.isEmpty() && courseDescription.isEmpty()) {
                     Toast.makeText(MainActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                     return;
                 }

                 // on below line we are calling a method to add new
                 // course to sqlite data and pass all our values to it.
                 dbHandler.addNewCourse(courseName, courseDuration, courseDescription, courseTracks);

                 // after adding the data we are displaying a toast message.
                 Toast.makeText(MainActivity.this, "Student has been added.", Toast.LENGTH_SHORT).show();
                 courseNameEdt.setText("");
                 courseDurationEdt.setText("");
                 courseTracksEdt.setText("");
                 courseDescriptionEdt.setText("");
             }
         });
     }

     class Downloader extends AsyncTask<Void, Integer, Integer> {

         @Override
         protected Integer doInBackground(Void... voids) {
             return null;
         }
         @Override
         protected void onPostExecute(Integer result) {
             // TODO Auto-generated method stub
             super.onPostExecute(result);

             Toast.makeText(getApplicationContext(), "(AsyncTask) Data Added to Database !!", Toast.LENGTH_LONG).show();
         }
     }
 }