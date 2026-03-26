# Spring JWT API 🔐

API REST sécurisée avec JWT (JSON Web Token) — Spring Boot 3 + Spring Security 6.

---

## Technologies

- Java 17+
- Spring Boot 3
- Spring Security 6
- Spring Data JPA
- MySQL
- jjwt 0.11.5
- Lombok

---

## Structure du projet



---

## Configuration

**Créer la base de données MySQL :**
```sql
CREATE DATABASE security_jwt;
```

**`application.properties` :**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/security_jwt?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
jwt.secret=MySuperSecretKeyForJwtAuthentication123456
jwt.expiration=3600000
```

---

## Lancer le projet

```bash
mvn spring-boot:run
```

Au démarrage, deux utilisateurs sont créés automatiquement :

| Username | Password | Rôle  |
|----------|----------|-------|
| admin    | 1234     | ADMIN |
| user     | 1234     | USER  |

---

## Tests avec Postman

### 📸 Screen 1 — Login (obtenir le token)







---

### 📸 Screen 2 — Accès à une route protégée (USER)





---

### 📸 Screen 3 — Accès route ADMIN



---

### 📸 Screen 4 — Accès refusé (token invalide)



---
