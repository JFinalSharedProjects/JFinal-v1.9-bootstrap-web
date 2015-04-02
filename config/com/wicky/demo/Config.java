package com.wicky.demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.ehcache.EhCachePlugin;
import com.jfinal.render.ViewType;

public class Config extends JFinalConfig {
    
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.JSP);
    }

    public void configRoute(Routes me) {
        me.add(new FrontRoutes());
        me.add(new AdminRoutes());
    }

    public void configPlugin(Plugins me) {
		// C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password").trim());
		// me.add(c3p0Plugin);
    }

    public void configInterceptor(Interceptors me) {
    	me.add(new DemoInterceptor());
    }

    public void configHandler(Handlers me) {
    	me.add(new DemoHandler());
    }
}
