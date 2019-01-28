package config;

import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: linxiaomi
 * @CreateDate: 2019/1/27 17:38
 * @UpdateDate: 2019/1/27 17:38
 * @Version: 1.0
 **/
@Configuration
public class MyRule {

    /**
     * @Description:    自定义访问规则(轮询、随机、加权重...)
     * @Author:         linxiaomi
     * @CreateDate:     2019/1/27 17:41
     * @UpdateUser:     linxiaomi
     * @UpdateDate:     2019/1/27 17:41
     * @UpdateRemark:
     * @Version:        1.0
     * @return:
     */
    @Bean
    public IRule myRule() {
        return new MyRandomRule();
        // 达到的目的,用我们重新选择的随机算法代替默认的轮询
//        return new RandomRule();
        // 重试
//        return new RetryRule();
//        return new RoundRobinRule();
    }

}
