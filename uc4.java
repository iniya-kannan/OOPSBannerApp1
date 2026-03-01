public class uc4 {
    public static void main(String[] args) {

        // Banner lines using String.join()
        String[] banner = {
            String.join(" ", "O", "O", "O", "O"),
            String.join(" ", "O", " ", " ", "O"),
            String.join(" ", "O", " ", " ", "O"),
            String.join(" ", "O", "O", "O", "O"),

            String.join(" ", "P", "P", "P", " "),
            String.join(" ", "P", " ", " ", "P"),
            String.join(" ", "P", "P", "P", " "),
            String.join(" ", "P", " ", " ", " "),

            String.join(" ", "S", "S", "S", "S"),
            String.join(" ", "S", " ", " ", " "),
            String.join(" ", "S", "S", "S", "S"),
            String.join(" ", " ", " ", " ", "S")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}