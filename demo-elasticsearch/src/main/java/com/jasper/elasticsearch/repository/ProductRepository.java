package com.jasper.elasticsearch.repository;

import com.jasper.elasticsearch.dataobject.ESProductDO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author jasper
 * @date 2022-04-15 14:39
 */
public interface ProductRepository extends ElasticsearchRepository<ESProductDO, Integer> {

}

