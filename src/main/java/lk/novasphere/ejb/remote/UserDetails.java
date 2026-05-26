package lk.novasphere.ejb.remote;

import jakarta.ejb.Remote;

@Remote
public interface UserDetails {
    String getUsername();
    String getEmail();
}
