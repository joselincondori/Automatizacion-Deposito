package domain.comandos.notemporizados.conluz;

import domain.tracer.Tracer;
public class ApagarLuz extends ComandoConLuz {
    @Override
    public void ejecutar() {
        Tracer.getInstance().showTrace("Ejecutando comando Apagar Luz");
        super.receptorAdapter.apagarLuz(super.color);
    }
}
