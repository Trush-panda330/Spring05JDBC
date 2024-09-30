package uetak.Repository;

import java.util.ArrayList;

import uetak.entity.Shain;

public interface ShainRepository {
	//社員リストを取得
	ArrayList<Shain> findAll();
	
	//社員を登録
	void insertShain();
	
	//社員を取得
	void findByShain();
	
	//社員データの更新
	void updateShain();
	
	//社員のデータを削除
	void deleteShain();
	

}
