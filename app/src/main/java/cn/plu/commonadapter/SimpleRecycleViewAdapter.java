package cn.plu.commonadapter;

import android.content.Context;

import java.util.List;

import cn.plu.commonadapter.commonadapter.RecycleAdapter;
import cn.plu.commonadapter.commonadapter.RecycleViewHolder;

/**
 * Created by lily on 15-12-9.
 */
public class SimpleRecycleViewAdapter extends RecycleAdapter<Item> {


    public SimpleRecycleViewAdapter(Context context, List<Item> dataList) {
        super(context, dataList);
    }



    @Override
    public int getLayoutRes(int type) {
        if (type==0) {
            return R.layout.item1;
        }
        return R.layout.item;
    }

    @Override
    public void bindData(RecycleViewHolder recycleViewHolder, int pos) {

    }

    @Override
    public int getItemViewType(int position) {
        if (position%2==0) {
            return 0;
        }
        return 1;

    }



   /* @Override
    public void bindData(RecycleViewHolder recycleViewHolder, Item item) {
        int layoutRes=recycleViewHolder.getLayoutId();
        switch (layoutRes){
            case R.layout.item:
                recycleViewHolder.setText(R.id.textview,item.getContent());
            break;
            case R.layout.item1:
                recycleViewHolder.setText(R.id.textview,item.getContent());
            break;
        }

    }
*/
   /* @Override
    public int getItemViewType(int position) {
       *//* Item item=dataList.get(position);
        if (item.isComMeg()){
            return 0;
        }
        return  1;*//*
        return super.getItemViewType(position);


    }*/
}
