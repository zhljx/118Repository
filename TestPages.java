public class TestPages{
	public static void main(String[] args) {
		
		//��ѯ֮���������Ϊ23��

		int totalRows = 23;//������

		int singlePage = 5;//��ҳ��ʾ����

		int pageIndex = 1;//��ǰҳ��  �˿�=2

		//����pageIndex��Ӧ��ʾ����������ʼ������

		int totalPages = totalRows % singlePage == 0 ? totalRows / singlePage : totalRows / singlePage + 1;

		int start = (pageIndex - 1) * singlePage + 1;//��ʼ��

		int end = pageIndex < totalPages ? pageIndex * singlePage : totalRows;

		System.out.println(start +"--->"+ end);

	}
}