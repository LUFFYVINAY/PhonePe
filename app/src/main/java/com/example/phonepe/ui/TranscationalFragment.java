package com.example.phonepe.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phonepe.R;
import com.example.phonepe.adapter.TransactionAdapter;
import com.example.phonepe.model.Transcationmodel;

import java.util.ArrayList;


public class TranscationalFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView;




    public TranscationalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    public static TranscationalFragment newInstance() {
        TranscationalFragment fragment = new TranscationalFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        
        View view=inflater.inflate(R.layout.fragment_transcational, container, false);
        initViews(view);

        ArrayList<Transcationmodel> transactionModeArrayList = new ArrayList<>();
       transactionModeArrayList.add(new Transcationmodel("1 day ago ","paid to","Zomato","Rs"+"500","Debited From",R.drawable.ic_to_contact));
        transactionModeArrayList.add(new Transcationmodel("1 day ago ","paid to","Swiggy","Rs"+"234","Debited From",R.drawable.ic_to_contact));
        transactionModeArrayList.add(new Transcationmodel("2 day ago ","paid to","Amazon","Rs"+"499","Debited From",R.drawable.ic_to_account));
        transactionModeArrayList.add(new Transcationmodel("5 day ago ","paid to","FlipKart","Rs"+"180","Credited to ",R.drawable.ic_to_contact));
        transactionModeArrayList.add(new Transcationmodel("5 day ago ","CashBack","GooglePay","Rs"+"06","Debited From",R.drawable.ic_to_account));
        transactionModeArrayList.add(new Transcationmodel("6 day ago ","paid to","Zomato","Rs"+"500","Debited From",R.drawable.ic_to_contact));
        transactionModeArrayList.add(new Transcationmodel("6 day ago ","paid to","BOAT","Rs"+"1890","Debited From",R.drawable.ic_to_account));
        transactionModeArrayList.add(new Transcationmodel("10 day ago ","CashBack","Vinay Singh","Rs"+"5000","Debited From",R.drawable.ic_to_contact));

        TransactionAdapter adapter = new TransactionAdapter(transactionModeArrayList,context);
        recyclerView.setAdapter(adapter);
        return view;

    }

    private void initViews(View view) {

        recyclerView = view.findViewById(R.id.transaction_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

    }
}