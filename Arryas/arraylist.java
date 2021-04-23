package Arryas;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<cursos> osCursos = new ArrayList<>();
    static ArrayList<disciplinas> asDisciplinas = new ArrayList<>();
    static ArrayList<inscricoes>  asInscricoes= new ArrayList<>();
    static Continuar continuar = new Continuar();
    static int idFormando = 1;
    static int idDisciplinas = 1;
    static int idInscricao = 1;
    static int idCurso = 1;


    public static void main(String[] args) {
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        Continuar continuar = new Continuar();
        Menu menus = new Menu();
        ArrayList<cursos> lista2 = new ArrayList<>();

        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
            case 1:
                do {
                    escolhasec = menus.showMenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        inserirFormando();
                        break;
                    case 2:
                        modificarFormando();
                        break;
                    case 3:
                        eliminarFormando();
                        break;
                    case 4:
                        for (Formando osFormandos : osFormandos) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 2:
                do {
                    escolhasec = menus.showMenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        inserirCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        eliminarCurso();
                        break;
                    case 4:
                        for (cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
                case 3:
                do {
                    escolhasec = menus.showMenuInscricoes("Inscrições");
                    switch (escolhasec) {
                    case 1:
                        adicionarInscricao();
                        break;
                    case 2:
                        eliminarInscricoes();
                        break;
                    case 3:
                    int x = 1;
                    for (inscricoes asInscricoes : asInscricoes) {
                        System.out.print("Id Inscrição" + x++ +" ");
                        System.out.println(asInscricoes.toString());
                    }
                    break;
                    }
                } while (escolhasec != 9);
                break;
            case 4:
            do {
                escolhasec = menus.showMenuSecundário("Disciplinas");
                switch (escolhasec) {
                case 1:
                    inserirDisciplinas();
                    break;
                case 2:
                    modificarDisciplinas();
                    break;
                case 3:
                    eliminarDisciplina();
                    break;
                case 4:
                    for (disciplinas asDisciplinas : asDisciplinas) {
                        System.out.println(asDisciplinas.toString());

                    }    
                    break;
            }
        } while (escolhasec != 9);
    }
    }while (escolha != 9); 
    }      

    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
               cursos cursos = osCursos.get(id-1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O Curso " + id + " não existe");
            }
        }
    }

    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando:");
                formando.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    formando.setNome(sc.nextLine());

                System.out.println("Masculino (True/False):");
                formando.setMasculino(sc.nextBoolean());
                do {
                    System.out.println("Telefone:");
                    formando.setTelefones(sc.nextInt());
                } while (continuar.perguntar());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void inserirCurso() {
        Scanner sc = new Scanner(System.in);
        cursos cursos = new cursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        osCursos.add(cursos);
    }

    private static void inserirFormando() {
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNome(sc.nextLine());
        System.out.println("Masculino (True/False):");
        formando.setMasculino(sc.nextBoolean());
        do {
            System.out.println("Telefone:");
            formando.setTelefones(sc.nextInt());
        } while (continuar.perguntar());
        osFormandos.add(formando);
    }

    private static void inserirDisciplinas() {
        Scanner sc = new Scanner(System.in);
        disciplinas disciplinas = new disciplinas();
        sc = new Scanner(System.in);
        disciplinas.setIdDisciplinas(idDisciplinas++);
        System.out.println("Nome da Disciplina:");
        disciplinas.setNome(sc.nextLine());
        asDisciplinas.add(disciplinas);
    }

    private static void modificarDisciplinas() {
        if (asDisciplinas.size() == 0) {
            System.out.println("Essa disciplina não existe!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }

            System.out.println("Id da Disciplina:");
            int id = sc.nextInt();
            try {
               disciplinas aDisciplinas = asDisciplinas.get(id-1);
                String nome = sc.nextLine();
                sc = new Scanner(System.in);
                System.out.println("Nome da disciplina:");
                aDisciplinas.setNome(sc.nextLine());
                if (!nome.isEmpty());

            } catch (Exception e) {
                System.out.println("A disciplina " + id + " não existe");
            }
        }
    }

    private static void adicionarInscricao() {
        Scanner sc =new Scanner(System.in);
        inscricoes ad = new inscricoes();
        for (cursos osCursos : osCursos) {
            System.out.println(osCursos.toString());
        }
        System.out.println("Qual o id do curso?");
        int id = sc.nextInt();
        ad.setIdCurso(id);
        for (Formando osFormandos : osFormandos) {
            System.out.println(osFormandos.toString());
        }
        System.out.println("Qual o id do formando?");
        int idD = sc.nextInt();
        ad.setIdFormando(idD);
        asInscricoes.add(ad);
    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
       if (osFormandos.size() == 0) {
           System.out.println("Não existe formandos.");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (Formando oFormando : osFormandos) {
           System.out.println(oFormando.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Id do Formando que é para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= osFormandos.size()) {          
           if (osFormandos.size() == 0){
               System.out.println("Não existe Formandos!");
           } else
           {           
               osFormandos.remove(id - 1);
               idFormando = 2;
               int w = osFormandos.size();
               for (int x = 2; x < w+1; x++){
                   formando = osFormandos.get(x-1);
                   formando.setIdFormando(idFormando++);
                   
               }
              System.out.println("O Formando" + id + "foi eliminado!");
              for (Formando c : osFormandos) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("O formando com esse id não existe. " + id);
       }
       }
    }

    private static void eliminarCurso() {
        cursos cursos = new cursos();
       if (osCursos.size() == 0) {
           System.out.println("Não existem Cursos.");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (cursos osCursos : osCursos) {
           System.out.println(osCursos.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Id do Curso que é para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= osCursos.size()) {          
           if (osCursos.size() == 0){
               System.out.println("Não existe Cursos!");
           } else
           {           
               osCursos.remove(id - 1);
               idCurso = 2;
               int w = osCursos.size();
               for (int x = 2; x < w+1; x++){
                   cursos = osCursos.get(x-1);
                   cursos.setIdCurso(idCurso++);
                   
               }
              System.out.println("O Curso" + id + "foi eliminado!");
              for (cursos c : osCursos) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("O Curso com esse id não existe. " + id);
       }
       }
    }

    private static void eliminarDisciplina() {
        disciplinas disciplinas = new disciplinas();
       if (asDisciplinas.size() == 0) {
           System.out.println("Não existem Disciplinas.");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       for (disciplinas asDisciplinas : asDisciplinas) {
           System.out.println(asDisciplinas.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Id da Disciplina que é para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= asDisciplinas.size()) {          
           if (asDisciplinas.size() == 0){
               System.out.println("Não existe Disciplinas!");
           } else
           {           
               asDisciplinas.remove(id - 1);
               idDisciplinas = 2;
               int w = asDisciplinas.size();
               for (int x = 2; x < w+1; x++){
                disciplinas = asDisciplinas.get(x-1);
                   cursos.setidDisciplina(idDisciplinas++);
                   
               }
              System.out.println("A disciplina" + id + "foi eliminado!");
              for (disciplinas c : asDisciplinas) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("A Disciplina com esse id não existe. " + id);
       }
       }
    }
    private static void eliminarInscricoes() {
        inscricoes aInscricoes = new inscricoes();
       if (asInscricoes.size() == 0) {
           System.out.println("Não existem Inscrições.");          
       }
       else 
       {          
       Scanner sc =new Scanner(System.in);
       int z = 1;
       for (inscricoes asInscricoes : asInscricoes) {
            System.out.print("Id Inscrição" + z++ +" ");
           System.out.println(asInscricoes.toString());
       }
       sc = new Scanner(System.in);
           System.out.println("Id da Inscrição que é para eliminar.");
           int id = sc.nextInt();
           
       if (id > 0 && id <= asInscricoes.size()) {          
           if (asInscricoes.size() == 0){
               System.out.println("Não existe Inscrições!");
           } else
           {           
               asInscricoes.remove(id - 1);
               idInscricao = 2;
               int w = asInscricoes.size();
               for (int x = 2; x < w+1; x++){
                aInscricoes = asInscricoes.get(x-1);
                aInscricoes.setIdFormando(idInscricao++);          
               }
              System.out.println("A Inscriçao" + id + "foi eliminado!");
              for (inscricoes c : asInscricoes) {
                  System.out.println(c.toString());
              }
           }
       }    else {
           System.out.println("A Inscrição com esse id não existe. " + id);
       }
       }
    }
}