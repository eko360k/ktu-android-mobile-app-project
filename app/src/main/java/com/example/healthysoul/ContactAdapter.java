package com.example.healthysoul;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter
        extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_item,
                        parent,
                        false);

        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ContactViewHolder holder,
            int position) {

        Contact contact = contactList.get(position);

        holder.txtName.setText(contact.getName());
        holder.txtMessage.setText(contact.getMessage());
        holder.txtTime.setText(contact.getTime());

        holder.itemView.setOnClickListener(v ->
                Toast.makeText(
                        v.getContext(),
                        "Opening chat with "
                                + contact.getName(),
                        Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class ContactViewHolder
            extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtMessage;
        TextView txtTime;

        public ContactViewHolder(
                @NonNull View itemView) {

            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtMessage = itemView.findViewById(R.id.txtLastMessage);
            txtTime = itemView.findViewById(R.id.txtTime);
        }
    }
}