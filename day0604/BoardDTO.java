package day0604;

public class BoardDTO {

	private String name;
	private String subject;
	private String content;
	
	//����Ʈ ������ ; �ƹ��͵� ���� public
	public BoardDTO() {
		
	}
	
	//3�� ������ ; string or int�� ������ public->�Ŀ� this. ������ ��.
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
