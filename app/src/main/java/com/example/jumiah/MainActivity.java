package com.example.jumiah;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize RecyclerViews
        RecyclerView flashSalesRecyclerView = findViewById(R.id.flashSalesRecyclerView);
        RecyclerView sponsoredRecyclerView = findViewById(R.id.sponsoredRecyclerView);

        // Set up Flash Sales (Horizontal)
        List<Product> flashSaleProducts = new ArrayList<>();
        flashSaleProducts.add(new Product("Children Casual Comfo...", "GH₵ 59", "-69%", "39 items left", 40, R.drawable.children_casual_shoe));
        flashSaleProducts.add(new Product("Nail clippers set brown...", "GH₵ 28", "-84%", "30 items left", 60, R.drawable.nail_clippers));
        flashSaleProducts.add(new Product("Children's dancing tal...", "GH₵ 68", "-75%", "45 items left", 20, R.drawable.dancing_cactus_toy));
        flashSaleProducts.add(new Product("Modern Wall Clock", "GH₵ 120", "-15%", "10 items left", 90, R.drawable.wall_clock));

        ProductAdapter flashSaleAdapter = new ProductAdapter(flashSaleProducts, true);
        flashSalesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        flashSalesRecyclerView.setAdapter(flashSaleAdapter);

        // Set up Sponsored Products (Vertical Grid)
        List<Product> sponsoredProducts = new ArrayList<>();
        sponsoredProducts.add(new Product("Other Bluetooth headp...", "GH₵ 65", "-5%", "", 0, R.drawable.headphone));
        sponsoredProducts.add(new Product("Gaming Over-Ear Wire...", "GH₵ 250", "-10%", "", 0, R.drawable.gamingheadset));
        sponsoredProducts.add(new Product("Wireless Bluetooth Earbuds", "GH₵ 31", "-40%", "", 0, R.drawable.earbuds));
        sponsoredProducts.add(new Product("X15 Gaming Headset", "GH₵ 150", "-20%", "", 0, R.drawable.gamingheadset));
        sponsoredProducts.add(new Product("Smart Watch Series 7", "GH₵ 199", "-35%", "", 0, R.drawable.smart_watch));
        sponsoredProducts.add(new Product("Portable Power Bank", "GH₵ 85", "-12%", "", 0, R.drawable.power_bank));
        sponsoredProducts.add(new Product("Urban Explorer Backpack", "GH₵ 145", "-15%", "", 0, R.drawable.backpack));
        sponsoredProducts.add(new Product("Classic Cotton Hoodie", "GH₵ 180", "-20%", "", 0, R.drawable.hoodie));

        ProductAdapter sponsoredAdapter = new ProductAdapter(sponsoredProducts, false);
        sponsoredRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        sponsoredRecyclerView.setAdapter(sponsoredAdapter);
        
        flashSalesRecyclerView.setNestedScrollingEnabled(false);
        sponsoredRecyclerView.setNestedScrollingEnabled(false);
    }
}