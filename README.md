# Exercícios de Programação em Java

## Conteúdo

1. [Lógica](#lógica)
1. [Algoritmo](#algoritmo)
1. [Estrutura sequencial](#estrutura-sequencial)
1. [Estrutura de decisão](#estrutura-de-decisão)
    1. [Estrutura condicional](#estrutura-condicional)
1. [Estrutura de repetição](#estrutura-de-repetição)
1. [_Strings_](#strings)
1. [Vetores e coleções](#vetores-e-coleções)
1. [Matrizes](#matrizes)
1. [Funções](#funções)
    1. [Funções recursivas](#funções-recursivas)
1. [Programação concorrente](#programação-concorrente)
1. [NoSQL Chave-Valor](#nosql-chave-valor)
1. [NoSQL Documento](#nosql-documento)
    1. [ODM](#nosql-documento-odm)
1. [Filmes](#filmes)
1. [Livros](#livros)
1. [Palestras](#palestras)
1. [Agradecimentos](#agradecimentos)
1. [Informações legais](#informações-legais)

## Lógica

1. Um homem precisa atravessar um rio com um barco que possui capacidade de transportar apenas ele e mais uma de suas
   três cargas, que são: um lobo, uma ovelha e um kilo de couve. Quais os passos que o homem deve fazer para conseguir
   atravessar o rio sem perder as suas cargas?
   [link racha-cuca](https://rachacuca.com.br/jogos/o-lobo-e-a-ovelha/)

1. Três jesuítas e três canibais precisam atravessar um rio. No entanto, dispõem apenas de um barco com capacidade para
   duas pessoas. Por medida de segurança não se permite que em alguma das margens do rio a quantidade de jesuítas seja
   inferior à quantidade de canibais. Qual a sequência de viagens necessárias para a travessia do rio com segurança para
   os jesuítas?
   [link racha-cuca](https://rachacuca.com.br/jogos/missionarios-e-canibais/)

1. Para comemorar o aniversário de Cláudio, ele e mais quatro amigos – Alberto, Beto, Dino e Eurico – foram almoçar
   juntos no restaurante da escola. As mesas são redondas e acomodam exatamente cinco pessoas. Cláudio e Dino sentam-se
   um ao lado do outro. Alberto e Beto não se sentam um ao lado do outro. Os dois amigos sentados ao lado de Eurico são:
    - Alberto e Beto
    - Cláudio e Dino
    - Dino e Beto
    - Cláudio e Alberto
    - Alberto e Dino

1. Uma equipe de meninas está participando de uma gincana preparada pelos professores da escola. Após muitas peripécias,
   elas finalmente encontraram o cofre escondido que contém a última tarefa a ser resolvida. Mas o cofre está protegido
   com um cadeado digital aberto somente se uma senha de quatro letras for digitada. Junto ao cofre elas encontraram
   também um pedaço de papel com as letras Xkzk. Inicialmente elas pensaram que essa era a senha, mas o cofre não abriu.
   No entanto, elas tinham certeza de que as quatro letras encontradas eram a chave para o enigma. Após pensar um pouco
   elas perceberam que os nomes das cinco meninas da equipe tinham exatamente quatro letras. Seria essa a ligação com as
   letras encontradas? Não demorou muito para elas abrirem o cofre, pois a senha era mesmo o nome de uma das meninas.
   Qual era a senha do cofre?
    - Anna
    - Lisa
    - Nina
    - Iris
    - Nara

1. Um palíndrome é um número inteiro positivo, sem zeros à esquerda, que é o mesmo se lido da esquerda para a direita ou
   da direita para a esquerda. Por exemplo, os números 11 e 65256 são palíndromes, mas os números 010 e 123 não são. A
   diferença entre o valor do maior palíndrome de três dígitos e o menor palíndrome de três dígitos é:
    - 989
    - 888
    - 898
    - 998
    - 979

1. Na Nlogônia, as cédulas de dinheiro são de $ 1,00, $ 3,00, $ 9,00, $ 27,00, e $ 81,00. Num dado momento, um vendedor
   possui apenas cinco cédulas, uma de cada um dos valores das cédulas existentes na Nlogônia. Qual dos valores abaixo
   não é possível ser dado como troco por esse vendedor?
    - $40,00
    - $35,00
    - $31,00
    - $13,00
    - $4,00

1. . Em uma sala há duas lousas (quadros negros), a lousa A e a lousa B. Na lousa A foi escrito o número 7 e na lousa B
   foi escrito o número 13. Após isso, um aluno entrou na sala, apagou o número da lousa B e em seu lugar escreveu um
   número igual ao número escrito na lousa A. Depois disso, outro aluno entrou na sala, apagou o número da lousa A e em
   seu lugar escreveu um número igual ao número atualmente escrito na lousa B. Depois dessas mudanças, quais são os
   números escritos nas
   lousas?
    - 13 na lousa A e 7 na lousa B
    - 7 na lousa A e 13 na lousa B
    - 7 na lousa A e 7 na lousa B
    - 13 na lousa A e 13 na lousa B
    - 20 na lousa A e 6 na lousa B

1. Maria tinha alguns biscoitos. Ela comeu dois e deu dois à irmã. Depois deu metade do que sobrou ao irmão. Se o irmão
   ficou com 5 biscoitos, quantos tinha Maria no início?

1. Uma pessoa lê um livro de 100 páginas em 6 dias. Em quantos dias essa pessoa lê um livro de 150 páginas?

1. Lúcia foi ao mesmo tempo, a décima terceira melhor classificada e a décima terceira pior classificada de um concurso.
   Quantos eram os concorrentes?

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

   66, 59, 52, 45, 38, ??
    - 32
    - 35
    - 31
    - 41
    - 43

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

   102, 103, 105, 108, ??
    - 109
    - 114
    - 106
    - 111
    - 112

1. Ao observar a sequência de números abaixo, descubra qual das opções completa a série.

   50, 5, 40, 10, 30, ??
    - 35
    - 20
    - 25
    - 15
    - 37

1. Para A = V, B = V e C = F, qual o resultado da avaliação das seguintes expressões lógicas:
    1. A or C and not B
    1. (A or B) and (A and C)

1. Há cinco casas diferentes em cinco cores diferentes em uma fileira. Em cada casa mora uma pessoa com uma diferente
   nacionalidade. Os cinco proprietários bebem um certo tipo de bebida, fuma cigarro de uma certa marca e tem um certo
   tipo de animal de estimação. Nenhum dos proprietários tem o mesmo tipo de animal ou de marca de cigarro, ou de
   bebida. Quem é o dono do peixe? [link racha-cuca](https://rachacuca.com.br/logica/problemas/teste-de-einstein/)
    1. O britânico mora na casa vermelha
    1. O suíço tem um cão como animal de estimação
    1. O dinamarquês bebe chá
    1. A casa verde fica imediatamente à esquerda da casa branca
    1. O dono da casa verde bebe café
    1. O proprietário que fuma _Pall Mall_ tem um pássaro
    1. O dono da casa amarela fuma _Dunhill_
    1. O proprietário morando na casa do centro bebe leite
    1. O norueguês mora na primeira casa
    1. O dono que fuma Blends mora ao lado do que cria gatos
    1. O proprietário que cria um cavalo mora ao lado do que fuma _Dunhill_
    1. O dono que fuma _Bluemasters_ bebe cerveja
    1. O alemão fuma _Prince_
    1. O norueguês mora ao lado da casa azul
    1. O proprietário que fuma _Blends_ mora ao lado do que bebe água

## Algoritmo

1. Escreva um algoritmo, passo a passo, para trocar um pneu furado.

## Estrutura sequencial

1. Faça um programa que imprima a mensagem "Alo mundo" na tela.

1. Faça um programa que peça as 4 notas bimestrais, calcule e imprima a média.

1. Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considerar que a média
   é ponderada e que o peso das notas é 2, 3 e 5.

   $mediafinal = \frac{n1 \times 2 + n2 \times 3 + n3 \times 5}{10}$

1. Faça um programa para calcular a área de uma circunferência, considerando a fórmula $area = \pi \times raio^2$.
   Utilize as variáveis `area` e `raio`, a constante &pi; (&pi; = 3,14159) e os operadores aritméticos de multiplicação.

1. Faça um programa que peça dois números, base e expoente, calcule e imprima o primeiro número elevado ao segundo
   número. Utilize a função de potência da linguagem.

1. Faça um programa que:
    1. Leia o nome;
    1. Leia o sobrenome;
    1. Concatene o nome com o sobrenome;
    1. Apresente o nome completo.

1. Faça um programa que leia uma temperatura em graus _Celsius_ e apresente-a convertida em graus _Fahrenheit_. A
   fórmula de conversão é: $^\circ F = \frac{^\circ C \times 9}{5} + 32$, na qual &#8457; é a temperatura em
   _Fahrenheit_ e &#8451; é a temperatura em _Celsius_.

1. Faça um programa que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que
   faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
   durante ela. Desta forma, será possível obter a distância percorrida com a
   fórmula $Distancia = Tempo \times Velocidade$. Tendo o valor da distância, basta calcular a quantidade de litros de
   combustível utilizada na viagem com a fórmula: $LitrosUsados = \frac{Distancia}{12}$. O programa deve apresentar os
   valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na
   viagem.

1. Faça um programa que leia os valores de _Comprimento_, _Largura_ e _Altura_ e apresente o valor do volume de uma
   caixa retangular. Utilize para o cálculo a fórmula $Volume = Comprimento \times Largura \times Altura$.

1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
   expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até
   hoje.

1. Faça um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um determinado cômodo de uma
   residência. Dados de entrada: a potência da lâmpada utilizada (em watts), as dimensões (largura e comprimento, em
   metros) do cômodo. Considere que a potência necessária é de 18 watts por metro quadrado.

1. Faça um programa que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. A seguir (utilizando
   apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em A passe para B e
   vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

1. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
   pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em
   latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
   preço total.

1. Considere a seguinte situação: Descontam-se inicialmente 10% do salário bruto do trabalhador como contribuição à
   previdência social. Após esse desconto, há outro desconto de 5% sobre o valor restante do salário bruto, a título
   de imposto de renda. Faça um programa que leia o salário bruto de um cidadão e imprima o seu salário líquido.

## Estrutura de decisão

1. Faça um programa que peça dois números e imprima o maior deles.

1. Faça um programa que leia três números e imprima o maior deles.

1. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,10 se forem compradas pelo menos 12
   unidades. Escreva um programa que leia o número de maçãs compradas, calcule e imprima o custo total da compra.

1. Faça um programa para aprovar empréstimos bancários. O código deve pedir três informações: valor do empréstimo,
   número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor das parcelas represente no máximo 30% do
   salário do solicitante.

1. A empresa paga ao corretor uma comissão calculada conforme o valor de suas vendas. Se o valor da venda de um corretor
   for maior que R$ 50.000,00 a comissão será de 12% do valor vendido. Se o valor da venda do corretor estiver entre R$
   30.000,00 e R$ 50.000,00 (incluindo extremos) a comissão será de 9,5%. Em qualquer outro caso, a comissão será de 7%.
   Escreva um programa onde será informado nome do corretor e o valor da venda, após isto o programa irá calcular o
   valor da comissão.

1. Faça um programa onde serão informados as quatro notas do aluno. O programa irá então apresentar a média, se foi
   aprovado (nota &ge; 7) ou se ficou em exame. Caso o aluno ficou em exame, o programa irá então perguntar qual foi a
   nota do exame e então irá calcular a nova média (média anterior com a nota do exame) e informar se ele foi aprovado
   (nova média &ge; 5) ou se foi reprovado.

1. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá
   hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de
   horas trabalhadas em um mês, o salário por hora e imprima o salário total do funcionário, que deverá ser acrescido
   das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

1. Faça um programa que efetue a leitura de três valores numéricos representando os lados de um triângulo. O programa
   deverá verificar e informar se os lados fornecidos formam realmente um triângulo (cada lado é menor que a soma dos
   outros dois lados). Se esta condição for verdadeira, deverá ser indicado qual tipo de triângulo foi formado:
   isósceles (dois lados iguais e um diferente), escaleno (todos os lados diferentes) ou equilátero (todos os lados são
   iguais).

1. Faça um programa para uma empresa que decide dar um reajuste aos funcionários conforme os seguintes critérios:
    - 50% para aqueles que ganham menos do que três salários mínimos;
    - 20% para aqueles que ganham entre três até dez salários mínimos;
    - 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    - 10% para os demais funcionários.

1. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma $ax² + bx + c$. O programa deverá
   pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
    - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
      os demais valores, sendo encerrado;
    - Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;
    - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    - Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuário.

   Fórmula de _bhaskara_:

   $x = -b \pm \frac{\sqrt{b^2 - 4ac}}{2a}$

1. Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não
   bissexto. Regras para o cálculo dos anos bissextos:

    1. A cada 4 anos é ano bissexto.
    1. A cada 100 anos não é ano bissexto.
    1. A cada 400 anos é ano bissexto.
    1. Prevalecem as últimas regras sobre as primeiras

1. Um posto está vendendo combustíveis com a seguinte tabela de descontos. Escreva um programa que leia o número de
   litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o
   valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$
   2,90.
    <table border="1" align="center">
        <tr>
            <th rowspan="2" align="center">Álcool</th>
            <td>Até 20 litros, desconto de 3% por litro</td>
        </tr>
        <tr>
            <td>Acima de 20 litros, desconto de 5% por litro</td>
        </tr>
        <tr>
            <th rowspan="2" align="center">Gasolina</th>
            <td>Até 20 litros, desconto de 4% por litro</td>
        </tr>
        <tr>
            <td>Acima de 20 litros, desconto de 6% por litro</td>
        </tr>
    </table>

1. Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o cliente comprar mais de 8 kg em frutas ou o
   valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo
   para ler a quantidade (em kg) de morangos e a quantidade (em kg) de maças adquiridas e imprima o valor a ser pago
   pelo cliente.
    <table border="1" align="center">
        <tr>
            <td></td>
            <th>Até 5Kg</th>
            <th>Acima de 5kg</th>
        </tr>
        <tr>
            <th>Morango</th>
            <td>R$ 2,50 / kg</td>
            <td>R$ 2,20 / kg</td>
        </tr>
        <tr>
            <th>Maçã</th>
            <td>R$ 1,80 / kg</td>
            <td>R$ 1,50 / kg</td>
        </tr>
    </table>

### Estrutura Condicional

1. Faça um programa que leia a primeira letra do estado civil de uma pessoa e mostre uma mensagem com a sua descrição
   (Solteiro, Casado, Viúvo, Divorciado, dEsquitado). Mostre uma mensagem de erro caso for informado um código inválido.

1. Faça um programa que leia dois valores do usuário e a operação que ele deseja executar (Operações: (+) soma, (-)
   subtração, (/) divisão, (*) multiplicação). Execute a operação desejada e imprima na tela.

1. Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. Faça um programa que calcule
   o valor total a ser pago por uma pessoa. O programa deverá ler o valor total da compra efetuada e um código que
   identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).

## Estrutura de repetição

1. Faça um programa que calcule a soma dos números inteiros de 1 a 100.

1. Escreva um programa que pergunte ao usuário um número e após, imprima na tela o total de 1 até o número lido.
   Exemplo: 5: $1 + 2 + 3 + 4 + 5 = 15$

1. Faça um programa que peça dois números, base e expoente, calcule e imprima o primeiro número elevado ao segundo
   número. **Não utilize a função de potência da linguagem**.

1. Construa um programa que exiba a tabuada de 1 até N, onde N é informado pelo usuário. ex: Até a tabuada de 3, irá
   imprimir as tabuadas de 1, 2 e 3.

1. Faça um programa para calcular e imprimir a soma dos cubos dos números pares compreendidos entre A e B (B &gt; A). A
   e B são lidos pelo teclado.

1. Faça um programa que receba um valor depositado na poupança e exiba o valor com rendimento mês a mês durante o
   período de um ano. Considere fixo os juros da poupança em 0,5% a. m.

1. Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Faça um programa que peça um número inteiro
   ao usuário e determine se o número informado é primo ou não.

1. Faça um programa que calcule o resultado dos 50 primeiros números da seguinte sequência:

   $\frac{1000}{1} - \frac{997}{2} + \frac{994}{3} - \frac{991}{4} + \dots$

1. Faça um programa para calcular e imprimir a seguinte equação:

   $37 \times \frac{38}{1} + 38 \times \frac{36}{2} + 35 \times \frac{36}{3} + \dots + 1 \times \frac{2}{37}$

1. Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10m e cresce 3 centímetros por ano.
   Construa um programa que calcule e apresente quantos anos serão necessários para que Felisberto seja maior que
   Anacleto.

1. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas,
   faça um programa que determine o tempo necessário para que essa massa se torne menor que 0,05 gramas.

1. Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que
   a população de B, seja 200.000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa que calcule e imprima
   o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
   taxas de crescimento.

1. Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de
   alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de
   xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros
   subsequentes, o dobro do quadro anterior. Crie um programa para calcular o total de grãos que o monge recebeu.

1. Escreva um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número
   do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido
   conforme a seguir:

   $N! = 1 \times 2 \times 3 \times 4 \times \dots \times (N - 1) \times N$

1. Faça um programa que peça para o usuário ir informando números até que ele informe 0 (zero). Após isto apresente os
   seguintes dados sobre os números digitados:
    1. O maior número;
    1. O menor número;
    1. A soma dos números;
    1. A média deles;
    1. A quantidade de números pares;
    1. A quantidade de números ímpares.

1. Leia um número positivo do usuário, então, calcule e imprima a sequência Fibonacci (onde cada número é a soma dos
   dois anteriores) até o primeiro número superior ao número lido. Exemplo: se o usuário informou o número 30, a
   sequência a ser impressa será 0 1 1 2 3 5 8 13 21 34.

1. Faça um programa que peça ao usuário pensar em um número de 1 a 1000, o programa então tentará adivinhar o número
   pensando. A cada _chute_ que o programa der, o usuário deverá responder se ele acertou, se o valor foi acima ou
   abaixo do pensado. Caso o programa acerte em até 10 tentativas, o programa será considerado vitorioso.

1. O seguinte programa em Java&trade; não está funcionando e lhe foi pedido para ser corrigido. Apenas olhando o
   código, qual foi o erro de programação?

   ```java
   public class Exercicio18 {
       static void main() {
           Scanner input = new Scanner(System.in);
           int cont1 = 0;
           int cont2 = 0;
           int brancos = 0;
           int nulos = 0;
           int voto = input.nextInt();
           while (voto != -1) {
               switch (voto) {
                   case 1 -> cont1 += 1;
                   case 2 -> cont2 += 1;
                   case 0 -> brancos += 1;
                   default -> nulos += 1;
               }
           }
           System.out.println(cont1);
           System.out.println(cont2);
           System.out.println(brancos);
           System.out.println(nulos);
           input.close();
       }
   }
   ```

## _Strings_

1. Faça um programa que permita ao usuário digitar o seu nome e em seguida imprima o nome do usuário de trás para frente
   utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas
   ou minúsculas.

1. Dado uma _string_ com uma frase informada pelo usuário (incluindo espaços em branco), conte:
    1. quantos espaços em branco existem na frase.
    1. quantas vezes aparecem as vogais a, e, i, o, u.

1. Leia um código de cinco algarismos (variável Codigo) e gere o digito verificador (DigitoV) módulo 7 para o mesmo.
   Supondo que os cinco algarismos do código são ABCDE, uma forma de calcular o dígito desejado, com módulo 7 é:

   DigitoV = resto da divisão de S por 7, onde $S = 6A + 5B + 4C + 3D + 2E$

1. Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável inteira), imprima
   cada um dos seus dígitos por extenso.
   Exemplo:

    ```text
    Entre o número: 4571
    Resultado: quatro, cinco, sete, um
    ```

1. _Leet_ é uma forma de se escrever o alfabeto latino usando outros símbolos em lugar das letras, como números, por
   exemplo. A própria palavra _leet_ admite muitas variações, como l33t ou 1337. O uso do _leet_ reflete uma subcultura
   relacionada ao mundo dos jogos de computador e internet, sendo muito usada para confundir os iniciantes e afirmar-se
   como parte de um grupo. Pesquise sobre as principais formas de traduzir as letras. Depois, faça um programa que peça
   um texto e transforme-o para a grafia _leet speak_.

1. Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais. As iniciais são formadas
   pela primeira letra de cada nome, sendo que todas deverão aparecer em maiúsculas na saída do programa. Note que os
   conectores e, do, da, dos, das, de, di, du não são considerados nomes e, portanto, não devem ser considerados para a
   obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome seja entrado todo em
   minúsculas.

   Exemplos:

    ```text
    Maria das Graças Pimenta -> MGP
    João Carlos dos Santos -> JCS
    ```

1. Faça um programa que peça ao usuário duas _strings_ diferentes, verifique então se elas são anagramas, ou seja, tem o
   mesmo conjunto de letras.

1. Dado uma frase informada pelo usuário, converta as letras minúsculas em maiúsculas e vice-versa.

   Exemplo:

    ```text
    Entrada: PalAVra
    saída:   pALavRA
    ```

## Vetores e coleções

1. Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor dos valores armazenados em um vetor A de
   100 elementos numéricos a serem lidos do dispositivo de entrada padrão.

1. Faça um programa que copie o conteúdo de um vetor em um segundo vetor.

1. Faça um programa que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor.

1. Faça um programa para ler dois vetores V1 e V2 de 15 números cada. Calcular e imprimir a quantidade de vezes que V1 e
   V2 possuem os mesmos números e nas mesmas posições.

1. Faça um programa que defina dois vetores A = [2, 4, 7, 13, 14, 15, 16] e B = [1, 6, 7, 11, 13, 16, 18] e faça as
   seguintes operações de conjuntos:
    - A &bigcup; B: União (todos os valores de ambos os vetores)
    - A &bigcap; B: Intersecção (apenas valores que existam em ambos)
    - A &minus; B: Diferença (apenas valores que não apareçam simultaneamente em ambos conjuntos)

1. Escrever um programa que lê um vetor com 20 números inteiros e os imprime na tela. Troque, a seguir, o 1&ordm;
   elemento com o último, o 2&ordm; com o penúltimo, etc. até o 10&ordm; com o 11&ordm; e imprima na tela o vetor N
   assim modificado.

1. Ler 100 números de matrículas de alunos e armazenar em um vetor. Esses números são distintos, ou seja, não existem
   números de matrículas iguais. Caso o usuário informa um número de matrículo que já existe, o programa deverá emitir
   um alerta.

1. Faça um programa que leia um vetor com N elementos formados por valores do tipo inteiro. Crie então dois novos
   vetores, um com os valores pares e outro com os valores ímpares do vetor original.

1. Faça um programa que:
    1. Leia um vetor A com N elementos já ordenados e um vetor B com M elementos também já ordenados.
    1. Intercale os dois vetores A e B, formando um vetor C, sendo que ao final do processo de intercalação, o vetor C
       continue ordenado. Nenhum outro processo de ordenação poderá ser utilizado além da intercalação dos vetores A e
       B.
    1. Caso um vetor (A ou B) termine antes do outro, o vetor C deverá ser preenchido com os elementos do vetor que
       ainda possui informações.

1. Uma escola de samba recebeu como pontos pela alegoria os seguintes 5 valores inclusos no vetor Notas. Lembrando que a
   nota mais alta e a nota mais baixa são descartadas. Faça um programa que calcule a média final do quesito.

    ```python
    Notas = [9.9, 9.7, 9.8, 10, 10]
    ```

1. Dadas duas sequências com _n_ números inteiros entre 0 e 9, interpretadas como dois números inteiros de _n_
   algarismos, calcular a sequência de números que representa a soma dos dois inteiros.

    ```text
      1  8  2  4  3  4  2  5  1
    +    3  3  7  5  2  3  3  7
      -------------------------
      2  1  6  1  8  6  5  8  8
    ```

## Matrizes

1. Faça um programa para ler e imprimir uma matriz 2 &times; 4 de números inteiros.

1. Dada a seguinte matriz A, calcule:
    1. A soma dos elementos da primeira coluna;
    1. O produto dos elementos da primeira linha;
    1. A soma de todos os elementos;
    1. O produto da diagonal principal.

    ```math
    A = \begin{bmatrix}
    1 & 2 & 3 & 4 \\
    5 & 6 & 7 & 8 \\
    9 & 10 & 11 & 12 \\
    13 & 14 & 15 & 16
    \end{bmatrix}
    ```

1. Dada as matrizes A e B determine A + B.

    ```math
    A = \begin{bmatrix}
    -10 & 4 & 1 & 6 \\
    2 & 3 & 2 & 8
    \end{bmatrix}
    B = \begin{bmatrix}
    1 & 8 & 4 & -1 \\
    0 & 6 & 3 & -3
    \end{bmatrix}
    ```

1. Faça um programa que dada a matriz A, gere a matriz oposta -A. Matriz oposta possui valores que se somados à matriz
   original, gera uma matriz com valores zerados.

    ```math
    A = \begin{bmatrix}
    2 & -3 \\
    -1 & 4
    \end{bmatrix}
    ```

1. Faça um programa que dada a seguinte matriz A, gere a matriz transposta dela A<sup>t</sup>. Matriz transposta é a que
   se obtém trocando-se ordenadamente as linhas pelas colunas.

    ```math
    A = \begin{bmatrix}
    -7 & 8 \\
    4 & 9 \\
    2 & 1
    \end{bmatrix}
    A^t = \begin{bmatrix}
    -7 & 4 & 2 \\
    8 & 9 & 1
    \end{bmatrix}
    ```

1. Dada as matrizes A e B determine A &times; B.

    ```math
    A = \begin{bmatrix}
    2 & 3 & 1 \\
    -1 & 0 & 2
    \end{bmatrix}
    B = \begin{bmatrix}
    1 & -2 \\
    0 & 5 \\
    4 & 1
    \end{bmatrix}
    ```

1. Matriz identidade é a matriz quadrada de ordem N (2&times;2, 3&times;3, 4&times;4, ... N&times;N), em que os
   elementos da diagonal principal são iguais a 1 e, o restante dos elementos são iguais a 0.

   Faça um programa que peça ao usuário informar o tamanho da ordem e gere a matriz identidade.

1. Dada a seguinte matriz 3x3, faça um programa que:

    ```math
    \begin{bmatrix}1&2&3\\4&5&6\\7&8&9\end{bmatrix}
    ```

    1. Apresente a matriz rotacionada em 90&deg;:

       ```math
       \begin{bmatrix}7&4&1\\8&5&2\\9&6&3\end{bmatrix}
       ```

    1. Apresente a matriz rotacionada em 180&deg;:

        ```math
        \begin{bmatrix}9&8&7\\6&5&4\\3&2&1\end{bmatrix}
       ```

    1. Apresente a matriz rotacionada em 270&deg;:

       ```math
       \begin{bmatrix}3&6&9\\2&5&8\\1&4&7\end{bmatrix}
       ```

1. O tempo que um determinado avião dispensa para percorrer o trecho entre duas localidades distintas está disponível
   através da seguinte tabela:

   |       |  1 |  2 |  3 |  4 |  5 |  6 |  7 |
   |------:|---:|---:|---:|---:|---:|---:|---:|
   | **1** |    |  2 | 11 |  6 | 15 | 11 |  1 |
   | **2** |  2 |    |  7 | 12 |  4 |  2 | 15 |
   | **3** | 11 |  7 |    | 11 |  8 | 31 |  3 |
   | **4** |  6 | 12 | 11 |    | 10 |  2 |  1 |
   | **5** | 15 |  4 |  8 | 10 |    |  5 | 13 |
   | **6** | 11 |  2 |  3 |  2 |  5 |    | 14 |
   | **7** |  1 | 15 | 13 |  1 | 13 | 14 |    |

    1. Faça um programa que leia a matriz anterior e informe ao usuário o tempo necessário para percorrer duas cidades
       por ele fornecidas;
    1. Faça um programa que permita ao usuário informa várias cidades e as armazene no vetor de rota até que ele informe
       0 (zero), após isto imprima o tempo total para cumprir todo o trajeto fornecido passando por todas as cidades.

1. Implemente um programa que exiba um triângulo de Pascal (Tartalha) de ordem n, sendo n informado pelo usuário. Para
   tal, considere uma matriz quadrada de ordem n, o triângulo de Pascal segue a seguinte regra de formação:
    1. todos os elementos da primeira coluna da matriz são iguais a 1;
    1. todos os elementos da diagonal principal da matriz também são iguais a 1;
    1. para os demais elementos são obtidos pela soma do elemento da mesma coluna na linha de cima com o seu vizinho
       esquerdo;
    1. os elementos acima da diagonal principal não são exibidos.

   ex: Triângulo de Pascal de ordem 7:

    ```math
    \begin{matrix}
    1 \\
    1 & 1 \\
    1 & 2 & 1 \\
    1 & 3 & 3 & 1 \\
    1 & 4 & 6 & 4 & 1 \\
    1 & 5 & 10 & 10 & 5 & 1 \\
    1 & 6 & 15 & 20 & 15 & 6 & 1
    \end{matrix}
    ```

## Funções

1. Crie uma função que receba duas palavras e retorne _True_ caso a primeira palavra seja um prefixo da segunda.

1. Crie uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

1. Crie uma função que uma quantidade variável de argumentos, e que forneça a soma desses argumentos.

1. Faça um programa com duas funções, uma que recebe uma temperatura em _Fahrenheit_ e retorna em _Celcius_ e outra que
   faz o inverso. Lembrando que as fórmulas são:

   $^\circ C = \frac{ (^\circ F - 32) \times 5}{9}$

   $^\circ F = \frac{^\circ C \times 9}{5} + 32$

1. Crie uma função que receba como parâmetro um inteiro positivo ano e devolve verdadeiro ou falso se ano for bissexto
   ou não. Anos bissextos ocorrem a cada quatro anos exceto anos múltiplos de 100 que não são múltiplos de 400.

1. Crie uma função que receba o comprimento de cada um dos três lados de um triângulo e retorne se esse triângulo é
   isósceles (dois lados iguais e um diferente), escaleno (todos os lados diferentes), equilátero (todos os lados são
   iguais) ou se não é um triangulo (algum lado é maior que a soma dos outros dois lados).

1. Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Crie uma função que retorne verdadeiro ou
   falso se o número passado é primo ou não.

### Funções recursivas

1. Crie uma função recursiva que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.

1. Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.

1. O máximo divisor comum (MDC) dos inteiros x e y é o maior número inteiro que é divisor de ambos x e y. Escreva o
   algoritmo de Euclides por uma função recursiva MDC, que retorna o máximo divisor comum de x e y. O MDC de x e y é
   definido como segue:

    - se y é igual a 0, então mdc (x, y) é x;
    - caso contrário, mdc (x, y) é mdc (y, x mod y), onde mod é o operador módulo (resto).

1. Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta
   sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

1. Faça uma função recursiva que retorne a inversão de uma _String_ passada como parâmetro. Ex: teste &rarr; etset

1. **Torres de Hanói** é um jogo matemático onde dispomos de 3 pinos: _pino origem_, _pino de trabalho_ e _pino
   destino_. O _pino origem_ contém n discos empilhados por ordem crescente de tamanho (o maior disco fica embaixo). O
   objetivo do jogo é levar todos os discos do _pino origem_ para o _pino destino_, utilizando o _pino de trabalho_ para
   auxiliar a tarefa, e atendendo às seguintes restrições:
    1. Apenas um disco pode ser movido por vez (o disco que estiver no topo da pilha de um dos pinos).
    2. Um disco de tamanho maior nunca pode ser colocado sobre um disco de tamanho menor.

   Faça um programa com função recursiva que resolve o jogo das Torres de Hanoi.

## Programação concorrente

1. Faça um programa concorrente que crie 10 _threads_ que exibam o nome da _thread_ e a hora atual.

1. Faça um programa concorrente que crie 10 _threads_ que exibam o nome da _thread_ e um contador que varia de 1 a 10.
   Execute várias vezes e observe as variações na saída. Os valores são sempre impressos na mesma ordem? Qual a causa
   desta diferença?

1. Faça um programa que gere um array de 1 bilhão de números inteiros aleatórios e faça as seguintes tarefas:
    1. Some todos os valores de forma sequencial e meça o tempo de execução;
    1. Some todos os valores de forma concorrente com 10 _threads_ e meça o tempo de execução;
    1. Some todos os valores de forma concorrente com 100 _threads_ e meça o tempo de execução.
    1. Some todos os valores de forma concorrente com a quantidade de _threads_ igual à quantidade de núcleos no sistema
       operacional e meça o tempo de execução.
    1. Responda as seguintes perguntas:
        1. Qual foi o _speedup_[^1] obtido?
        1. Teve algum caso que o _speedup_ foi negativo?
    1. Repita os testes acima usando _Threads_ virtuais.
        1. Houve diferenças entre _Threads_ de plataforma e _Threads_ virtuais? Se houve, quais foram e explique o
           porquê das diferenças.

1. Faça um programa que crie uma lista (_ArrayList_) e manipule ela com as seguintes _threads_:
    - Duas _threads_ incluindo valores aleatórios na lista.
    - Uma _thread_ removendo o primeiro valor da lista.
    - Uma _thread_ imprimindo a cada segundo os valores existentes.

1. O banco Firmeza desenvolveu um sistema de contas e saldos bancários e lhe contratou para executar um teste de
   desempenho para avaliar a robusteza e a quantidade de transações possíveis de serem processadas por 3 minutos. Para
   avaliar a desempenho do sistema foram criadas 100 contas correntes fictícias com
   R$ 1.000,00 de saldo inicial. Crie então um teste com programação concorrente que simule 5 sistemas fazendo transferências de valores aleatórios de até R$
   2.500,00 de uma conta aleatória para outra igualmente aleatória. A cada 5 segundos, imprima o valor total no cofre do
   banco, que deverá ser sempre de
   R$ 100.000,00. Após 3 minutos de execução, verifique a quantidade de transações que foram executadas e se o valor total no cofre continua sendo R$
   100.000,00.

1. Reescreva o exercício 3
   usando [Executors](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/concurrent/package-summary.html#executors-heading).
   Faça os testes com 10 e 100 _Threads_ usando os _Executors_ abaixo listados. Explique o funcionamento de cada
   _Executor_ e o motivo da diferença nos tempos recebidos.
    - _ThreadPerTaskExecutor_
    - _VirtualThreadPerTaskExecutor_
    - _CachedThreadPool_
    - _WorkStealingPool_

1. Em uma cozinha, existe uma pilha de 100 pratos sujos. Para tal, temos uma pessoa lavando pratos e duas secando os
   pratos. Entre eles, existe um escorredor com espaço para apenas 10 pratos. Faça um programa que simule a lavação dos
   100 pratos sujos, sua colocação no escorredor e a secagem destes. Após enxugar cada prato, ele será colocado na pilha
   de pratos limpos.

1. Descubra qual a quantidade de _Threads_ que o seu sistema consegue criar. Para isso, fique criando _Threads_ de
   plataforma e "estacione" elas com o método _park ()_ da classe _LockSupport_.

1. Observe o programa a seguir, e diga o motivo do valor de saída no console às vezes não ser 2000. Qual seria a
   correção?

```java
public class Exercicio09 {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    static void main() throws Exception {
        Exercicio09 contador = new Exercicio09();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(contador.getCount());
    }
}
```

## NoSQL Chave-Valor

1. Faça um programa que conecte numa base [Redis&reg;](https://redis.io/) e chame as funções `Ping` e `Echo`. Utilize a
   linguagem [Java&trade;](https://www.java.com/) com a biblioteca [Jedis](https://github.com/redis/jedis).

1. Crie 10 entradas chave-valor aleatórios e em seguida acesse o banco Redis com algum programa GUI
   ([RedisInsight](https://redis.io/insight/), [Another Redis Desktop Manager](https://goanother.com/)
   ou [Redis for VS Code](https://marketplace.visualstudio.com/items?itemName=Redis.redis-for-vscode)) e verifique se as
   chaves foram criadas. Depois volte ao programa e liste as chaves e seus respectivos valores.

1. Crie uma chave inteira com o nome "programa:execucoes" e a cada chamada do programa execute a função `Incr`.
   Verifique pela GUI se o valor está sendo incrementado.

1. Salve na base de dados uma lista de 10 usuários usando o tipo de dado `List`.

1. Salve na base de dados uma lista de 10 usuários usando o tipo de dado `Set`.

1. Salve na base de dados uma lista de 10 usuários usando o tipo de dado `Sorted Set`.

1. Crie a classe Pessoa, com os atributos mais comuns (id, nome, telefone, etc), e após isto crie uma classe PessoaDAO
   que implemente as operações básicas de C.R.U.D.[^2] para fazerem a persistência dos objetos na base chave-valor
   usando o tipo _Hash_ de dados. A chave da coleção _hash_ será "contatos1:" mais o id da pessoa. Ex: `contatos:1`,
   `contatos:2`

1. Crie a classe Pessoa, com os atributos mais comuns (id, nome, telefone, etc), e após isto crie uma classe PessoaDAO
   que implemente as operações básicas de C.R.U.D.[^2] para fazerem a persistência dos objetos na base chave-valor
   usando do mecanismo de serialização do Java&trade;. Neste exercício será usada a mesma estratégia de chaves do
   exercício anterior, ou seja, chave "contatos2:" + o id da pessoa.

1. Crie a classe Pessoa, com os atributos mais comuns (id, nome, telefone, etc), e após isto crie uma classe PessoaDAO
   que implemente as operações básicas de C.R.U.D.[^2] para fazerem a persistência dos objetos na base chave-valor
   usando do mecanismo de serialização do Java&trade;. Neste exercício será usado uma entrada _Hash_ somente. Cada valor
   interno do _Hash_ terá o id da pessoa como chave e a objeto serializado como valor.

1. Crie a classe Pessoa, com os atributos mais comuns (id, nome, telefone, etc), e após isto crie uma classe PessoaDAO
   que implemente as operações básicas de C.R.U.D.[^2] para fazerem a persistência dos objetos na base chave-valor
   usando o tipo de dados JSON[^4] através da biblioteca [GSON](https://github.com/google/gson) já incluída na
   biblioteca [Jedis](https://github.com/redis/jedis).
   Neste exercício será usada a mesma estratégia de chaves do exercício 8, ou seja, chave "contatos4:" + o id da pessoa.

1. Faça um programa que fique publicando (`Publish`) a cada 20 segundos um número aleatório no tópico
   `codigo:seguranca`. Faça um segundo programa que assine (`Subscribe`) a este mesmo tópico e que exiba os valores que
   vem sendo publicados.

## NoSQL Documento

1. Importe as bases de dados de exemplo
   do [airbnb](src/main/resources/mongodb/airbnb/), [mflix](src/main/resources/mongodb/mflix/)
   e [weather](src/main/resources/mongodb/weather/) e responda as seguintes perguntas sobre cada uma delas:
    1. Quantas coleções existem?
    1. Qual o tipo de dado usado para Id?
    1. Quais tipos de dados foram usados pelos campos no primeiro nível de cada documento?
    1. São aproximadamente quantos campos por documento?
    1. Existe "relacionamento" entre os documentos?
    1. Caso fosse usado um banco relacional, como ficaria o Modelo Entidade-Relacionamento.
    1. Existem dados geoespaciais? Se sim, como são armazenados?
    1. Cite vantagens e desvantagens do uso do modelo documento neste caso.

   > Dica: Use o comando `mongoimport --db=<nomedabase> <arquivo.json>`
   do [MongoDB&reg; Database Tools](https://www.mongodb.com/try/download/database-tools)

1. Com a base de dados do [mflix](src/main/resources/mongodb/mflix/) e faça os seguintes programas com a
   linguagem [Java&trade;](https://www.java.com/) e a
   biblioteca [MongoDB&reg; Synchronous Driver](https://www.mongodb.com/pt-br/docs/drivers/java/sync/current/):
    1. Liste os filmes com o nome "_The Room_".
    1. Liste os filmes que possuam uma duração ("_runtime_") menor ou igual à 15 minutos.
    1. Liste os filmes produzidos nos anos 1980s ordenados do maior ao menor valor no campo "_imdb.rating_".
    1. Liste os nomes e gêneros dos filmes que contenham, ao menos, ambos gêneros "_Drama_" e "_Comedy_".
    1. Liste, em ordem alfabética, os nomes e a quantidade de prêmios recebidos dos filmes que possuam mais de 3 prêmios
       ganhos.
    1. Insira o filme [O Triunfo dos Nerds](https://www.imdb.com/title/tt0115398).
    1. Insira o filme [Silicon Cowboys](http://www.imdb.com/title/tt4938484) e inclua dois comentários.
    1. Para os filmes lançados antes de 1950, inclua o gênero _old_.
1. Crie a classe Pessoa, com os atributos mais comuns (id, nome, telefone, etc) e com pelo menos 1 atributo composto
   (endereço contento rua, bairro, cep, tipo), e após isto crie uma classe PessoaDAO que implemente as operações básicas
   de C.R.U.D.[^2] para fazerem a persistência dos objetos na base documento usando o formato BSON[^3].

### NoSQL Documento ODM

1. Com o uso da biblioteca [Morphia](https://morphia.dev/), vamos criar uma aplicação C.R.U.D[^2]:
    1. Crie classes de modelo com a seguinte estrutura e com as anotações do _Morphia_:
        - Livro:
            - id
            - titulo
            - autor (_Referenced_)
            - ano
        - Autor
            - id
            - nome
            - livros (_Referenced_)
            - endereços (_Embedded_)
        - Endereço
            - rua
            - complemento
            - bairro
            - cep
            - tipo

       > Obs: A entidade Autor deverá possuir um índice único por nome e a entidade livro deverá possuir um índice único
       por título.

    1. Crie o livro [O Corvo](https://pt.wikipedia.org/wiki/O_Corvo) e o armazene na base do MongoDB&reg; e após isto
       crie os dados do autor Edgar Allan Poe, do seu endereço residencial, e do livro e o armazene.
    1. Busque o autor _Edgar Allan Poe_ e apresente todos os seus dados (endereços e livros).
    1. Adicione mais 2 livros escritos por este autor.
    1. Altere o nome do livro _O Corvo_ para _O Corvo e outros contos extraordinários_ através do comando
       `query update`.

## Filmes

Segue uma relação de filmes que abordam o tema da programação e/ou da importância da computação (ordem alfabética):

- [AlphaGo](http://www.imdb.com/title/tt6700846)
- [BlackBerry](https://www.imdb.com/title/tt21867434)
- [C0d3rs Championship](https://www.imdb.com/title/tt20850260)
- [Estrelas Além do Tempo](https://www.imdb.com/title/tt4846340)
- [Ex-Machina](https://www.imdb.com/title/tt0470752/)
- [Hello World](https://www.imdb.com/title/tt11590582)
- [Intermediário.com](http://www.imdb.com/title/tt1251757)
- [Jobs](http://www.imdb.com/title/tt2357129)
- [O Jogo da Imitação](http://www.imdb.com/title/tt2084970)
- [Jogos de Guerra](http://www.imdb.com/title/tt0086567)
- [Piratas do Vale do Silício](http://www.imdb.com/title/tt0168122)
- [A Rede Social](http://www.imdb.com/title/tt1285016)
- [Revolution OS](https://www.imdb.com/title/tt0308808/)
- [Silicon Cowboys](http://www.imdb.com/title/tt4938484)
- [Tetris](https://www.imdb.com/title/tt12758060/)
- [O Triunfo dos Nerds](https://www.imdb.com/title/tt0115398)
- [Y2K: Bomba-Relógio](https://www.imdb.com/title/tt26786629)

## Livros

Segue relação de livros recomendados (ordem alfabética):

- [A Catedral e o Bazar](https://www.oreilly.com/library/view/the-cathedral/0596001088/)
- [Código Limpo: Habilidades Práticas do Agile Software](https://altabooks.com.br/produto/codigo-limpo/)
- [Como o Google Funciona](https://intrinseca.com.br/livro/como-o-google-funciona/)
- [Conceitos de Linguagens de Programação](https://loja.grupoa.com.br/conceitos-de-linguagens-de-programacao-p992606)
- [Entendendo Algoritmos](https://novatec.com.br/livros/entendendo-algoritmos/)
- [Introdução à Programação Com Python](https://novatec.com.br/livros/introducao-python-4ed/)
- [Lógica de programação: A construção de algoritmos e estruturas de dados](https://loja.grupoa.com.br/logica-de-programacao-4ed-p1018386)
- [Metodologia de Pesquisa para Ciência da Computação](https://www.grupogen.com.br/e-book-metodologia-de-pesquisa-para-ciencia-da-computacao)
- [The New Kingmakers](https://thenewkingmakers.com/)
- [Nova Era Digital](https://intrinseca.com.br/livro/a-nova-era-digital/)
- [O Programador Pragmático De aprendiz a mestre](https://loja.grupoa.com.br/o-programador-pragmatico-p995566)
- [A Vida Digital](https://www.companhiadasletras.com.br/livro/9788571644557/a-vida-digital)

## Palestras

- [Meet the inventor of the electronic spreadsheet](https://www.ted.com/talks/dan_bricklin_meet_the_inventor_of_the_electronic_spreadsheet)

## Agradecimentos

Seguem alguns agradecimentos aos professores e eventos que disponibilizaram uma lista de exercícios na internet
facilitando a criação desta lista:

- [Profa. Flávia Pereira de Carvalho](https://fit.faccat.br/~fpereira/pagina/)
- [Prof. Marco André Lopes Mendes](https://wiki.python.org.br/ListaDeExercicios)
- Alex (Aluno de Engenharia de Software da Univille)

## Informações legais

- **Java** is a registered trademark of Oracle.
- **MongoDB** is a registered trademark of MongoDB Inc.
- **Python** is a trademark of the Python Software Foundation.
- **Redis** is a registered trademark of Redis Ltd.
- **Visual Studio Code** and **VS Code** are trademarks of Microsoft Corporation.

[^1]: na arquitetura de computadores, _speedup_ é um número que mede o desempenho relativo de dois sistemas que
processam o mesmo problema.

[^2]: C.R.U.D. são as operações _Create_, _Read_, _Update_ e _Delete_

[^3]: BSON Binary JSON

[^4]: JSON JavaScript Object Notation
