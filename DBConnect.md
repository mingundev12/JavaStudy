## 예시

DB와 연결하는 코드
    
      import java.sql.*;

      public class DBConnect {
      	private Connection conn;
      	private Statement st;
      	private ResultSet rs;
      
      	public DBConnect() {
      		connect();
      	}
      	
      	public void connect() {
      		try {
      			Class.forName("com.mysql.cj.jdbc.Driver");
      			String username = "mingundev";
      			String password = "1234";
      			String url = "jdbc:mysql://localhost:3306/mingundev";
      			
      			conn = DriverManager.getConnection(url, username, password);
      		} catch (Exception e) {
      			System.out.println(e.getMessage());
      		}
      	}
      	
      	public ArrayList<Item> selectItem() {
      		ArrayList<Item> items = new ArrayList<>();
      		
      		String sql = "select * from item";
      		try {
      			st = conn.createStatement();
      			rs = st.executeQuery(sql);
      			while(rs.next()) {
      				items.add(new Item(
      						rs.getString("item_name"), rs.getInt("item_price"),
      						rs.getString("item_main_image"), rs.getInt("item_stock")
      						));
      			}
      		} catch (Exception e) {
      			System.out.println(e.getMessage());
      		}
      		
      		return items;
      	}
      }
