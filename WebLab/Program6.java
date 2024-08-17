interface Backend {
    public void connectServer();
}

class Frontend {
    public void responsive(String language) {
        System.out.println(language + " can be used in frontend language.");
    }
}

class Program6 extends Frontend implements Backend {

    String language = "JavaScript";
    public void connectServer() {
        System.out.println(language + " can be used as backend language.");
    }

    public static void main(String[] args) {
        Program6 lang = new Program6();
        lang.connectServer();
        lang.responsive(lang.language);
    }
}