package section;

public class hello {
    public static void main(String[] args) {
        String[][] alphabet = {
            {"  ┏━┓","┏━━┓ "," ┏━━┓","┏━━┓ ","┏━━━┓","┏━━━┓"," ┏━━┓ ","┏┓ ┏┓","┏━━┓"," ┏━━┓","┏┓┏━┓","┏┓   ","┏┓  ┏┓","┏┓ ┏┓","┏━━━┓","┏━━━┓","┏━━━┓","┏━━━┓","┏━━━┓","┏━━━━┓","┏┓ ┏┓","┏┓  ┏┓","┏┓┏┓┏┓","┏┓  ┏┓","┏┓  ┏┓","┏━━━┓"},
            {" ┏┛┃┃", "┃┏┓┃ ","┏┛┏┓┃","┃┏┓┻┓","┃┏━━┛","┃┏━━┛","┏┛┏┓┻┓","┃┃ ┃┃","┗┓┏┛"," ┗┓┏┛","┃┃┃┏┛","┃┃   ","┃┗┓┏┛┃","┃┗┓┃┃","┃┏━┓┃","┃┏━┓┃","┃┏━┓┃","┃┏━┓┃","┃┏━┓┃","┗━┓┏━┛","┃┃ ┃┃","┃┃  ┃┃","┃┃┃┃┃┃","┃┗┓┏┛┃","┃┗┓┏┛┃","┗━┳━┃"},
            {" ┃┏┫┃","┃┗┛┻┓","┃┏┛┗┛","┃┃┗┓┃","┃┗━━┓","┃┗━━┓","┃┏┛┗━┛","┃┗━┛┃"," ┃┃ ","  ┃┃ ","┃┗╋┛ ","┃┃   ","┃┃┗┫┃┃","┃┃┗┫┃","┃┃ ┃┃","┃┗━┛┃","┃┃ ┃┃","┃┗━┛┃","┃┗━┻┫","  ┃┃  ","┃┃ ┃┃","┃┗┓┏┛┃","┃┣┫┣┫┃","┗┫┗┛┣┛","┗┫┗┛┣┛"," ┏┛┳┛"},
            {"┏┛┗┛┃","┃┏━┓┃","┃┗┓┏┓","┃┃┏┛┃","┃┏━━┛","┃┏━━┛","┃┗┓┏━┓","┃┏━┓┃"," ┃┃ ","┏┓┃┃ ","┃┃┗┓ ","┃┃   ","┃┣┫┏┫┃","┃┣┫┃┃","┃┃ ┃┃","┃┏━━┛","┃┃┏┻┫","┃┏━┓┫","┣┳━┓┃","  ┃┃  ","┃┃ ┃┃","┗┓┗┫┏┛","┃┃┏┓┃┃","┏┫┏┓┣┓"," ┗┫┣┛ ","┏┛┳┛ "},
            {"┃┏━┫┃","┃┗━┛┃","┗┓┗┛┃","┃┗┛┳┛","┃┗━━┓","┃┃   ","┗┓┗┛┓┃","┃┃ ┃┃","┏┛┗┓","┃┻┛┃ ","┃┣┓┗┓","┃┗━━┓","┃┃┃┃┃┃","┃┃┗┓┃","┃┗━┛┃","┃┃   ","┃┗┻┫┃","┃┃ ┃┃","┃┗━┛┃","  ┃┃  ","┃┗━┛┃"," ┗┓┏┛ ","┃┏┛┗┓┃","┃┏┛┗┓┃","  ┃┃  ","┃━┻━┓"},
            {"┗┛ ┗┛","┗━━━┛"," ┗━━┛","┗━━┛ ","┗━━━┛","┗┛   "," ┗━━┻┛","┗┛ ┗┛","┗━━┛","┗━━┛ ","┗┛┗━┛","┗━━━┛","┗┛┗┛┗┛","┗┛ ┗┛","┗━━━┛","┗┛   ","┗━━┻┛","┗┛ ┗┛","┗━━━┛","  ┗┛  ","┗━━━┛","  ┗┛  ","┗┛  ┗┛","┗┛  ┗┛","  ┗┛  ","┗━━━┛"},
        };

        for(int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i][4]);
        }
    }
}
