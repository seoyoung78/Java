package project1;

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		boolean run = true;
		String[][] boardArry = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Creat) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			String select = scanner.nextLine();
			int num;
			int i;
			int max;
			
			switch (select) {
				case "1" :
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("��ȣ	����	����	�۾���	��ȸ��");
					System.out.println("--------------------------------------------------------------------------");
					
					max = 0;				
					for (i = 0; i < boardArry.length; i++) {
						if (boardArry[i][0] != null && Integer.parseInt(boardArry[i][0]) > max) {
							max = Integer.parseInt(boardArry[i][0]);
						}
					}
							
					for (i = max-1; i >= 0; i--) {
						if (boardArry[i][0] != null) {
							System.out.println(boardArry[i][0] + "	" + boardArry[i][1] + "	" + boardArry[i][2] + "	" + boardArry[i][3] + "	" + boardArry[i][4]);
						}
					}
								
					break;
					
				case "2" :
					for (i = 0; i < boardArry.length; i++) {
						max = 0; 
						for (i = 0; i < boardArry.length; i++) {
							//if (boardArry[i][0]) != null && Integer.parseInt(boardArry[i][0]) > max)) {
								max = Integer.parseInt(boardArry[i][0]);
							}
						}
						
						if (boardArry[i][0] == null) {
							
							boardArry[i][0] = String.valueOf(i+1);
							
							System.out.print("����: ");
							boardArry[i][1] = scanner.nextLine();
							System.out.print("����: ");
							boardArry[i][2] = scanner.nextLine();
							System.out.print("�۾���: ");
							boardArry[i][3] = scanner.nextLine();
							
							boardArry[i][4] = "0";
							
							/*for (int j = 0; j < boardArry[i].length; j++) {
								System.out.println(boardArry[i][j] + ", ");
							}*/
					max = 0;
					for (i = 0; i < boardArry.length; i++) {
					if (boardArry[i][0] != null && Integer.parseInt(boardArry[i][0]) > max) {
							max = Integer.parseInt(boardArry[i][0]);
						}
							}
					boardArry[i][0] = String.valueOf(max);
							
							break;
						}
					}
					
					break;
					
				case "3" :
					System.out.print("��ȣ: ");
					num = Integer.parseInt(scanner.nextLine());	;
					
					for (i = 0; i < boardArry.length; i++) {
						if ( boardArry[i][0] != null && num == Integer.parseInt(boardArry[i][0])) { 
							int count = Integer.parseInt(boardArry[i][4]);
							count++;
							boardArry[i][4] = String.valueOf(count);
								
							System.out.println("����: " + boardArry[i][1]);
							System.out.println("����: " + boardArry[i][2]);
							System.out.println("�۾���: " + boardArry[i][3]);
							System.out.println("��ȸ��: " + boardArry[i][4]);
							
							break;
						}
					}
					
					break;
					
				case "4" :
					System.out.print("��ȣ: ");
					num = Integer.parseInt(scanner.nextLine());	;
					
					for (i = 0; i < boardArry.length; i++) {
						if ( boardArry[i][0] != null && num == Integer.parseInt(boardArry[i][0])) {
							String oldTitle = boardArry[i][1];
							System.out.println("��������: " + oldTitle);
							System.out.print("��������: ");
							String newTitle = scanner.nextLine();
							if (!newTitle.equals("")) {
								boardArry[i][1] = newTitle;
							} else {
								boardArry[i][1] = oldTitle;
							}
							
							String oldContent = boardArry[i][2];
							System.out.println("��������: " + oldContent);
							System.out.print("��������: ");
							String newContent = scanner.nextLine();
							if (!newContent.equals("")) {
								boardArry[i][2] = newContent;
							} else {
								boardArry[i][2] = oldContent;
							}
						}
					}
					
					break;
					
				case "5" :
					System.out.print("��ȣ: ");
					num = Integer.parseInt(scanner.nextLine());	
					
					for (i = 0; i < boardArry.length; i++) {
						if (boardArry[i][0] != null && num == Integer.parseInt(boardArry[i][0])) {
							for (int j = 0; j < boardArry[i].length; j++) {
								//System.out.print(boardArry[i][j] + ", ");
								boardArry[i][j] = null;
							}
							break;
						}
					}
					
					break;
					
				case "6" :
					run = false;
					break;
			}
			
		}

	}

}
