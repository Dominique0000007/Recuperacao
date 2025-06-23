package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Repository.ProdutoRepository;
import Entity.Produto;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	    @GetMapping("/novo")
	    public String mostrarFormularioNovoProduto(Model model) {
	        model.addAttribute("produto", new Produto()); // Produto é a entidade
	        return "formProduto"; // nome da página HTML do formulário
	    }

	    @PostMapping("/salvar")
	    public String salvarProduto(@ModelAttribute Produto produto) {
	        Object produtoService = null;
			produtoService.salvar(produto); // Salva no banco via serviço
	        return "redirect:/produtos"; // volta para lista de produtos
	    }

	    // Outros métodos (listar, editar, excluir)...
	}
