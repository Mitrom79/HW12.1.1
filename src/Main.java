public class Main {
    public static void main(String[] args) {
        Author chehov = new Author("Anton", "Chehov" );
        Author bulgakov = new Author("Mikhail", "Bulgakov" );
        Book svadba = new Book("Свадьба", chehov, 1889);
        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1967);

        System.out.println(svadba);
        System.out.println(masterAndMargarita);


        svadba.setYear(1234);
        System.out.println(masterAndMargarita);

    }


}