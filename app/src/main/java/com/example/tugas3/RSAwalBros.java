package com.example.tugas3;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAwalBros extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center", "SMS Center", "Driving Direction", "Website",
                "Info", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if (pilihan.equals("Call Center")) {
                String nomortel ="tel:0761-12345";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            }

            else if (pilihan.equals("SMS Center"))
            {
                String smsText = "Dzaky_Abdillah/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:08951130912"));
                a.putExtra("/" + "sms_body", smsText);
            }

            else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "google.navigation:q=0.463304,101.390325";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            }

            else if (pilihan.equals("Website"))
            {
                String websiters = "http://awalbros.com";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(websiters));

            }

            else if (pilihan.equals("Info"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Awal Bros");
            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
