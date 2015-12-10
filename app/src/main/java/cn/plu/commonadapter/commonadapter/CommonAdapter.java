package cn.plu.commonadapter.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;


/**baseAdapter的通用类　继承该类实现bindData方法即可
 * Created by lily on 15-12-8.
 */
public  abstract  class CommonAdapter<T> extends BaseAdapter {


    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;
    private int layoutId;
    ItemInterface<T> itemInterface;

    ViewStubController viewStubController;

    protected int columnCount=1;

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public interface ItemInterface<T>{
        T getItem(int index,int pos);
    }

    protected void setItemInterface(ItemInterface<T> itemInterface) {
        this.itemInterface = itemInterface;
    }

    public void setViewStubController(ViewStubController viewStubController) {
        this.viewStubController = viewStubController;
    }

    public CommonAdapter(Context context, List<T> datas, int layoutId)
    {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        this.mDatas = datas;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount()
    {
        if (getColumnCount()>1) {
            int yushu = mDatas.size() % 2;
            return mDatas == null ? 0 : yushu == 0 ? mDatas.size() / columnCount : mDatas.size() / columnCount + 1;
        }else{
            return mDatas==null?0:mDatas.size();
        }

    }

    @Override
    public T getItem(int position)
    {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        CommonViewHolder holder = CommonViewHolder.get(mContext, convertView, parent,
                layoutId, position);
        if (viewStubController!=null){
            viewStubController.fillInflateView(holder,position);
        }
        bindData(holder, position);
        return holder.getConvertView();
    }

    /**
     * 绑定数据
     * @param holder　view的holder类　
     * @param t　单个数据源
     */
    public abstract void bindData(CommonViewHolder holder, int pos);

    public interface ViewStubController{
        //View getView(CommonViewHolder commonViewHolder);
        void fillInflateView(CommonViewHolder commonViewHolder,int pos);


    }
}