package cn.plu.commonadapter;


import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by lily on 15-12-8.
 */
public class ChatAdapter extends MutiTypeAdapter<Item> {
    public ChatAdapter(Context context, List<Item> datas) {
        super(context, datas, new MutiTypeInterface<Item>() {
            /*@Override
            public int getItemType(int pos, Item item) {
                if (item.isComMeg()) {
                    return 0;
                }else{
                    return 1;
                }
            }

            @Override
            public int getLayoutRes(int pos, Item item) {
                if (item.isComMeg()) {
                    return R.layout.item;
                }else{

                    return R.layout.item1;
                }
            }
*/

            @Override
            public int getLayoutId(int position, Item item) {
                if (item.isComMeg()) {
                    return R.layout.item;
                }else{

                    return R.layout.item1;
                }
            }

            @Override
            public int getViewTypeCount() {
                return 2;
            }

            @Override
            public int getItemViewType(int postion, Item item) {
                if (item.isComMeg()) {
                    return 0;
                }else{
                    return 1;
                }
            }
        });
    }

    @Override
    public void convert(CommonViewHolder viewHolder, Item t) {
        Log.v("TAG", "--------CONVERT Item IS " + t + "  comntent is " + t.getContent());
        switch (viewHolder.getLayoutRes()){
            case R.layout.item:
                viewHolder.setText(R.id.textview,t.getContent());
                break;
            case R.layout.item1:
                viewHolder.setText(R.id.textview1,t.getContent());
                break;
        }


    }
}
