package com.example.sliitguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class linkerAdapter extends RecyclerView.Adapter<linkerAdapter.linkerViewHolder> {
    private Context context;
    private ArrayList title_id,link_id,desc_id;

    public linkerAdapter(Context context, ArrayList title_id, ArrayList link_id, ArrayList desc_id) {
        this.context = context;
        this.title_id = title_id;
        this.link_id = link_id;
        this.desc_id = desc_id;
    }

    @NonNull
    @Override
    public linkerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.linkersingle,parent,false);
        return new linkerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull linkerViewHolder holder, int position) {
        holder.title_id.setText(String.valueOf(title_id.get(position)));
        holder.link_id.setText(String.valueOf(link_id.get(position)));
    }

    @Override
    public int getItemCount() {
        return title_id.size();
    }

    public class linkerViewHolder extends RecyclerView.ViewHolder {
        TextView title_id,link_id,desc_id;
        public linkerViewHolder(@NonNull View itemView) {
            super(itemView);
            title_id=itemView.findViewById(R.id.texttitle);
            link_id=itemView.findViewById(R.id.textlink);
        }
    }
}
