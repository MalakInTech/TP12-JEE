package ma.ens.security.spring_jwt_api.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/api/user/profile")
    public Map<String, String> userProfile(Authentication auth) {
        return Map.of(
                "message", "Accès autorisé",
                "username", auth.getName()
        );
    }

    @GetMapping("/api/admin/dashboard")
    public Map<String, String> adminDashboard(Authentication auth) {
        return Map.of(
                "message", "Bienvenue Admin",
                "username", auth.getName()
        );
    }
}