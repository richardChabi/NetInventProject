package ci.inphb.NetInvent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("ci.inphb.Entities")
public class NetInventApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetInventApplication.class, args);
	}

}
