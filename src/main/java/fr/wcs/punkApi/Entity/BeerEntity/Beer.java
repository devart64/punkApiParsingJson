package fr.wcs.punkApi.Entity.BeerEntity;

import fr.wcs.punkApi.Entity.Boil_Volume;
import fr.wcs.punkApi.Entity.IngredientEntity.Ingredient;
import fr.wcs.punkApi.Entity.Method;
import fr.wcs.punkApi.Entity.Volume;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Beer {
    private Integer id;
    private String name;
    private String tagline;
    private Date first_brewed;
    private String description;
    private String image_url;
    private float abv;
    private float ibu;
    private float target_fg;
    private float target_og;
    private float ebc;
    private float srm;
    private float ph;
    private float attenuation_level;
    // the Volume will be an object Volume idem for boil_volume, and method
    private Volume volume;
    private Boil_Volume boil_volume;
    private Method method;
    // ingredient will be object list
    public List<Ingredient> ingredients;
    // food_pairing will be a list of Strings
    public List<String> foodPairing = new ArrayList<String>();
    private String brewers_tips;
    private String contributed_by;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Date getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(Date first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }

    public float getIbu() {
        return ibu;
    }

    public void setIbu(float ibu) {
        this.ibu = ibu;
    }

    public float getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(float target_fg) {
        this.target_fg = target_fg;
    }

    public float getTarget_og() {
        return target_og;
    }

    public void setTarget_og(float target_og) {
        this.target_og = target_og;
    }

    public float getEbc() {
        return ebc;
    }

    public void setEbc(float ebc) {
        this.ebc = ebc;
    }

    public float getSrm() {
        return srm;
    }

    public void setSrm(float srm) {
        this.srm = srm;
    }

    public float getPh() {
        return ph;
    }

    public void setPh(float ph) {
        this.ph = ph;
    }

    public float getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(float attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public Boil_Volume getBoil_volume() {
        return boil_volume;
    }

    public void setBoil_volume(Boil_Volume boil_volume) {
        this.boil_volume = boil_volume;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public String getContributed_by() {
        return contributed_by;
    }

    public void setContributed_by(String contributed_by) {
        this.contributed_by = contributed_by;
    }
}
