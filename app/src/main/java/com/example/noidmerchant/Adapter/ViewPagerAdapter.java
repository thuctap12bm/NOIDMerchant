package com.example.noidmerchant.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.noidmerchant.GUI.Products.CategoryFragment;
import com.example.noidmerchant.GUI.Products.ProductFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            default:
            case 0:
                return new ProductFragment();
            case 1:
                return new CategoryFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position)
        {
            case 0 :
                title= "SẢN PHẨM";
                break;
            case 1:
                title= "DANH MỤC";
                break;
        }
        return title;
    }
}