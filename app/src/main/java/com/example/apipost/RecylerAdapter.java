package com.example.apipost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.MyViewHolder> {

    private ArrayList<AndroidVersionModel> androidVersionModels;

    public RecylerAdapter(ArrayList<AndroidVersionModel> data) {

        this.androidVersionModels=data;
    }




    @NonNull
    @Override
    public RecylerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.android_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerAdapter.MyViewHolder holder, int position) {
        holder.txt_verision.setText(androidVersionModels.get(position).getVer());
        holder.txt_number.setText(androidVersionModels.get(position).getName());
        holder.txt_apilevel.setText(androidVersionModels.get(position).getApi());




    }

    @Override
    public int getItemCount() {
        return androidVersionModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_verision,txt_number,txt_apilevel;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_verision = (TextView)itemView.findViewById(R.id.txt_verision);
            txt_number = (TextView)itemView.findViewById(R.id.txt_number);
            txt_apilevel = (TextView)itemView.findViewById(R.id.txt_apilevel);


        }
    }
}
