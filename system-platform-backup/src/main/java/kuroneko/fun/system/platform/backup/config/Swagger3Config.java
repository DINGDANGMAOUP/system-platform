package kuroneko.fun.system.platform.backup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/** @author kuroneko */
@Configuration
@EnableOpenApi
public class Swagger3Config {
  @Bean
  public Docket createRestApi() {
    // 添加请求参数，我们这里把token作为请求头部参数传入后端
    //        return new Docket(DocumentationType.OAS_30)
    //            .apiInfo(apiInfo())
    //            .select()
    //            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
    //            .paths(PathSelectors.any())
    //            .build();
    return new Docket(DocumentationType.OAS_30)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    //    	return new ApiInfoBuilder()
    //    			.title("Kitty API Doc")
    //    			.description("This is a restful api document of Kitty.")
    //    			.version("1.0")
    //    			.build();
    return new ApiInfoBuilder().build();
  }
}
