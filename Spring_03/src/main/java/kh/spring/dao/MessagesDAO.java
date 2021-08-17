package kh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
		try (Connection con = this.getConnection(); PreparedStatement pstat = con.prepareStatement(sql);) {
			pstat.setString(1, dto.getWriter());
			pstat.setString(2, dto.getMessage());
			int result = pstat.executeUpdate();
			con.commit();
			return result;
		}
	}
	
	public List<MessagesDTO> selectAll() throws Exception {
		String sql = "select * from messages";
		try (Connection con = this.getConnection();PreparedStatement patmt = con.prepareStatement(sql);ResultSet re = patmt.executeQuery();) {
			List<MessagesDTO> list = new ArrayList<>();
			while (re.next()) {
				MessagesDTO dto = new MessagesDTO(re.getInt("seq"), re.getString("writer"), re.getString("message"));
				list.add(dto);
			}
			return list;
		}
	}

	public int del(int seq) throws Exception {
		String sql = "delete from messages where seq=?";
		try (Connection con = this.getConnection(); PreparedStatement patmt = con.prepareStatement(sql);) {
			patmt.setInt(1, seq);
			int result = patmt.executeUpdate();
			con.commit();
			return result;
		}
	}

	
}
