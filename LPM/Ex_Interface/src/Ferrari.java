public class Ferrari implements ICarro,IItemLoja{

    @Override
    public void abrirPorta(){
        System.out.println("Ferrari abrindo porta");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerando 0 a 100");
    }

    @Override
    public void frear() {
        System.out.println("Ferrari freando");
    }

    @Override
    public double getValor() {
        return 800000;
    }
}
