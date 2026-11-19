// PRIMEIRA QUESTÃO

import java.util.Scanner;

public static int cadastrarConta(Conta[] v, int tam) {
public static Scanner sc = new Scanner(System.in);

    if (tam >= TAM_CONTAS) {
        System.out.println("Vetor cheio!");
        return tam;
    }

    System.out.println("ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    if (buscaId(v, tam, id) != -1) {
        System.out.println("ID repetido");
        return tam;
    }

    System.out.println("Cliente: ");
    String cliente = sc.nextLine();
    System.out.println("Saldo: ");
    double saldo = sc.nextDouble();
    System.out.println("Limite: ");
    double limite = sc.nextDouble();

    if (saldo < 0 || limite < 0) {
        System.out.println("Saldo e limite inválidos");
        return tam;
    }

    v[tam] = new Conta();
    v[tam].id = id;
    v[tam].cliente = cliente;
    v[tam].saldo = saldo;
    v[tam].limite = limite;

    return tam + 1;
}


// SEGUNDA QUESTÃO

public static int buscaBinariaCliente(Conta[] v, int tam, String x) {
    int inicio = 0;
    int fim = tam - 1;

    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;

        if (v[meio].cliente.compareTo(x) == 0) {
            return meio;
        } else if (v[meio].cliente.compareTo(x) < 0) {
            inicio = meio + 1;
        } else {
            fim = meio - 1;
        }
    }
    return -1;
}


// TERCEIRA QUESTÃO

public static int insertionSortCliente(Conta[] v, int tam) {
    for (int i = 1; i < tam; i++) {
        Conta aux = v[i];
        int j = i - 1;

        while (j >= 0 && v[j].cliente.compareTo(aux.cliente) > 0) {
            v[j + 1] = v[j];
            j--;
        }
        v[j + 1] = aux;
    }
    return tam;
}


// QUARTA QUESTÃO

public static int filtraOperacoes(Operacao[] vOp, int tamOp, Operacao[] vOpFiltrado, int x) {
    int tamFiltrado = 0;

    for (int i = 0; i < tamOp; i++) {
        if (vOp[i].idConta == x) {
            vOpFiltrado[tamFiltrado] = vOp[i];
            tamFiltrado++;
        }
    }
    return tamFiltrado;
}


// QUINTA QUESTÃO

public static void extrato(Conta[] vContas, int tamConta, Operacao[] vOp, int tamOp) {
    System.out.print("ID da conta: ");
    int id = sc.nextInt();

    int pos = buscaId(vContas, tamConta, id);
    if (pos == -1) {
        System.out.println("Conta nao encontrada!");
        return;
    }

    int qtd = 0;
    for (int i = 0; i < tamOp; i++) {
        if (vOp[i].idConta == id) {
            qtd++;
        }
    }

    int ignorar = qtd - 5;
    if (ignorar < 0) {
        ignorar = 0;
    }

    double saldo = 0;
    int contador = 0;
    for (int i = 0; i < tamOp; i++) {
        if (vOp[i].idConta == id) {
            if (contador < ignorar) {
                saldo = saldo + vOp[i].valor;
            }
            contador++;
        }
    }

    System.out.println("CONTA N." + vContas[pos].id);
    System.out.println("CLIENTE: " + vContas[pos].cliente);
    System.out.println("Saldo Anterior: " + Math.abs(saldo));

    contador = 0;
    for (int i = 0; i < tamOp; i++) {
        if (vOp[i].idConta == id) {
            if (contador >= ignorar) {
                saldo = saldo + vOp[i].valor;

                String nome = "Transferencia";
                if (vOp[i].tipo == 'D') {
                    nome = "Deposito";
                } else if (vOp[i].tipo == 'S') {
                    nome = "Saque";
                }

                char cvalor = 'C';
                if (vOp[i].valor < 0) {
                    cvalor = 'D';
                }
                char csaldo = 'C';
                if (saldo < 0) {
                    csaldo = 'D';
                }

                System.out.println(vOp[i].id + " | " + nome + " | "
                        + Math.abs(vOp[i].valor) + cvalor + " | "
                        + Math.abs(saldo) + csaldo);
            }
            contador++;
        }
    }
    System.out.println("Saldo Atual: " + Math.abs(saldo));
}