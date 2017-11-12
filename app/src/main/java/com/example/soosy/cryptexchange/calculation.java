package com.example.soosy.cryptexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Soosy on 11/12/2017.
 */

public class calculation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        double btc_Price;
        double eth_Price;

        double convertAmountUser;

        double btc_convertedPrice;
        double eth_convertedPrice;

        btc_Price= getIntent().getExtras().getDouble("btc_price");
        eth_Price= getIntent().getExtras().getDouble("eth_price");

        TextView convert_amount = (TextView)findViewById(R.id.btcConvertedAmount);

        TextView textBTC = (TextView)findViewById(R.id.btcValue);
        TextView textETH = (TextView)findViewById(R.id.ethValue);
        Button convert = (Button)findViewById(R.id.convert_button);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
