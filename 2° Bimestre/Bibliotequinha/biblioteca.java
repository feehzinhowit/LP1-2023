import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private String nome_bib;
    private dono dono;
    private List<livro> livros = new ArrayList<>();
    private List<funcionario> funcionarios = new ArrayList<>();

    public biblioteca (String nome_bib, dono dono){
        this.dono = dono;
        this.nome_bib = nome_bib;
    }


    public String getNome_bib() {
        return nome_bib;
    }

    public void setNome_bib(String nome_bib) {
        this.nome_bib = nome_bib;
    }

    public dono getDono() {
        return dono;
    }

    public void setDono(dono dono) {
        this.dono = dono;
    }

    public List<livro> getLivros() {
        return livros;
    }

    public void setLivros(List<livro> livros) {
        this.livros = livros;
    }

    public List<funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addlivros (livro Livro){
        this.livros.add(Livro);
    }

    public void addfunc (funcionario Func){
        this.funcionarios.add(Func);
    }

    public void MostrarLivros(){
        System.out.println("::::::BIBLIOTECA CREFE::::::");
        System.out.println("");

        for (livro i: this.livros) {
            System.out.println("nome do livro é: " + i.getNome_livro());
            System.out.println("o autor do livro é: " + i.getAutor());
            System.out.println("o ano do livro é: " + i.getAno());

            System.out.println(" ");
        }


    }

    public void MostrarFuncionarios(){
        for (funcionario i: this.funcionarios) {
            System.out.println("nome do funcionario é: " + i.getNome_func());
            System.out.println("cpf do funcionário é: " + i.getCpf_func());

            System.out.println("");

        }
    }


}
