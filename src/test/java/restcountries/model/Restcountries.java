
package restcountries.model;

import java.util.HashMap;
import java.util.List;
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
    "name",
    "topLevelDomain",
    "alpha2Code",
    "alpha3Code",
    "callingCodes",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "population",
    "latlng",
    "demonym",
    "area",
    "gini",
    "timezones",
    "borders",
    "nativeName",
    "numericCode",
    "currencies",
    "languages",
    "translations",
    "relevance"
})
public class Restcountries {

    @JsonProperty("name")
    private String name;
    @JsonProperty("topLevelDomain")
    private List<String> topLevelDomain = null;
    @JsonProperty("alpha2Code")
    private String alpha2Code;
    @JsonProperty("alpha3Code")
    private String alpha3Code;
    @JsonProperty("callingCodes")
    private List<String> callingCodes = null;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("altSpellings")
    private List<String> altSpellings = null;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("latlng")
    private List<Double> latlng = null;
    @JsonProperty("demonym")
    private String demonym;
    @JsonProperty("area")
    private Double area;
    @JsonProperty("gini")
    private Double gini;
    @JsonProperty("timezones")
    private List<String> timezones = null;
    @JsonProperty("borders")
    private List<String> borders = null;
    @JsonProperty("nativeName")
    private String nativeName;
    @JsonProperty("numericCode")
    private String numericCode;
    @JsonProperty("currencies")
    private List<String> currencies = null;
    @JsonProperty("languages")
    private List<String> languages = null;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("relevance")
    private String relevance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Restcountries withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("topLevelDomain")
    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    @JsonProperty("topLevelDomain")
    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public Restcountries withTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }

    @JsonProperty("alpha2Code")
    public String getAlpha2Code() {
        return alpha2Code;
    }

    @JsonProperty("alpha2Code")
    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public Restcountries withAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
        return this;
    }

    @JsonProperty("alpha3Code")
    public String getAlpha3Code() {
        return alpha3Code;
    }

    @JsonProperty("alpha3Code")
    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public Restcountries withAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
        return this;
    }

    @JsonProperty("callingCodes")
    public List<String> getCallingCodes() {
        return callingCodes;
    }

    @JsonProperty("callingCodes")
    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public Restcountries withCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
        return this;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Restcountries withCapital(String capital) {
        this.capital = capital;
        return this;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public Restcountries withAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Restcountries withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Restcountries withSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Restcountries withPopulation(Integer population) {
        this.population = population;
        return this;
    }

    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Restcountries withLatlng(List<Double> latlng) {
        this.latlng = latlng;
        return this;
    }

    @JsonProperty("demonym")
    public String getDemonym() {
        return demonym;
    }

    @JsonProperty("demonym")
    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Restcountries withDemonym(String demonym) {
        this.demonym = demonym;
        return this;
    }

    @JsonProperty("area")
    public Double getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Double area) {
        this.area = area;
    }

    public Restcountries withArea(Double area) {
        this.area = area;
        return this;
    }

    @JsonProperty("gini")
    public Double getGini() {
        return gini;
    }

    @JsonProperty("gini")
    public void setGini(Double gini) {
        this.gini = gini;
    }

    public Restcountries withGini(Double gini) {
        this.gini = gini;
        return this;
    }

    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public Restcountries withTimezones(List<String> timezones) {
        this.timezones = timezones;
        return this;
    }

    @JsonProperty("borders")
    public List<String> getBorders() {
        return borders;
    }

    @JsonProperty("borders")
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public Restcountries withBorders(List<String> borders) {
        this.borders = borders;
        return this;
    }

    @JsonProperty("nativeName")
    public String getNativeName() {
        return nativeName;
    }

    @JsonProperty("nativeName")
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Restcountries withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    @JsonProperty("numericCode")
    public String getNumericCode() {
        return numericCode;
    }

    @JsonProperty("numericCode")
    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public Restcountries withNumericCode(String numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    @JsonProperty("currencies")
    public List<String> getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public Restcountries withCurrencies(List<String> currencies) {
        this.currencies = currencies;
        return this;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Restcountries withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public Restcountries withTranslations(Translations translations) {
        this.translations = translations;
        return this;
    }

    @JsonProperty("relevance")
    public String getRelevance() {
        return relevance;
    }

    @JsonProperty("relevance")
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public Restcountries withRelevance(String relevance) {
        this.relevance = relevance;
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

    public Restcountries withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("topLevelDomain", topLevelDomain).append("alpha2Code", alpha2Code).append("alpha3Code", alpha3Code).append("callingCodes", callingCodes).append("capital", capital).append("altSpellings", altSpellings).append("region", region).append("subregion", subregion).append("population", population).append("latlng", latlng).append("demonym", demonym).append("area", area).append("gini", gini).append("timezones", timezones).append("borders", borders).append("nativeName", nativeName).append("numericCode", numericCode).append("currencies", currencies).append("languages", languages).append("translations", translations).append("relevance", relevance).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(region).append(currencies).append(numericCode).append(callingCodes).append(alpha3Code).append(nativeName).append(topLevelDomain).append(altSpellings).append(capital).append(alpha2Code).append(languages).append(subregion).append(timezones).append(area).append(additionalProperties).append(name).append(relevance).append(translations).append(latlng).append(demonym).append(gini).append(borders).append(population).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restcountries) == false) {
            return false;
        }
        Restcountries rhs = ((Restcountries) other);
        return new EqualsBuilder().append(region, rhs.region).append(currencies, rhs.currencies).append(numericCode, rhs.numericCode).append(callingCodes, rhs.callingCodes).append(alpha3Code, rhs.alpha3Code).append(nativeName, rhs.nativeName).append(topLevelDomain, rhs.topLevelDomain).append(altSpellings, rhs.altSpellings).append(capital, rhs.capital).append(alpha2Code, rhs.alpha2Code).append(languages, rhs.languages).append(subregion, rhs.subregion).append(timezones, rhs.timezones).append(area, rhs.area).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(relevance, rhs.relevance).append(translations, rhs.translations).append(latlng, rhs.latlng).append(demonym, rhs.demonym).append(gini, rhs.gini).append(borders, rhs.borders).append(population, rhs.population).isEquals();
    }

}
