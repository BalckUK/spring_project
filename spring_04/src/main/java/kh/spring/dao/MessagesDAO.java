package kh.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

	/*
	 * public List<MessagesDTO> selectAll() throws Exception { String sql =
	 * "select * from messages";
	 * 
	 * }
	 * 
	 * public int del(int seq) throws Exception { String sql =
	 * "delete from messages where seq=?";
	 * 
	 * }
	 */

}
