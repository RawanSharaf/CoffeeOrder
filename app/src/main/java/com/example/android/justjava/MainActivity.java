package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
int quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        quantity = quantity+1;
        displayQuantity(quantity);
    }
    public void decrement(View view) {
        quantity = quantity-1;
        displayQuantity(quantity);
    }
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummery(price));
    }

    private int calculatePrice() {
        return (quantity * 5);
    }

    private String createOrderSummery (int price){
        String PriceMessage = "Name : Rawan Ahmed" ;
        PriceMessage += "\nQuantity : " + quantity ;
        PriceMessage += "\nTotal $" + (price);
        PriceMessage += "\nThank you !";
        return PriceMessage ;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
