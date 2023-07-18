import org.example.TaskManager;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TaskManagerTest {
    TaskManager tm = new TaskManager();

    @Test
    public void testAddTask() {

        // Agregar una task
        tm.addTask("Jojo");
        // Verificar si la task se agrego correctamente
        assertEquals(1, tm.getTasks().size());
        assertTrue(tm.getTasks().contains("Jojo"));
    }

    @Test
    public void testRemoveTask() {

        // Agregar dos task
        tm.addTask("Jojo");
        tm.addTask("Jeje");
        // Eliminar task
        tm.removeTask("Jojo");
        // Verificar que la task se elimine
        assertEquals(1, tm.getTasks().size());
        assertFalse(tm.getTasks().contains("Jojo"));
        assertTrue(tm.getTasks().contains("Jeje"));
    }

    @Test
    public void testGetTask() {

        tm.addTask("Jojo");
        tm.addTask("Jeje");
        // Obtener la lista
        List<String> tasks = tm.getTasks();
        // Verificar que la lista es correcta
        assertEquals(2, tasks.size());
        assertTrue(tasks.contains("Jojo"));
        assertTrue(tasks.contains("Jeje"));

    }
}
