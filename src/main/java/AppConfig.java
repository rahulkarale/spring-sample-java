import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.karganga.repository.CustomerRepository;
import com.karganga.repository.HibernateCustomerRepositoryImpl;
import com.karganga.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.karganga"})
public class AppConfig {

	/*
	 * @Bean(name = "customerService") public CustomerServiceImpl
	 * getCustomerServiceImpl() {
	 * 
	 * CustomerServiceImpl customerService = new CustomerServiceImpl();
	 * //CustomerServiceImpl customerService = new
	 * CustomerServiceImpl(getCustomerRepository());
	 * //customerService.setCustomerRepository(getCustomerRepository()); return
	 * customerService;
	 * 
	 * }
	 */
	/*
	 * @Bean(name = "customerRepository") public CustomerRepository
	 * getCustomerRepository() { return new HibernateCustomerRepositoryImpl(); }
	 */
}
