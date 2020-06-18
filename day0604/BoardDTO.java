package day0604;

public class BoardDTO {

	private String name;
	private String subject;
	private String content;
	
	//디폴트 생성자 ; 아무것도 없는 public
	public BoardDTO() {
		
	}
	
	//3개 생성자 ; string or int로 지정한 public->후에 this. 생성할 것.
	public BoardDTO(String name, String sub, String cont) {
		this.name = name;
		this.subject = sub;
		this.content = cont;
	}
	
	
	//setter, getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
}
