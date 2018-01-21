package com.myatnoe.burpplefood.event;

import java.util.List;

import com.myatnoe.burpplefood.data.vo.FeaturedVO;

/**
 * Created by User on 1/15/2018.
 */

public class LoadedFeaturedEvent {
    private List<FeaturedVO> featuredList;

    public List<FeaturedVO> getFeaturedList() {
        return featuredList;
    }

    public LoadedFeaturedEvent(List<FeaturedVO> featuredList) {
        this.featuredList = featuredList;
    }
}
