package br.com.btg.game.jokenpo.controller;

import br.com.btg.game.jokenpo.dto.PlayerRequest;
import br.com.btg.game.jokenpo.dto.api.ApiResponse;
import br.com.btg.game.jokenpo.exception.JokenpoException;
import br.com.btg.game.jokenpo.service.JokenpoService;
import br.com.btg.game.jokenpo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/play")
@CrossOrigin(origins = "*")
public class JokenpoController {

    private JokenpoService jokenpoService;

    @Autowired
    public JokenpoController(JokenpoService jokenpoService) {
        this.jokenpoService = jokenpoService;
    }

    @DeleteMapping(value = "")
    public ResponseEntity<Object> reset() throws JokenpoException {
        return ResponseEntity.ok(new ApiResponse<>(this.jokenpoService.clear()));
    }

    @GetMapping(value = "")
    public ResponseEntity<Object> play() throws JokenpoException {
        return ResponseEntity.ok(new ApiResponse<>(this.jokenpoService.play()));
    }

}