package com.myatnoe.burpplefood.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.myatnoe.burpplefood.BurppleFoodApp;
import com.myatnoe.burpplefood.R;
import com.myatnoe.burpplefood.adpaters.BurppleGuidesAdapter;
import com.myatnoe.burpplefood.adpaters.BurpplePromotionsAdpater;
import com.myatnoe.burpplefood.adpaters.ImageInBurppleAdapter;;
import com.myatnoe.burpplefood.data.models.BurppleModel;
import com.myatnoe.burpplefood.delegates.BurppleActionDelegates;
import com.myatnoe.burpplefood.event.LoadedGuidesEvent;
import com.myatnoe.burpplefood.event.LoadedPromotionsEvent;

/**
 * Created by User on 1/4/2018.
 */

public class BurppleFoodActivity extends AppCompatActivity implements BurppleActionDelegates{

    @BindView(R.id.vp_burpple_food_background_img)
    ViewPager vpBurppleFoodBackgroundImg;

    @BindView(R.id.rv_burpple_promotions)
    RecyclerView rvBurpplePromotions;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView getRvBurppleGuides;

    private ImageInBurppleAdapter mBurppleAdapter;
    private BurpplePromotionsAdpater mBurpplePromotionsAdapter;
    private BurppleGuidesAdapter mBurppleGuidesAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_burpple_food);

        ButterKnife.bind(this,this);

        mBurppleAdapter = new ImageInBurppleAdapter();
        vpBurppleFoodBackgroundImg.setAdapter(mBurppleAdapter);

        mBurpplePromotionsAdapter = new BurpplePromotionsAdpater();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
        (getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvBurpplePromotions.setLayoutManager(linearLayoutManager);
        rvBurpplePromotions.setAdapter(mBurpplePromotionsAdapter);

        mBurppleGuidesAdapter = new BurppleGuidesAdapter();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager
        (getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        getRvBurppleGuides.setLayoutManager(linearLayoutManager1);
        getRvBurppleGuides.setAdapter(mBurppleGuidesAdapter);

        BurppleModel.getsObjInstance().loadBurppleFeatures();
    //    BurppleModel.getsObjInstance().loadBurpplePromotions();
    //    BurppleModel.getsObjInstance().loadBurppleGuides();
    }

    @Override
    public void onTapMoviesItem() {

    }

    @Override
    public void onTapMovieOverviewButton() {

    }

    @Override
    public void onTapCropButton() {

    }

    @Override
    public void onTapFavoriteButton() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPromotionLoaded(LoadedPromotionsEvent promotionsEvent){
        Log.d(BurppleFoodApp.LOG_TAG, "onFeaturedLoaded :"+promotionsEvent.getPromotionList().size());
        mBurpplePromotionsAdapter.setData(promotionsEvent.getPromotionList());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGuidesLoaded(LoadedGuidesEvent guidesEvent){
        Log.d(BurppleFoodApp.LOG_TAG, "onFeaturedLoaded :"+guidesEvent.getGuidesList().size());
        mBurppleGuidesAdapter.setData(guidesEvent.getGuidesList());
    }

}
