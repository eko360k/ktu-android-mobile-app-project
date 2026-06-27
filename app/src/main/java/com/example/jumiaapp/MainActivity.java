package com.example.jumiaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        );

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Asano Split AC - 1.5HP", "GH₵ 2,699", R.drawable.ac));
        productList.add(new Product("Double Door Fridge", "GH₵ 3,200", R.drawable.fridge));
        productList.add(new Product("HP Laptop", "GH₵ 4,500", R.drawable.laptop));
        productList.add(new Product("Smartphone", "GH₵ 2,400", R.drawable.phone));
        productList.add(new Product("Asano 43\" Smart TV", "GH₵ 2,556", R.drawable.tv));
        productList.add(new Product("Washing Machine", "GH₵ 1,950", R.drawable.washing_machine));
        productList.add(new Product("Electric Iron", "GH₵ 180", R.drawable.iron));

        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}