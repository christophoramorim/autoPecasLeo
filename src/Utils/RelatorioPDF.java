package Utils;

import Model.Cliente;
import Model.ItensVenda;
import Model.Produto;
import Model.Venda;
import Model.Vendedor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioPDF {
    // Vendas
     public static void gerarRelatorioVenda(Venda venda, String caminhoArquivo) {
        Document document = new Document();

        try {
            // Inicializa o escritor de PDF
            PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
            document.open();

            // Título do relatório
            document.add(new Paragraph("Relatório de Venda"));
            document.add(new Paragraph(" "));

            // Informações da venda
            document.add(new Paragraph("ID da Venda: " + venda.getId()));
            document.add(new Paragraph("Cliente: " + venda.getCliente().getCliNome()));
            document.add(new Paragraph("Vendedor: " + venda.getVendedor().getNome()));
            document.add(new Paragraph("Total da Venda: R$ " + String.format("%.2f", venda.getTotalVenda())));
            document.add(new Paragraph(" "));

            // Tabela de itens da venda
            PdfPTable table = new PdfPTable(4); // 4 colunas
            table.setWidthPercentage(100);

            // Cabeçalhos da tabela
            PdfPCell cellProduto = new PdfPCell(new Phrase("Produto"));
            PdfPCell cellQuantidade = new PdfPCell(new Phrase("Quantidade"));
            PdfPCell cellPrecoUnitario = new PdfPCell(new Phrase("Preço Unitário"));
            PdfPCell cellPrecoTotal = new PdfPCell(new Phrase("Preço Total"));

            table.addCell(cellProduto);
            table.addCell(cellQuantidade);
            table.addCell(cellPrecoUnitario);
            table.addCell(cellPrecoTotal);

            // Dados dos itens da venda
            List<ItensVenda> itensVenda = venda.getItensVenda();
            for (ItensVenda item : itensVenda) {
                table.addCell(item.getProduto().getNome());
                table.addCell(String.valueOf(item.getQuantidade()));
                table.addCell(String.format("%.2f", item.getPreco()));
                table.addCell(String.format("%.2f", item.getPrecototalitem()));
            }

            // Adiciona a tabela ao documento
            document.add(table);

            // Fecha o documento
            document.close();

            System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

     public static void gerarRelatorioTodasVendas(List<Venda> vendas, String caminhoArquivo) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
            document.open();

            // Título do relatório
            document.add(new Paragraph("Relatório de Todas as Vendas"));
            document.add(new Paragraph(" "));

            // Variável para calcular o subtotal
            double subtotal = 0;

            // Itera sobre todas as vendas
            for (Venda venda : vendas) {
                document.add(new Paragraph("ID da Venda: " + venda.getId()));
                document.add(new Paragraph("Cliente: " + venda.getCliente().getCliNome()));
                document.add(new Paragraph("Vendedor: " + venda.getVendedor().getNome()));
                document.add(new Paragraph("Total da Venda: R$ " + String.format("%.2f", venda.getTotalVenda())));
                document.add(new Paragraph(" "));

                // Adiciona o total da venda ao subtotal
                subtotal += venda.getTotalVenda();

                // Tabela de itens da venda
                PdfPTable table = new PdfPTable(4); // 4 colunas
                table.setWidthPercentage(100);

                PdfPCell cellProduto = new PdfPCell(new Phrase("Produto"));
                PdfPCell cellQuantidade = new PdfPCell(new Phrase("Quantidade"));
                PdfPCell cellPrecoUnitario = new PdfPCell(new Phrase("Preço Unitário"));
                PdfPCell cellPrecoTotal = new PdfPCell(new Phrase("Preço Total"));

                table.addCell(cellProduto);
                table.addCell(cellQuantidade);
                table.addCell(cellPrecoUnitario);
                table.addCell(cellPrecoTotal);

                for (ItensVenda item : venda.getItensVenda()) {
                    table.addCell(item.getProduto().getNome());
                    table.addCell(String.valueOf(item.getQuantidade()));
                    table.addCell(String.format("%.2f", item.getPreco()));
                    table.addCell(String.format("%.2f", item.getPrecototalitem()));
                }

                document.add(table);
                document.add(new Paragraph(" "));
            }

            // Exibe o subtotal ao final do relatório
            document.add(new Paragraph(" "));
            document.add(new Paragraph("--------------------------------------------------"));
            document.add(new Paragraph("Subtotal de Todas as Vendas: R$ " + String.format("%.2f", subtotal)));
            document.add(new Paragraph("--------------------------------------------------"));

            document.close();

            System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //Fim Vendas
     
     //Cliente
     public static void gerarRelatorioCliente(Cliente cliente, String caminhoArquivo) {
        Document document = new Document();

        try {
            // Inicializa o escritor de PDF
            PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
            document.open();

            // Título do relatório
            document.add(new Paragraph("Relatório ficha Cliente"));
            document.add(new Paragraph(" "));

            // Informações da venda
            document.add(new Paragraph("Código do Cliente: " + cliente.getIdCliente()));
            document.add(new Paragraph("Nome: " + cliente.getCliNome()));
            document.add(new Paragraph("Cpf: " + cliente.getCliCpf()));
            document.add(new Paragraph("Endereço: " + cliente.getCliEndereco()));
            document.add(new Paragraph("Bairro: " + cliente.getCliBairro()));
            document.add(new Paragraph("Cidade: " + cliente.getCliCidade() + "/" + cliente.getCliUf()));
            document.add(new Paragraph("CEP: " + cliente.getCliCep()));
            document.add(new Paragraph("Telefone: " + cliente.getCliTelefone()));
            document.add(new Paragraph(" "));           

            // Fecha o documento
            document.close();

            System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     
     public static void gerarRelatorioTodosClientes(ArrayList<Cliente> clientes, String caminhoArquivo) {
        Document document = new Document();

           try {
               PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
               document.open();

               // Título do relatório
               document.add(new Paragraph("Relatório de Todos os Clientes"));
               document.add(new Paragraph(" "));

               // Variável para calcular o subtotal
               double subtotal = 0;

               // Itera sobre todas as vendas
               for (Cliente cliente : clientes) {
                   document.add(new Paragraph("Código do Cliente: " + cliente.getIdCliente()));
                   document.add(new Paragraph("Nome: " + cliente.getCliNome()));
                   document.add(new Paragraph("Cpf: " + cliente.getCliCpf()));
                   document.add(new Paragraph("Endereço: " + cliente.getCliEndereco()));
                   document.add(new Paragraph("Bairro: " + cliente.getCliBairro()));
                   document.add(new Paragraph("Cidade: " + cliente.getCliCidade() + "/" + cliente.getCliUf()));
                   document.add(new Paragraph("CEP: " + cliente.getCliCep()));
                   document.add(new Paragraph("Telefone: " + cliente.getCliTelefone()));
                   document.add(new Paragraph(" ")); 
               }

               document.close();

               System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

           } catch (DocumentException | FileNotFoundException e) {
               e.printStackTrace();
           }
     }
     //Fim Cliente
     
     //Vendedor
     public static void gerarRelatorioVendedor(Vendedor vendedor, String caminhoArquivo) {
        Document document = new Document();

        try {
            // Inicializa o escritor de PDF
            PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
            document.open();

            // Título do relatório
            document.add(new Paragraph("Relatório ficha Vendedor"));
            document.add(new Paragraph(" "));

            // Informações da venda
            document.add(new Paragraph("Código do Vendedor: " + vendedor.getId()));
            document.add(new Paragraph("Nome: " + vendedor.getNome()));
            document.add(new Paragraph("Cpf: " + vendedor.getCpf()));

            document.add(new Paragraph(" "));           

            // Fecha o documento
            document.close();

            System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     
     public static void gerarRelatorioTodosVendedores(ArrayList<Vendedor> vendedores, String caminhoArquivo) {
        Document document = new Document();

           try {
               PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
               document.open();

               // Título do relatório
               document.add(new Paragraph("Relatório de Todos os Vendedores"));
               document.add(new Paragraph(" "));

               // Variável para calcular o subtotal
               double subtotal = 0;

               // Itera sobre todas as vendas
               for (Vendedor vendedor : vendedores) {
                   document.add(new Paragraph("Código do Vendedor: " + vendedor.getId()));
                   document.add(new Paragraph("Nome: " + vendedor.getNome()));
                   document.add(new Paragraph("Cpf: " + vendedor.getCpf()));
                   document.add(new Paragraph(" ")); 
               }

               document.close();

               System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

           } catch (DocumentException | FileNotFoundException e) {
               e.printStackTrace();
           }
     }
     //Fim Vendedor
     
     //Produto
     public static void gerarRelatorioProduto(Produto produto, String caminhoArquivo) {
        Document document = new Document();

        try {
            // Inicializa o escritor de PDF
            PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
            document.open();

            // Título do relatório
            document.add(new Paragraph("Relatório ficha Produto"));
            document.add(new Paragraph(" "));

            // Informações da venda
            document.add(new Paragraph("Código do Produto: " + produto.getId()));
            document.add(new Paragraph("Nome: " + produto.getNome()));
            document.add(new Paragraph("Descricao: " + produto.getDescricao()));
            document.add(new Paragraph("Ano: " + produto.getAno_faixa()));
            document.add(new Paragraph("Modelo do Carro: " + produto.getModelo_carro()));
            document.add(new Paragraph("Marca: " + produto.getMarca()));
            document.add(new Paragraph("Validade: " + produto.getValidade()));
            document.add(new Paragraph("Quantidade: " + produto.getQuantidade()));
            document.add(new Paragraph("Preço de compra: " + produto.getPreco_compra()));
            document.add(new Paragraph("Preço de venda: " + produto.getPreco_venda()));

            document.add(new Paragraph(" "));           

            // Fecha o documento
            document.close();

            System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     
     public static void gerarRelatorioTodosProdutos(ArrayList<Produto> produtos, String caminhoArquivo) {
        Document document = new Document();

           try {
               PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
               document.open();

               // Título do relatório
               document.add(new Paragraph("Relatório de Todos os Produtos"));
               document.add(new Paragraph(" "));

               // Variável para calcular o subtotal
               double subtotal = 0;

               // Itera sobre todas as vendas
               for (Produto produto : produtos) {
                   document.add(new Paragraph("Código do Produto: " + produto.getId()));
                   document.add(new Paragraph("Nome: " + produto.getNome()));
                   document.add(new Paragraph("Descricao: " + produto.getDescricao()));
                   document.add(new Paragraph("Ano: " + produto.getAno_faixa()));
                   document.add(new Paragraph("Modelo do Carro: " + produto.getModelo_carro()));
                   document.add(new Paragraph("Marca: " + produto.getMarca()));
                   document.add(new Paragraph("Validade: " + produto.getValidade()));
                   document.add(new Paragraph("Quantidade: " + produto.getQuantidade()));
                   document.add(new Paragraph("Preço de compra: " + produto.getPreco_compra()));
                   document.add(new Paragraph("Preço de venda: " + produto.getPreco_venda()));
                   document.add(new Paragraph(" "));
               }

               document.close();

               System.out.println("Relatório gerado com sucesso: " + caminhoArquivo);

           } catch (DocumentException | FileNotFoundException e) {
               e.printStackTrace();
           }
     }
     //Fim Produto
}
