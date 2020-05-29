package com.macro.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * Information about the current Flash Promotion on the home page
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeFlashPromotion {
    private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //Products belonging to this Flash Promotion activity
    private List<FlashPromotionProduct> productList;
}
