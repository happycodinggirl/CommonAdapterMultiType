package cn.plu.commonadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

import java.util.List;

import cn.plu.commonadapter.commonadapter.CommonAdapter;
import cn.plu.commonadapter.commonadapter.CommonViewHolder;

/**
 * Created by lily on 15-12-10.
 */
public class ViewStubAdapter extends CommonAdapter<Item> {

    public ViewStubAdapter(Context context, final List<Item> datas, int layoutId) {
        super(context, datas, layoutId);
      /*  setViewStubController(new ViewStubController() {
            @Override
            public View getView(CommonViewHolder commonViewHolder) {
                ViewStub viewStub=commonViewHolder.getViewStub();
                viewStub=commonViewHolder.findView(R.id.viewStub);
                View inflateView=null;
                if (commonViewHolder.getConvertView()==null){
                    inflateView=viewStub.inflate();
                    commonViewHolder.setText(R.id.textview,);
                    return inflateView;
                }else{
                    inflateView.setVisibility(View.VISIBLE);
                }
                return null;
            }

            @Override
            public void fillInflateView(CommonViewHolder commonViewHolder, int pos) {
                    commonViewHolder.setText(R.id.textview,datas.get(pos).getContent()+" inflate view");

            }
        });*/

        setViewStubController(new ViewStubController() {
            @Override
            public void fillInflateView(CommonViewHolder commonViewHolder, int pos) {

                View inflateView=commonViewHolder.getInflateView();
                if (pos%5==0){
                    if (inflateView==null){
                        commonViewHolder.setInflateView(((ViewStub)commonViewHolder.findView(R.id.viewStub)).inflate());
                    }else{
                        inflateView.setVisibility(View.VISIBLE);
                    }
                }else{
                    if (inflateView!=null){
                        inflateView.setVisibility(View.GONE);
                    }
                }
                if (inflateView!=null){
                    commonViewHolder.setText(R.id.inflatedid,R.id.textview_inflate,getItem(pos).getContent()+"i am inflate view");
                }

            }
        });

    }



    @Override
    public void bindData(CommonViewHolder holder, int pos) {
        holder.setText(R.id.container1, R.id.textview1, (getItem(pos)).getContent());
        //holder.setText(R.id.container2,R.id.textview2, (getItem(pos)).getContent());
    }


}
