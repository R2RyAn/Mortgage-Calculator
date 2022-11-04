package ca.yorku.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void glue(View v){
        EditText principle = (EditText)findViewById(R.id.Principle);
        EditText amortization = (EditText)findViewById(R.id.amortizationText);
        EditText interest = (EditText)findViewById(R.id.interestText);
        String p = principle.getText().toString();
        String a = amortization.getText().toString();
        String i = interest.getText().toString();
        TextView answer1 = (TextView)findViewById(R.id.answer);

        MortgageModel MM = new MortgageModel(p,a,i);
        String Mortgage_final = MM.computePayment();
        answer1.setText(Mortgage_final);


    }
}