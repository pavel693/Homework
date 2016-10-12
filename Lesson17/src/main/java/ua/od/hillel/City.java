package ua.od.hillel;

public class City implements Comparable<City> {
    private String name;
    private String region;

    City(String name, String region) {
        this.name = name;
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != City.class) return false;

        City city = (City) o;
        if (this.name == null || city.name == null) return false;
        boolean nameResult = this.name.equals(city.name);
        boolean regionResult = this.region.equals(city.region);
        return nameResult && regionResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.name);
    }
}
