package controle_de_eventos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/locais")
public class LocalController {

    @Autowired
    LocalRepository localRepository;

    @GetMapping
    public List<Local> listarLocais() {
        return localRepository.findAll();
    }

    @PostMapping
    public Local salvarLocal(@RequestBody Local local) {
        return localRepository.save(local);
    }
}
