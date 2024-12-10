package in.codebuffdev.release.java8.features.optionals;

import java.util.List;

public class Subscriber {
    private int subscriptionId;
    private String subscriberName;
    private String registeredMail;
    private List<String> subscriptionPackages;

    public Subscriber() {
    }

    public Subscriber(int subscriptionId, String subscriberName, String registeredMail, List<String> subscriptionPackages) {
        this.subscriptionId = subscriptionId;
        this.subscriberName = subscriberName;
        this.registeredMail = registeredMail;
        this.subscriptionPackages = subscriptionPackages;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public List<String> getSubscriptionPackages() {
        return subscriptionPackages;
    }

    public String getRegisteredMail() {
        return registeredMail;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriptionId=" + subscriptionId +
                ", subscriberName='" + subscriberName + '\'' +
                ", registeredMail='" + registeredMail + '\'' +
                ", subscriptionPackages=" + subscriptionPackages +
                '}';
    }
}
