package com.example.phonepe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonepe.R;
import com.example.phonepe.model.Transcationmodel;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {
    public TransactionAdapter(ArrayList<Transcationmodel> txnList, Context context) {
        this.txnList = txnList;
        this.context = context;
    }

    private ArrayList<Transcationmodel> txnList;
    private Context context;

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_list_item,parent,false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {

        holder.txnImg.setImageResource(txnList.get(position).getImg_txn_way());
        holder.txnDate.setText(txnList.get(position).getTxn_details());
        holder.texTxtView.setText(txnList.get(position).getTxn_med());
        holder.txnDealer.setText(txnList.get(position).getTxn_amt());
        holder.txnAmtDevCed.setText(txnList.get(position).getTxn_cd());



    }

    @Override
    public int getItemCount() {

        return txnList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView txnImg;
        private TextView txnDate, texTxtView,txnDealer,txnAmt,txnAmtDevCed;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txnImg=itemView.findViewById(R.id.inv_transaction_type);
            txnDate=itemView.findViewById(R.id.txt_transaction_date);
            texTxtView=itemView.findViewById(R.id.txn_transaction_type);
            txnDealer=itemView.findViewById(R.id.txn_transaction_merchant);
            txnAmt=itemView.findViewById(R.id.txn_transaction_amount);
            txnAmtDevCed=itemView.findViewById(R.id.txn_transaction_cred_dep);



        }
    }
}
