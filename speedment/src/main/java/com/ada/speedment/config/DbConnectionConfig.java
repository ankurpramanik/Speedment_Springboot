package com.ada.speedment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.ada.speedment.zdb.SpeedmentDbApplication;
import com.ada.speedment.zdb.SpeedmentDbApplicationBuilder;
import com.speedment.runtime.join.JoinBundle;

@Configuration
public class DbConnectionConfig {

	@Autowired
	Environment env;

	@Bean
	public SpeedmentDbApplication getSakilaApplication() {
		return new SpeedmentDbApplicationBuilder().withBundle(JoinBundle.class)
				.withConnectionUrl(env.getProperty("spring.datasource.url"))
				.withUsername(env.getProperty("spring.datasource.username"))
				.withPassword(env.getProperty("spring.datasource.password"))
				.withSchema(env.getProperty("spring.datasource.schema")).build();
	}

}
