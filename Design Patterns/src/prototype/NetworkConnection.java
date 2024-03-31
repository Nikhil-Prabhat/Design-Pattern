package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static constants.Constants.*;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domainsList = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public List<String> getDomainsList() {
        return domainsList;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    // This operation is a costly operation and can consume time
    public void loadVeryImportantData() throws InterruptedException {
        Thread.sleep(5000);
        domainsList.add(LEARN_DESIGN_PATTERN_DOMAIN);
        domainsList.add(LEARN_CODING_DOMAIN);
        domainsList.add(LEARN_JAVA_DOMAIN);


        setImportantData(VERY_IMPORTATNT_DATA);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domainsList=" + domainsList +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();

        // Add custom logic to implement deep copy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        this.getDomainsList().stream().forEach(
                domain -> networkConnection.getDomainsList().add(domain)
        );

        return networkConnection;
    }
}
