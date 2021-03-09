//package kuroneko.fun.system.platform.admin.config;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author kuroneko
// */
//@Configuration
//@MapperScan()
//public class MybatisPlusConfig {
//  @Bean
//  public MapperScannerConfigurer mapperScannerConfigurer(){
//    MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//    //可以通过环境变量获取你的mapper路径,这样mapper扫描可以通过配置文件配置了
//    scannerConfigurer.setBasePackage("kuroneko.fun.system.platform.admin.mapper");
//    return scannerConfigurer;
//  }
//  /**
//   * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false 避免缓存出现问题(该属性会在旧插件移除后一同移除)
//   */
//  @Bean
//  public MybatisPlusInterceptor mybatisPlusInterceptor() {
//    MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//    interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//    return interceptor;
//  }
//
//  @Bean
//  public ConfigurationCustomizer configurationCustomizer() {
//    return configuration -> configuration.setUseDeprecatedExecutor(false);
//  }
//}
