package com.example.ecommerce;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminAddNewProductActivity extends AppCompatActivity {

    private String CategoryName;
    private Button AddNewProductButton;
    private ImageView InputProductImage;
    private EditText InputProductName,InputProductDescription, InputProductPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);

        CategoryName = getIntent().getExtras().get("category").toString();
        AddNewProductButton = (Button)findViewById(R.id.add_new_product);
        InputProductImage = (ImageView) findViewById(R.id.select_product_image);
        InputProductName = (EditText) findViewById(R.id.product_name);
        InputProductPrice = (EditText) findViewById(R.id.product_price);


//        Toast.makeText(this, CategoryName
//             , Toast.LENGTH_SHORT).show();
    }
}
