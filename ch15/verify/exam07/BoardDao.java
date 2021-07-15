package verify.exam07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new LinkedList<Board>();
		List<Board> list2 = new ArrayList<Board>();
		
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		list2.add(new Board("2제목3", "2내용3"));
		list2.add(new Board("2제목3", "2내용3"));
		list2.add(new Board("2제목3", "2내용3"));
		list2.add(new Board("2제목3", "2내용3"));
		
		list2.addAll(2, list);
		
		return list2;
	}
}
