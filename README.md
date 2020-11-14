# API-Estoque-Bebidas
> API para controle de Estoque de bebidas.

Api desenvolvida para controle de estoque de bebidas com formas variadas de consulta, cadastro e atualização.

```sh
Desenvolvido em Java com JPA, Swagger e PostgreSQL
```
## Como Utilizar

Após o término do projeto tentei efetuar um deploy para o Heroku para que a API ficasse disponível de forma online no entanto não obtive sucesso nessa parte porém posteriormente posso deixar ele online.

Para executar a API:
- Baixe todo o projeto presente na pasta "apirest"
- Abra o projeto com a IDE de sua preferência
- configure o banco através do "application.properties" presente no caminho "src/main/resources"
Dentro deste arquivo constará a seguinte configuração


## Cadastrar

Para o cadastramento, usar os textos em Json abaixo:

```sh

EXEMPLOS DE CADASTROS
{
  "historicoEntradaSaida": {
    "dataEntrada": "2020-11-14",
    "dataSaida": " ",
    "horaEntrada": "12:54",
    "horaSaida": " ",
    "responsavelPelaEntrada": "ERGON ZAMARIAN LIMA",
    "responsavelPelaSaida": " ",
    "secao": {
      "numeroDaSecao": 1,
      "tipoDeBebidaNaSecao": "NAO_ALCOOLICA",
      "volumeDaBebida": 70,
      "volumeTotalSecao": 400
    }
  },
  "idBebida": 0,
  "nomeBebida": "TODDYNHO"
}
---copiar até aqui
{
  "historicoEntradaSaida": {
    "dataEntrada": "2020-11-14",
    "dataSaida": " ",
    "horaEntrada": "18:58",
    "horaSaida": " ",
    "responsavelPelaEntrada": "ERGON ZAMARIAN LIMA",
    "responsavelPelaSaida": " ",
    "secao": {
      "numeroDaSecao": 1,
      "tipoDeBebidaNaSecao": "NAO_ALCOOLICA",
      "volumeDaBebida": 70,
      "volumeTotalSecao": 400
    }
  },
  "idBebida": 28,
  "nomeBebida": "LEITE"
}
---copiar até aqui
{
  "historicoEntradaSaida": {
    "dataEntrada": "2020-11-14",
    "dataSaida": " ",
    "horaEntrada": "20:58",
    "horaSaida": " ",
    "responsavelPelaEntrada": "ERGON ZAMARIAN LIMA",
    "responsavelPelaSaida": " ",
    "secao": {
      "numeroDaSecao": 2,
      "tipoDeBebidaNaSecao": "ALCOOLICA",
      "volumeDaBebida": 90,
      "volumeTotalSecao": 500
    }
  },
  "idBebida": 0,
  "nomeBebida": "SKOL"
}

```

## Atualizar - Venda de Bebida

Para a atualização, usar os textos em Json abaixo:

```sh

EXEMPLOS DE ATUALIZAÇÕES - VENDAS
{
  "historicoEntradaSaida": {
    "dataEntrada": "2020-11-14",
    "dataSaida": "2020-11-17",
    "horaEntrada": "12:54",
    "horaSaida": "17:54",
    "responsavelPelaEntrada": "ERGON ZAMARIAN LIMA",
    "responsavelPelaSaida": "FULANO",
    "secao": {
      "numeroDaSecao": 0,
      "tipoDeBebidaNaSecao": "NAO_ALCOOLICA",
      "volumeDaBebida": 70,
      "volumeTotalSecao": 400
    }
  },
  "idBebida": inserir id correspondente,
  "nomeBebida": "TODDYNHO"
}
---copiar até aqui
{
  "historicoEntradaSaida": {
    "dataEntrada": "2020-11-14",
    "dataSaida": "2020-11-19",
    "horaEntrada": "18:58",
    "horaSaida": "11:40",
    "responsavelPelaEntrada": "ERGON ZAMARIAN LIMA",
    "responsavelPelaSaida": "DELTRANO",
    "secao": {
      "numeroDaSecao": 1,
      "tipoDeBebidaNaSecao": "NAO_ALCOOLICA",
      "volumeDaBebida": 70,
      "volumeTotalSecao": 400
    }
  },
  "idBebida": inserir id correspondente,
  "nomeBebida": "LEITE"
}

```
## Outras Funções dentro da API

As outras funções presentes na API estão descritas no botão que chama cada método, todas são explicativas.

Importante lembrar que a inserção deve ser feita da forma como foi passado acima, bem como a atualização.

As regras de cadastramento não foram cumpridas, no entanto disponibilizei a tentativa [Aqui ](https://github.com/ergonlima/API-Estoque-Bebidas/blob/main/Ideias%20para%20o%20Cadastro) que fazia direto no banco e tentava passar para o JPA.

## Autor

Ergon Zamarian Lima 

