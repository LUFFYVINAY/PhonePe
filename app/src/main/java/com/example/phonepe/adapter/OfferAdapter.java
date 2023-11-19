package com.example.phonepe.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonepe.R;
import com.example.phonepe.model.Offermodel;

import java.util.ArrayList;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Offermodel>offermodelArrayList;

    public OfferAdapter(Context context, ArrayList<Offermodel> offermodelArrayList) {
        this.context = context;
        this.offermodelArrayList = offermodelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_offers,parent,false);
        return new ViewHolder(view) ;
        
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.offerImgView.setImageResource(offermodelArrayList.get(position).getImage());
        holder.offerItem.setText(offermodelArrayList.get(position).getOffer_on());
        holder.offerDescription.setText(offermodelArrayList.get(position).getOffer_details());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView offerImgView;
        private TextView offerItem,offerDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            offerImgView= itemView.findViewById(R.id.offer_img);
            offerItem = itemView.findViewById(R.id.offer_txt);
            offerImgView=itemView.findViewById(R.id.offer_info);
        }
    }

}