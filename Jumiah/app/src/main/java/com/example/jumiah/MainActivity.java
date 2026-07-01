package com.example.jumiah;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        setupFlashSales();
        setupCategories();
        setupSponsoredProducts();
    }

    private void setupFlashSales() {
        setProductData(findViewById(R.id.flash1), R.drawable.headphone, "Wireless Headset", "GH₵ 85");
        setProductData(findViewById(R.id.flash2), R.drawable.laptop, "Gaming Laptop", "GH₵ 4,500");
        setProductData(findViewById(R.id.flash3), R.drawable.mouse, "Optical Mouse", "GH₵ 45");
        setProductData(findViewById(R.id.flash4), R.drawable.video_camera, "4K Video Camera", "GH₵ 1,200");
        setProductData(findViewById(R.id.flash5), R.drawable.oat_pack, "Quaker Oat Pack", "GH₵ 35");
        setProductData(findViewById(R.id.flash6), R.drawable.chips, "Potato Chips", "GH₵ 15");
    }

    private void setupCategories() {
        setCategoryData(findViewById(R.id.cat1), R.drawable.iron, "Ironing");
        setCategoryData(findViewById(R.id.cat2), R.drawable.washing_machine, "Laundry");
        setCategoryData(findViewById(R.id.cat3), R.drawable.blender, "Kitchen");
        setCategoryData(findViewById(R.id.cat4), R.drawable.standing_fan, "Cooling");
    }

    private void setupSponsoredProducts() {
        setProductData(findViewById(R.id.prod1), R.drawable.mic, "Studio Mic", "GH₵ 250");
        setProductData(findViewById(R.id.prod2), R.drawable.backpack, "Travel Backpack", "GH₵ 120");
        setProductData(findViewById(R.id.prod3), R.drawable.jacket, "Winter Jacket", "GH₵ 180");
        setProductData(findViewById(R.id.prod4), R.drawable.jeans_pants, "Denim Jeans", "GH₵ 95");
        setProductData(findViewById(R.id.prod5), R.drawable.sneakers, "Sport Sneakers", "GH₵ 210");
        setProductData(findViewById(R.id.prod6), R.drawable.rice, "Premium Rice", "GH₵ 150");
    }

    private void setProductData(View container, int imageRes, String name, String price) {
        if (container == null) return;
        ImageView img = container.findViewById(R.id.product_image);
        TextView txtName = container.findViewById(R.id.product_name);
        TextView txtPrice = container.findViewById(R.id.product_price);
        TextView txtOldPrice = container.findViewById(R.id.old_price);

        if (img != null) img.setImageResource(imageRes);
        if (txtName != null) txtName.setText(name);
        if (txtPrice != null) txtPrice.setText(price);
        
        if (txtOldPrice != null) {
            txtOldPrice.setPaintFlags(txtOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

    private void setCategoryData(View container, int imageRes, String name) {
        if (container == null) return;
        ImageView img = container.findViewById(R.id.banner_image);
        TextView txtName = container.findViewById(R.id.banner_text);

        if (img != null) img.setImageResource(imageRes);
        if (txtName != null) txtName.setText(name);
    }
}