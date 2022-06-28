/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

/**
 *
 * @author Outro eu
 */
public class MoneyControl {
    
    public MoneyControl() {
        
    }
    public MoneyControl(String u, String s) {
        this.usuario = u;
        this.senha = s;
    }
    
    public MoneyControl(String n, String sN, String e, String dN, String cpf, String fS) {
        this.nome = n;
        this.sobrenome = sN;
        this.email = e;
        this.dataNasc = dN;
        this.cpf = cpf;
        this.fazerSenha = fS;
    }
    
    public MoneyControl(double vE, String cE, String dE/*, double vS, String cS, String dS*/) {
        this.valorEntrada = vE;
        this.categoriaEntrada = cE;
        this.dataEntrada = dE;
        /*this.valorSaida = vS;
        this.categoriaSaida = cS;
        this.dataSaida = dS;*/
    }
    
    public MoneyControl(String n, String sN, String e, String dN, String cpf) {
        this.nome = n;
        this.sobrenome = sN;
        this.email = e;
        this.dataNasc = dN;
        this.cpf = cpf;
    }
    
    
    //SETTERS
    
    private String usuario;
    private String senha;
    
    private String nome;
    private String sobrenome;
    private String email;
    private String dataNasc;
    private String cpf;
    private String fazerSenha;
    private String repetirSenha;
    
    private double valorEntrada;
    private String categoriaEntrada;
    private String dataEntrada;
    
    private double valorSaida;
    private String categoriaSaida;
    private String dataSaida;
    
    private int id;
    
    
    public void setUsuario(String u) {
        this.usuario = u;
    }
    
    public void setSenha(String s) {
        this.senha = s;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public void setSobrenome(String sN) {
        this.sobrenome = sN;
    }
    
    public void setEmail(String e) {
        this.email = e;
    }
    
    public void setDataNasc(String dN) {
        this.dataNasc = dN;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setFazerSenha(String fS) {
        this.fazerSenha = fS;
    }
    
    public void setRepetirSenha(String rS) {
        this.repetirSenha = rS;
    }
    
    public void setValorEntrada(int vE) {
        this.valorEntrada = vE;
    }
    
    public void setCategoriaEntrada(String cE) {
        this.categoriaEntrada = cE;
    }
    
    public void setDataEntrada(String dE) {
        this.dataEntrada = dE;
    }
    
    public void setValorSaida(int vS) {
        this.valorSaida = vS;
    }
    
    public void setCategoriaSaida(String cS) {
        this.categoriaSaida = cS;
    }
    
    public void setDataSaida(String dS) {
        this.dataSaida = dS;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    //GETTERS
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getDataNasc() {
        return this.dataNasc;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getFazerSenha() {
        return this.fazerSenha;
    }
    
    public String getRepetirSenha() {
        return this.repetirSenha;
    }
    
    public double getValorEntrada() {
        return this.valorEntrada;
    }
    
    public String getCategoriaEntrada() {
        return this.categoriaEntrada;
    }
    
    public String getDataEntrada() {
        return this.dataEntrada;
    }
    
    public double getValorSaida() {
        return this.valorSaida;
    }
    
    public String getCategoriaSaida() {
        return this.categoriaSaida;
    }
    
    public String getDataSaida() {
        return this.dataSaida;
    }
    
    public int getId() {
        return this.id;
    }
}
