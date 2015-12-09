package cn.plu.commonadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lily on 15-12-8.
 */
public abstract class RecycleAdapter<T> extends RecyclerView.Adapter<RecycleViewHolder> {

    List<T> dataList;
    int layoutRes;
    LayoutInflater inflater;

    public RecycleAdapter(Context context,List<T> dataList) {
        this.dataList = dataList;
        inflater=LayoutInflater.from(context);
    }


    public T getItem(int pos){
       return dataList.get(pos);
    }

    public View inflateItemByType(int type,ViewGroup viewGroup){
        int layoutRes=getLayoutRes(type);
        return inflater.inflate(layoutRes,viewGroup,false);
    }

    public int getLayoutRes(int type){
        return layoutRes;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecycleViewHolder(inflateItemByType(i,viewGroup));
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder recycleViewHolder, int i) {
            int type=getItemViewType(i);
            T t=getItem(i);


            bindData(recycleViewHolder,t,i,type);
    }

    @Override
    public int getItemCount() {
        return dataList==null?0:dataList.size();
    }

    public abstract void bindData(RecycleViewHolder recycleViewHolder,T item,int pos,int type);
}
