import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev developer1 = new Dev();
        developer1.setNome("Test01");
        developer1.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos " + developer1.getNome() + ": " + developer1.getConteudosInscritos());
        developer1.progredir();
        developer1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + developer1.getNome() + ": " + developer1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + developer1.getNome() + ": " + developer1.getConteudosConcluidos());
        System.out.println("XP: " + developer1.calcularTotalXp());

        System.out.println("-------");

        Dev developer2 = new Dev();
        developer2.setNome("Test02");
        developer2.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos " + developer2.getNome() + ": " + developer2.getConteudosInscritos());
        developer2.progredir();
        developer2.progredir();
        developer2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + developer2.getNome() + ": " + developer2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + developer2.getNome() + ": " + developer2.getConteudosConcluidos());
        System.out.println("XP: " + developer2.calcularTotalXp());
    }
}
