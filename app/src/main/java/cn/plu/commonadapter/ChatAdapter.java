package cn.plu.commonadapter;


import android.content.Context;

import java.util.List;

import cn.plu.commonadapter.commonadapter.CommonViewHolder;
import cn.plu.commonadapter.commonadapter.MutiTypeAdapter;
import cn.plu.commonadapter.commonadapter.MutiTypeInterface;

/**
 * Created by lily on 15-12-8.
 */
public class ChatAdapter extends MutiTypeAdapter<Item> {
    public ChatAdapter(Context context, List<Item> datas)
    {
        super(context, datas, new MutiTypeInterface<Item>()
        {
            @Override
            public int getLayoutId(int position, Item msg)
            {
                if (position%2==0)
                {
                    return R.layout.item;
                }
                return R.layout.item1;
            }

            @Override
            public int getViewTypeCount()
            {
                return 2;
            }
            @Override
            public int getItemViewType(int postion, Item msg)
            {
                if (msg.isComMeg())
                {
                    return Item.RECIEVE_MSG;
                }
                return Item.SEND_MSG;
            }
        });
    }

   /* @Override
    public void bindData(CommonViewHolder holder, Item chatMessage)
    {

        switch (holder.getLayoutId())
        {
            case R.layout.item:
                holder.setText(R.id.textview, chatMessage.getContent());
               // holder.setText(R.id.textview, chatMessage.getName());
              *//*  holder.setText(R.id.chat_from_name, chatMessage.getName());
                holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());*//*
                break;
            case R.layout.item1:
                holder.setText(R.id.textview, chatMessage.getContent());
               // holder.setText(R.id.textview, chatMessage.getName());
              *//*  holder.setText(R.id.chat_send_name, chatMessage.getName());
                holder.setImageResource(R.id.chat_send_icon, chatMessage.getIcon());*//*
                break;
        }
    }*/

    @Override
    public void bindData(CommonViewHolder holder, int pos) {

    }
}
