package com.example.simplecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView workingTv;
    TextView resultTv;
    String working = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextViews();
    }
    private void setWorkings(String givenValue)
    {
        working = working + givenValue;
        workingTv.setText(working);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.developerId)
        {
            Intent intent = new Intent(getApplicationContext(),country_details_page.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void initTextViews() {
        workingTv = findViewById(R.id.workingsTextId);
        resultTv = findViewById(R.id.resultTextView);
    }

    public void clearOnClick(View view) {
        workingTv.setText("");
        working = "";
        resultTv.setText("");
    }

    public void braketOnClick(View view) {
    }

    public void divisionOnClick(View view) {
        String x = resultTv.getText().toString();
        if(!x.isEmpty())
        {
            workingTv.setText("");
            working = "";

            setWorkings(x);
        }
        setWorkings("/");
    }

    public void sevenOnClick(View view) {
        setWorkings("7");
    }

    public void eightOnClick(View view) {
        setWorkings("8");
    }

    public void nineOnClick(View view) {
        setWorkings("9");
    }

    public void multiplyOnClick(View view) {

        String x = resultTv.getText().toString();
        if(!x.isEmpty())
        {
            workingTv.setText("");
            working = "";

            setWorkings(x);
        }
        setWorkings("X");
    }

    public void fourOnClick(View view) {
        setWorkings("4");
    }

    public void fiveOnClick(View view) {
        setWorkings("5");
    }

    public void sixOnClick(View view) {
        setWorkings("6");
    }

    public void subtractOnClick(View view) {

        String x = resultTv.getText().toString();
        if(!x.isEmpty())
        {
            workingTv.setText("");
            working = "";

            setWorkings(x);
        }

        setWorkings("-");
    }

    public void OneOnClick(View view) {
        setWorkings("1");
    }

    public void twoOnClick(View view) {
        setWorkings("2");
    }

    public void threeOnClick(View view) {
        setWorkings("3");
    }

    public void decimalOnClick(View view) {
        setWorkings(".");
    }

    public void zeroOnClick(View view) {
        setWorkings("0");
    }
    public void doubleZeroOnClick(View view) {
        setWorkings("00");
    }

    public void equalOnClick(View view) {
       try {
           Double v1, v2;

           if (working.contains("-")) {
               String[] arr = working.split("-");
               v1 = Double.parseDouble(arr[0]);
               v2 = Double.parseDouble(arr[1]);
               resultTv.setText(Double.toString(v1-v2));

           }
           else if (working.contains("X")) {
               String[] arr = working.split("X");
               v1 = Double.parseDouble(arr[0]);
               v2 = Double.parseDouble(arr[1]);
               resultTv.setText(Double.toString(v1*v2));
           }
           else if (working.contains("+")) {
               String replaceString=working.replace('+','a');
               String[] arr = replaceString.split("a");
               v1 = Double.parseDouble(arr[0]);
               v2 = Double.parseDouble(arr[1]);
               resultTv.setText(Double.toString(v1+v2));
           }
           else if (working.contains("/")) {
               String[] arr = working.split("/");
               v1 = Double.parseDouble(arr[0]);
               v2 = Double.parseDouble(arr[1]);
               resultTv.setText(Double.toString(v1/v2));


           }
           else if (working.contains("^"))
           {
               String replaceString=working.replace('^','p');
               String[] arr = replaceString.split("p");
               v1 = Double.parseDouble(arr[0]);
               v2 = Double.parseDouble(arr[1]);
               resultTv.setText(Double.toString(Math.pow(v1,v2)));
           }
       }
       catch (Exception e) {
           resultTv.setText("Something wrong!");
       }
    }
    public void powerOnClick(View view) {
        String x = resultTv.getText().toString();
        if(!x.isEmpty())
        {
            workingTv.setText("");
            working = "";

            setWorkings(x);
        }
        setWorkings("^");
    }

    public void additionOnClick(View view) {
        String x = resultTv.getText().toString();
        if(!x.isEmpty())
        {
            workingTv.setText("");
            working = "";

            setWorkings(x);
        }
            setWorkings("+");
    }
}