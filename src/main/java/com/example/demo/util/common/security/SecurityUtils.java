package com.example.demo.util.common.security;

import net.minidev.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class SecurityUtils {
    private SecurityUtils() {
    }

    public static Optional<String> getCurrentUserLogin() {
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        return Optional.ofNullable(securityContext.getAuthentication()).map((authentication) -> {
//            if (authentication.getPrincipal() instanceof UserDetails) {
//                UserDetails springSecurityUser = (UserDetails)authentication.getPrincipal();
//                return springSecurityUser.getUsername();
//            } else if (authentication instanceof JwtAuthenticationToken) {
//                return (String)((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims().get("preferred_username");
//            } else {
//                if (authentication.getPrincipal() instanceof DefaultOidcUser) {
//                    Map<String, Object> attributes = ((DefaultOidcUser)authentication.getPrincipal()).getAttributes();
//                    if (attributes.containsKey("preferred_username")) {
//                        return (String)attributes.get("preferred_username");
//                    }
//                } else if (authentication.getPrincipal() instanceof String) {
//                    return (String)authentication.getPrincipal();
//                }
//
//                return null;
//            }
//        });

        return null;
    }

    public static Optional<List<String>> getRoles() {
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        return Optional.ofNullable(securityContext.getAuthentication()).map((authentication) -> {
//            if (authentication instanceof JwtAuthenticationToken) {
//                Map<String, Object> claims = ((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims();
//                Collection<String> cRoles = getRolesFromClaims(claims);
//                List<String> roles = new ArrayList(cRoles);
//                if (roles.contains("uma_authorization")) {
//                    roles.remove("uma_authorization");
//                }
//
//                return roles;
//            } else {
//                return new ArrayList();
//            }
//        });

        return null;
    }

    public static Optional<String> getGivenName() {
        return getCode("given_name");
    }

    public static Optional<String> getFullname() {
        return getCode("name");
    }

    public static Optional<String> getMigrationStatus() {
        return getCode("migration_status");
    }

    public static Optional<String> getOrgCode() {
        return getCode("org_code");
    }

    public static Optional<String> getParentUser() {
        return getCode("parent_user");
    }

    public static Optional<Boolean> isAdmin() {
//        String claimName = "is_admin";
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        return Optional.ofNullable(securityContext.getAuthentication()).map((authentication) -> {
//            if (authentication instanceof JwtAuthenticationToken) {
//                return ((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims().containsKey(claimName) ? (Boolean)((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims().get(claimName) : false;
//            } else {
//                if (authentication.getPrincipal() instanceof DefaultOidcUser) {
//                    Map<String, Object> attributes = ((DefaultOidcUser)authentication.getPrincipal()).getAttributes();
//                    if (attributes.containsKey(claimName)) {
//                        return (Boolean)attributes.get(claimName);
//                    }
//                }
//
//                return false;
//            }
//        });

        return null;
    }

    private static Optional<String> getCode(String claimName) {
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        return Optional.ofNullable(securityContext.getAuthentication()).map((authentication) -> {
//            if (authentication instanceof JwtAuthenticationToken) {
//                return (String)((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims().get(claimName);
//            } else {
//                if (authentication.getPrincipal() instanceof DefaultOidcUser) {
//                    Map<String, Object> attributes = ((DefaultOidcUser)authentication.getPrincipal()).getAttributes();
//                    if (attributes.containsKey(claimName)) {
//                        return (String)attributes.get(claimName);
//                    }
//                }
//
//                return null;
//            }
//        });

        return null;
    }

    public static boolean isAuthenticated() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return authentication != null && getAuthorities(authentication).noneMatch("ROLE_ANONYMOUS"::equals);

        return true;
    }

    public static boolean isCurrentUserInRole(String authority) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        boolean var2;
//        if (authentication != null) {
//            Stream var10000 = getAuthorities(authentication);
//            authority.getClass();
//            if (var10000.anyMatch(authority::equals)) {
//                var2 = true;
//                return var2;
//            }
//        }
//
//        var2 = false;
//        return var2;

        return true;
    }

//    public static Jwt getJwt() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return authentication instanceof JwtAuthenticationToken ? (Jwt)((JwtAuthenticationToken)authentication).getToken() : null;
//    }
//
//    private static Stream<String> getAuthorities(Authentication authentication) {
//        Collection<? extends GrantedAuthority> authorities = authentication instanceof JwtAuthenticationToken ? extractAuthorityFromClaims(((Jwt)((JwtAuthenticationToken)authentication).getToken()).getClaims()) : authentication.getAuthorities();
//        return ((Collection)authorities).stream().map(GrantedAuthority::getAuthority);
//    }
//
//    public static List<GrantedAuthority> extractAuthorityFromClaims(Map<String, Object> claims) {
//        return mapRolesToGrantedAuthorities(getRolesFromClaims(claims));
//    }
//
//    private static Collection<String> getRolesFromClaims(Map<String, Object> claims) {
//        Collection result = (Collection)claims.getOrDefault("groups", claims.getOrDefault("roles", claims.getOrDefault("roles", new ArrayList())));
//        if (result.isEmpty()) {
//            result = (Collection)((JSONObject)claims.getOrDefault("realm_access", (new JSONObject()).appendField("roles", new ArrayList()))).get("roles");
//        }
//
//        return result;
//    }
//
//    private static List<GrantedAuthority> mapRolesToGrantedAuthorities(Collection<String> roles) {
//        return (List)roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
//    }
}