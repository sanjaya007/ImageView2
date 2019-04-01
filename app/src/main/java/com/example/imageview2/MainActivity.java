package com.example.imageview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioKiranSir,radioDemi,radioMiley;
    ImageView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioKiranSir = findViewById(R.id.radioKiranSir);
        radioMiley = findViewById(R.id.radioMiley);
        radioDemi = findViewById(R.id.radiodDemi);
        mainView = findViewById(R.id.imageViewMain);

        radioKiranSir.setOnClickListener(this);
        radioMiley.setOnClickListener(this);
        radioDemi.setOnClickListener(this);

    }

    private void changeImage(){
        Toast toast = Toast.makeText(this,"Your Message",Toast.LENGTH_LONG);
        toast.show();
        //mainView.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public void onClick(View v) {

        switch ( v.getId() ){
            case R.id.radioKiranSir:
                changeImage();
                break;

            case R.id.radioMiley:
                changeImage();
                break;

            case R.id.radiodDemi:
                changeImage();
                break;
        }

    }
}
