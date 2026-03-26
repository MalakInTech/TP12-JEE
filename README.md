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

<img width="603" height="722" alt="structure2" src="https://github.com/user-attachments/assets/d70ef0b4-02cd-4934-8c0c-87de1b0722c4" />

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


<img width="892" height="678" alt="auth-login-postman" src="https://github.com/user-attachments/assets/22dd4aa0-637a-46b2-a660-5398cc6918e3" />


---

### 📸 Screen 2 — Accès à une route protégée (USER)


<img width="886" height="640" alt="user-profile-postman" src="https://github.com/user-attachments/assets/96192c0e-1288-4834-8705-fcffe0dc2a81" />


---

### 📸 Screen 3 — Accès route ADMIN


<img width="892" height="652" alt="admin-dash-postman" src="https://github.com/user-attachments/assets/5c5f99ca-1755-4bf4-9960-24d8120a553b" />


---

### 📸 Screen 4 — Accès refusé (token invalide)


<img width="885" height="538" alt="token-incorrect" src="https://github.com/user-attachments/assets/ae3a0784-3ded-43ee-ac8b-df80fc264ac4" />


---

## Auteur
- Nom : Malak El Mallouky
- Filliere : SIR
