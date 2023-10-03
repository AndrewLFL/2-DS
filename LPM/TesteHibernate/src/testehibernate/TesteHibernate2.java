/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
     
            //primeiro cria as disciplinas
            Disciplina disc1 = new Disciplina (1,"java", 80);
            Disciplina disc2 = new Disciplina (2, "estrutura de dados", 40);
            Disciplina disc3 = new Disciplina (3, "banco de dados", 40);
        
            //cria os alunos
            Aluno al1 =new Aluno(1234,"Sandro");
            Aluno al2 =new Aluno(5678,"Andrew");
            Aluno al3 =new Aluno(9012,"Maria");

            //cria os professores
            Professor p1 = new Professor(1,"Tania",8000);
            Professor p2 = new Professor(2,"Helo",2000);
            Professor p3 = new Professor(3,"Xands",100000);

            List<Disciplina> listaDisc = new ArrayList<Disciplina>();
            listaDisc.add(disc1);
            listaDisc.add(disc2);
            p1.setListaDisc(listaDisc);

            //cria func
            Funcionario f1 = new Funcionario(1,"Vera",8000);
            Funcionario f2 = new Funcionario(2,"Mario",2000);

            //cria dep
            Departamento d1 = new Departamento(1,"Humanas");
            Departamento d2 = new Departamento(2,"Exatas");

           //salva alunos
           session.save(al1);
           session.save(al2);
           session.save(al3);

           session.save(disc1);
           session.save(disc2);
           session.save(disc3);

           session.save(p1);
           session.save(p2);
           session.save(p3);

           session.save(f1);
           session.save(f2);

           session.save(d1);
           session.save(d2);

           session.getTransaction().commit();

           String htlProfessor = "from Professor";
           Query queryProfessor = session.createQuery(htlProfessor);
           List<Professor> listProfessor = queryProfessor.list();
           for(Professor p : listProfessor)
           {
               System.out.println("\nCodigo: " + p.getCodigo() + "\nNome: " + p.getNome() + "\nSalário: " + p.getSalario());
           }

           String htlFuncionario = "from Funcionario";
           Query queryFuncionario = session.createQuery(htlFuncionario);
           List<Funcionario> listFuncionario = queryFuncionario.list();
           for(Funcionario f : listFuncionario)
           {
               System.out.println("\nID: " + f.getId() + "\nNome: " + f.getNome() + "\nSalário: " + f.getSalario());
           }

           String htlDepartamento = "from Departamento";
           Query queryDepartamento = session.createQuery(htlDepartamento);
           List<Departamento> listDepartamento = queryDepartamento.list();
           for(Departamento depart : listDepartamento)
           {
               System.out.println("\nID: " + depart.getCod() + "\nNome: " + depart.getNome());
           }

           String htlAlunoId = "from Aluno where id = 1234";
           Query queryAlunoId = session.createQuery(htlAlunoId);
           List<Aluno> listAlunoId = queryAlunoId.list();
           for(Aluno a : listAlunoId)
           {
               System.out.println("\nRA: " + a.getRa() + "\nNome: " + a.getNome());
           }

           String htlAlunoA = "from Aluno where nome like 'A%'";
           Query queryAlunoA = session.createQuery(htlAlunoA);
           List<Aluno> listAlunoA = queryAlunoA.list();
           for(Aluno a : listAlunoA)
           {
               System.out.println("\nRA: " + a.getRa() + "\nNome: " + a.getNome());
           }

           session.close();
           HibernateUtil.shutdown();
    }
}
