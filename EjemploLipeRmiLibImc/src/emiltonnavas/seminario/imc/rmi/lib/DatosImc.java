/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emiltonnavas.seminario.imc.rmi.lib;

import emiltonnavas.seminario.imc.rmi.lib.DatosImc;
import emiltonnavas.seminario.imc.rmi.lib.IRemotaCalculoImc;
import java.io.Serializable;

 

public class DatosImc implements Serializable {

    private float peso;
    private float altura;
    private float resultado;
    private String interpretation;

    public DatosImc() {
    }

    public DatosImc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getInterpretacion() {
        return interpretation;
    }

    public void setInterpretacion(String interpretation) {
        this.interpretation = interpretation;
    }
}