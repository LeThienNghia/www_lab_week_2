package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
//@NamedQueries(
//        @NamedQuery()
//)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long id;
    @Column(name = "cust_name", length = 150, nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "cust_name", length = 150, nullable = false)
    private String unit;
    @Column(name = "cust_name", length = 150, nullable = false)
    private String manufacturerName;
    @Column(name = "cust_name", length = 150, nullable = false)
    private String status;

}
