package com.example.intentchonhinhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class AnimalsActivity extends AppCompatActivity {

    TableLayout mTablelayout;
    String[] arrayNamesAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        init();
        mapview();
        drawimage();


    }

    private void init() {
        arrayNamesAnimal = getResources().getStringArray(R.array.arrayNamesAnimal);
        // cho mang ten random
        Collections.shuffle(Arrays.asList(arrayNamesAnimal));

    }

    private void drawimage() {
        int socot = 3;
        int sodong = 6;
        int index = 0;
        for (int i = 0; i < sodong ; i++)
        {
            Context context;
            TableRow tableRow = new TableRow(AnimalsActivity.this);
            for (int j = 0; j < socot ; j++){
                final ImageView imageView = new ImageView(AnimalsActivity.this);

                int valueHinhChon = getResources().getIdentifier(
                        arrayNamesAnimal[index++],
                        "drawable",
                        getPackageName());

                imageView.setImageResource(valueHinhChon);

                imageView.setTag(valueHinhChon);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(AnimalsActivity.this, imageView.getTag().toString() + "", Toast.LENGTH_SHORT).show();
                        // du lieu id hinh`
                    }
                });
                tableRow.addView(imageView);
            }
            mTablelayout.addView(tableRow);
        }
    }

    private void mapview() {
        mTablelayout = findViewById(R.id.tableLayout);
    }
}
