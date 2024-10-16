package 댓글프로그램;

import javax.xml.stream.events.Comment;

/**
 * @author kj
 *
 */
public class DTO {
//	
// 필드,생성자,get,tostring
	private String writer;
	private String comment;
	private int likes;
	private int hate;
	public DTO(String writer, String comment, int likes, int hate) {
		this.writer = writer;
		this.comment = comment;
		this.likes = likes;
		this.hate = hate;
	}
	public String getWriter() {
		return writer;
	}

	public String getComment() {
		return comment;
	}

	public int getLikes() {
		return likes;
	}

	public int getHate() {
		return hate;
	}
	@Override
	public String toString() {
		return "DTO [writer=" + writer + ", comment=" + comment + ", likes=" + likes + ", hate=" + hate + "]";
	}
		

}
