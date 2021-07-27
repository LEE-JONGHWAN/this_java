package verify.exam04.prac;

import java.sql.ResultSet;

public class MySqlDAo implements DataAccessObject {
	private String dbName = "MariaDB";
	
	@Override
	public ResultSet select() {
		System.out.println(dbName + "에서 DB 검색");
		return null;
	}

	@Override
	public int insert() {
		System.out.println(dbName + "에서 DB 삽입");
		return 0;
	}

	@Override
	public int update() {
		System.out.println(dbName + "에서 DB 갱신");
		return 0;
	}

	@Override
	public int delete() {
		System.out.println(dbName + "에서 DB 삭제");
		return 0;
	}

}
