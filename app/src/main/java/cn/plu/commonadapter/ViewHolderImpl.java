package cn.plu.commonadapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lily on 15-12-8.
 */
public class ViewHolderImpl {
    private SparseArray<View> viewArray;
    //private int mPosition;
    private View mConvertView;
    private Context mContext;
    private int mLayoutId;

    public ViewHolderImpl(Holderable holderable,Context context, ViewGroup parent, int layoutId,
                            int position)
    {

        mContext = context;
        mLayoutId = layoutId;
        //	this.mPosition = position;
        this.viewArray = new SparseArray<View>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent,
                false);
        mConvertView.setTag(holderable);
    }

    public ViewHolderImpl(View mConvertView) {
        this.mConvertView = mConvertView;
        this.viewArray = new SparseArray<View>();
    }

    boolean hasViewStub;



    public <T extends View> T findView(int resId){
        View view=viewArray.get(resId);
        if (view==null){
            view=mConvertView.findViewById(resId);
            viewArray.put(resId,view);
            return (T) view;
        }
        return (T) view;
    }

    public void setText(int resId,String content){
        TextView textView=findView(resId);
        Log.v("TAG","-----TEXTVIEW IS "+textView);
        textView.setText(content);
    }

    public void setImageResource(int resId,int resource){
        ImageView imageView=findView(resId);
        imageView.setImageResource(resource);
    }

    public View getConvertView() {
        return mConvertView;
    }


    public int getLayoutId(){
        return mLayoutId;
    }

    public int getArraySize(){
        return viewArray.size();
    }

    public boolean hasViewStub(){
        return hasViewStub;
    }
}
