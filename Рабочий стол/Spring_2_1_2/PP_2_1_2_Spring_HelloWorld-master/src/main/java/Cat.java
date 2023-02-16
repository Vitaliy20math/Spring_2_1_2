import java.util.Objects;

public class Cat {
    private String catName;

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catName, cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName);
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }


}
