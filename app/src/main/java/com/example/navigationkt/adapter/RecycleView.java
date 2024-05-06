package com.example.navigationkt.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationkt.R;
import com.example.navigationkt.model.Song;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends RecyclerView.Adapter<RecycleView.HomeViewHolder> {
    private List<Song> list;

    private ItemListener itemListener;

    public RecycleView() {
        this.list = new ArrayList<>();
    }

    public void setItemListener(ItemListener itemListener) {
        this.itemListener = itemListener;
    }

    public void setList(List<Song> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public Song getSong(int position){
        return list.get(position);
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new HomeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        Song item = list.get(position);
        holder.song.setText(item.getSong());
        holder.singer.setText(item.getSinger());
        holder.album.setText(item.getAlbum());
        holder.type.setText(item.getType());
        if (item.getIsFavorite()==1){
            holder.isFavorite.setImageResource(R.drawable.ic_selected_favorite);
        }
        else{
            holder.isFavorite.setImageResource(R.drawable.ic_favorite);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView song, singer, album, type;
        private ImageButton isFavorite;

        public HomeViewHolder(@NonNull View view) {
            super(view);
            song = view.findViewById(R.id.tvSong);
            singer = view.findViewById(R.id.tvSinger);
            album = view.findViewById(R.id.tvAlbum);
            type = view.findViewById(R.id.tvType);
            isFavorite =view.findViewById(R.id.tvFavorite);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemListener!=null){
                itemListener.onItemClick(view,getAdapterPosition());
            }
        }
    }

    public interface ItemListener{
        void  onItemClick(View view, int position);
    }
}
