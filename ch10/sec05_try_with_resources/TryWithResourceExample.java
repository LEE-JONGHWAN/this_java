package sec05_try_with_resources;

import java.sql.Connection;
import java.sql.SQLException;

import com.jbpark.dabang.module.AddressMan;

public class TryWithResourceExample {
	public static void main(String[] args) throws SQLException {
		Connection conn2 = null;
		try (Connection conn = AddressMan.getConnection()) {
			conn2 = conn;
			throw new Exception();
		} catch(Exception e) {
			boolean reallyClosed = conn2.isClosed();
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
