<img src="https://github.com/paularcsarruda/pti_sys_school/assets/122739036/3bab0d2e-4155-47f4-bb9b-d513237cc435" width=250px>

# Projeto Integrador - Grupo 22

Repositório destinado a entrega do Projeto Integrador III do Senac. O grupo possui sete integrantes:

- Bruno Batista de Souza
- Camila Coradi Garcia Leal
- Viviane da Conceição Simões
- Waldecy da Silva Marques Neto
- Renan Dellecrode Gava
- Lucas José Pereira da Costa
- Paula Roberta Corrêa dos Santos Arruda

## Descrição do Projeto

Este é um projeto Node.js com Express que oferece uma API REST para cadastrar alunos, professores e fornecedores em um sistema de gerenciamento escolar. Ele fornece endpoints para cada tipo de entidade, permitindo que os dados sejam enviados e salvos no banco de dados.

>
>    - **Cadastro de Alunos**: Endpoint para cadastrar um novo aluno com os seguintes campos: nome, data de nascimento, CPF, endereço, e-mail e telefone.
>
>    - **Cadastro de Professores**: Endpoint para cadastrar um novo professor com os seguintes campos: nome, CPF, e-mail e disciplina.
>
>    - **Cadastro de Fornecedores**: Endpoint para cadastrar um novo fornecedor com os seguintes campos: nome fantasia, CNPJ e telefone.
>
>    - **Consulta** dos Alunos, Professores e Fornecedores Cadastrados.
>

### Tecnologias Utilizadas

    - JavaScript/Typescript
    - Express
    - Prisma ORM
    - PostgreSQL
    - HTML
    - CSS

### Sumário

- Protótipo Figma
- Instalação
- Configuração
- Uso
- Estrutura de Diretórios 
- Rotas de Cadastro
- Contribuição
- Referências Bibiográficas
- Licença
  
### Protótipo Figma

>
O protótipo foi desenvolvido para representar o cadastro de alunos, professores e fornecedores de uma universidade. A interface do usuário foi projetada para ser intuitiva e fácil de navegar, utilizando modais que permitem abrir exclusivamente o cadastro selecionado ao clicar em uma opção. 
>

<img width="1830" alt="Captura de Tela 2024-05-20 às 3 59 43 PM" src="https://github.com/paularcsarruda/pti_sys_school/assets/122739036/c03ea11e-a83a-4cae-b90d-cc97d8c72f4d">

<img width="1821" alt="Captura de Tela 2024-05-20 às 3 59 24 PM" src="https://github.com/paularcsarruda/pti_sys_school/assets/122739036/821e90f3-95e3-4e2a-a0cb-4d5d60bb12cc">


### Instalação 

Instruções para configurar o ambiente e instalar as dependências do projeto.

```
git clone https://github.com/RenanGava/pti_sys_school.git
cd pti_sys_school
npm install
```

### Configuração

Detalhes sobre como configurar as variáveis de ambiente e outras configurações necessárias para executar o projeto.

Crie um arquivo `.env` na raiz do projeto e adicione as seguintes variáveis:

```
PORT=3000
DATABASE_URL=your-database-url
```

A aplicação estará disponível em http://localhost:3000.

### Uso

Instruções sobre como iniciar e usar o projeto.

Para iniciar o servidor de desenvolvimento:

```
npm start
```

### Estrutura de Diretórios

Descrição da estrutura de diretórios do projeto.

```
nome-do-projeto/
├── node_modules/
├── prisma/
├── src/
│   ├── controllers/
│   ├── interfaces/
│   ├── models/
│   ├── public/
│   │   ├── css/
|   |   ├── assets/
|   |   ├── viewa/
│   │   └── js/
│   ├── services/
│   └── views/
├── tests/
├── .env
├── .gitignore
├── app.js
├── package.json
└── README.md
```

### Rotas de Cadastro

#### Usuários

- `POST /users/register` - Registra um novo usuário.
    - Request Body:
    ```
    {
      "name": "Nome do Usuário",
      "email": "email@exemplo.com",
      "password": "senha123"
    }
    ```
    - Response:
    ```
    {
      "message": "Usuário registrado com sucesso",
      "user": {
        "id": 1,
        "name": "Nome do Usuário",
        "email": "email@exemplo.com"
      }
    }
    ```

- `GET /users/:id` - Retorna detalhes de um usuário específico.
    -Response:
  ```
    {
      "id": 1,
      "name": "Nome do Usuário",
      "email": "email@exemplo.com"
    }
  ```

### Contribuição

Regras e diretrizes para contribuir com o projeto.

1. Fork o repositório.
2. Crie uma branch para sua feature (git checkout -b feature/nova-feature).
3. Commit suas mudanças (git commit -m 'Adiciona nova feature').
4. Faça o push para a branch (git push origin feature/nova-feature).
5. Abra um Pull Request.

### Referências Bibliograficas

>
> - Guia Markdown, acesso em: https://www.markdownguide.org/basic-syntax/
> - Senac - Projeto Integrador
>   

### Licença
Informações sobre a licença do projeto.
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para detalhes.
