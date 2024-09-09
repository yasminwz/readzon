package br.com.readzon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "BOOK") //Entidade = Tabela do banco
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLICATION_YEAR")
    private Integer publicationYear;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "UNIT_PRICE")
    private Double unitPrice;
}
