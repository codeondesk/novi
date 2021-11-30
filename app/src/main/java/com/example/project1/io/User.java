package com.example.project1.io;

public class User {
    private String access_token="6AANov3Vn6-a8--q9HTGBPLe-xTVZH3sbOSkuEseHHVzgcx9ILWUfRi1BOwWs65_6nraTCxZKtd2Cq29xy1AE8B9OjOQCNqmxpdBqBXUEe2drhng6jzcEtVXLrt84yb3XKbI5zETYlNygu7MnHN6c7Ek9KAX_ps0SWlue-QD6ariw6lpw4fzMjzqJbdy2ufei6q7VR8zU7AvfQJzGRi7Yw";
    private String token_type = "Bearer";


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
