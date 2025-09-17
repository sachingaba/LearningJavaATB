package ex_03_Literals;

public class Lab016_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';
        // char c2 = "A"; this is string --> "" double quotes

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space


        //Escape Literal

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SachinGaba");

        System.out.println("Sachin"+ new_line +"Gaba");  // new line char used here defined above

        System.out.println("Sachin/nGaba");
        System.out.println("Sachin"+ tab_line +"Gaba");
        System.out.println("Sachin"+ back_space +"Gaba");




    }
}
