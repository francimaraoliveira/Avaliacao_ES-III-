package questao05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

abstract class Tipo{
    public enum Tipooperacao {
        Deposito,
        Retirada,
        Transferencia
    }

}

public class Transacao {
    private double valor;
    private Date data;
    private String tipo; 

    public Transacao(double valor, Date data, String tipo) {
    }

    public String getTipo(){
        return tipo;
    }
    public double getValor(){
        return valor;
    }
    public Date getData(){
        return data;
    }

}

