package cn.plu.commonadapter.commonadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

/**recycleview adapter的通用holder
 * Created by lily on 15-12-8.
 */
public class RecycleViewHolder extends RecyclerView.ViewHolder {

    /**
     * 使用该类统一recycleview和listview填充的行为实现
     */
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
