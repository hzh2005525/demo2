package com.sogal.wx.core.config;

import com.google.gson.Gson;
import com.sogal.common.util.JedisUtil;
import com.sogal.wx.core.annotation.processor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * Created by xiaoxuwang on 2019/2/21.
 */
@Configuration
public class GlobalWebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private Gson gson;

    @Autowired
    private JedisUtil jedisUtil;

    @Autowired
    private AppletLoginHandlerProcessor appletLoginHandlerProcessor;

    @Autowired
    private QrCodeBodyProcessor qrCodeBodyProcessor;

    @Autowired
    private UserShareDesignProcessor userShareDesignProcessor;

    @Autowired
    private UserQueryDesignPageProcessor userQueryDesignPageProcessor;

    @Autowired
    private AppletMarkHandlerProcessor appletMarkHandlerProcessor;

    @Autowired
    private MyRecordProcessor myRecordProcessor;

    @Autowired
    private MyCollectProcessor myCollectProcessor;

    @Autowired
    private MyCollectSignProcessor myCollectSignProcessor;

    @Autowired
    private AppletSharerNoHandlerProcessor appletSharerNoHandlerProcessor;

    @Autowired
    private AppletVisitMethodProcessor appletVisitMethodProcessor;

    @Autowired
    private UserQueryDesignerDetailProcessor userQueryDesignerDetailProcessor;

    @Autowired
    private UserQueryCouponPageProcessor userQueryCouponPageProcessor;

    @Autowired
    private ViewMyFootmarkProcessor viewMyFootmarkProcessor;

    @Autowired
    private AppletSceneValueHandlerProcessor appletSceneValueHandlerProcessor;

    @Autowired
    private ASDataPrivilegeHandlerProcessor asDataPrivilegeHandlerProcessor;


    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry) {
        interceptorRegistry.addInterceptor(new AppletLoginRequiredProcessor(jedisUtil)).addPathPatterns("/**");
        interceptorRegistry.addInterceptor(new AdminLoginRequiredProcessor(jedisUtil)).addPathPatterns("/**");
        interceptorRegistry.addInterceptor(new AppleMarkRequiredProcessor()).addPathPatterns("/**");
//        interceptorRegistry.addInterceptor(new AppleMarkRequiredProcessor()).addPathPatterns("/**").excludePathPatterns("/**/wechat/c/test/send/kefu/msg");
        interceptorRegistry.addInterceptor(new UserLogoutProcessor(jedisUtil)).addPathPatterns("/wechat/c/logout.json");
//        interceptorRegistry.addInterceptor(new UserRegisterInfoProcessor(jedisUtil)).addPathPatterns("/wechat/c/user/fill/info.json");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(appletLoginHandlerProcessor);
        argumentResolvers.add(qrCodeBodyProcessor);
        argumentResolvers.add(userShareDesignProcessor);
        argumentResolvers.add(new AppletUserTokenProcessor());
        argumentResolvers.add(new UserQueryDetailProcessor(appletLoginHandlerProcessor));
        argumentResolvers.add(userQueryDesignPageProcessor);
        argumentResolvers.add(appletMarkHandlerProcessor);
        argumentResolvers.add(myRecordProcessor);
        argumentResolvers.add(myCollectProcessor);
        argumentResolvers.add(appletSharerNoHandlerProcessor);
        argumentResolvers.add(appletVisitMethodProcessor);
        argumentResolvers.add(myCollectSignProcessor);
        argumentResolvers.add(userQueryDesignerDetailProcessor);
        argumentResolvers.add(userQueryCouponPageProcessor);
        argumentResolvers.add(viewMyFootmarkProcessor);
        argumentResolvers.add(appletSceneValueHandlerProcessor);
        argumentResolvers.add(asDataPrivilegeHandlerProcessor);
    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }

}
