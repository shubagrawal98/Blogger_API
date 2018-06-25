package com.example.lovemom.blogger_api;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.postadapter> {

    private Context context;
    private List<Item> items;

    public PostAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public postadapter onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cardview, parent, false);
        return new postadapter(view);
    }

    @Override
    public void onBindViewHolder(postadapter holder, int position) {
        Item item=items.get(position);
        holder.textpost.setText(item.getContent());
        holder.texttitle.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class postadapter extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView texttitle, textpost;

        public postadapter(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            texttitle = itemView.findViewById(R.id.texttitle);
            textpost = itemView.findViewById(R.id.textpost);

        }
    }

}