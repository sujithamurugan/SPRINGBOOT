package com.suji.RevatureApplication;

	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Book_sales")
	public class BookSale {
		
		@Id
		@GeneratedValue
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNoofCopies() {
			return noofCopies;
		}
		public void setNoofCopies(int noofCopies) {
			this.noofCopies = noofCopies;
		}
		@Column(name="no_of_column")
		private int noofCopies;
		
		

	}


