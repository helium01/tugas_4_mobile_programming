package com.example.tugas4_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PenggunaAdapter extends
        RecyclerView.Adapter<PenggunaAdapter.PenggunaViewHolder> {
    private ArrayList<Pengguna>dataList;

    public PenggunaAdapter(ArrayList<Pengguna> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public PenggunaAdapter.PenggunaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_pengguna, parent, false);
        return new PenggunaViewHolder(view);
    }

    public void onBindViewHolder(PenggunaViewHolder holder, int position) {
        holder.profil.setImageResource(dataList.get(position).getProfil());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtpekerjaan.setText(dataList.get(position).getpekerjaan ());
        holder.txtAsal.setText(dataList.get(position).getAsal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PenggunaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtpekerjaan , txtAsal;
        private ImageView profil;
        public PenggunaViewHolder(View itemView) {
            super(itemView);
            profil=(ImageView)
                    itemView.findViewById(R.id.img_profil);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtpekerjaan = (TextView)
                    itemView.findViewById(R.id.txt_pekerjaan);
            txtAsal = (TextView)
                    itemView.findViewById(R.id.txt_Asal);
        }
    }
}

