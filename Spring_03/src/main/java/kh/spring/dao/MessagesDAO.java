package kh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MessagesDTO;

@Repository
public class MessagesDAO {

	@Autowired
	private BasicDataSource bds;

	private Connection getConnection() throws Exception {
		return bds.getConnection();
	}

	public int insert(MessagesDTO dto) throws Exception {
		String sql = "insert into messages values(messages_seq.nextval,?,?,sysdate)";
		try (Connection con = this.getConnection(); PreparedStatement pstat = con.prepareStatement(sql)) {
			pstat.setString(1, dto.getWriter());
			pstat.setString(2, dto.getMessage());
			int result = pstat.executeUpdate();
			con.commit();
			return result;
		}
	}
}
