<h1>O que são enums??</h1>

> <p>Enum é um tipo especial de classe onde os objetos são previamente 
> criados, imutáveis e disponíveis por toda a aplicação.</p>

<p>Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto
que já existem e são pré-estabelecidos com a certeza de não haver tanta alteração
de valores.</p>

<h2>Exemplos:</h2>

<section style="display: flex; flex-direction: column; gap: 1rem;">
<div style="display: flex; align-items: center; gap:
.7rem; background-color: pink; border-radius: .3rem; color: #010101; padding: 0 .5rem;">
    <h4>Grau de escolaridade: </h4> <p style="color: #010101;">Analfabeto, Fundamental, Médio, Superior</p>
</div>

<div style="display: flex; align-items: center; gap:
.7rem; background-color: pink; border-radius: .3rem; color: #010101; padding: 0 .5rem;">
    <h4>Estado Civil: </h4> <p style="color: #010101;">Solteiro, Casado, Divorciado, Viúvo</p>
</div>

<div style="display: flex; align-items: center; gap:
.7rem; background-color: pink; border-radius: .3rem; color: #010101; padding: 0 .5rem;">
    <h4>Estados Brasileiros: </h4> <p style="color: #010101;">São Paulo, Rio de Janeiro, Piauí, Maranhão</p>
</div>

> [!CAUTION]  
> <span>Não confunda uma lista de constantes com enum.</span>
</section>

<p>Enquanto uma constante é uma variável de tipo com o valor imutável, um enum 
é um conjunto de objetos já pré-definidos na aplicação.</p>

<p>Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos
e métodos. Veja o exemplo acima de um enum para disponibilizar os quatro estados 
brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega
o nome de cada estado e já retorna tudo em maiúsculo.</p>

``` Java
    public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);

    private String sigla;
    private String nome;
    private int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiuculo() {
        return this.nome.toUpperCase();
    }
}
     
```


