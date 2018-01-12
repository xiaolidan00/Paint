package com.lidan.xiao.mypaint;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.lidan.xiao.mypaint.helper.ToolHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */

public class ColorActivity extends AppCompatActivity {
    private GridView gv;
    private int coloridlist[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_color);
        setTitle("MaterialDesign色板");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gv=findViewById(R.id.gv_color);
        coloridlist=ToolHelper.colorArray;

        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return coloridlist.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView= LayoutInflater.from(ColorActivity.this).inflate(R.layout.coloritem,null);
                Button bt=convertView.findViewById(R.id.coloritem);
                final int color=coloridlist[position];
                bt.setBackgroundColor(getResources().getColor(color));
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selectColor(color);
                    }
                });
                return convertView;
            }
        };
        gv.setAdapter(adapter);

    }

    private void selectColor(int c) {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("color",c);
        setResult(11,intent);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
