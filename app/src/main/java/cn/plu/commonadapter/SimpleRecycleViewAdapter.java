package cn.plu.commonadapter;

import android.content.Context;

import java.util.List;

/**
 * Created by lily on 15-12-9.
 */
public class SimpleRecycleViewAdapter extends RecycleAdapter<Item> {
    List<Item> dataList;

    public SimpleRecycleViewAdapter(Context context, List<Item> dataList) {
        super(context, dataList);
        this.dataList=dataList;
    }

    @Override
    public void bindData(RecycleViewHolder recycleViewHolder, Item item, int pos, int type) {
        /*switch (type){
            case 0:
                recycleViewHolder.setText(R.id.textview,item.getContent());
                break;
            case 1:
                recycleViewHolder.setText(R.id.textview,item.getContent());
                break;
        }*/
        recycleViewHolder.setText(R.id.textview,item.getContent());

    }

    @Override
    public int getLayoutRes(int type) {
        /*if (type==0){
            return R.layout.item;
        }*/
        return  R.layout.item1;

    }

    @Override
    public int getItemViewType(int position) {
       /* Item item=dataList.get(position);
        if (item.isComMeg()){
            return 0;
        }
        return  1;*/
        return super.getItemViewType(position);


    }
}
