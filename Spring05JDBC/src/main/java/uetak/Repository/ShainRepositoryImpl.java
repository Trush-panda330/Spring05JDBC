package uetak.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		final String sql = "select id, name, gender, nen, address from shain";

		//SQLの実行
		List<Shain> shainList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Shain>(Shain.class));

		for (Shain shain : shainList) {
			System.out.println(shain.getId() + ":" + shain.getName() + ":"
					+ shain.getGender() + ":" + shain.getNen() + ":" +shain.getAddress());

		}
	}

	@Override
	public void insertShain() {

	}

	@Override
	public void findByShain() {

	}

	@Override
	public void updateShain() {

	}

	@Override
	public void deleteShain() {

	}

}
