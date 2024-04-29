package com.example.demo1;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

import java.util.logging.Level;
import java.util.logging.Logger;

@WebListener
public class MySessionListener implements HttpSessionListener {

    private static final Logger LOG = Logger.getLogger(MySessionListener.class.getName());
    private int sessionCounter = 0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        synchronized (this) {
            sessionCounter++;
        }
        LOG.log(Level.INFO, "=================== Session created =======================", sessionCounter);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        synchronized (this) {
            sessionCounter--;
        }
        LOG.log(Level.INFO, "==================== Session destroyed ===========================", sessionCounter);
    }
}
