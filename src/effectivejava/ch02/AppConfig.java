package effectivejava.ch02;

public enum AppConfig {
    INSTANCE("1.0.0", "https://api.example.com");

    private final String version;
    private final String serverUrl;

    private AppConfig(String version, String serverUrl) {
        System.out.println("AppConfig constructor");
        this.version = version;
        this.serverUrl = serverUrl;
    }

    public String getVersion() {
        return version;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public static void main(String[] args) {
        System.out.println("AppConfig.main");

        AppConfig config1 = AppConfig.INSTANCE;
        AppConfig config2 = AppConfig.INSTANCE;

        System.out.println("config1 == config2 : " + (config1 == config2));

        System.out.println("config1 hashcode : " + config1.hashCode());
        System.out.println("config2 hashcode : " + config2.hashCode());

        System.out.println("App Version : " + config1.getVersion());
        System.out.println("App Server Url : " + config2.getServerUrl());
    }
}
