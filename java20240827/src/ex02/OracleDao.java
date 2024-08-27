package ex02;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Orable DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Orable DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("Orable DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("Orable DB에서 삭제");
		
	}
	

}
