package cn.plu.commonadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by lily on 15-12-8.
 */
public class CommonViewHolder {

    ViewHolderImpl viewHolderImpl;

    private SparseArray<View> mViews;
    //private int mPosition;
    private View mConvertView;
    private Context mContext;
    private int mLayoutId;
    public CommonViewHolder(Context context, ViewGroup parent, int layoutId,
                      int position)
    {
        mContext = context;
        mLayoutId = layoutId;
        //	this.mPosition = position;
        this.mViews = new SparseArray<View>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent,
                false);
        mConvertView.setTag(this);
    }

    public static CommonViewHolder get(Context context, View convertView,
                                 ViewGroup parent, int layoutId, int position)
    {
        if (convertView == null)
        {
            return new CommonViewHolder(context, parent, layoutId, position);
        } else
        {
            CommonViewHolder holder = (CommonViewHolder) convertView.getTag();
            //holder.mPosition = position;
            return holder;
        }
    }
    public int getLayoutRes() {
        return mLayoutId;
    }

    /*  public <Item extends View> Item findView(int resId){
       return viewHolderImpl.findView(resId);
    }



    public void setText(int resId,String content){
      viewHolderImpl.setText(resId,content);
    }

    public void setImageResource(int resId,int imgRes){
      viewHolderImpl.setImageResource(resId, imgRes);
    }


    public View getConvertView(){
        return convertView;
    }

    public int getViewArraySize(){
        return viewHolderImpl.getArraySize();
    }*/


    /**
     * 通过viewId获取控件
     *
     * @param viewId
     * @return
     */
    public <T extends View> T getView(int viewId)
    {
        View view = mViews.get(viewId);
        if (view == null)
        {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public View getConvertView()
    {
        return mConvertView;
    }

    /**
     * 设置TextView的值
     *
     * @param viewId
     * @param text
     * @return
     */
    public CommonViewHolder setText(int viewId, String text)
    {
        TextView tv = getView(viewId);
        tv.setText(text);
        return this;
    }

    public int getArraySize(){
        return mViews.size();
    }

   // public boolean hasViewStub(){
       // return hasViewStub;
   // }


}
