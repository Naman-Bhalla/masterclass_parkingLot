package repositories;

import models.Vehicle;

public class VehicleRepository {
    // ORM layes: we don't have to write the queries. Framework writes it for us
    // Object Relational Mapping
    // Java : Hibernate
    // Python: SQLAlchemy

    Vehicle save() {
        String query = "INSERT INTO vehicles ()";
        return null;
    }

    Vehicle getByID() {
        String query = "SELECT * from vehicles where id = ";
        return null;
    }
}

// Head First Design Patterns
// refactoriing.guru

