class Televisor {

    Integer canal = new Integer(130); // deprecated
    Integer volume = 20; // boxing
    Integer brilho = Integer.valueOf(50); // java 9

    void mudarCanal(Integer novoCanal) {
        if (novoCanal.equals(canal) == true) {
            String msg  = "Novo canal é também o canal atual.";
            System.out.println(msg);
        } else {
            String msg = "Canal " + canal + " ";
            canal = new Integer(novoCanal.intValue());
            msg += "alterado para " + canal;
            System.out.println(msg);
        }
    }
	
    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            String msg  = "Novo volume é também ";
                   msg += "o volume atual.";
            System.out.println(msg);
	} else {
            String msg = "Volume " + volume + " ";
            volume = novoVolume;
            msg += "alterado para " + volume;
            System.out.println(msg);
        }
    }
	
    void mudarBrilho(Integer novoBrilho) {
        if (novoBrilho.equals(brilho)) {
            String msg  = "Novo brilho é também o brilho atual.";
            System.out.println(msg);
        } else {
            String msg = "Brilho " + brilho + " ";
			
            // metodo obj.valueOf(int x) recebe um valor do tipo
            // primitivo inteiro. Ao passarmos um objeto wrapper
            // (argumento) observamos um exemplo de unboxing. :-)
            
            brilho = Integer.valueOf(novoBrilho); // unboxing
            
            // como se tivessemos feito da seguinte forma:
            // int auxBrilho = novoBrilho.intValue();
            // brilho = Integer.valueOf(auxBrilho);
			
            msg += "alterado para " + brilho;
            System.out.println(msg);
        }
    }
	
    // ponto de entrada da aplicacao
    public static void main(String[] args) {
        Televisor tv = new Televisor();
		
        // o codigo do chefe foi revisado para comparar os
        // objetos (wrappers) com o metodo obj.equals() :-)

        // nao deve alterar os valores previamente iniciados
        System.out.println("\nValores nao serao alterados");
        tv.mudarVolume(20);
        tv.mudarCanal(130);
        tv.mudarBrilho(50);
	
        // deve alterar os valores previamente iniciados
        System.out.println("\nValores serao alterados");
        tv.mudarVolume(25);
        tv.mudarCanal(80);
        tv.mudarBrilho(60);
    }
}