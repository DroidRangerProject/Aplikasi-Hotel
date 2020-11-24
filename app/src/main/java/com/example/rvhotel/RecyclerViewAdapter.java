package com.example.rvhotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> fotoHotels= new ArrayList<>();
    private ArrayList<String> namaHotels= new ArrayList<>();
    private ArrayList<String> alamatHotels= new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoHotels, ArrayList<String> namaHotels, ArrayList<String> alamatHotels, Context context) {
        this.fotoHotels = fotoHotels;
        this.namaHotels= namaHotels;
        this.alamatHotels= alamatHotels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.design_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotoHotels.get(position)).into(holder.imageView);
        holder.txtnama.setText(namaHotels.get(position));
        holder.txtalamat.setText(alamatHotels.get(position));

    }

    @Override
    public int getItemCount() {
        return namaHotels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txtnama, txtalamat;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            txtnama = (TextView) itemView.findViewById(R.id.nama_hotel);
            txtalamat = (TextView) itemView.findViewById(R.id.alamat_hotel);
        }
    }
}
