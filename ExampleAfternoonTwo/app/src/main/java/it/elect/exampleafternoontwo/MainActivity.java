package it.elect.exampleafternoontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declarations
    Button btnGreet;
    EditText txtName;
    TextView lblDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Bindings
        btnGreet = findViewById(R.id.btnGreet);
        txtName = findViewById(R.id.txtName);
        lblDisplay = findViewById(R.id.lblDisplay);

        btnGreet.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        // logic
        switch (view.getId())
        {
            case R.id.btnGreet:
            {
               //Do your code
                String name = txtName.getText().toString();

                //check if name is not empty
                if(name.isEmpty())
                {
                    //display error
                    txtName.setError("Required!");
                }
                else
                {
                    lblDisplay.setText("Hello, " + name + "!");
                    txtName.setText("");
                }

            }
            break;
        }
    }
}