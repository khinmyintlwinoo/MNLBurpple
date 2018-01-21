package com.myatnoe.burpplefood.network.responses;

import java.util.List;

import com.myatnoe.burpplefood.data.vo.PromotionVO;

/**
 * Created by User on 1/15/2018.
 */

public class GetBurpplePromotionsResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<PromotionVO> promotions;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PromotionVO> getPromotions() {
        return promotions;
    }
}
