package cn.plu.commonadapter.commonadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by lily on 15-12-8.
 */
public class RecycleViewHolder extends RecyclerView.ViewHolder {


    ViewHolderImpl viewHolderImpl;
    int layoutRes;


    public  RecycleViewHolder(View view,int resLayout) {
        super(view);
        this.layoutRes=resLayout;
        viewHolderImpl=new ViewHolderImpl(view,resLayout);
    }

    public int getLayoutId() {
        return viewHolderImpl.getLayoutId();
    }

    public void setText(int resId,String content){
        viewHolderImpl.setText(resId,content);
    }







}
