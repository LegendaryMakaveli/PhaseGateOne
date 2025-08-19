import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;


class checkFatherAndSonAgeTest {
	@Test
		public void testcheckfatherToSonAge(){
			TaskOne newTask = new TaskOne();
			assertEquals(18, newTask.checkfatherToSonAge(50,16));
	}
	

}