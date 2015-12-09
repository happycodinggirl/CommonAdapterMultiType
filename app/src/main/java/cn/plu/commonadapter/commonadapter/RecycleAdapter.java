package cn.plu.commonadapter.commonadapter;

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

    LayoutInflater inflater;

    public RecycleAdapter(Context context,List<T> dataList) {
        this.dataList = dataList;
        inflater=LayoutInflater.from(context);
    }


    public T getItem(int pos){
       return dataList.get(pos);
    }

    public abstract int getLayoutRes(int type);

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecycleViewHolder(inflater.inflate(getLayoutRes(i), viewGroup, false),getLayoutRes(i));
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder recycleViewHolder, int i) {
            bindData(recycleViewHolder,getItem(i));
    }

    @Override
    public int getItemCount() {
        int count=dataList==null?0:dataList.size();
        return count;
    }

    public abstract void bindData(RecycleViewHolder recycleViewHolder,T item);
}
