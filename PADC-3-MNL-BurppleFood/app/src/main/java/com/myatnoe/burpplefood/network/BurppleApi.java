package com.myatnoe.burpplefood.network;

import com.myatnoe.burpplefood.network.responses.GetBurppleFeaturedResponse;
import com.myatnoe.burpplefood.network.responses.GetBurppleGuidesResponse;
import com.myatnoe.burpplefood.network.responses.GetBurpplePromotionsResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by User on 1/16/2018.
 */

public interface BurppleApi {
    @FormUrlEncoded
    @POST("getFeatured.php")
    Call<GetBurppleFeaturedResponse> loadFeatured(@Field("page") int page,
                                                  @Field("access_token") String accessToken);

    @FormUrlEncoded
    @POST("getPromotions.php")
    Call<GetBurpplePromotionsResponse> loadPromotions(@Field("page") int page,
                                                    @Field("access_token") String accessToken);

    @FormUrlEncoded
    @POST("getGuides.php")
    Call<GetBurppleGuidesResponse> loadGuides(@Field("page") int page,
                                                  @Field("access_token") String accessToken);
}
