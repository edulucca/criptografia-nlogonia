
<h1 align="center">
<br>
Cifra da Nlogônia 
</h1>

<p align="center">Algoritmo de encriptação do desafio proposto pela <b>Olímpiada Brasileira de Informática</b> de 2021, Fase 1</p>

<p align="center">
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License MIT">
  </a>
</p>

<p>
                        O rei da Nlogônia ordenou que todos os documentos importantes sejam
                        "cifrados", para que apenas quem tem conhecimento da cifra
                        possa lê-los (<i>cifrar</i> um documento significa alterar
                        o original modificando as letras de acordo com algum algoritmo
                        de cifra).
                    </p>
                    <p>
                        O rei decretou que o seguinte algoritmo deve ser usado para
                        cifrar os documentos:
                    </p>
                    <ul>
                        <li> Cada consoante deve ser substituída por exatamente três
                            letras, na seguinte ordem:
                            <ol>
                                <li> a própria consoante (vamos chamar de <i>consoante original</i>);
                                </li>
                                <li> a vogal mais próxima da consoante original no alfabeto, com a
                                    regra adicional de que se a consoante original está à mesma distância
                                    de duas vogais, então a vogal mais próxima do início do alfabeto
                                    é usada. Por exemplo,
                                    se a consoante original é <i>d</i>, a vogal que deve ser usada é <i>e</i>,
                                    pois esta é a vogal mais próxima; se a consoante original é <i>c</i>,
                                    a vogal que deve ser utilizada é <i>a</i>, porque <i>c</i> está
                                    à mesma distância de <i>a</i> e <i>e</i>, e <i>a</i> é mais
                                    próxima do início do alfabeto.
                                </li>
                                <li> a consoante que segue a consoante original, na ordem
                                    do início ao fim do alfabeto. Por exemplo, se a consoante
                                    original é <i>d</i>, a consoante a ser utilizada é <i>f</i>.
                                    No caso de a consoante original ser <i>z</i>, deve ser utilizada
                                    a própria letra <i>z</i>.
                                </li>
                            </ol>
                        </li>
                        <li> As vogais não são modificadas.
                        </li>
                    </ul>
<hr/>

<div>
  <h3>Execução 🏁</h3>
  <img src="https://s7.gifyu.com/images/eclipse-workspace---PoliciaFederal_src_cifraNlogonia_Criptografia.java---Eclipse-IDE-2022-03-05-12-53-38_Trim.gif" alt="programa em execução" border="0" height="325"/>
</div>

<hr />

## Linguagens

- **Java** - Todo o código foi desenvolvido em Java

## License

This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/licenses/MIT) page for details.
