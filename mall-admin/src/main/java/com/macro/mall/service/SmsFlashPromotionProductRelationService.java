package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Flash Promotion product Relation management service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionProductRelationService {
    /**
     * Add Relation in bulk
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * Edit related information
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * Remove link
     */
    int delete(Long id);

    /**
     * Get link details
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * Query related products and promotion information by page
     *
     * @param flashPromotionId        Flash Promotion id
     * @param flashPromotionSessionId Flash Promotion Session id
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * Get the number of product relations based on the event and event id
     * @param flashPromotionId
     * @param flashPromotionSessionId
     * @return
     */
    long getCount(Long flashPromotionId,Long flashPromotionSessionId);
}
