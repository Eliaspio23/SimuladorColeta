public class ConfiguracaoSimulacao {
    public int caminhoesPorTipo = 10;
    public int[] caminhoesCapacidades = {2, 4, 8, 10};
    public int horarioInicio = 5 * 60;   // 05:00 em minutos
    public int horarioFim = 23 * 60;     // 23:00 em minutos
    public int cargaMinimaCaminhao = 500; // kg
    public int cargaMaximaCaminhaoExtra = 499; // valor extra para randomização
    public int limiteViagensMin = 6;
    public int limiteViagensMax = 10;
    public int cargaCaminhaoGrande = 20000; // kg
    public int tempoEsperaEstacao = 45; // minutos
    public int tempoViagemGrandePicoMin = 150; // minutos
    public int tempoViagemGrandePicoMax = 180; // minutos
    public int tempoViagemGrandeForaPicoMin = 90; // minutos
    public int tempoViagemGrandeForaPicoMax = 120; // minutos

    // Construtor solicitado
    public ConfiguracaoSimulacao(int caminhoesPorTipo, int[] caminhoesCapacidades, int horarioInicio, int horarioFim) {
        this.caminhoesPorTipo = caminhoesPorTipo;
        this.caminhoesCapacidades = caminhoesCapacidades;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    // Getters solicitados
    public int getCaminhoesPorTipo() {
        return caminhoesPorTipo;
    }

    public int[] getCaminhoesCapacidades() {
        return caminhoesCapacidades;
    }

    public int getHorarioInicio() {
        return horarioInicio;
    }

    public int getHorarioFim() {
        return horarioFim;
    }
}