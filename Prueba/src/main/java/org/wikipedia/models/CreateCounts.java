package org.wikipedia.models;

public class CreateCounts
{
    private final String USER,PASSWORD,EMAIL;

    public CreateCounts(String USER, String PASSWORD, String EMAIL) {
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.EMAIL = EMAIL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getEMAIL() {
        return EMAIL;
    }
}
