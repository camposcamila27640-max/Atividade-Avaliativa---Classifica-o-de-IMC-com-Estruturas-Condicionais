void main() {
    IO.println("CALCULADORA DE IMC");

    
    String nome = IO.readln("Digite seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar)").charAt(0);
    String alturaSTR = IO.readln("Digite seu altura: ");
    String pesoSTR = IO.readln("Digite sua peso: ");

    Double altura = Double.parseDouble(alturaSTR);
    Double peso = Double.parseDouble(pesoSTR);

    Double IMC = (peso / (altura * altura));

    String classificacao = "";
                

    switch (genero) {
        case 'M':
           if (IMC < 20) 
                classificacao = "Abaixo do peso";
            else if (IMC <= 24.9) 
                classificacao = "Peso normal";
             else if (IMC <= 29.9) 
                classificacao = "Obesidade Leve";

             else if (IMC <= 39.9)
                classificacao = "Obesidade Moderada";
                else 
                classificacao = "Obesidade Morbida";

        case 'F', 'N':
           if (IMC < 19) 
                classificacao = "Abaixo do peso";
            else if (IMC <= 23.9) 
                classificacao = "Peso normal";

            else if (IMC <= 28.9) 
                classificacao = "Obesidade Leve";

            else if(IMC <= 38.9)
                classificacao = "Obesidade Moderada";
                else 
                classificacao = "Obesidade Morbida";
      default:
            IO.println("Opção invalida!");
            break;
    }

        IO.println("Resultado:");

    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + IMC);
    IO.println("Classificação: " + classificacao);

}
