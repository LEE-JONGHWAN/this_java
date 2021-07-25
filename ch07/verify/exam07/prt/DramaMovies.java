package verify.exam07.prt;

public class DramaMovies extends Movies{
	
	
	public DramaMovies(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("SF영화를 시작합니다.");
	}

}
