package com.example.mypc.ffood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mypc.ffood.FoodData;
import com.example.mypc.ffood.R;

import java.util.List;

/**
 * Created by Dell on 11/25/2017.
 */

public class FoodAdapter extends BaseAdapter {
    private List<FoodData> foodDataList;
    private Context mContext;
    private View.OnClickListener onClickEvent;

    public FoodAdapter(List<FoodData> foodDataList, Context mContext, View.OnClickListener onClickEvent) {
        this.foodDataList = foodDataList;
        this.mContext = mContext;
        this.onClickEvent = onClickEvent;
    }

    public FoodAdapter(List<FoodData> foodDataList, Context mContext) {
        this.foodDataList = foodDataList;
        this.mContext = mContext;
    }

    public List<FoodData> getFoodDataList() {
        return foodDataList;
    }

    public void setFoodDataList(List<FoodData> foodDataList) {
        this.foodDataList = foodDataList;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return foodDataList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodDataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = view;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.foodlist,null);
            ViewHolder viewholder = new ViewHolder();
            viewholder.foodlist_title = (TextView)rowView.findViewById(R.id.foodlist_title);
            viewholder.foodlist_restaurant = (TextView)rowView.findViewById(R.id.foodlist_restaurant);
            viewholder.foodlist_price = (TextView)rowView.findViewById(R.id.foodlist_price);
            viewholder.foodlist_button = (Button) rowView.findViewById(R.id.foodlist_button);
            viewholder.foodlist_Image = (ImageView)rowView.findViewById(R.id.foodlist_imageview);
            rowView.setTag(viewholder);
        }
        ViewHolder holder = (ViewHolder)rowView.getTag();
        final FoodData foodData = foodDataList.get(i);
        holder.foodlist_title.setText(foodData.getFood_title());
        holder.foodlist_restaurant.setText(foodData.getFood_Restaurant());
        holder.foodlist_price.setText(foodData.getFood_price());
        holder.foodlist_Image.setImageResource(foodData.getFood_Image());
        holder.foodlist_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           }
       });
        return rowView;
    }

    static class ViewHolder {
        public ImageView foodlist_Image;
        public TextView foodlist_title;
        public TextView foodlist_restaurant;
        public TextView foodlist_price;
        public Button foodlist_button;
    }
}