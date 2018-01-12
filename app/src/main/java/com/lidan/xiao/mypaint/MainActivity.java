package com.lidan.xiao.mypaint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private View penView,opView;
private PopupWindow popup;
private ImageView imgBrush,imgPen,imgPencil,imgMarker,
        imgRotate,imgResize,imgMove,imgUndo,imgRedo,imgClear,
     imgAdd,imgSave,imgSet,imgOut;
private LinearLayout layout;
private int penWidth,penOpa,penColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        layout=findViewById(R.id.layout_main);
        penView = this.getLayoutInflater().inflate(R.layout.paint_pen,null);
        imgBrush= penView.findViewById(R.id.img_brush);
        imgPen= penView.findViewById(R.id.img_pen);
        imgPencil= penView.findViewById(R.id.img_pencil);
        imgMarker= penView.findViewById(R.id.img_marker);
        imgBrush.setOnClickListener(this);
        imgPen.setOnClickListener(this);
        imgPencil.setOnClickListener(this);
        imgMarker.setOnClickListener(this);

        opView=this.getLayoutInflater().inflate(R.layout.paint_operate,null);
        imgRotate=opView.findViewById(R.id.img_rotate);
        imgResize=opView.findViewById(R.id.img_resize);
        imgMove=opView.findViewById(R.id.img_move);
        imgUndo=opView.findViewById(R.id.img_undo);
        imgRedo=opView.findViewById(R.id.img_redo);
        imgClear=opView.findViewById(R.id.img_clear);
        imgAdd=opView.findViewById(R.id.img_add);
        imgSave=opView.findViewById(R.id.img_save);
        imgSet=opView.findViewById(R.id.img_set);
        imgOut=opView.findViewById(R.id.img_out);
        imgRotate.setOnClickListener(this);
        imgResize.setOnClickListener(this);
        imgMove.setOnClickListener(this);
        imgUndo.setOnClickListener(this);
        imgRedo.setOnClickListener(this);
        imgClear.setOnClickListener(this);
        imgAdd.setOnClickListener(this);
        imgSave.setOnClickListener(this);
        imgSet.setOnClickListener(this);
        imgOut.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_color:
                Intent intent=new Intent(this,ColorActivity.class);
                startActivityForResult(intent,11);
                break;
            case R.id.action_edit:
                showPopup(penView);
                break;
            case R.id.action_pic:
                break;
            case R.id.action_more:
                showPopup(opView);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void showPopup(View view) {
           popup=new PopupWindow(view,layout.getWidth(),view.getHeight());
        popup.showAsDropDown(layout);
        popup.showAtLocation(layout, Gravity.BOTTOM, 0, 0);//底部弹出
//        if(!popup.isShowing()) {
//            popup.showAsDropDown(layout);
//            popup.showAtLocation(layout, Gravity.BOTTOM, 0, 0);//底部弹出
//        }else {
//            popup.dismiss();
//        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==11&&resultCode==11){
            Toast.makeText(this,"color selected",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_brush:
                break;
            case R.id.img_pen:
                break;
            case R.id.img_pencil:
                break;
            case R.id.img_marker:
                break;
            case R.id.img_rotate:
                break;
            case R.id.img_resize:
                break;
            case R.id.img_move:
                break;
            case R.id.img_clear:
                break;
            case R.id.img_undo:
                break;
            case R.id.img_redo:
                break;
            case R.id.img_add:
                break;
            case R.id.img_save:
                break;
            case R.id.img_set:
                break;
            case R.id.img_out:
                break;
        }

    }
}
