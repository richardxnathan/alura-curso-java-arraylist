package DesafioConclusaoCurso.minhaSolucao;

import DesafioConclusaoCurso.minhaSolucao.Compra;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        float limite = leitor.nextFloat();;
        List<Compra> compras = new ArrayList<>();

        while(true){
            System.out.println("Digite a descrição da compra: ");
            leitor.nextLine();
            String nomeDoProduto = leitor.nextLine();

            System.out.println("Digite o preço do produto: ");
            float precoDoProduto = leitor.nextFloat();

            if (precoDoProduto <= limite){
                Compra minhaCompra = new Compra(nomeDoProduto, precoDoProduto);
                compras.add(minhaCompra);
                limite -= precoDoProduto;
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }

            System.out.println("Digite [0] pra sair ou [1] pra continuar:");
            byte opcao = leitor.nextByte();

            if (opcao == 0) {
                break;
            }
        }
        System.out.println("*******************");
        System.out.println("COMPRAS REALZADAS:");

        compras.sort(Comparator.comparing(Compra::getPreco));
        for (Compra item: compras) {
            System.out.println(item.getNome() + " - " + item.getPreco());
        }

        System.out.println("*******************");
        System.out.print("Saldo do cartão: " + limite);
    }
}
