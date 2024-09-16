echo "# C-digo-Fonte-do-Sistema" >> README.md 
git init 
git add README.md 
git commit -m "primeiro commit" 
git branch -M main 
git remote add origin https://github.com/Franklin-Front-end/C-digo-Fonte-do-Sistema.git
 git push -u origin main

 package librarymanagement;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
    }
}





package librarymanagement;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", User ID: " + userId;
    }
}




package librarymanagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321"));

        // Adding users
        library.addUser(new User("Alice", "user1"));
        library.addUser(new User("Bob", "user2"));

        // Borrowing a book
        if (library.borrowBook("123456789", "user1")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Failed to borrow the book.");
        }

        // Returning a book
        if (library.returnBook("123456789")) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Failed to return the book.");
        }

        // Display library status
        System.out.println(library);
    }
}



# java -cp bin librarymanagement.Main





# Sistema de Gestão de Biblioteca

## Visão Geral

Este é um sistema simples de gestão de biblioteca desenvolvido em Java. Ele inclui funcionalidades para gerenciar livros e usuários, permitindo o empréstimo e a devolução de livros.

## Funcionalidades

- **Adicionar Livros**: Adicionar novos livros à biblioteca.
- **Adicionar Usuários**: Registrar novos usuários na biblioteca.
- **Emprestar Livros**: Usuários podem emprestar livros se estiverem disponíveis.
- **Devolver Livros**: Usuários podem devolver livros emprestados.
- **Visualizar Status da Biblioteca**: Exibir o status atual dos livros e usuários.

## Estrutura do Projeto

- `Book.java`: Representa um livro com título, autor, ISBN e status de disponibilidade.
- `User.java`: Representa um usuário com nome e ID de usuário.
- `Library.java`: Gerencia livros e usuários, e lida com o empréstimo e devolução de livros.
- `Main.java`: Ponto de entrada da aplicação que demonstra a funcionalidade do sistema de biblioteca.

## Como Executar

1. Certifique-se de ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile os arquivos Java:

   ```bash
   javac -d bin src/*.java


### Passos para Criar e Adicionar ao GitHub

1. **Criar Repositório**:
   - Acesse [GitHub](https://github.com/) e crie um novo repositório.
   - Nomeie o repositório, por exemplo, `sistema-gestao-biblioteca`.

2. **Inicializar Git e Adicionar Arquivos**:
   - No terminal, navegue até o diretório do projeto e inicialize um repositório Git:

     ```bash
     cd path/to/sistema-gestao-biblioteca
     git init
     ```

   - Adicione os arquivos ao repositório:

     ```bash
     git add .
     git commit -m "Commit inicial com arquivos do projeto"
     ```

3. **Subir para o GitHub**:
   - Conecte o repositório local ao repositório remoto no GitHub:

     ```bash
     git remote add origin https://github.com/seuusuario/sistema-gestao-biblioteca.git
     git branch -M main
     git push -u origin main
     ```

Substitua `path/to/sistema-gestao-biblioteca` pelo caminho real para o diretório do seu projeto e `seuusuario` pelo seu nome de usuário do GitHub.

Isso deve fornecer uma base sólida para o seu projeto. Se precisar de mais assistência ou tiver outras perguntas, estarei à disposição!
