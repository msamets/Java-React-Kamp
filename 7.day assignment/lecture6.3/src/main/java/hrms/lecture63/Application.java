package hrms.lecture63;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*
	 * org.springframework.context.ApplicationContextException: 
	 * Failed to start bean 'documentationPluginsBootstrapper';
	 *  nested exception is java.lang.NullPointerException:
	 *  HATASI ALIRSAN
	 *  
	 *  application.properties a aşağıdaki kodu ekleyince çalışıyor
	 *  bu bir patchmatcher hatası o yüzden bunu ekleyince çözülüyor
	 */
	//spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
                .select()                                  
                .apis(RequestHandlerSelectors.any())              
                .paths(PathSelectors.any())                          
                .build();    
        
    }

}
