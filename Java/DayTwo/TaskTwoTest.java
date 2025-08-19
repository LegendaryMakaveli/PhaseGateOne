import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;


class TaskTwoTest {
	@Test
		public void teststudentGrade(){
			TaskTwo newTask = new TaskTwo();
			assertEquals('F', newTask.studentGrade(34,33,78));
	}
	
	@Test
		public void teststudentGradesFunction(){
			TaskTwo newTask = new TaskTwo();
			assertEquals('F', newTask.studentGrade(880,400,546));
	}

	@Test
		public void teststudentGradesFunctions(){
			TaskTwo newTask = new TaskTwo();
			assertNotEquals('A', newTask.studentGrade(880,400,546));
	}

}