package JavaPractise.Enum;

public class Enum_env {
    public static void main(String[] args) {
        System.out.println(environments.dev.getUrl());
        System.out.println(environments.live.getUrl());
        System.out.println(environments.test.getUrl());

        environments.test.setUrl("www.test.intercellworld.com");
        System.out.println(environments.test.getUrl());
    }
}
enum environments {

    test("Www.test.intercellworld.com"),
    dev("Www.test.intercellworld.com"),
    live("Www.test.intercellworld.com");

    private String url;

    environments(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
