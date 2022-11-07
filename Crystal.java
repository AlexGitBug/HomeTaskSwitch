package Thread.HomeTask.Switch;

public class Crystal {
    private final CrystalColorEnum crystalColorEnum;

    public Crystal(CrystalColorEnum crystalColorEnum) {
        this.crystalColorEnum = crystalColorEnum;
    }

    @Override
    public String toString() {
        return "Crystal{" +
                "crystalColorEnum=" + crystalColorEnum +
                '}';
    }

    public CrystalColorEnum getCrystalColorEnum() {
        return crystalColorEnum;
    }
}