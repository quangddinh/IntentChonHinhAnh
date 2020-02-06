package com.example.intentchonhinhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class AnimalsActivity extends AppCompatActivity {
    TableLayout mTablelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        mapview();
        drawimage();

    }

    private void drawimage() {
        int socot = 3;
        int sodong = 6;
        for (int i = 0; i < sodong ; i++)
        {
            Context context;
            TableRow tableRow = new TableRow(AnimalsActivity.this);
            for (int j = 0; j < socot ; j++){
                ImageView imageView = new ImageView(AnimalsActivity.this);
                imageView.setImageResource(R.drawable.bo);
                tableRow.addView(imageView);
            }
            mTablelayout.addView(tableRow);
        }
    }

    private void mapview() {
        mTablelayout = findViewById(R.id.tableLayout);
    }
}
