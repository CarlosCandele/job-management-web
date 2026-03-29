package br.com.carlosjorge.front_gestao_vaga.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers(
                    "/candidate/login",
                    "/candidate/signIn",
                    "/candidate/logout",
                    "/css/**",
                    "/js/**",
                    "/images/**",
                    "/webjars/**"
                ).permitAll()
                .requestMatchers("/candidate/profile").authenticated()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/candidate/login")
                .loginProcessingUrl("/candidate/signIn")
                .defaultSuccessUrl("/candidate/profile", true)
                .failureUrl("/candidate/login?error=true")
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/candidate/logout")
                .logoutSuccessUrl("/candidate/login?logout=true")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .permitAll()
            );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails candidate = User.builder()
            .username("candidato")
            .password(passwordEncoder.encode("123456"))
            .roles("CANDIDATE")
            .build();

        return new InMemoryUserDetailsManager(candidate);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
