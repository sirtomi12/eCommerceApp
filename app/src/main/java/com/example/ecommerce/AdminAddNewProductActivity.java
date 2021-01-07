package com.example.ecommerce;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminAddNewProductActivity extends AppCompatActivity {

    private String CategoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);


        CategoryName = getIntent().getExtras().get("category").toString();
Toast.makeText(this, CategoryName
             , Toast.LENGTH_SHORT).show();
    }
}
