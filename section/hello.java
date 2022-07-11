package section;

public class hello {
    public static void main(String[] args) {
        String[][] alphabet = {
            {"  ┏━┓"},
            {" ┏┛┃┃"},
            {" ┃┏┫┃"},
            {"┏┛┗┛┃"},
            {"┃┏━┫┃"},
            {"┗┛ ┗┛"},
        };

        for(int i = 0; i < alphabet.length; i++) {
            for(int j = 0; j < alphabet[i].length; j++) {
                System.out.print(alphabet[i][j]);
            }
            System.out.println("");
        }
    }
}
