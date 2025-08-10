import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //INSTANCIA DO PRIMEIRO CURSO
        Curso curso = new Curso();
        curso.setTitulo("Java Fullstack");
        curso.setDescricao("Desenvolver aplicações Java");
        curso.setCargaHoraria(40);

        //INSTANCIA DO SEGUNDO CURSO
        Curso curso2 = new Curso();
        curso2.setTitulo("React with Typescript");
        curso2.setDescricao("Desenvolver aplicações com React e Typescript");
        curso2.setCargaHoraria(40);

        //INSTANCIA DA MENTORIA
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Fundamentos Java");
        mentoria.setData(LocalDate.now());

        //INSTANCIA DO BOOTCAMP
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Desenvolvedor Java");
        bootcamp.setDescricao("Bootcamp TOONIE Java and AI in Europe");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //INSTANCIA DO DEV
        Dev dev = new Dev();
        dev.setNome("Gustavo");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev.getNome() + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdos inscritos: " + dev.getNome() + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev.getNome() + dev.getConteudosConcluidos());
        System.out.println("XP de Gustavo: " +dev.calcularTotalXP());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("Nicolas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getNome() + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos: " + dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("XP de Gustavo: " +dev2.calcularTotalXP());
    }
}