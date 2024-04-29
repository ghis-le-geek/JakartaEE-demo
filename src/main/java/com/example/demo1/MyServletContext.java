package com.example.demo1;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.logging.Level;
import java.util.logging.Logger;

@WebListener
public class MyServletContext implements ServletContextListener {

    private static final Logger LOG = Logger.getLogger(MyServletContext.class.getName());
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.log(Level.INFO, "=============== DemoApp started ===============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.log(Level.INFO, "=============== DemoApp Stoped ================");
    }
}
