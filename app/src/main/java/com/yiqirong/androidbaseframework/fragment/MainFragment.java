package com.yiqirong.androidbaseframework.fragment;


import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.yiqirong.androidbaseframework.R;
import com.yiqirong.androidbaseframework.widget.bannerHeaders.NetImageHolderView;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by kangwencai on 2016/11/21.
 */

public class MainFragment extends BaseFragment {
    @BindView(R.id.convenientBanner)
    ConvenientBanner convenientBanner;
    private ArrayList<String> networkImages = new ArrayList<String>();

    private String[] images = {"http://img2.imgtn.bdimg.com/it/u=3093785514,1341050958&fm=21&gp=0.jpg",
            "http://img2.3lian.com/2014/f2/37/d/40.jpg",
            "http://d.3987.com/sqmy_131219/001.jpg",
            "http://img2.3lian.com/2014/f2/37/d/39.jpg",
            "http://www.8kmm.com/UploadFiles/2012/8/201208140920132659.jpg",
            "http://f.hiphotos.baidu.com/image/h%3D200/sign=1478eb74d5a20cf45990f9df460b4b0c/d058ccbf6c81800a5422e5fdb43533fa838b4779.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/09fa513d269759ee50f1971ab6fb43166c22dfba.jpg"
    };


    @Override
    protected int setContentViewId() {
        return R.layout.fragment_main;


    }


    @Override
    protected void initViewData() {


        for (String str : images) {
            networkImages.add(str);
        }

        //本地图片例子
        convenientBanner.setPages(
                new CBViewHolderCreator<NetImageHolderView>() {
                    @Override
                    public NetImageHolderView createHolder() {
                        return new NetImageHolderView();
                    }
                }, networkImages)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
//                .setPageIndicator(new int[]{R.drawable.ic_page_indicator, R.drawable.ic_page_indicator_focused})
                //设置指示器的方向
//                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT)
//                .setOnPageChangeListener(this)//监听翻页事件
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(int position) {

                    }
                }).startTurning(2000);
// 设置切换模式，具体可以进包里面查看各种动画
// convenientBanner.getViewPager().setPageTransformer(true,new DefaultTransformer());

    }

    /*
   加入测试Views
   * */
    private void loadTestDatas() {
        //本地图片集合
//        for (int position = 0; position < 7; position++)
//            networkImages.add(getResId("ic_test_" + position, R.drawable.class));


    }


    @Override
    protected void initListener() {

    }

    @Override
    protected void lazyLoad() {

    }


}
