package jstam.mrpatotohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // when checkbox is clicked, change image visibility
    public void CheckButton(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // get id for clicked checkbox
        switch(view.getId()) {
            // if checkbox is checked make image visible, of not checked make image invisible
            case R.id.hat_Checkbox:
                ImageView Hat = (ImageView) findViewById(R.id.Hat);
                if (checked)
                    Hat.setVisibility(View.VISIBLE);
                else
                    Hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.arms_checkbox:
                ImageView Arms = (ImageView) findViewById(R.id.Arms);
                if (checked)
                    Arms.setVisibility(View.VISIBLE);
                else
                    Arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears_checkbox:
                ImageView Ears = (ImageView) findViewById(R.id.Ears);
                if (checked)
                    Ears.setVisibility(View.VISIBLE);
                else
                    Ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows_checkbox:
                ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
                if (checked)
                    Eyebrows.setVisibility(View.VISIBLE);
                else
                    Eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes_checkbox:
                ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
                if (checked)
                    Shoes.setVisibility(View.VISIBLE);
                else//
                    Shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyes_checkbox:
                ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
                if (checked)
                    Eyes.setVisibility(View.VISIBLE);
                else
                    Eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses_checkbox:
                ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
                if (checked)
                    Glasses.setVisibility(View.VISIBLE);
                else
                    Glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth_checkbox:
                ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
                if (checked)
                    Mouth.setVisibility(View.VISIBLE);
                else
                    Mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.moustache_checkbox:
                ImageView Moustache = (ImageView) findViewById(R.id.Moustache);
                if (checked)
                    Moustache.setVisibility(View.VISIBLE);
                else
                    Moustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose_checkbox:
                ImageView Nose = (ImageView) findViewById(R.id.Nose);
                if (checked)
                    Nose.setVisibility(View.VISIBLE);
                else
                    Nose.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
