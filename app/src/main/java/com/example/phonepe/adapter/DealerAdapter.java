package com.example.phonepe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonepe.R;
import com.example.phonepe.model.Dealermodel;

import java.util.ArrayList;

public class DealerAdapter extends RecyclerView.Adapter<DealerAdapter.ViewHolder>{
    private Context context;
    private ArrayList<Dealermodel>dealermodelArrayList;

    public DealerAdapter(Context context, ArrayList<Dealermodel> dealermodelArrayList) {
        this.context = context;
        this.dealermodelArrayList = dealermodelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_dealers,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.dealerName.setText(dealermodelArrayList.get(position).getDeale_rname());
        holder.discountVc.setText(dealermodelArrayList.get(position).getDiscount_way());
        holder.discountAmt.setText(dealermodelArrayList.get(position).getDiscount_amount());
        holder.discountOffer.setText(dealermodelArrayList.get(position).getDiscount_offer());
        holder.discountDetails.setText(dealermodelArrayList.get(position).getDiscount_details());

    }

    @Override
    public int getItemCount() {
        return dealermodelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView dealerName,discountOffer,discountAmt,discountVc,discountDetails;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            dealerName=itemView.findViewById(R.id.dealer_txt);
            discountOffer=itemView.findViewById(R.id.dealer_off);
            discountAmt=itemView.findViewById(R.id.dealer_off_price);
            discountVc=itemView.findViewById(R.id.dealer_txt);
            discountDetails=itemView.findViewById(R.id.discount_info);

        }
    }
}