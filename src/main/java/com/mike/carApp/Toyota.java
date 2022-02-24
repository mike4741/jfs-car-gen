package com.mike.carApp;

public class Toyota extends  Car{
   private boolean  greatGasMileage;

    public Toyota(String color, int year,  int maxSpeed,  boolean greatGasMileage) {
        super(color, year, maxSpeed );
        this.greatGasMileage = greatGasMileage;
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
