package cn.plu.commonadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lily on 15-12-8.
 */
public class RecycleViewHolder extends RecyclerView.ViewHolder {


    ViewHolderImpl viewHolderImpl;

    public RecycleViewHolder(View itemView) {
        super(itemView);
       // viewHolderImpl=new ViewHolderImpl(itemView);
    }

    public void setText(int resId,String content){
        viewHolderImpl.setText(resId,content);
    }







}
