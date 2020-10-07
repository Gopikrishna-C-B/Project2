package com.gpk.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Button button;
    private ToggleButton toggleButton;
    private Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bn_its_me_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "its me button", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch_button);

        toggleButton.setOnCheckedChangeListener(this);
        aSwitch.setOnCheckedChangeListener(this);

    }


    public void buttonClickHandler(View view)
    {
        Toast.makeText(this,"dude button",Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonSelected(View view)
    {
        boolean isChecked = ((RadioButton)view).isChecked();

        switch (view.getId())
        {

            case R.id.yes_button:
                if(isChecked)
                    shoMessage("Attending : Yes");
                break;
            case R.id.no_button:
                if (isChecked)
                    shoMessage("Attending : No");
                break;
        }

    }

    private void  shoMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    public void onCheckBoxSelected(View view)
    {
        boolean isChecked = ((CheckBox)view).isChecked();

        switch (view.getId())
        {
            case R.id.checkBox_meat:
                if(isChecked)
                    showMessage("Meat Selected");
                else
                    showMessage("Meat Removed");
                     break;
            case R.id.checkBox_veggie:
                if(isChecked)
                    showMessage("Veggie Selected");
                else
                    showMessage("Veggie Removed");
                    break;
        }

    }

    private void showMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        switch (compoundButton.getId())
        {
            case R.id.switch_button:
                if (b)
                    shMessage("switch is on");
                else
                    shMessage("switch is off");
                     break;
            case R.id.toggleButton:
                if (b)
                    shMessage("toggle button is on");
                else
                    shMessage("toggle button is off");
                break;
        }
    }

    public void shMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
