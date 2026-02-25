package com.plane.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.plane.test.common.DBConnection;
import com.plane.test.dto.MenuDTO;

public class MenuDAO {
	
	public static List<MenuDTO> getMenuList() {
		List<MenuDTO> menuList = new ArrayList<>();
	
		try {
			Connection conn = DBConnection.getConnection();
			
			String sql = "select * from menu";
			
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MenuDTO menu = new MenuDTO(
						rs.getLong("id"), rs.getString("menu_name"), rs.getString("menu_img"), rs.getInt("price"), rs.getString("category")
						);
				
				menuList.add(menu);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return menuList;
	}

}
