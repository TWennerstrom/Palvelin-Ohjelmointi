package fi.k2021.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.k2021.Bookstore.domain.Book;

@Controller
public class BookController {

		@GetMapping("index")
		public String addNewBook(Model model) {
			model.addAttribute("book", new Book());
			return "addBook";
		}
}
