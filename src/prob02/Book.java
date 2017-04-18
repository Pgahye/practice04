package prob02;

public class Book {
	
	
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(int bookNo,String title,String author){
		
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;
		
	}
	
	
	
	public int getStateCode() {
		return stateCode;
	}



	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}



	public int getBookNo() {
		return bookNo;
	}



	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void rent(){
		
		stateCode=0;
		System.out.println(title+ "이(가) 대여 됐습니다. ");
		
	}
	
	public void print(){
		
		System.out.print( "책제목: "+ title+ " ,저자 :"+ author);
		
		if(stateCode==1){
			
			System.out.println(",대여 유무 : 재고있음");
		}
		else if(stateCode==0){
			
			System.out.println(",대여 유무 : 대여중");
		}
		
	}
	
	

	
}
