package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

      /*  int a = 5;
        int b = 3;

        System.out.println("Hello World! " + (a+b));*/
    }

    class livro {

        private String nome;
        private Integer numPáginas;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPáginas() {
            return numPáginas;
        }

        public livro(String nome, Integer numPáginas) {
            this.nome = nome;
            this.numPáginas = numPáginas;
        }

        public void setNumPáginas(Integer numPáginas) {
            this.numPáginas = numPáginas;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numPáginas=" + numPáginas +
                    '}';

        }
    }
}