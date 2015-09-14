package com.parkervogt.c3express;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity implements View.OnClickListener{
    int correctAnswer;
    Button buttonObjectChoice1;
    Button buttonObjectChoice2;
    Button buttonObjectChoice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        int partA = 9;
        int partB = 9;
        correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;
        //link objects
        TextView textObjectPartA = (TextView)findViewById(R.id.textPartA);
        TextView textObjectPartB = (TextView)findViewById(R.id.textPartB);
        buttonObjectChoice1 = (Button)findViewById(R.id.buttonChoice1);
        buttonObjectChoice2 = (Button)findViewById(R.id.buttonChoice2);
        buttonObjectChoice3 = (Button)findViewById(R.id.buttonChoice3);
        //Set Text
        textObjectPartA.setText(""+partA);
        textObjectPartB.setText(""+partB);
        buttonObjectChoice1.setText(""+correctAnswer);
        buttonObjectChoice2.setText(""+wrongAnswer1);
        buttonObjectChoice3.setText(""+wrongAnswer2);
        buttonObjectChoice1.setOnClickListener(this);
        buttonObjectChoice2.setOnClickListener(this);
        buttonObjectChoice3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int answerGiven=0;
        switch(view.getId()){
            case R.id.buttonChoice1:
                answerGiven = Integer.parseInt(""+buttonObjectChoice1.getText());
                if(answerGiven==correctAnswer){
                    Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonChoice2:
                answerGiven = Integer.parseInt(""+buttonObjectChoice2.getText());
                if(answerGiven==correctAnswer){
                    Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonChoice3:
                answerGiven = Integer.parseInt(""+buttonObjectChoice3.getText());
                if(answerGiven==correctAnswer){
                    Toast.makeText(getApplicationContext(),"Well done!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
