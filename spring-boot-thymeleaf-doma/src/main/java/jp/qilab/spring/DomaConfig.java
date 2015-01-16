package jp.qilab.spring;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.OracleDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DomaConfig {

	@Resource
	private Environment env;

	@Bean
	public DataSource dataSource() {
		// application.propertiesにあるDB設定キーから値を取得し設定します。
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));

        // TransactionAwareDataSourceProxyでラッピングしないとDoma側でコネクションがおかしくなる
		return new TransactionAwareDataSourceProxy(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public Dialect dialect() {
		// DBの方言はここで設定します。
		return new OracleDialect();
	}

	@Bean
	public SqlFileRepository sqlFileRepository() {
		return new NoCacheSqlFileRepository();
	}

	@Bean
	public Config config() {
		// Domaの設定を行います。デフォルトはDomaAbstractConfigを使用します。
		return new Config() {

			@Override
			public Dialect getDialect() {
				return dialect();
			}

			@Override
			public DataSource getDataSource() {
				return dataSource();
			}

			@Override
			public SqlFileRepository getSqlFileRepository() {
				return sqlFileRepository();
			}
		};
	}
}
