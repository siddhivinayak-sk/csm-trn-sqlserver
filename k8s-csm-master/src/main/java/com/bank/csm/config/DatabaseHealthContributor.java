package com.bank.csm.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthContributor;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("Database")
public class DatabaseHealthContributor implements HealthIndicator {

	@Autowired
    private DataSource ds;
	
	@Override
	public Health health() {
		try(Connection conn = ds.getConnection();){
			Statement stmt = conn.createStatement();
			stmt.execute("select @@version");
		} catch (SQLException ex) {
			return Health.outOfService().withException(ex).build();
		}
		return Health.up().build();
	}
	
}