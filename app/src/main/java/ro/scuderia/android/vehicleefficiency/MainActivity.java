package ro.scuderia.android.vehicleefficiency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View v)
    {
        final EditText Odometer = (EditText) findViewById(R.id.editTextOdometer);
        final EditText Fuel = (EditText) findViewById(R.id.editTextFuel);
        final EditText Price = (EditText) findViewById(R.id.editTextPrice);
        final TextView Consumption =(TextView) findViewById(R.id.textBoxConsumption);
        final TextView Price_total = (TextView) findViewById(R.id.textBoxPriceTotal);
        double fuel_consumption = (Double.parseDouble(Fuel.getText().toString()) / Double.parseDouble(Odometer.getText().toString())) * 100;
        double fuel_price = (Double.parseDouble(Price.getText().toString())/Double.parseDouble(Fuel.getText().toString()));

        Price_total.setText(new DecimalFormat("##.##").format(fuel_price) + "RON/litre");
        Consumption.setText(new DecimalFormat("##.##").format(fuel_consumption)+"l/100km");
    }
}
