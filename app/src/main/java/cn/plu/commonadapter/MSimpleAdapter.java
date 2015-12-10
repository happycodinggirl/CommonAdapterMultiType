package cn.plu.commonadapter;

import android.content.Context;
import android.opengl.Visibility;
import android.view.View;

import java.util.List;

import cn.plu.commonadapter.commonadapter.CommonAdapter;
import cn.plu.commonadapter.commonadapter.CommonViewHolder;

/**
 * Created by lily on 15-12-8.
 */
public class MSimpleAdapter extends CommonAdapter {


    public MSimpleAdapter(Context context, final List datas, int layoutRes) {
        super(context, datas, layoutRes);
       /* setItemInterface(new ItemInterface() {
            @Override
            public Object getItem(int pos) {
                return datas.subList(0,);
            }
        });*/
    }

    @Override
    public void bindData(CommonViewHolder holder, int pos) {
        holder.setText(R.id.container1, R.id.textview1, ((Item) getItem(pos * 2)).getContent());
        holder.setText(R.id.container2,R.id.textview2, ((Item) getItem(pos * 2 + 1)).getContent());
        //holder.setText(R.id.container2,R.id.textview,((Item)getItem(pos*2)).getContent());

      /*  if (2*pos+1<mDatas.size()) {
            holder.setVisible(R.id.container2,R.id.textview,true);
            holder.setText(R.id.container2,R.id.textview, ((Item) getItem(pos * 2 + 1)).getContent());
        }else{
            holder.setVisible(R.id.container2,R.id.textview,false);
        }*/

    }



}
