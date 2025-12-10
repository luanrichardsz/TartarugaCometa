package bo;

import dao.EntregaDAO;
import model.Entrega;
import model.ProdutoEntrega;

import java.util.ArrayList;

public class EntregaBO {
    EntregaDAO daoEntrega = new EntregaDAO();

    ArrayList<String> erros = new ArrayList<>();

    public void validarCriacao(Entrega entrega, ArrayList<ProdutoEntrega> mercadorias){
        erros.clear();

        validarEntradaDest(entrega);
        validarEntradaRem(entrega);
        validarEntradaMerca(mercadorias);

        //Se a lista de erros estiver vazia, cria o cliente, se nao, imprime os erros
        if (erros.isEmpty()){
            daoEntrega.cadastrar(entrega, mercadorias);
        } else {
            System.out.println(erros);
        }
    }

    public void validarDeletar(int idEntrega){
        erros.clear();

        int idEntregaBanco = daoEntrega.buscarPorId(idEntrega);

        if (idEntregaBanco == idEntrega){
            daoEntrega.apagar(idEntrega);
        } else {
            erros.add("ID não encontrado no banco de dados!");
            System.out.println(erros);
        }
    }

    public void validarAtualizar(boolean realizada, int idEntrega){
        erros.clear();

        int idEntregaBanco = daoEntrega.buscarPorId(idEntrega);

        if (idEntregaBanco == idEntrega){
            daoEntrega.atualizar(realizada, idEntrega);
        } else {
            erros.add("ID não encontrado no banco de dados!");
            System.out.println(erros);
        }
    }

    private void validarEntradaDest(Entrega entrega){
        if (entrega.clienteDestinatario.getIdCliente() <= 0){
            erros.add("\nDigite um cliente destinatario valido");
        }
    }
    private void validarEntradaRem(Entrega entrega){
        if (entrega.clienteRemetente.getIdCliente() <= 0){
            erros.add("\nDigite um cliente remetente valido");
        }
    }
    private void validarEntradaMerca(ArrayList<ProdutoEntrega> mercadorias){
        if (mercadorias.isEmpty()){
            erros.add("\nLista de Mercadorias VAZIA");
        }
    }
}
