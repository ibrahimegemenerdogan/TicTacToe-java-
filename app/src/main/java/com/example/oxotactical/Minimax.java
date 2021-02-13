package com.example.oxotactical;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Minimax extends AppCompatActivity {

    public Button[][] buttons = new Button[3][3];

    public boolean player1Turn = true;

    public int roundCount;

    public int Player1Points;
    public int Player2Points;

    public TextView Player1;
    public TextView Player2;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
