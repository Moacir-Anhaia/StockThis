# 📦 StockThis — Sistema de Gerenciamento de Estoque

O **StockThis** é um sistema desktop desenvolvido em **Java + JavaFX** para gerenciamento de estoque, permitindo cadastrar produtos, controlar quantidades, gerenciar usuários e visualizar dados por meio de gráficos.  
Utiliza **H2 Database**, arquitetura próxima ao **MVC**, tela em **FXML** e DAO para acesso ao banco.

---

# 🚀 Tecnologias Utilizadas

- Java JDK 24.0.2
- JavaFX
- Maven
- H2 Database 2.4.240
- FXML (SceneBuilder)
- Arquitetura MVC simplificada

---

# 🖥 Funcionalidades Principais

- Login e autenticação  
- Dashboard com visão geral  
- Cadastro de produtos  
- Atualização de preço  
- Controle de estoque  
- Busca e filtro por categoria  
- Inserção de novos itens  
- Gráficos de consumo e finanças  
- Redefinição de senha  
- Contagem e soma automática de valores  

---

# 🧪 Testes Unitários Implementados

- Inserção de itens no banco  
- Validação de valores e persistência no H2  

---

# 📁 Estrutura de Pastas (Correspondente ao Projeto Atualizado)

```
StockThis/
├── .idea/
│   ├── .gitignore
│   ├── compiler.xml
│   ├── encodings.xml
│   ├── jarRepositories.xml
│   ├── misc.xml
│   ├── vcs.xml
│   └── workspace.xml
│
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
│
├── data/
│   └── stockthis.mv.db
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/unipar/stockthis/
│   │   │       ├── BancoDeDados/
│   │   │       │   ├── Database.java
│   │   │       │   ├── ProdutoDAO.java
│   │   │       │   └── UsuarioDAO.java
│   │   │       │
│   │   │       ├── Cadastro/
│   │   │       │   ├── CadastroController.java
│   │   │       │   ├── LoginController.java
│   │   │       │   ├── RedefinirSenhaController.java
│   │   │       │   └── Usuario.java
│   │   │       │
│   │   │       ├── Estoque/
│   │   │       │   ├── AlterarPrecoController.java
│   │   │       │   ├── DashboardController.java
│   │   │       │   ├── EstoqueController.java
│   │   │       │   ├── HelloController.java
│   │   │       │   ├── NovoItemController.java
│   │   │       │   └── Produto.java
│   │   │       │
│   │   │       ├── HelloApplication.java
│   │   │       ├── Launcher.java
│   │   │       └── module-info.java
│   │   │
│   │   └── resources/
│   │       └── br/unipar/stockthis/
│   │           ├── AlterarPreco.fxml
│   │           ├── Cadastro.fxml
│   │           ├── Dashboard.fxml
│   │           ├── Estoque.fxml
│   │           ├── hello-view.fxml
│   │           ├── Login.fxml
│   │           ├── NovoItem.fxml
│   │           ├── Redefinir_senha.fxml
│   │           │
│   │           └── Images/
│   │               └── IconEstoque.png
│   │
│   └── test/
│       └── java/
│           └── br/unipar/stockthis/BancoDeDados/
│               └── ProdutoDAOTest.java
│
├── .gitignore
├── h2-2.4.240.jar
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

# ⚙ Como Executar o Projeto

### 1. Clonar o repositório
```
https://github.com/Moacir-Anhaia/StockThis.git
```

### 2. Importar no IntelliJ
- File → Open → selecione a pasta **StockThis**
- Aguarde o Maven baixar todas as dependências
- Certifique-se de que o JavaFX está configurado

### 3. Executar a aplicação
Abra:

```
src/main/java/br/unipar/stockthis/Launcher.java
```

E clique em **Run**.

---

# 🗄 Banco de Dados (H2)

O sistema utiliza **H2 Database embutido**.  
O arquivo necessário já está incluído:

```
h2-2.4.240.jar
```

### Abrir o console do H2
No terminal:

```
java -jar h2-2.4.240.jar
```

### Dados de conexão:
```
URL: jdbc:h2:./data/stockthis
USER: StockThis
PASSWORD: 12345
```

---

# 📚 Organização do Código

### 📌 **Controllers**  
Controlam as interfaces FXML:

- LoginController  
- CadastroController  
- RedefinirSenhaController  
- DashboardController  
- EstoqueController  
- NovoItemController  
- AlterarPrecoController  

---

### 📌 **Model**  
Representação dos dados:

- `Usuario`
- `Produto`

---

### 📌 **DAO — Acesso ao Banco de Dados**

- `Database` → gerencia conexão  
- `UsuarioDAO`  
- `ProdutoDAO`  

---

# 👥 Autores

| Nome | RA |
|------|------|
| **Yuri Grade** | 60005585 |
| **Moacir Samoel Anhaia** | 60005619 |
| **Thiago Cornelius** | 60012173 |

