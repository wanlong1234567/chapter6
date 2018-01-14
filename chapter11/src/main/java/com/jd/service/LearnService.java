package com.jd.service;

import com.jd.domain.LearnResource;
import com.jd.model.LeanQueryLeanListReq;
import com.jd.util.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author wanlong
 * @since 2018/1/9
 */

public interface LearnService  extends IService<LearnResource>{
      List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
      void deleteBatch(Long[] ids);
}
