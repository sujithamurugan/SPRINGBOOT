package com.suji.Revaturecontroller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suji.RevatureApplication.Book;

import com.suji.RevatureService.BookService;

@Controller
@RequestMapping(value = "Book")
public class BookController {
	@Autowired
	public BookService bookService;
		
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String listBook(ModelMap modelMap) {
    System.out.println("BookController called");
    List<Book> books = bookService.findAll();
	modelMap.addAttribute("books", books);
	return "books/Listbook";
	}
	@GetMapping("/{id}")
	public String View(@PathVariable("id") int id,HttpSession session)
	{
	System.out.println("viewbook"+id);	
	Book book=bookService.findOne(id);
	session.setAttribute("selectbook", book);
	return "books/bookdetails";

	}
	@GetMapping("/view")
	public String viewBook(HttpSession session)
	{
		
		return "redirect:../order/cart";
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.GET)
	public String updateBook()
	{
		System.out.println("Controller called");
		
		return "book/BookUpdate";
	}
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:../User/loginpage";
    }

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public String addBook(@RequestParam("isbnid") int id, @RequestParam("title") String title,
			@RequestParam("author") String author,@RequestParam("publishdate") LocalDate publishdate,
			@RequestParam("content") String content,@RequestParam("price") float price ,
			@RequestParam("status") String status,HttpSession session) {
		System.out.println("AddBookController called");
		Book book = new Book( id,title,author,publishdate,content,price,status );
		session.setAttribute("bk", book);
		System.out.println("Inside the controller");
		bookService.save(book);
return "ListBook";
	}
}
