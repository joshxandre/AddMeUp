package com.example.joshxandre.addmeup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnequal;
    private EditText fn;
    private EditText sn;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnequal = (Button)findViewById(R.id.btnequal);
        fn = (EditText)findViewById(R.id.fn);
        sn = (EditText)findViewById(R.id.sn);
        txtresult = (TextView)findViewById(R.id.txtresult);
        btnequal.setOnClickListener(this);
    }
     public void onClick(View view)
     {
         String first = fn.getText().toString();
         String sec = sn.getText().toString();

          int addition = Integer.parseInt(first)+Integer.parseInt(sec);
         txtresult.setText(String.valueOf(addition));

}

}

