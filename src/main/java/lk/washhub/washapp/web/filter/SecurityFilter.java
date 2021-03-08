package lk.washhub.washapp.web.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.washhub.washapp.web.util.AppUtil;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sesath De Costa on 2021-03-08
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Order(2)
@Component
@WebFilter
public class SecurityFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        if (request.getMethod().equals("OPTIONS")) {
            chain.doFilter(request, response);
        } else if (request.getServletPath().equals("/api/v1/users/authenticate") && request.getMethod().equals("POST")) {
            chain.doFilter(request, response);
        } else if (request.getServletPath().equals("/api/v1/users") && request.getMethod().equals("GET")
                && request.getPathInfo() != null) {
            chain.doFilter(request, response);
//        } else if (request.getServletPath().equals("/api/v1/requests") && request.getMethod().equals("POST")
//                && request.getPathInfo() != null) {
//            chain.doFilter(request, response);
//        } else {
            String authorization = request.getHeader("Authorization");
            if (authorization == null || !authorization.startsWith("Bearer")) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            } else {
                String token = authorization.replace("Bearer", "");
                Jws<Claims> jws;
                try {
                    SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64URL.decode(AppUtil.getAppSecretKey()));
                    jws = Jwts.parserBuilder()
                            .setSigningKey(key)
                            .build()
                            .parseClaimsJws(token);
                    request.setAttribute("user", jws.getBody().get("name"));
                    chain.doFilter(request, response);
                } catch (JwtException ex) {
                    ex.printStackTrace();
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
