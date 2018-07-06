package io.github.justinebateman.imgur.domain;

public class AccessTokenResponse
{
    String access_token;
    String expires_in;
    String token_type;
    String scope;
    String refresh_token;
    String account_id;
    String account_username;

    public AccessTokenResponse()
    {
    }

    public String getAccess_token()
    {
        return access_token;
    }

    public AccessTokenResponse setAccess_token(String access_token)
    {
        this.access_token = access_token;
        return this;
    }

    public String getExpires_in()
    {
        return expires_in;
    }

    public AccessTokenResponse setExpires_in(String expires_in)
    {
        this.expires_in = expires_in;
        return this;
    }

    public String getToken_type()
    {
        return token_type;
    }

    public AccessTokenResponse setToken_type(String token_type)
    {
        this.token_type = token_type;
        return this;
    }

    public String getScope()
    {
        return scope;
    }

    public AccessTokenResponse setScope(String scope)
    {
        this.scope = scope;
        return this;
    }

    public String getRefresh_token()
    {
        return refresh_token;
    }

    public AccessTokenResponse setRefresh_token(String refresh_token)
    {
        this.refresh_token = refresh_token;
        return this;
    }

    public String getAccount_id()
    {
        return account_id;
    }

    public AccessTokenResponse setAccount_id(String account_id)
    {
        this.account_id = account_id;
        return this;
    }

    public String getAccount_username()
    {
        return account_username;
    }

    public AccessTokenResponse setAccount_username(String account_username)
    {
        this.account_username = account_username;
        return this;
    }
}
