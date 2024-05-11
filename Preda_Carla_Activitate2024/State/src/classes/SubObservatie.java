package classes;

public class SubObservatie implements Stare{
    protected SubObservatie() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
