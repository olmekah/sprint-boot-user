/*
 *  Curso Spring y MicroServicios
 *  www.dcinternet.com.mx
 */
package mx.com.dcinternet.sprint_boot_user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dcinternet
 */
@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Pedro Infante";
    }
}
