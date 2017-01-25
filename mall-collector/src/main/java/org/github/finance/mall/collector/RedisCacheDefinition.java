package org.github.finance.mall.collector;

/**
 * @author ligaofeng 2017年1月25日 下午8:09:38
 */
public class RedisCacheDefinition {

    private RedisCacheDefinition() {
    }

    //未知
    public static final String unkown                 = "unkown";

    //各省份累计用户数
    public static final String provinceUsersCntPrefix = "province.users.cnt";
    //各运营商累计用户数
    public static final String catNameUsersCntPrefix  = "catName.users.cnt";

}