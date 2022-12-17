package productService.example.mohaDev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ProductApplicationTests {

    @Container
	static  MongoDBContainer mongoDBContainer =new MongoDBContainer();
	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
		dynamicPropertyRegistry.add("spring.data.mongo.uri",mongoDBContainer::getReplicaSetUrl);
	}
	@Test
	void contextLoads() {
	}

}
