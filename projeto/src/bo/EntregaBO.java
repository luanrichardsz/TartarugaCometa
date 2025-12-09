package bo;

import dao.EntregaDAO;
import model.Entrega;
import model.ProdutoEntrega;

import java.util.ArrayList;

public class EntregaBO {
    EntregaDAO daoEntrega = new EntregaDAO();

    ArrayList<String> errosCriacao = new ArrayList<>();

    public void validarCriacao(Entrega entrega, ArrayList<ProdutoEntrega> mercadorias){
        errosCriacao.clear();

        validarEntradaDest(entrega);
        validarEntradaRem(entrega);
        validarEntradaMerca(mercadorias);

        //Se a lista de erros estiver vazia, cria o cliente, se nao, imprime os erros
        if (errosCriacao.isEmpty()){
            daoEntrega.cadastrar(entrega, mercadorias);
        } else {
            System.out.println(errosCriacao);
        }
    }

    private void validarEntradaDest(Entrega entrega){
        if (entrega.clienteDestinatario.getIdCliente() <= 0){
            errosCriacao.add("\nDigite um cliente destinatario valido");
        }
    }
    private void validarEntradaRem(Entrega entrega){
        if (entrega.clienteRemetente.getIdCliente() <= 0){
            errosCriacao.add("\nDigite um cliente remetente valido");
        }
    }
    private void validarEntradaMerca(ArrayList<ProdutoEntrega> mercadorias){
        if (mercadorias.isEmpty()){
            errosCriacao.add("\nLista de Mercadorias VAZIA");
        }
    }
}
