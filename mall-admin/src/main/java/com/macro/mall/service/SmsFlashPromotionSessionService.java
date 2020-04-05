package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionSessionDetail;
import com.macro.mall.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * Flash Promotion Session management service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionSessionService {
    /**
     * Add sessions
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * Modify session
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * Modify session activation status
     */
    int updateStatus(Long id, Integer status);

    /**
     * Delete session
     */
    int delete(Long id);

    /**
     * Get details
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * Get a list of sessions based on the enabled state
     */
    List<SmsFlashPromotionSession> list();

    /**
     * Get all available sessions and their number
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
