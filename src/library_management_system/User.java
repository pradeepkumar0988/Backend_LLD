package library_management_system;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public static int getTotalUsers() {
        return totalUsers;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public User() {
        userId = generateUniqueId();
    }

    private final String generateUniqueId() {
        totalUsers++;
        return "User-" + totalUsers;
    }

    public User(String name, String contactInfo) {
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other) {
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        this.userId = generateUniqueId();
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();
}
