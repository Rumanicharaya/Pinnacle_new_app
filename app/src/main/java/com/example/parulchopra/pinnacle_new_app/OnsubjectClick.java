package com.example.parulchopra.pinnacle_new_app;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OnsubjectClick extends AppCompatActivity {

    ViewPager v11;
    TabLayout t11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onsubject_click);
        v11=(ViewPager) findViewById(R.id.v1);
        v11.setAdapter(new CustomAdapter(getSupportFragmentManager(),getApplicationContext()));
        t11=(TabLayout) findViewById(R.id.t1);
        t11.setupWithViewPager(v11);
        t11.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                v11.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                v11.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                v11.setCurrentItem(tab.getPosition());
            }
        });
    }


    private class CustomAdapter extends FragmentPagerAdapter {
        String[] a={"PDF","VIDEOS","PRACTICE TEST"};
        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Pdf_frag();
                case 1:
                    return new Video_fragment();
                case 2:
                    return new Test_frag();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return a.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return a[position];
        }
    }
}

