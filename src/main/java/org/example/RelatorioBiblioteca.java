package org.example;

import java.util.Iterator;

public class RelatorioBiblioteca {
    public static Integer contarLivrosDisponiveis(Prateleira prateleira) {
        int quantidade = 0;
        for (Livro livro : prateleira) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosEmprestados(Prateleira prateleira) {
        int quantidade = 0;
        for (Livro livro : prateleira) {
            if (!livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivros(Prateleira prateleira) {
        int quantidade = 0;
        for (Iterator<Livro> a = prateleira.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
