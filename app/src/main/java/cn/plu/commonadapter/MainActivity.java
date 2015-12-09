package cn.plu.commonadapter;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;


public class MainActivity extends ListActivity{

    private ArrayList<Item> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatas = new ArrayList<>();
        initDatas();

        //ListView listview= (ListView) findViewById(R.id.listview);
       /* CommonAdapter mutiTypeAdapter=new MutiTypeAdapter(MainActivity.this,dataList);
        listview.setAdapter(mutiTypeAdapter);*/
      ChatAdapter chatAdapter=new ChatAdapter(MainActivity.this, mDatas);
        getListView().setAdapter(chatAdapter);
        //listview.setAdapter(chatAdapter);
       /* RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycleview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
       RecycleAdapter<String> adapter=new RecycleAdapter<String>(MainActivity.this,dataList) {
           @Override
           public void bindData(RecycleViewHolder recycleViewHolder, String item, int pos,int type) {
               recycleViewHolder.setText(R.id.textview,item);

           }

           @Override
           public int getLayoutRes(int type) {
               return R.layout.item;
           }
       };
        recyclerView.setAdapter(adapter);
*/


        /*CommonAdapter adapter=new SimpleAdapter(MainActivity.this,R.layout.item,dataList);
        listview.setAdapter(adapter);*/


      

    }


    private void initDatas()
    {

        Item msg = null;
        msg = new Item(R.drawable.xiaohei, "xiaohei", "1 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "2",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "3 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "4 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "5",
                null, false);
        mDatas.add(msg);

        msg = new Item(R.drawable.xiaohei, "xiaohei", "6 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "7 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "8 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "9 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "10 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "11 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "12 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "13 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "14 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "15 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "16 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "17 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "18 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "19",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "20 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "21",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "22 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "23 ",
                null, false);
        mDatas.add(msg);
        msg = new Item(R.drawable.renma, "renma", "24 ",
                null, true);
        mDatas.add(msg);
        msg = new Item(R.drawable.xiaohei, "xiaohei", "25 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "26 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "27 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "28 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "29 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "30 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "31 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "32 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "33 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "34 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "35 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "36 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "37 ",
                null, false);
        mDatas.add(msg); msg = new Item(R.drawable.xiaohei, "xiaohei", "38 ",
                null, false);
        mDatas.add(msg);

    }

}
