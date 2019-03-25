package id.eudeka.delapan.model.incident;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Source {

    @SerializedName("api_url")
    private String apiUrl;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("name")
    private String name;

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Source{" +
                        "api_url = '" + apiUrl + '\'' +
                        ",html_url = '" + htmlUrl + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}