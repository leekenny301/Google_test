package utils;

public enum PageURL {
    GOOGLE_URL("https://www.google.com");

    private final String pageURL;
    PageURL(String pageURL) {
        this.pageURL = pageURL;
    }
    public String getPageURL(){
        return this.pageURL;
    }
}
