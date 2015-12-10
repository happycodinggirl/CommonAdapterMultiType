package cn.plu.commonadapter.commonadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.RatingBar;


/**baseAdapter的通用ViewHolder
 * Created by lily on 15-12-8.
 */
public class CommonViewHolder implements  Holderable{

    /**
     * abslistview和recycleview桥接的实现类
     */
    ViewHolderImpl viewHolderImpl;

    public CommonViewHolder(Context context, ViewGroup parent, int layoutId,
                      int position)
    {
        viewHolderImpl=new ViewHolderImpl(CommonViewHolder.this,context,parent,layoutId,position);

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

    public ViewStub getViewStub(){
        return viewHolderImpl.viewStub;
    }

    public View getInflateView(){
        return viewHolderImpl.getInflatedView();
    }

    public void setInflateView(View view){
        viewHolderImpl.setInflatedView(view);
    }



    public int getLayoutId(){
        return viewHolderImpl.getLayoutId();
       // return mLayoutId;
    }

    /**
     * 通过viewId获取控件
     *
     * @param viewId
     * @return
     */
    public <T extends View> T findView(int viewId)
    {
        return viewHolderImpl.findView(viewId);
    }

    public View getConvertView()
    {
        return viewHolderImpl.getConvertView();

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
         viewHolderImpl.setText(viewId,text);
        return this;

    }
    /**
     * 设置TextView的值
     *
     * @param viewId
     * @param text
     * @return
     */
    public CommonViewHolder setText(int parentRes,int viewId, String text)
    {
         viewHolderImpl.setText(parentRes,viewId,text);
        return this;

    }

    public CommonViewHolder setImageResource(int viewId, int resId)
    {
        viewHolderImpl.setImageResource(viewId,resId);
        return this;
    }

    public CommonViewHolder setImageBitmap(int viewId, Bitmap bitmap)
    {
        viewHolderImpl.setImageBitmap(viewId,bitmap);
        return this;
    }

    public CommonViewHolder setImageDrawable(int viewId, Drawable drawable)
    {
        viewHolderImpl.setImageDrawable(viewId,drawable);
        return this;
    }

    public CommonViewHolder setBackgroundColor(int viewId, int color)
    {
        viewHolderImpl.setBackgroundColor(viewId,color);
        return this;
    }

    public CommonViewHolder setBackgroundRes(int viewId, int backgroundRes)
    {
       viewHolderImpl.setBackgroundRes(viewId,backgroundRes);
        return this;
    }

    public CommonViewHolder setTextColor(int viewId, int textColor)
    {
        viewHolderImpl.setTextColor(viewId,textColor);
        return this;
    }

    public CommonViewHolder setTextColorRes(int viewId, int textColorRes)
    {
        viewHolderImpl.setTextColorRes(viewId,textColorRes);
        return this;
    }

    @SuppressLint("NewApi")
    public CommonViewHolder setAlpha(int viewId, float value)
    {
       viewHolderImpl.setAlpha(viewId,value);

        return this;
    }

    public CommonViewHolder setVisible(int viewId, boolean visible)
    {
        viewHolderImpl.setVisible(viewId,visible);
        return this;
    }
    public CommonViewHolder setVisible(int parentId,int viewId, boolean visible)
    {
        viewHolderImpl.setVisible(parentId,viewId,visible);
        return this;
    }

    public CommonViewHolder linkify(int viewId)
    {
        viewHolderImpl.linkify(viewId);
        return this;
    }

    public CommonViewHolder setTypeface(Typeface typeface, int... viewIds)
    {
        viewHolderImpl.setTypeface(typeface,viewIds);
        return this;
    }

    public CommonViewHolder setProgress(int viewId, int progress)
    {
        viewHolderImpl.setProgress(viewId,progress);
        return this;
    }

    public CommonViewHolder setProgress(int viewId, int progress, int max)
    {
        ProgressBar view = findView(viewId);
        view.setMax(max);
        view.setProgress(progress);
        return this;
    }

    public CommonViewHolder setMax(int viewId, int max)
    {
        ProgressBar view = findView(viewId);
        view.setMax(max);
        return this;
    }

    public CommonViewHolder setRating(int viewId, float rating)
    {
        RatingBar view = findView(viewId);
        view.setRating(rating);
        return this;
    }

    public CommonViewHolder setRating(int viewId, float rating, int max)
    {
        RatingBar view = findView(viewId);
        view.setMax(max);
        view.setRating(rating);
        return this;
    }

    public CommonViewHolder setTag(int viewId, Object tag)
    {
        viewHolderImpl.setTag(viewId,tag);
        return this;
    }

    public CommonViewHolder setTag(int viewId, int key, Object tag)
    {
        viewHolderImpl.setTag(viewId,key,tag);
        return this;
    }

    public CommonViewHolder setChecked(int viewId, boolean checked)
    {
        viewHolderImpl.setChecked(viewId,checked);
        return this;
    }

    /**
     * 关于事件的
     */
    public CommonViewHolder setOnClickListener(int viewId,
                                         View.OnClickListener listener)
    {
        viewHolderImpl.setOnClickListener(viewId,listener);
        return this;
    }

    public CommonViewHolder setOnTouchListener(int viewId,
                                         View.OnTouchListener listener)
    {
        viewHolderImpl.setOnTouchListener(viewId,listener);
        return this;
    }

    public CommonViewHolder setOnLongClickListener(int viewId,
                                             View.OnLongClickListener listener)
    {
       viewHolderImpl.setOnLongClickListener(viewId,listener);
        return this;
    }


}
