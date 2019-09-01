package edu.xatu;

public class Address {
    private String homeadr;

    public String getHomeadr() {
        return homeadr;
    }

    public void setHomeadr(String homeadr) {
        this.homeadr = homeadr;
    }

    public String getWorkadr() {
        return workadr;
    }

    public void setWorkadr(String workadr) {
        this.workadr = workadr;
    }

    public Address(String homeadr, String workadr) {
        this.homeadr = homeadr;
        this.workadr = workadr;
    }

    private String workadr;
}
