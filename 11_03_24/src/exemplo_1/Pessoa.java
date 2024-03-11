package exemplo_1;

public class Pessoa {
    
    // Definindo as variaveis
        
        String nome, bairro, rua;
        int cep, idade;

    // Criando sets e gets
        
        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getBairro() {
            return this.bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getRua() {
            return this.rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getCep() {
            return this.cep;
        }

        public void setCep(int cep) {
            this.cep = cep;
        }

        public int getIdade() {
            return this.idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

}
