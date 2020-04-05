package com.macro.mall.dao;

import com.macro.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Subject Product relationship operations
 * Created by macro on 2018/4/26.
 */
public interface CmsSubjectProductRelationDao {
    /**
     * Bulk creation
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
