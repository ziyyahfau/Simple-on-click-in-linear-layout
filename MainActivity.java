package com.zizi.project.beginnerandroid1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity=0;
    }

    public void submitOrder(View view)
    {
        display(1);
    }

    public void display(int number)
    {
        TextView quantityTextView = (TextView)findViewById(R.id.text);
        quantityTextView.setText(""+number);
    }

    public void tambah(View view)
    {
        quantity = quantity + 1;
        display(quantity);
    }

    public void kurang(View view)
    {
        quantity = quantity - 1;
        display(quantity);
    }
}
