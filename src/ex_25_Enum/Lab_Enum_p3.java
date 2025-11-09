package ex_25_Enum;

public class Lab_Enum_p3 {
    public static void main(String[] args) {
        System.out.println(hex_colors.Blue.getHexcode());
        System.out.println(hex_colors.Red);
    }

}
enum hex_colors{
    White("#FFFFFF"), Black("#000000"), Red("#FF0000"), Green("#00FF00"), Blue("#0000FF"), Yellow("#FFFF00"), Cyan("#00FFFF"), Magenta("#FF00FF"), Silver("#C0C0C0"), Gray("#808080"), Maroon("#800000"), Olive("#808000"), Purple("#800080"), Teal("#008080"), Navy("#000080"), Orange("#FFA500"), Lime("#00FF00"), Brown("#A52A2A");

    public String getHexcode() {
        return hexcode;
    }

    private String hexcode;
    hex_colors(String hexcode) {
        this.hexcode = hexcode;
    }
}
