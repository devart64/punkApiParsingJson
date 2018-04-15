package fr.wcs.punkApi.Entity.IngredientEntity;

public class Ingredient {
    private String typeOfIngredient; // type will be "malt" or "hops"
    private String name;
    private float amountValue;
    private float amountUnit;

    public String add; // just for "hops"

    public String getTypeOfIngredient() {
        return typeOfIngredient;
    }

    public void setTypeOfIngredient(String typeOfIngredient) {
        this.typeOfIngredient = typeOfIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmountValue() {
        return amountValue;
    }

    public void setAmountValue(float amountValue) {
        this.amountValue = amountValue;
    }

    public float getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(float amountUnit) {
        this.amountUnit = amountUnit;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String attribute; // just for "hops"
}
