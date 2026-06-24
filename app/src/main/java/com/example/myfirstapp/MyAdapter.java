package com.example.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * MyAdapter is a custom BaseAdapter implementation used to bind data models
 * (images and titles) to GridView cells inside the main screen layout.
 */
public class MyAdapter extends BaseAdapter {

    // Application context reference
    private final Context context;

    // Array containing resource IDs of the images to be loaded
    private final int[] images;

    // Array containing titles of the items corresponding to the images
    private final String[] names;

    // LayoutInflater reference used to inflate cell layout resource files
    private final LayoutInflater layoutInflater;

    /**
     * Constructs a new MyAdapter instance.
     *
     * @param context the application or activity context
     * @param images  an array of drawable resource IDs
     * @param names   an array of label strings corresponding to each image
     */
    public MyAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.layoutInflater = LayoutInflater.from(context);
    }

    /**
     * Returns the total count of items in the data set.
     */
    @Override
    public int getCount() {
        return names.length;
    }

    /**
     * Returns the data item associated with the specified position.
     * (Unused in this simple adapter implementation).
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     * Returns the row id associated with the specified position in the list.
     * (Unused in this simple adapter implementation).
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * ViewHolder pattern container class used to avoid unnecessary calls of
     * findViewById() and optimize performance on list scrolling.
     */
    static class ViewHolder {
        ImageView imageView;
        TextView textView;
    }

    /**
     * Inflates individual item cell views, retrieves View references via ViewHolder,
     * and populates image/text components according to cell position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        // Check if layout needs to be inflated or can be recycled from scrap heap
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.single_data, parent, false);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.image_view);
            holder.textView = (TextView) convertView.findViewById(R.id.text_view);
            convertView.setTag(holder);
        } else {
            // Retrieve ViewHolder instance from direct view tag
            holder = (ViewHolder) convertView.getTag();
        }

        // Set the resource values based on current position
        holder.imageView.setImageResource(images[position]);
        holder.textView.setText(names[position]);

        return convertView;
    }
}

