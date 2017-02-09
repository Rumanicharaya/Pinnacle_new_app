package com.example.parulchopra.pinnacle_new_app;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Test_frag extends Fragment {
    private RecyclerView r;
    private RecyclerView.Adapter a;
    private RecyclerView.LayoutManager l;
    String[] name= {"test1","test2","test 3","test 4"};





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_test_frag, container, false);

        r=(RecyclerView)v.findViewById(R.id.testrecyler);

        a= new TestRecyclerAdapter(getContext(),name);
        l=new LinearLayoutManager(getContext());
        r.setLayoutManager(l);
        r.setHasFixedSize(true);
        r.setAdapter(a);


    return v;
}

    private class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.Recyclerviewholder> {
        Context context;
        String[] a;
        LayoutInflater inflater;
        public TestRecyclerAdapter(Context C1, String[] a) {
            this.context=C1;
            this.a=a;
            inflater= LayoutInflater.from(C1);

        }

        @Override
        public TestRecyclerAdapter.Recyclerviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view =inflater.inflate(R.layout.testlistview,parent,false);
            Recyclerviewholder M1= new Recyclerviewholder(view);

            return M1;
        }

        @Override
        public void onBindViewHolder(TestRecyclerAdapter.Recyclerviewholder holder, int position) {
            holder.T1.setText(a[position]);
        }

        @Override
        public int getItemCount() {

            return a.length;
        }

        public class Recyclerviewholder extends RecyclerView.ViewHolder {
            TextView T1;

            public Recyclerviewholder(View itemView) {
                super(itemView);
                T1 = (TextView) itemView.findViewById(R.id.TV1);
            }
        }     }
}
