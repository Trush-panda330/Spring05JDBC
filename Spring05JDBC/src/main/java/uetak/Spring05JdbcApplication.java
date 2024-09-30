package uetak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import uetak.Repository.ShainRepository;
import uetak.Repository.ShainRepositoryImpl;

@SpringBootApplication
public class Spring05JdbcApplication {

	public static void main(String[] args) {		
		//DIコンテナを作成
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringApplication.class, args);
		
		//社員リポジトリのインスタンスを呼ぶ
		ShainRepository shainRepository = context.getBean(ShainRepositoryImpl.class);
		
		//社員リストを取得
		shainRepository.findAll();
	}

}
