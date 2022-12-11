package com.example.talabattask;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptor2 extends RecyclerView.Adapter<Adaptor2.ViewHolder> {
    Context context;
    ArrayList<productClass> data;

    public Adaptor2(Context context, ArrayList<productClass> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Adaptor2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_res_view2,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptor2.ViewHolder holder, int position) {
        holder.productDesc.setText(data.get(position).getDescription());
        holder.productImage.setImageResource(data.get(position).getImage());
    }

    @Override
    public int getItemCount() {return data.size();}


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView productDesc;
        public ImageView productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.productDesc = itemView.findViewById(R.id.product_desc);
            this.productImage = itemView.findViewById(R.id.product_image);
        }
    }
}
