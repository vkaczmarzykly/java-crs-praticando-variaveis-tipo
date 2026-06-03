public class CadastroLivros {
    static void main() {

        char categoria = 'v';

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double preco = 39.9;
        String categ = "";

        switch(categoria) {
            case 'F':
                categ = "Ficção.";
                break;
            case 'N':
                categ = "Não-ficção.";
                break;
            case 'T':
                categ = "Tecnologia.";
                break;
            case 'H':
                categ = "História.";
                break;
            default:
                categ = "Categoria inválida";
        }

        System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + numeroPaginas + 
                " páginas, custa R$" + preco + " e pertece á categoria " + categ);
    }
}
