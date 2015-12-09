package cn.plu.commonadapter;

import android.content.Context;

import java.util.List;

import cn.plu.commonadapter.commonadapter.CommonAdapter;
import cn.plu.commonadapter.commonadapter.CommonViewHolder;

/**
 * Created by lily on 15-12-8.
 */
public class SimpleAdapter extends CommonAdapter {


    public SimpleAdapter(Context context, List datas, int layoutRes) {
        super(context, datas, layoutRes);
    }

    @Override
    public void bindData(CommonViewHolder viewHolder, Object o) {
        viewHolder.setText(R.id.textview, ((Item)o).getContent());
    }

}
