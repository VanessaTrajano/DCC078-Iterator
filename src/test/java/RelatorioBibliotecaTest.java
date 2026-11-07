import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioBibliotecaTest {

    @Test
    void deveContarLivrosDisponiveisPrateleira() {
        Prateleira prateleira = new Prateleira(
                new Livro("Dom Casmurro", true),
                new Livro("O Alquimista", false),
                new Livro("Clean Code", true),
                new Livro("Design Patterns", false)
        );
        assertEquals(2, RelatorioBiblioteca.contarLivrosDisponiveis(prateleira));
    }

    @Test
    void deveContarLivrosEmprestadosPrateleira() {
        Prateleira prateleira = new Prateleira(
                new Livro("Dom Casmurro", true),
                new Livro("O Alquimista", false),
                new Livro("Clean Code", true),
                new Livro("Design Patterns", false)
        );
        assertEquals(2, RelatorioBiblioteca.contarLivrosEmprestados(prateleira));
    }

    @Test
    void deveContarTotalLivrosPrateleira() {
        Prateleira prateleira = new Prateleira(
                new Livro("Dom Casmurro", true),
                new Livro("O Alquimista", false),
                new Livro("Clean Code", true),
                new Livro("Design Patterns", false)
        );
        assertEquals(4, RelatorioBiblioteca.contarTotalLivros(prateleira));
    }

}