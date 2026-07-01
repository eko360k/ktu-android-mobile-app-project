package com.example.jumiah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;
    private boolean isFlashSale;

    public ProductAdapter(List<Product> productList, boolean isFlashSale) {
        this.productList = productList;
        this.isFlashSale = isFlashSale;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.name.setText(product.getName());
        holder.price.setText(product.getPrice());
        holder.discount.setText(product.getDiscount());
        holder.image.setImageResource(product.getImageRes());
        
        if (isFlashSale) {
            holder.flashSaleInfo.setVisibility(View.VISIBLE);
            holder.itemsLeft.setText(product.getItemsLeft());
            holder.progressBar.setProgress(product.getProgress());
        } else {
            holder.flashSaleInfo.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView name, price, discount, itemsLeft;
        ImageView image;
        ProgressBar progressBar;
        View flashSaleInfo;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.productTitle);
            price = itemView.findViewById(R.id.productPrice);
            discount = itemView.findViewById(R.id.discountBadge);
            itemsLeft = itemView.findViewById(R.id.itemsLeft);
            image = itemView.findViewById(R.id.productImage);
            progressBar = itemView.findViewById(R.id.stockProgressBar);
            flashSaleInfo = itemView.findViewById(R.id.flashSaleInfo);
        }
    }
}