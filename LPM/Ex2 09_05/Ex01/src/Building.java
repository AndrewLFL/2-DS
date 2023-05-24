public abstract class Building implements CarbonFootprint{
    private int numPessoas;
    private boolean ehRenovavel;
    private int numLampadas;
    private boolean usaArCond;

    @Override
    public int getCarbonFootprint()
    {
        return 1;
    }

    //m.e

    public Building(int numPessoas, boolean ehRenovavel, int numLampadas, boolean usaArCond) {
        this.numPessoas = numPessoas;
        this.ehRenovavel = ehRenovavel;
        this.numLampadas = numLampadas;
        this.usaArCond = usaArCond;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public boolean isEhRenovavel() {
        return ehRenovavel;
    }

    public void setEhRenovavel(boolean ehRenovavel) {
        this.ehRenovavel = ehRenovavel;
    }

    public int getNumLampadas() {
        return numLampadas;
    }

    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    public boolean isUsaArCond() {
        return usaArCond;
    }

    public void setUsaArCond(boolean usaArCond) {
        this.usaArCond = usaArCond;
    }
}


