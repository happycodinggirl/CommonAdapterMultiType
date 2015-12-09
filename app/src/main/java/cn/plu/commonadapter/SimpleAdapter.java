package cn.plu.commonadapter;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lily on 15-12-8.
 */
public class SimpleAdapter extends CommonAdapter {


    public SimpleAdapter(Context context, List datas, int layoutRes) {
        super(context, datas, layoutRes);
    }

    @Override
    public int getLayoutRes(int type) {
        return R.layout.item;
    }

    @Override
    public void convert(CommonViewHolder viewHolder, Object o) {
        viewHolder.setText(R.id.textview, (String) o);
    }

    /*@Override
    public void convert(CommonViewHolder viewHolder, Object o,int type) {
        Log.v("TAG", "-----commonViewHolder is " + viewHolder);

    }*/
}
