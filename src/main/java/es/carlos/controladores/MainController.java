package es.carlos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcome(@RequestParam("name") String nombre, Model model) {
        //model.addAttribute("mensaje", "Hola a todos los alumnos de Openwebinars");
        model.addAttribute("nombre", nombre);
        return "index";
    }

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("saludo", "Seguro que has visto otras plataformas con miles de cursos...");
        return "saludo";
    }
}
