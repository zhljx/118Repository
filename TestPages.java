public class TestPages{
	public static void main(String[] args) {
		
		//查询之后的总行数为23行

		int totalRows = 23;//总行数

		int singlePage = 5;//单页显示行数

		int pageIndex = 1;//当前页码  此刻=2

		//计算pageIndex中应显示的数据行起始到结束

		int totalPages = totalRows % singlePage == 0 ? totalRows / singlePage : totalRows / singlePage + 1;

		int start = (pageIndex - 1) * singlePage + 1;//起始行

		int end = pageIndex < totalPages ? pageIndex * singlePage : totalRows;

		System.out.println(start +"--->"+ end);

	}
}