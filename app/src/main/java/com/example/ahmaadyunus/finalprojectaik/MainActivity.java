package com.example.ahmaadyunus.finalprojectaik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void threePointA(View view){
        scoreA = scoreA+3;
        displayScoreA(scoreA);
    }
    public void twoPointA(View view){
        scoreA = scoreA+2;
        displayScoreA(scoreA);
    }
    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayScoreA(scoreA);
    }
    public void threePointB(View view){
        scoreB = scoreB+3;
        displayScoreB(scoreB);
    }
    public void twoPointB(View view){
        scoreB = scoreB+2;
        displayScoreB(scoreB);
    }
    public void freeThrowB(View view){
        scoreB = scoreB+1;
        displayScoreB(scoreB);
    }
    public void btnReset(View view){
        scoreA = 0;
        scoreB = 0;
        displayDecision("");
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
    public void btnDecision(View view){

        if(scoreA>scoreB){
           displayDecision("The Winner is Team A");
        }else if(scoreB>scoreA){
            displayDecision("The Winner is Team B");
        }else{
            displayDecision("DRAW");
        }

    }
    private void displayScoreA (int scoreA){
        TextView displayScoreA = (TextView) findViewById(R.id.scoreA);
        displayScoreA.setText(""+scoreA);

    }
    private void displayScoreB (int scoreB){
        TextView displayScoreB = (TextView) findViewById(R.id.scoreB);
        displayScoreB.setText(""+scoreB);

    }
    private void displayDecision (String decisionText){
        TextView decision = (TextView) findViewById(R.id.textView_Decision);
        decision.setText(decisionText);

    }
}
