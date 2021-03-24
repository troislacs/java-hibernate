package com.project.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	private int book_id;
	
	@Column(name="book_title")
	private String book_title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="publish_date")
	private String publish_date;
	
	public Book() {	}

	public Book(String book_title, String author, String publisher, String publish_date) {
		this.book_title = book_title;
		this.author = author;
		this.publisher = publisher;
		this.publish_date = publish_date;
	}

	public int getBookId() {
		return book_id;
	}

	public void setId(int b_id) {
		this.book_id = b_id;
	}

	public String getBookTitle() {
		return book_title;
	}

	public void setBookTitle(String b_title) {
		this.book_title = b_title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String b_author) {
		this.author = b_author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String b_pub) {
		this.publisher = b_pub;
	}
	
	public String getPublishDate() {
		return publish_date;
	}

	public void setPublishDate(String p_date) {
		this.publish_date = p_date;
	}

	@Override
	public String toString() {
		String bookInfo = "Book [id=" + book_id 
							+ ", Book_Title=" + book_title 
							+ ", Author=" + author 
							+ ", Publisher=" + publisher 
							+ "Publish Date=" + publish_date +"]";		
		return bookInfo;		
	}	
}
