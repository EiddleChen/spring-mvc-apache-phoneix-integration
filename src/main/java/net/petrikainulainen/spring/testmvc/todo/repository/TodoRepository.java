package net.petrikainulainen.spring.testmvc.todo.repository;

import net.petrikainulainen.spring.testmvc.todo.model.Todo;

import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Petri Kainulainen
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	@Modifying
	@Query(value = "upsert into todos values (NEXT VALUE FOR my_sequence, ?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
	int saveNative(DateTime creationTime, String description, DateTime modificationTime, String title, long version);

	@Modifying
	@Query(value = "upsert into todos values (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	int updateNative(long id, DateTime creationTime, String description, DateTime modificationTime, String title, long version);

}
