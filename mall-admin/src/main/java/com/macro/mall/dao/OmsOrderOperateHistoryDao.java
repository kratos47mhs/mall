package com.macro.mall.dao;

import com.macro.mall.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Order operation record custom Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderOperateHistoryDao {
    /**
     * Bulk creation
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
