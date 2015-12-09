package cn.plu.commonadapter;

/**
 * Created by lily on 15-12-8.
 */
public interface MutiTypeInterface<T> {
    int getLayoutId(int position, T t);

    int getViewTypeCount();

    int getItemViewType(int postion, T t);

}
