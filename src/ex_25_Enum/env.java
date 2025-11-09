package ex_25_Enum;

public enum env{
    Dev("dev.intercellworld.com"),
    prod("prod.intercellworld.com"),
    test("test.intercellworld.com");

    public String getUrl() {
        return url;
    }

    private String url;
    env(String url) {
        this.url = url;
    }
}
