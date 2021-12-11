package com.dbs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import com.template.service.EmailNotification;*/
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
public class WareHouseMgmtApplication {

	/*
	 * @Autowired private EmailNotification emalEmailNotification;
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(WareHouseMgmtApplication.class, args);
	}
	
	/*
	 * @Override public void configureViewResolvers(ViewResolverRegistry registry) {
	 * InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 * resolver.setPrefix("/WEB-INF/view/"); resolver.setSuffix(".jsp");
	 * resolver.setViewClass(JstlView.class); registry.viewResolver(resolver); }
	 */
	
	/*
	 * Dont need this for now
	 * @EventListener(ApplicationReadyEvent.class) public void sendMailAlert() {
	 * emalEmailNotification.sendMail(); }
	 */

}
