# Relacionamento entre as classes Computador e PlacaMae

## 1. Composição  
O relacionamento entre `Computador` e `PlacaMae` é de **composição**: um computador **possui** uma placa-mãe, e a placa-mãe **não existe independentemente** do computador.  
No diagrama UML, isso é representado pela linha com um losango preenchido próximo à classe `Computador`.  
No código, isso aparece no atributo `private PlacaMae placa` dentro da classe `Computador`, que é instanciado diretamente no construtor da classe.

## 2. Multiplicidade  
No UML: um `Computador` possui **exatamente uma** `PlacaMae` (multiplicidade 1), e uma `PlacaMae` está associada a exatamente um `Computador`.  
No código: isso é refletido pelo atributo simples `PlacaMae placa` (não uma lista ou coleção), e pela necessidade de passar os dados da placa-mãe no construtor de `Computador`, que cria internamente a instância de `PlacaMae`.

## 3. Classe e Objeto  
As classes `Computador` e `PlacaMae` representam entidades do sistema — um computador físico e sua placa-mãe.  
No método `main`, a criação do objeto `Computador` gera indiretamente uma instância de `PlacaMae` pela composição.

## 4. Métodos e Comportamentos  
- O método `mostrarInformacoes()` da classe `Computador` chama o método `mostrarDados()` da `PlacaMae`, mostrando a interação entre as classes.  
- Essa interação demonstra o encapsulamento e a divisão de responsabilidades, onde cada classe exibe suas informações.

## 5. Atributos  
Cada classe possui atributos que representam suas características essenciais:  
- `Computador`: marca, modelo, processador, memória RAM e placa-mãe.  
- `PlacaMae`: fabricante, chipset, quantidade de slots e tipo de memória.

## 6. Independência de Ciclo de Vida  
A `PlacaMae` não tem independência de ciclo de vida do `Computador`, reforçando o conceito de **composição**.  
Quando o objeto `Computador` é destruído, sua placa-mãe também deixa de existir, pois a instância da placa é gerenciada internamente pela classe `Computador`.
