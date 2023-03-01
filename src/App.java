public class App {
    public static void main(String[] args) throws Exception {
        var livro = new Livro("A arte da guerra", 98.90, "Sun Tzu");
        System.out.println(livro.getAutor());
    }
}
