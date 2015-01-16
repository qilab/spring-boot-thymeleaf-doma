package jp.qilab.spring;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new CharacterEncodingFilter());
		return filterRegistrationBean;
	}
	
	
	private static class CharacterEncodingFilter implements Filter {
		protected String encoding;
		
		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			encoding = "UTF-8";
		}
		
		@Override
		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
							FilterChain filterChain) throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) servletRequest;
			request.setCharacterEncoding(encoding);;
			filterChain.doFilter(servletRequest, servletResponse);
		}
		
		@Override
		public void destroy() {
			encoding = null;
		}
	}
}
