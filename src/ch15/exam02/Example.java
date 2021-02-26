package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<>();
		
		//��ü ����
		list.add(new Board(1, "����1"));
		list.add(new Board(2, "����2"));
		list.add(new Board(3, "����3"));
		System.out.println(list.size());

		//��ü ���
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + ":" + board1.getTitle());
		Board board2 = list.get(1);		
		Board board3 = list.get(2);	
		
		//�ݺ� ó��
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		for (Board board : list) {
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		
		//��ü ����
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		

	}

}
