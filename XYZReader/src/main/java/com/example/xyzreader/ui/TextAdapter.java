package com.example.xyzreader.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xyzreader.R;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> {
    private List<String> text;

    public TextAdapter(List<String> text) {
        this.text = text;
    }

    TextAdapter() {

    }

    void setList(List<String> newList) {
        text = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textPiece.setText(text.get(position));
    }


    @Override
    public int getItemCount() {
        return text != null ? text.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textPiece;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            textPiece = itemView.findViewById(R.id.tv_text_piece);
        }
    }
}
