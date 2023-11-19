package com.example.phonepe.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.phonepe.R;

import java.util.ArrayList;

public class HomeViewPagerAdapter  extends PagerAdapter {
    public HomeViewPagerAdapter(Context context, ArrayList<Integer> offerList) {
        this.context = context;
        this.offerList = offerList;
    }

    private Context context;
    private ArrayList<Integer> offerList;


    @Override
    public int getCount() {
        return offerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,container,false);
        ImageView txOffer = view.findViewById(R.id.containzoner);
        txOffer.setImageResource(offerList.get(position));
        container.addView(view);
        return view;



    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        View view = (View)object;
        container.removeView(view);

    }
}
