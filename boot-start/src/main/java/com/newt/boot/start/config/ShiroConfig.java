package com.newt.boot.start.config;

import com.newt.boot.service.auth.Authenticator.MultiRealmAuthenticator;
import com.newt.boot.service.auth.JwtAuthFilter;
import com.newt.boot.service.auth.matcher.JwtCredentialsMatcher;
import com.newt.boot.service.auth.matcher.SmsCredentialsMatcher;
import com.newt.boot.service.auth.realm.JwtShiroRealm;
import com.newt.boot.service.auth.realm.SmsShiroRealm;
import com.newt.boot.service.biz.UserService;
import org.apache.shiro.authc.Authenticator;
import org.apache.shiro.authc.pam.FirstSuccessfulStrategy;
import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionStorageEvaluator;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSessionStorageEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

  //  @Value("${receipt.machs.redis.root}")
    private String redisRoot;

    //@Autowired
    private UserService userService;

   // @Value("${isReference}")
    private String isReference;

    //@Value("${sms.white.phone}")
    private String smsWhitePhone;

   // @Value("${sms.white.code}")
    private String smsWhiteCode;

    /**
     * Shiro基础配置
     */

    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean(SecurityManager securityManager) throws Exception {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter((Filter) (shiroFilterFactory(securityManager).getObject()));
        filterRegistrationBean.addInitParameter("targetFilterLifecycle", "true");
        //bean注入开启异步方式
        filterRegistrationBean.setAsyncSupported(true);
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        return filterRegistrationBean;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactory(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        shiroFilterFactoryBean.setLoginUrl("/auth/loginBySms");
        Map<String, Filter> filterMap = shiroFilterFactoryBean.getFilters();
        filterMap.put("authcToken", new JwtAuthFilter(this.userService));
        shiroFilterFactoryBean.setFilters(filterMap);

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        //<!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->

        shiroFilterFactoryBean.setFilterChainDefinitionMap(shiroFilterChainDefinition().getFilterChainMap());
        return shiroFilterFactoryBean;
    }

    @Bean
    protected ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/auth/logout", "noSessionCreation,authcToken[permissive]");
        chainDefinition.addPathDefinition("/auth/modifyPwd", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/resetPwd", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/getCurrentUserInfo", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/getSvcPubKey", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/modifyPhone", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/checkModifyInfo", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/getMchntList", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appGenQrCode", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appPayRefund", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appScanQrCodeReceipt", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appPayOrderStatusQuery", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appRefuandStatusQuery", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/appGetQrCode", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/collManage/validPwd", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/acctDetail/sumAccDetailInfo", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/acctDetail/queryMchntSumInfo", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/bizAdvert/queryPagePicList", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/bizAdvert/getOmImg", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/cardSign/mchntAcctSave", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/cardSign/getIsContractSign", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/cardSign/getAcctCardImage", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/cardSign/contractSign", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/cardSign/validAcctNoInfo", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/auth/**", "noSessionCreation,anon");
        chainDefinition.addPathDefinition("/druid/**", "anon");
        chainDefinition.addPathDefinition("/profile/**", "anon");
        chainDefinition.addPathDefinition("/collManage/**", "anon");
        chainDefinition.addPathDefinition("/test/**", "anon");
        chainDefinition.addPathDefinition("/acctDetail/**", "anon");
        chainDefinition.addPathDefinition("/cardSign/**", "anon");
        chainDefinition.addPathDefinition("/func/getBompImage", "anon");
        chainDefinition.addPathDefinition("/test/remoteFile", "anon");
        chainDefinition.addPathDefinition("/contract/H5ViewPdf", "noSessionCreation,authcToken");
        //chainDefinition.addPathDefinition("/contract/getBompPdf", "anon");
        chainDefinition.addPathDefinition("/contract/getBompPdf", "noSessionCreation,authcToken");
        chainDefinition.addPathDefinition("/img/**", "anon");
        //chainDefinition.addPathDefinition("/contract/**", "anon");
        chainDefinition.addPathDefinition("/**", "noSessionCreation,authcToken");
        return chainDefinition;
    }

    @Bean
    public Authorizer authorizer() {
        return new ModularRealmAuthorizer();
    }

    @Bean
    public Authenticator authenticator() {
        MultiRealmAuthenticator authenticator = new MultiRealmAuthenticator();
        authenticator.setRealms(Arrays.asList(smsShiroRealm(), jwtShiroRealm()));
        authenticator.setAuthenticationStrategy(new FirstSuccessfulStrategy());
        return authenticator;
    }

    @Bean("smsRealm")
    public SmsShiroRealm smsShiroRealm() {
        SmsShiroRealm smsShiroRealm = new SmsShiroRealm();
        smsShiroRealm.setCredentialsMatcher(new SmsCredentialsMatcher(this.redisRoot,this.isReference,this.smsWhitePhone,this.smsWhiteCode));
        return smsShiroRealm;
    }

    @Bean("jwtRealm")
    public JwtShiroRealm jwtShiroRealm() {
        JwtShiroRealm jwtShiroRealm = new JwtShiroRealm();
        jwtShiroRealm.setCredentialsMatcher(new JwtCredentialsMatcher());
        return jwtShiroRealm;
    }

    @Bean
    protected SessionStorageEvaluator sessionStorageEvaluator() {
        DefaultWebSessionStorageEvaluator sessionStorageEvaluator = new DefaultWebSessionStorageEvaluator();
        sessionStorageEvaluator.setSessionStorageEnabled(false);
        return sessionStorageEvaluator;
    }
}
