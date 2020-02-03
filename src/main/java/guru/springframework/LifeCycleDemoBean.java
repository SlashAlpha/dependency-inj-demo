package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## Im in the lifecylce constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Im in the lifecylce termination");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## lifeCycle set its properties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## App context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## the post construct method has been called");
    }

    @PreDestroy
    public void predDestroy() {
        System.out.println("## the predestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## before Init has been called");
    }

    public void afterInit() {
        System.out.println("#after init  called by ben processor");
    }
}
