package com.hino.dev.dashboardupdater;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MOList extends AppCompatActivity {

    private ListView lv_mo;
    private ImageView img_info;
    private TextView lbl_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molist);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        lv_mo = findViewById(R.id.lv_mo);
        img_info = findViewById(R.id.img_info);
        lbl_info = findViewById(R.id.lbl_info);

//        ArrayList<ManufacturingOrder> orders = new ArrayList<ManufacturingOrder>();
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","TIME IN"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","TIME IN"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//        orders.add(new ManufacturingOrder("NVBSP20181231231","MATERIAL CALL"));
//
//        MoListAdapter moListAdapter = new MoListAdapter(getApplicationContext(),orders);
//
//        lv_mo.setAdapter(moListAdapter);
//        lv_mo.setVisibility(View.VISIBLE);
    }

    private class MoListAdapter extends ArrayAdapter<ManufacturingOrder>{

        public MoListAdapter(Context context, ArrayList<ManufacturingOrder> items){
            super(context, 0, items);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            ManufacturingOrder mo = getItem(position);

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.mo_list_row, parent, false);
            }

            TextView chasis_no = convertView.findViewById(R.id.lbl_chasis_no);
            TextView status = convertView.findViewById(R.id.lbl_status);
            ImageView img_arrow_left = convertView.findViewById(R.id.img_arrow);

            img_arrow_left.setVisibility(View.VISIBLE);
            chasis_no.setText(mo.chasis_no);

            /*NOT FINAL*/
            if(mo.status == "MATERIAL CALL"){
                status.setText("Pending");
            }else if(mo.status == "TIME IN"){
                status.setText("In Progress");
            }
            return convertView;
        }
    }
}
