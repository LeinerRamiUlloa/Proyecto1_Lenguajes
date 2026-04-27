package com.spring.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import com.spring.app.entity.Cliente;
import com.spring.app.entity.Consultoria;
import com.spring.app.entity.EstadoConsultoria;
import com.spring.app.repository.ClienteRepository;
import com.spring.app.repository.ConsultoriaRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = AppApplication.class)
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ConsultoriaRepository consultoriaRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void consultoriaViewsRender() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente de prueba");
        cliente.setTelefono("8888-8888");
        cliente.setCorreo("cliente-prueba@example.com");
        cliente = clienteRepository.save(cliente);

        Consultoria consultoria = new Consultoria();
        consultoria.setTipo("Legal");
        consultoria.setEstado(EstadoConsultoria.PENDIENTE);
        consultoria.setDescripcion("Revision de contrato");
        consultoria.setCliente(cliente);
        consultoriaRepository.save(consultoria);

        mockMvc.perform(get("/vista/consultorias"))
                .andExpect(status().isOk());

        mockMvc.perform(get("/vista/consultoria"))
                .andExpect(status().isOk());

        mockMvc.perform(get("/vista/consultorias/nueva"))
                .andExpect(status().isOk());
    }
}
