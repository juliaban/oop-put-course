public class Movie {
    private String title;
    private Actor[] actors;
    private String director;

    Movie(String title, String director, Actor[] actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
    }

    public String toString() {
        String actors = "";
        for (int i = 0; i < this.actors.length; i++) {
            actors = String.format("%s\n%s", actors, this.actors[i]);
        }

        return String.format("Title: %s\nDirector: %s\nActors: %s", this.title, this.director, actors);
    }

    public static void main(String[] args) {
        Movie wielkaWoda = new Movie(
                "Wielka woda",
                "Tomek",
                new Actor[] {
                        new MainActor("Ola", "Jakas"),
                        new SupportingActor("Ania", "Aniowska"),
                        new SupportingActor("Basia", "Basiowska"),
                        new SupportingActor("Kasia", "Kasiowska")
                });
        System.out.println(wielkaWoda.toString());

    }

}