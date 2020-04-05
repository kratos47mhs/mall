package com.macro.mall.service;

import com.macro.mall.model.CmsSubject;

import java.util.List;

/**
 * Product Topic Service
 * Created by macro on 2018/6/1.
 */
public interface CmsSubjectService {
    /**
     * Query all topics
     */
    List<CmsSubject> listAll();

    /**
     * Pagination query topics
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
