package com.jd.dao;

import com.jd.domain.LearnResource;
import com.jd.util.MyMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author wanlong
 * @since 2018/1/9
 */
@Component
public interface LearnResourceMapper extends MyMapper<LearnResource> {

    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}


