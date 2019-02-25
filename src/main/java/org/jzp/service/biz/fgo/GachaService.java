package org.jzp.service.biz.fgo;

import org.jzp.common.Constants;
import org.springframework.stereotype.Component;

/**
 * fgo扭蛋模拟器
 *
 * @author Hongyi Zheng
 * @date 2018/9/11
 */
@Component("gachaService")
public class GachaService {

    private static final String x1 = Constants.FGO_SUM_TYPE_X1;
    private static final String x10 = Constants.FGO_SUM_TYPE_X10;

    public String summon(String type) {
        if (type.equals(x1)) {

        }else if (type.equals(x10)) {

        }
        return "";
    }


}
