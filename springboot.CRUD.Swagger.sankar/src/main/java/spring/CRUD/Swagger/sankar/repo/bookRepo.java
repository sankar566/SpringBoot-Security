package spring.CRUD.Swagger.sankar.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.CRUD.Swagger.sankar.Entity.Book;




@Repository
public interface bookRepo  extends CrudRepository <Book,Integer>{
    // all book details fetch and single querry parm pass..yearOfPublication book display..put single year able to fetch
	//List<Book>findAllByyearOfPublication(Integer yop);
	
	// yearOfPublications ...muliple year are pass and fetch the data 
	List<Book>findAllByyearOfPublicationIn(Set<Integer> yop);
	
	// yearOfPublications ...muliple year and booType also put qurry and fetch the data.
	//	List<Book> findAllByyearOfPublicationInAndBookType(Set<Integer> yop, String bookType);
	// Raw querry
		String rawQuery ="select *from book where year_of_publication IN :y_o_p";
		
		@Query(nativeQuery = true,value=rawQuery)
		List<Book> getBooksByYop(@Param("y_o_p") Set<Integer> yop);

}
