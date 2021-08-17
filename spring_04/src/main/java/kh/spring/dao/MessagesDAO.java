package kh.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MessagesDTO;

@Repository
public class MessagesDAO {

	@Autowired
	private JdbcTemplate jdbc;

	public int insert(MessagesDTO dto) throws Exception {
		String sql = "insert into messages values(messages_seq.nextval,?,?,sysdate)";
		return jdbc.update(sql, dto.getWriter(), dto.getMessage());
	}

	public List<MessagesDTO> selectAll() throws Exception {
		String sql = "select * from messages";
		jdbc.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MessagesDTO dto = new MessagesDTO();
				dto.setSeq(rs.getInt("seq"));
				dto.setWriter(rs.getString("writer"));
				dto.setMessage(rs.getString("message"));
				dto.setWrite_date(rs.getTimestamp("nowday"));
				return dto;
			}
		});
	}

	/*
	 * public int del(int seq) throws Exception { String sql =
	 * "delete from messages where seq=?";
	 * 
	 * }
	 */

}
