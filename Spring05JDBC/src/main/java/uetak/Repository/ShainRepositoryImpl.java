package uetak.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import uetak.entity.Shain;

@Repository
@Qualifier("ShainRepositoryImpl")
public class ShainRepositoryImpl implements ShainRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public void findAll() {
		//SQL文の作成
		final String sql 
		= "select id, name, gender, nen, address from shain";

		//SQLの実行
		List<Shain> shainList 
		= jdbcTemplate.query(sql, new BeanPropertyRowMapper<Shain>(Shain.class));

		// リストの中の社員を表示
		for (Shain shain : shainList) {
		System.out.println(shain.getId() + ":" + shain.getName() 
		+ ":" + shain.getGender() + ":" + shain.getNen() 
		+ ":" + shain.getAddress());
		}
	}

	@Override
	public void insertShain() {
		//SQL文の作成
		final String sql = "insert into shain(id, name, gender, nen, address) "
		+ "values(:id,:name,:gender,:nen,:address)";

		// パラメータの作成
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", 300);
		param.addValue("name", "長野太郎");
		param.addValue("gender", "男");
		param.addValue("nen", 2010);
		param.addValue("address", "長野県長野市");

		// SQLの実行
		jdbcTemplate.update(sql, param);
	}

	@Override
	public void findByShainId() {
		//SQL文の作成
		final String sql = "select id, name, gender, nen, address from shain where id = :id";
		
		//SQLの実行
		

	}

	@Override
	public void updateShain() {

	}

	@Override
	public void deleteShain() {

	}

}
