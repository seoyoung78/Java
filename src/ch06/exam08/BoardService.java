package ch06.exam08;

public class BoardService {
	//Field
	int count;
	String[][] boards;
	/*
	{
		{"1", "제목1", "내용1", "글쓴이1", "3}
		...
	} 
	 */
	
	//Constructor
	BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void create (String title, String content, String writter, int hitcount) {
		int bno = getNewBno();
		String[] board = {
				"" + bno,
				title,
				content,
				writter,
				String.valueOf(hitcount)
		};
		
		for (int i = 0; i < boards.length; i++) {
			if (boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	void showList() {
		for (int i = 0; i < 100; i++) {
	
				for (int j = 0; j < 5; j++) {
					System.out.println(boards[i][j] + "\t");
				}
			System.out.println();
		}
	}	
	
	String[] read(int bno) {
		String[] result = null;
		String strBno = String.valueOf(bno);
		for (int i = 0; i < 100; i++) {
			if (boards[i][0] != null) {
				if (boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}
		return result;
	}
}
