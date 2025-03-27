package com.example.appLibraryBackend.modelos;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data //usar dependencias anotcione de lombok
@NoArgsConstructor//constructor vacio
@AllArgsConstructor//constructor con todos los argumentos o atributos de la clase
@Setter
@Getter
@Entity//Definir la clase como una entidad (TABLA - en la bd dblibrary)
@Table(name="tbllibro")//darle nombre a la tabla de SQL
public class Libro {
    @Id//Anotacion ID primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremento
    @Column(name="idbook", nullable = false, length = 20, unique = true)//cambiar el nombre de la columna de la tabla
    private Long id;
    private String name;
}
