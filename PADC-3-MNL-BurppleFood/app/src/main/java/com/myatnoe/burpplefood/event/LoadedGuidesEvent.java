package com.myatnoe.burpplefood.event;

import java.util.List;

import com.myatnoe.burpplefood.data.vo.GuidesVO;

/**
 * Created by User on 1/15/2018.
 */

public class LoadedGuidesEvent {
    private List<GuidesVO> guidesList;

    public List<GuidesVO> getGuidesList() {
        return guidesList;
    }

    public LoadedGuidesEvent(List<GuidesVO> guidesList) {
        this.guidesList = guidesList;
    }
}
