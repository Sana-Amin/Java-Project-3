package com.MovieProject;

import com.MovieProject.model.MovieEntity;
import com.MovieProject.model.VoteEntity;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class HibernateConfig {
        @Bean
        public SessionFactory getFactory(){
            SessionFactory factory = new org.hibernate.cfg.Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(MovieEntity.class)
                    .addAnnotatedClass(VoteEntity.class)
                    .buildSessionFactory();
            return factory;
        }

}
