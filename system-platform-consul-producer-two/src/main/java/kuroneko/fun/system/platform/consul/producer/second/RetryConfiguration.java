package kuroneko.fun.system.platform.consul.producer.second;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.interceptor.RetryInterceptorBuilder;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

/**
 * 放入second pakg 仅为区别另一个生产者
 * @author kuroneko
 */
public class RetryConfiguration {
	@Bean
	@ConditionalOnMissingBean(name = "configServerRetryInterceptor")
	public RetryOperationsInterceptor configServerRetryInterceptor() {
		return RetryInterceptorBuilder.stateless().backOffOptions(1000, 1.2, 5000).maxAttempts(10).build();
	}
}