package com.example.phonepe.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.phonepe.R;
import com.example.phonepe.adapter.DealerAdapter;
import com.example.phonepe.adapter.OfferAdapter;
import com.example.phonepe.adapter.OfferViewPagerAdapter;
import com.example.phonepe.model.Dealermodel;
import com.example.phonepe.model.Offermodel;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class OffersFragment extends Fragment {


    private Context context;
    private RecyclerView offerRecycler,dealerRecycler,DealerRecyclerOnline;
    private DealerAdapter adapter;
    private ViewPager viewPager;
    private ArrayList<String> offerArray;
    private LinearLayout lnrLyt;
    private Timer timer;
    private int count=0;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    public OffersFragment() {
        // Required empty public constructor
    }


    public static OffersFragment newInstance() {
        OffersFragment fragment = new OffersFragment();
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
        // Inflate the layout for this
        View view=inflater.inflate(R.layout.fragment_offers, container, false);
        initViews(view);
        setupViewpager();

        ArrayList<Dealermodel>offlineMerchantList= new ArrayList<>();
        offlineMerchantList.add(new Dealermodel("starbucks","Flat","Rs"+"39","Cashback","Valid once per user"));
        offlineMerchantList.add(new Dealermodel("McDonalds","Get Burger Worth ","Rs"+"69","Free","New user"));
        offlineMerchantList.add(new Dealermodel("Metro","Flat","Rs"+"19","Cashback","Bill Payment for 500"));
        offlineMerchantList.add(new Dealermodel("JIO recharge ","Flat","Rs"+"39","Cashback","Valid for Postpaid user"));
        offlineMerchantList.add(new Dealermodel("Wifi","On The Spot ","Rs"+"399","20% off ","Valid once per user"));
        offlineMerchantList.add(new Dealermodel("starbucks","Flat","Rs"+"39","Cashback","Valid once per user"));
        adapter=new DealerAdapter(context,offlineMerchantList);
        dealerRecycler.setAdapter(adapter);

        ArrayList<Dealermodel> onlineDealerList = new ArrayList<>();
        onlineDealerList.add(new Dealermodel("Zomato ","Get","15","cashback","Valid Twice per User"));
        onlineDealerList.add(new Dealermodel("Zomato ","Get","15","cashback","Valid Twice per User"));
        onlineDealerList.add(new Dealermodel("Zomato ","Get","15","cashback","Valid Twice per User"));
        onlineDealerList.add(new Dealermodel("Zomato ","Get","15","cashback","Valid Twice per User"));
        adapter=new DealerAdapter(context,onlineDealerList);
        dealerRecycler.setAdapter(adapter);

        ArrayList<Offermodel> offerList = new ArrayList<>();
        offerList.add(new Offermodel("Bill Payment","23% Cashback" ,R.drawable.ic_bill_green));
        offerList.add(new Offermodel("Electricity","Done" ,R.drawable.ic_lightbulb_green));
        offerList.add(new Offermodel("Water Bill","2% Cashback" ,R.drawable.ic_water_green));

        OfferAdapter adapter = new OfferAdapter(context,offerList);
        offerRecycler.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                addBottomDots(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                getActivity().runOnUiThread(()->{
                    if(count<=5){
                        viewPager.setCurrentItem(count);
                        count++;
                    }
                    else{
                        count=0;
                        viewPager.setCurrentItem(count);
                    }
                });
            }
        },500,2000);


        return view;
    }

    private void setupViewpager() {
        offerArray = new ArrayList<>();
        offerArray.add("24% Cashback");
        offerArray.add("Free Recharge");
        offerArray.add(" 20% off on SBI card");
        offerArray.add(" 20% Discount Book Flight");
        OfferViewPagerAdapter viewPagerAdapter= new OfferViewPagerAdapter(context,offerArray);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setPadding(40,0,40,20);
        viewPager.setPageMargin(20);
        addBottomDots(0);
    }

    private void addBottomDots(int currentPage) {
        TextView[] mTxtDot = new TextView[offerArray.size()];
        lnrLyt.removeAllViews();

        for (int i = 0; i < mTxtDot.length; i++) {
            mTxtDot[i] = new TextView(context);
            mTxtDot[i].setText(Html.fromHtml("&#8226"));
            mTxtDot[i].setTextSize(35);
            mTxtDot[i].setTextColor(getResources().getColor(R.color.grey_400));
            lnrLyt.addView(mTxtDot[i]);

        }
    }

    private void initViews(View view) {
        viewPager=view.findViewById(R.id.offer_view_pager);
        lnrLyt=view.findViewById(R.id.ln_points);
        offerRecycler=view.findViewById(R.id.rv_bill_pay_offers);
        dealerRecycler=view.findViewById(R.id.rv_offline_merchants);
        DealerRecyclerOnline=view.findViewById(R.id.Online_Dealers_Recycler);
        DealerRecyclerOnline.setNestedScrollingEnabled(false);
        dealerRecycler.setNestedScrollingEnabled(false);
        LinearLayoutManager layoutManager= new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        offerRecycler.setLayoutManager(layoutManager);
        dealerRecycler.setLayoutManager(new GridLayoutManager(context,3));
        DealerRecyclerOnline.setLayoutManager(new GridLayoutManager(context,3));



    }
}