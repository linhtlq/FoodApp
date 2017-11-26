package com.example.mypc.ffood.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mypc.ffood.FoodData;
import com.example.mypc.ffood.R;
import com.example.mypc.ffood.adapter.FoodAdapter;

import java.util.ArrayList;
import java.util.List;


public class VNfood extends Fragment {
    List<FoodData> foodDataList;
    FoodAdapter adapter;
    ListView lv;
    View.OnClickListener myListItemClickListener;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vnfood, container, false);
        lv = (ListView)view.findViewById(R.id.lisview);
        initData();
        initdisplay();
        initeven();
        return view;
    }

    private void initeven() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });
    }

    private void initdisplay() {
        adapter = new FoodAdapter(foodDataList,mContext,myListItemClickListener);
        lv.setAdapter(adapter);
    }


    private void initData() {
        mContext = getActivity().getApplicationContext();
        int[] Image = {R.drawable.cuon,R.drawable.bunthit,R.drawable.download,R.drawable.hutieu,R.drawable.bunthit};
        foodDataList = new ArrayList<FoodData>();
        for (int i = 0; i<5; i++){
            FoodData fooddata = new FoodData(Image[i],"Mon an viet nam","Ba tam ban com","10$");
            foodDataList.add(fooddata);
        }
        myListItemClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        };
    }
}