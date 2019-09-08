
package restcountries.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "de",
    "es",
    "fr",
    "ja",
    "it"
})
public class Translations {

    @JsonProperty("de")
    private String de;
    @JsonProperty("es")
    private String es;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("ja")
    private String ja;
    @JsonProperty("it")
    private String it;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    public Translations withDe(String de) {
        this.de = de;
        return this;
    }

    @JsonProperty("es")
    public String getEs() {
        return es;
    }

    @JsonProperty("es")
    public void setEs(String es) {
        this.es = es;
    }

    public Translations withEs(String es) {
        this.es = es;
        return this;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    public Translations withFr(String fr) {
        this.fr = fr;
        return this;
    }

    @JsonProperty("ja")
    public String getJa() {
        return ja;
    }

    @JsonProperty("ja")
    public void setJa(String ja) {
        this.ja = ja;
    }

    public Translations withJa(String ja) {
        this.ja = ja;
        return this;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    public Translations withIt(String it) {
        this.it = it;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Translations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("de", de).append("es", es).append("fr", fr).append("ja", ja).append("it", it).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(de).append(it).append(additionalProperties).append(fr).append(es).append(ja).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Translations) == false) {
            return false;
        }
        Translations rhs = ((Translations) other);
        return new EqualsBuilder().append(de, rhs.de).append(it, rhs.it).append(additionalProperties, rhs.additionalProperties).append(fr, rhs.fr).append(es, rhs.es).append(ja, rhs.ja).isEquals();
    }

}
