package com.suji.Revaturecontroller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suji.RevatureApplication.Order;
import com.suji.RevatureService.OrderService;
@Controller
@RequestMapping(value="order")
public class OrderController {
	@Autowired
	public OrderService booksalesService;
		
	@RequestMapping(value = "/listcart", method = RequestMethod.GET)
	public String listBook(ModelMap modelMap) {
    System.out.println("BookController called");
    List<Order> booksales = booksalesService.findAll();
	modelMap.addAttribute("booksales", booksales);
	return "view-cart";

	}
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String register()
	{
			System.out.println("RegisterController called");
	return "orders/add-cart";	
	}
	
	
	@RequestMapping(value = "/addcart", method = RequestMethod.POST)
	public String addUser(HttpSession session) {
		System.out.println("AddCartController called");
		Order booksales = new Order();
		session.getAttribute("MY_CART");
		session.setAttribute("MY_CART_ITEMS", booksales);
		System.out.println("Inside the controller");
		booksalesService.save(booksales);
	return "orders/view-cart";
	}
	
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:../User/loginpage";
    }
	@PostMapping("/save")
	public String save(@RequestParam("total_price") float totalPrice, HttpSession session) {
System.out.println("inside order save");
		Order orderInCart = (Order) session.getAttribute("MY_CART_ITEMS");
		if ( orderInCart != null && orderInCart.getOrderItems().size() > 0) {
			orderInCart.setTotalPrice(totalPrice);
			booksalesService.save(orderInCart);
			session.removeAttribute("MY_CART_ITEMS");			
		}
				
		return "redirect:../Order/myorders";
	}
	
	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("id") int id , @RequestParam("status")String status ) {
		Order order = booksalesService.findOne(id);
		if ("CANCELLED".equals(status) ) {
			order.setCancelledDate(LocalDate.now());
		}
		else if ("DELIVERED".equals(status)) {
			order.setDeliveredDate(LocalDate.now());
		}
		
		order.setStatus(status);
		booksalesService.save(order);	
		return "redirect:../Order/myorders";
	}
	
	
	
	
	
}
