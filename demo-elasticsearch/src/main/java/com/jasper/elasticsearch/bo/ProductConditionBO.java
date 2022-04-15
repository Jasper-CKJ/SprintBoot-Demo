package com.jasper.elasticsearch.bo;

import lombok.Data;

import java.util.List;

/**
 * 商品搜索条件返回 BO
 *
 * @author jasper
 * @date 2022-04-15 14:31
 */
@Data
public class ProductConditionBO {

    /**
     * 商品分类数组
     */
    private List<Category> categories;

    public static class Category {

        /**
         * 分类编号
         */
        private Integer id;
        /**
         * 分类名称
         */
        private String name;

        public Integer getId() {
            return id;
        }

        public Category setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Category setName(String name) {
            this.name = name;
            return this;
        }

    }
}
