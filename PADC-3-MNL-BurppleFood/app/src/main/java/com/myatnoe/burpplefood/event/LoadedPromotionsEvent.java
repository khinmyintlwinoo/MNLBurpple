package com.myatnoe.burpplefood.event;

import java.util.List;

import com.myatnoe.burpplefood.data.vo.PromotionVO;

/**
 * Created by User on 1/15/2018.
 */

public class LoadedPromotionsEvent {
    private List<PromotionVO> promotionList;

    public List<PromotionVO> getPromotionList() {
        return promotionList;
    }

    public LoadedPromotionsEvent(List<PromotionVO> promotionList) {
        this.promotionList = promotionList;
    }
}
