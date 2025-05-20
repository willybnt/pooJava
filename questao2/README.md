### 1. Agregação
O relacionamento entre `Curso` e `Instrutor` é de agregação: um curso **possui** instrutores, mas os instrutores **existem independentemente**. Isso é mostrado no diagrama pela linha com losango branco e no código pela lista `List<Instrutor>` dentro da classe `Curso`.

### 2. Multiplicidade
No UML: um `Curso` pode ter 1 ou mais `Instrutores`, e um `Instrutor` pode estar vinculado a 0 ou mais `Cursos`.  
No código: isso é feito com `List<Instrutor>` em `Curso`, e com múltiplas chamadas de `adicionarInstrutor`.

### 3. Classe e Objeto
As classes `Curso` e `Instrutor` representam entidades do sistema.  
No `main`, objetos são criados a partir dessas classes (`new Curso(...)`, `new Instrutor(...)`), ilustrando a instanciação.

### 4. Métodos e Comportamentos
- O método `adicionarInstrutor()` mostra a interação entre as classes.
- `exibirDetalhes()` mostra o uso da agregação, exibindo os dados dos instrutores de um curso.

### 5. Atributos
Cada classe tem atributos representando suas características (como `nome`, `formacao`, `descricao`, etc.), assim como indicado no diagrama UML.

### 6. Independência de Ciclo de Vida
Mesmo que um `Curso` seja excluído, os objetos `Instrutor` ainda existem. Isso reforça o conceito de **agregação**, diferente de composição.