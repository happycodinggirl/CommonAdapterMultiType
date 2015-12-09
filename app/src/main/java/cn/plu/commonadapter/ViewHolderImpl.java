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
    View convertView;
    SparseArray<View> viewArray;
    LayoutInflater inflater;
    public ViewHolderImpl(CommonViewHolder commonViewHolder,Context context,View convertView,ViewGroup viewGroup,int layoutRes) {
        this.convertView = convertView;
        inflater= LayoutInflater.from(context);
       // this.convertView=inflater.inflate(layoutRes,viewGroup,false);

        this.convertView.setTag(commonViewHolder);
        this.viewArray=new SparseArray<>();

    }

    boolean hasViewStub;



    public <T extends View> T findView(int resId){
        View view=viewArray.get(resId);
        if (view==null){
            view=convertView.findViewById(resId);
            viewArray.put(resId,view);
            return (T) view;
        }
        return (T) view;
    }

    public void setText(int resId,String content){
        TextView textView=findView(resId);
        Log.v("TAG","-----TEXTVIEW IS "+textView);
        FragmentActivity  fragmentActivity;
        textView.setText(content);
    }

    public void setImageResource(int resId,int resource){
        ImageView imageView=findView(resId);
        imageView.setImageResource(resource);
    }

    public View getConvertView() {
        return convertView;
    }

    public int getArraySize(){
        return viewArray.size();
    }

    public boolean hasViewStub(){
        return hasViewStub;
    }
}
