package com.suji.RevatureApplication;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id

    @Column(name="id")
    private int id;
	@Column(name="title")
	private String title;
	 @Column(name="author")
     private  String author;
	 @Column(name="publishdate")
	 private LocalDate publishdate;
	 @Column(name="content")
	 private String content;
	 @Column(name="price")
	 private float price;
	 @Column(name="status")
	 private String status;
	 public Book()
	 {
		 
	 }
	
	public Book(int id, String title, String author,LocalDate publishdate, String content, float price, String status) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishdate = publishdate;
		this.content = content;
		this.price = price;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishdate=" + publishdate
				+ ", content=" + content + ", price=" + price + ", status=" + status + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor() + ", getPublishdate()="
				+ getPublishdate() + ", getContent()=" + getContent() + ", getPrice()=" + getPrice() + ", getStatus()="
				+ getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	}
