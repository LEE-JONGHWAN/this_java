package verify.exam04.prac;

import java.sql.ResultSet;

public interface DataAccessObject {
	ResultSet select();
	int insert();
	int update();
	int delete();

}
