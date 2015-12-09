package cn.plu.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by lily on 15-12-8.
 */
public  abstract  class CommonAdapter<T> extends BaseAdapter {

    LayoutInflater inflater;
    List<T> dataList;

    int layoutRes;

   // int resLayout;
    Context mContext;

    public CommonAdapter(Context context,  List<T> datas,int layoutRes) {
        this.layoutRes = layoutRes;
        this.dataList = datas;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public T getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

   /* public View inflateItemByType(int type,ViewGroup viewGroup){
        int layoutRes=getLayoutRes(type);
        return inflater.inflate(layoutRes, viewGroup, false);
    }*/

    public int getLayoutRes(int type){
        return layoutRes;
    }
    //public abstract int getLayoutRes(int type);

    public abstract void convert(CommonViewHolder viewHolder,T t);

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // int type=getItemViewType(position);
        CommonViewHolder commonViewHolder = CommonViewHolder.get(parent.getContext(),convertView,parent, layoutRes,position);
        convert(commonViewHolder,getItem(position));
       // Log.v("TAG","----VIEWS SIZE IS "+commonViewHolder.getViewSize());

        View result=commonViewHolder.getConvertView();
       // Log.v("TAG","-----view array size is  "+commonViewHolder.getViewArraySize());
        return result;
    }
}