package spring.CRUD.Swagger.sankar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.CRUD.Swagger.sankar.Entity.Book;
import spring.CRUD.Swagger.sankar.repo.bookRepo;





@Service
public class bookService {

	@Autowired
	bookRepo bookrepository;
//	public List<Book>getBooks(){   
//		 List<Book> bookList = new ArrayList<>();
//		 bookrepository.findAll().forEach(book->bookList.add(book));
//		 return bookList;
//	 }
// particular yearOfPublication book and all book details fetch
//	public List<Book>getBooks(Integer yop){   
//		 List<Book> bookList = new ArrayList<>();
//		 if(yop==null) {
//			 bookrepository.findAll().forEach(book->bookList.add(book));
//		 }else {
//			 return bookrepository.findAllByyearOfPublication(yop);
//		 }
//		 
//		 return bookList;
//	 }
	
// muliple year queery parm ....multiple yearOfPublication books display
	
	public List<Book>getBooks(Set<Integer> yop){   
		 List<Book> bookList = new ArrayList<>();
		 if(yop==null) {
			 bookrepository.findAll().forEach(book->bookList.add(book));
		 }else {
			 return bookrepository.findAllByyearOfPublicationIn(yop);
		 }
		 
		 return bookList;
	 }
	
// all books get & muliple yearOfPublications $ bookType also queery parm and fetch data 
//	public List<Book>getBooks(Set<Integer> yop,String bookType){   
//		 List<Book> bookList = new ArrayList<>();
//		 if(yop==null) {
//			 bookrepository.findAll().forEach(book->bookList.add(book));
//		 }else {
//			 return bookrepository.findAllByyearOfPublicationInAndBookType(yop,bookType);
//			 
//		 }
//		 
//		 return bookList;
//		 
//	 }
	
	
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepository.save(book);
	}
	public Optional<Book> getById(Integer bookId) {
		// TODO Auto-generated method stub
		return bookrepository.findById(bookId);
		//return null;
	}
	public Book updateBook(Book incommingBook) {
		// TODO Auto-generated method stub
		return bookrepository.save(incommingBook);
	}
	public String deletBookById(Integer bookId) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(bookId);
		return "deleted successfully";
	}

//Raw Querry
	public List<Book> getBookByRawQuerry(Set<Integer> yop) {
		// TODO Auto-generated method stub
		List<Book>booklist = bookrepository.getBooksByYop(yop);
		return booklist;
	} 
	


}
