package controle_de_eventos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    ParticipanteRepository participanteRepository;

    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteRepository.findAll();
    }

    @PostMapping
    public Participante salvarParticipante(@RequestBody Participante participante) {
        return participanteRepository.save(participante);
    }
}
