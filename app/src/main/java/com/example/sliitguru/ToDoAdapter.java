package com.example.sliitguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.MyViewHolder> {

    private Context context;
    private ArrayList todo_id, todo_title, todo_desc;

    ToDoAdapter(Context context,
                ArrayList todo_id,
                ArrayList todo_title,
                ArrayList todo_desc){
        this.context = context;
        this.todo_id = todo_id;
        this.todo_title = todo_title;
        this.todo_desc = todo_desc;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.todo_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.todo_id.setText(String.valueOf(todo_id.get(position)));
        holder.todo_title_id.setText(String.valueOf(todo_title.get(position)));
        holder.todo_desc_id.setText(String.valueOf(todo_desc.get(position)));


    }

    @Override
    public int getItemCount() {
        return todo_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView todo_id, todo_title_id, todo_desc_id;

        //Error Maybe occure for this below code line //
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            todo_id = itemView.findViewById(R.id.todo_id);
            todo_title_id = itemView.findViewById(R.id.todo_title_id);
            todo_desc_id = itemView.findViewById(R.id.todo_desc_id);
        }
    }
}
