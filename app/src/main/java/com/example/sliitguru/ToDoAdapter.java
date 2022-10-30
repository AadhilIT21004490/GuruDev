package com.example.sliitguru;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.MyViewHolder> {

    private Context context;
    private ArrayList todo_id, todo_title, todo_desc;
    private int position;

    ToDoAdapter(Context context,
                ArrayList todo_id,
                ArrayList todo_title,
                ArrayList todo_desc){
        this.context = context;
        this.todo_id = todo_id;
        this.todo_title = todo_title;
        this.todo_desc = todo_desc;
    }

    public ToDoAdapter(ArrayList<String> todo_id, ArrayList<String> todo_title, ArrayList<String> todo_desc) {
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
        //this.position = position;
        holder.todo_id.setText(String.valueOf(todo_id.get(position)));
        holder.todo_title_id.setText(String.valueOf(todo_title.get(position)));
        holder.todo_desc_id.setText(String.valueOf(todo_desc.get(position)));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateToDoActivity.class);
                intent.putExtra("id", String.valueOf(todo_id.get(position)));
                intent.putExtra("title", String.valueOf(todo_title.get(position)));
                intent.putExtra("desc", String.valueOf(todo_desc.get(position)));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return todo_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView todo_id, todo_title_id, todo_desc_id;
        LinearLayout mainLayout;

        //Error Maybe occure for this below code line //
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            todo_id = itemView.findViewById(R.id.todo_id);
            todo_title_id = itemView.findViewById(R.id.todo_title_id);
            todo_desc_id = itemView.findViewById(R.id.todo_desc_id);
            mainLayout= itemView.findViewById(R.id.mainLayout);
        }
    }
}
