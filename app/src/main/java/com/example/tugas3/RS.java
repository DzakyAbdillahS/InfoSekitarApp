package com.example.tugas3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah Sakit Awal Bros", "Rumah Sakit Eka Hospital", "Rumah Sakit Eria Bunda",
                "Rumah Sakit Arifin Ahmad", "Rumah Sakit Jiwa Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int Position, long id){
        super.onListItemClick(l, v, Position, id);
        Object o = this.getListAdapter().getItem(Position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros")){
            a = new Intent(this, RSAwalBros.class);
            }

            else if (pilihan.equals("Rumah Sakit Eka Hospital"))
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
