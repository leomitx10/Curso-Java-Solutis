public class Zoologico {
    private Animal[] jaula;

    public Zoologico(Animal[] jaula) {
        this.jaula = jaula;
    }

    public Zoologico() {
        jaula = new Animal[10];
        jaula[0] = new Cachorro("Bob", 7);
        jaula[1] = new Cavalo("Agro", 5);
        jaula[2] = new Preguica("Sid", 4);
        jaula[3] = new Cachorro("Felps", 8);
        jaula[4] = new Cavalo("Dom", 6);
        jaula[5] = new Preguica("Lux", 9);
        jaula[6] = new Cachorro("Rex", 7);
        jaula[7] = new Cavalo("Pegasus", 7);
        jaula[8] = new Preguica("Maicon", 6);
        jaula[9] = new Cachorro("Belinha", 3);
    }

    public void visitarZoologico() {
        for (int i = 0; i < jaula.length; i++) {
            jaula[i].emitirSom();
            if (jaula[i] instanceof Cavalo || jaula[i] instanceof Cachorro ) {
                if (jaula[i] instanceof  Cavalo) {
                    ((Cavalo) jaula[i]).correr();
                } else if (jaula[i] instanceof Cachorro) {
                    ((Cachorro) jaula[i]).correr();
                }
            }
        }
    }

    public Animal[] getJaula() {
        return jaula;
    }

    public void setJaula(Animal[] jaula) {
        this.jaula = jaula;
    }
}