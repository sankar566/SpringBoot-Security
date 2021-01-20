package spring.CRUD.Swagger.sankar.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.CRUD.Swagger.sankar.Entity.Book;
import spring.CRUD.Swagger.sankar.service.bookService;




@RestController
@RequestMapping("api")
public class bookController {
	
	@Autowired
	private bookService bookservice;
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello Java Code !";
    }
	// get the all books detaila
//	@RequestMapping(value="/books")
//	public List<Book> getBooks(){
//		System.out.println(bookservice.getBooks());
//		return bookservice.getBooks(); 
//	}
	
// if you put book... get all the books and put querry param yaerof publicatin...fetch paticuler year book only display	
//	@RequestMapping(value="/books")
//	public List<Book> getBooks(@RequestParam(value="yearOfPublication",required = false)Integer yop){
//		System.out.println(bookservice.getBooks(yop));
//		return bookservice.getBooks(yop); 
//	}
	
// yearOfPublications ...multiple year are pass and fetch the data 	
	@RequestMapping(value="/books")
	public List<Book> getBooks(@RequestParam(value="yearOfPublications",required = false)Set<Integer> yop){
		System.out.println(bookservice.getBooks(yop));
		return bookservice.getBooks(yop); 
	}
	
// yearOfPublications ...multiple year and booType also put querry and fetch the data.	
//	@RequestMapping(value="/books")
//	public List<Book> getBooks(
//			@RequestParam(value="yearOfPublications",required = false)Set<Integer> yop,
//			@RequestParam(value="bookType",required = false) String bookType
//			){
//		   
//		System.out.println(bookservice.getBooks(yop,bookType));
//		return bookservice.getBooks(yop,bookType); 
//	}
	
	@RequestMapping(value="/books",method = RequestMethod.POST)
	public Book createBook(@RequestBody Book book) {
		return bookservice.createBook(book);
		
	}
	@RequestMapping(value="/books/{id}")
	public Optional<Book> getById(@PathVariable("id")Integer bookId) {
		return bookservice.getById(bookId);
	}
	@RequestMapping(value="/books",method = RequestMethod.PUT)
	public Book updateBook(@RequestBody Book incommingBook) {
		return bookservice.updateBook(incommingBook);
		
	}
	@RequestMapping(value="/books/{bookId}",method=RequestMethod.DELETE)
	public String deleteBookById(@PathVariable Integer bookId) {
		return bookservice.deletBookById(bookId);
	}
// using Raw Querry 
	@GetMapping("/raw/books")
	public List<Book> getBookByRawQuerry(@RequestParam(value="yop") Set<Integer>yop){
		return bookservice.getBookByRawQuerry(yop);
	}
} 
