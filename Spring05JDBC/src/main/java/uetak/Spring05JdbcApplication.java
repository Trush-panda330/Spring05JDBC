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
				SpringApplication.run(Spring05JdbcApplication.class, args);
		
		//社員リポジトリのインスタンスを呼ぶ
		ShainRepository shainRepository = context.getBean(ShainRepositoryImpl.class);
		
		//社員リストを取得
//		shainRepository.findAll();
		
		//社員を登録
//		shainRepository.insertShain();
		
		//指定した社員のデータを取得
		shainRepository.findByShainId();
	}

}
