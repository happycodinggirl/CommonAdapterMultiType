package cn.plu.commonadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lily on 15-12-8.
 */
public abstract  class MutiTypeAdapter<T> extends CommonAdapter<T>{

    MutiTypeInterface<T> mMultiItemTypeSupport;

    public MutiTypeAdapter(Context context, List<T> datas,MutiTypeInterface mutiTypeInterface) {
        super(context, datas, -1);
        mMultiItemTypeSupport =mutiTypeInterface;
    }



    @Override
    public int getViewTypeCount() {
        if (mMultiItemTypeSupport !=null){
            return mMultiItemTypeSupport.getViewTypeCount();
        }
        return super.getViewTypeCount();
    }

    @Override
    public int getItemViewType(int position) {
        if (mMultiItemTypeSupport !=null){
            return mMultiItemTypeSupport.getItemViewType(position, mDatas.get(position));
        }
        return super.getItemViewType(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (mMultiItemTypeSupport == null)
            return super.getView(position, convertView, parent);

        int layoutId = mMultiItemTypeSupport.getLayoutId(position,
                getItem(position));
        CommonViewHolder viewHolder = CommonViewHolder.get(mContext, convertView, parent,
                layoutId, position);
        convert(viewHolder, getItem(position));
        return viewHolder.getConvertView();
    }


}
