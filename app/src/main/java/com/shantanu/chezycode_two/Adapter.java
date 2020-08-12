package com.shantanu.chezycode_two;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.view_holder> {

    private String[] data;
    public Adapter(String[] data){

        this.data=data;
    }
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate= LayoutInflater.from(parent.getContext());
        View view = inflate.inflate(R.layout.view_adapter,parent,false);
        return new view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {
String title = data[position];
holder.textIcon.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class view_holder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textIcon;
    public view_holder(@NonNull View itemView) {
        super(itemView);
    imgIcon = itemView.findViewById(R.id.image_colo);
    textIcon=itemView.findViewById(R.id.text1);

    }
}


}
