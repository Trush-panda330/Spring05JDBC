package uetak.Repository;

public interface ShainRepository {
	//社員リストを取得
	void findAll();
	
	//社員を登録
	void insertShain();
	
	//社員を取得
	void findByShainId();
	
	//社員データの更新
	void updateShain();
	
	//社員のデータを削除
	void deleteShain();
	

}
