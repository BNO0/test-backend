package groom.geniuses.geniuses.jwt.oauth2;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class GoogleUserDetails implements OAuth2UserInfo {
    private Map<String, Object> attributes;
    @Override
    public String getProvider() {
        return "google";
    }
    @Override
    public String getProviderId() {
        return attributes.get("sub").toString();
    }
    @Override
    public String getEmail() {
        return attributes.get("email").toString();
    }
    @Override
    public String getName() {
        return attributes.get("name").toString();
    }
    @Override
    public String getImage() { return (String) attributes.get("picture"); }
}