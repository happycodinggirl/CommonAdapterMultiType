package cn.plu.commonadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;


/**
 * Created by lily on 15-12-8.
 */
public class CommonViewHolder implements  Holderable{

    ViewHolderImpl viewHolderImpl;
    /*private SparseArray<View> mViews;
    //private int mPosition;
    private View mConvertView;
    private Context mContext;
    private int mLayoutId;
*/
    public CommonViewHolder(Context context, ViewGroup parent, int layoutId,
                      int position)
    {

        viewHolderImpl=new ViewHolderImpl(CommonViewHolder.this,context,parent,layoutId,position);

       /* mContext = context;
        mLayoutId = layoutId;
        //	this.mPosition = position;
        this.mViews = new SparseArray<View>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent,
                false);
        mConvertView.setTag(this);*/
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

	/*public int getPosition()
	{
		return mPosition;
	}*/

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
        /*View view = mViews.get(viewId);
        if (view == null)
        {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;*/
        return viewHolderImpl.findView(viewId);
    }

    public View getConvertView()
    {
        return viewHolderImpl.getConvertView();
       // return mConvertView;
    }

    /**
     * 设置TextView的值
     *
     * @param viewId
     * @param text
     * @return
     */
    public void setText(int viewId, String text)
    {

         viewHolderImpl.setText(viewId,text);
        /*TextView tv = findView(viewId);
        tv.setText(text);
        return this;*/
    }

    public CommonViewHolder setImageResource(int viewId, int resId)
    {
        ImageView view = findView(viewId);
        view.setImageResource(resId);
        return this;
    }

    public CommonViewHolder setImageBitmap(int viewId, Bitmap bitmap)
    {
        ImageView view = findView(viewId);
        view.setImageBitmap(bitmap);
        return this;
    }

    public CommonViewHolder setImageDrawable(int viewId, Drawable drawable)
    {
        ImageView view = findView(viewId);
        view.setImageDrawable(drawable);
        return this;
    }

    public CommonViewHolder setBackgroundColor(int viewId, int color)
    {
        View view = findView(viewId);
        view.setBackgroundColor(color);
        return this;
    }

    public CommonViewHolder setBackgroundRes(int viewId, int backgroundRes)
    {
        View view = findView(viewId);
        view.setBackgroundResource(backgroundRes);
        return this;
    }

    public CommonViewHolder setTextColor(int viewId, int textColor)
    {
        TextView view = findView(viewId);
        view.setTextColor(textColor);
        return this;
    }

    public CommonViewHolder setTextColorRes(int viewId, int textColorRes)
    {
        /*TextView view = findView(viewId);
        view.setTextColor(mContext.getResources().getColor(textColorRes));*/
        return this;
    }

    @SuppressLint("NewApi")
    public CommonViewHolder setAlpha(int viewId, float value)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
            findView(viewId).setAlpha(value);
        } else
        {
            // Pre-honeycomb hack to set Alpha value
            AlphaAnimation alpha = new AlphaAnimation(value, value);
            alpha.setDuration(0);
            alpha.setFillAfter(true);
            findView(viewId).startAnimation(alpha);
        }
        return this;
    }

    public CommonViewHolder setVisible(int viewId, boolean visible)
    {
        View view = findView(viewId);
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
        return this;
    }

    public CommonViewHolder linkify(int viewId)
    {
        TextView view = findView(viewId);
        Linkify.addLinks(view, Linkify.ALL);
        return this;
    }

    public CommonViewHolder setTypeface(Typeface typeface, int... viewIds)
    {
        for (int viewId : viewIds)
        {
            TextView view = findView(viewId);
            view.setTypeface(typeface);
            view.setPaintFlags(view.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }
        return this;
    }

    public CommonViewHolder setProgress(int viewId, int progress)
    {
        ProgressBar view = findView(viewId);
        view.setProgress(progress);
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
        View view = findView(viewId);
        view.setTag(tag);
        return this;
    }

    public CommonViewHolder setTag(int viewId, int key, Object tag)
    {
        View view = findView(viewId);
        view.setTag(key, tag);
        return this;
    }

    public CommonViewHolder setChecked(int viewId, boolean checked)
    {
        Checkable view = (Checkable) findView(viewId);
        view.setChecked(checked);
        return this;
    }

    /**
     * 关于事件的
     */
    public CommonViewHolder setOnClickListener(int viewId,
                                         View.OnClickListener listener)
    {
        View view = findView(viewId);
        view.setOnClickListener(listener);
        return this;
    }

    public CommonViewHolder setOnTouchListener(int viewId,
                                         View.OnTouchListener listener)
    {
        View view = findView(viewId);
        view.setOnTouchListener(listener);
        return this;
    }

    public CommonViewHolder setOnLongClickListener(int viewId,
                                             View.OnLongClickListener listener)
    {
        View view = findView(viewId);
        view.setOnLongClickListener(listener);
        return this;
    }


}
