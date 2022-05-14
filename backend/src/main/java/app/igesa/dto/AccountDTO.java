package app.igesa.dto;
import app.igesa.entity.Account;
import app.igesa.entity.Groupe;
import app.igesa.entity.Role;
import app.igesa.enumerations.AccountStatus;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  @author Tarchoun Abir
 */

@Data
@Builder
public class AccountDTO {
    private Long id;
    private String username;
    @Email
    private String email;
    private String password;
    private String matchingPassword;
    private String fiscaleCode ;
    private AccountStatus accountStatus;
    protected Date lastModifiedDate;
    protected Date createdDate;
    private Long groupId;
    private Set<Role> roles = new HashSet<>();
   //private GroupeDTO groupe ;

    public static AccountDTO fromEntity(Account account) {

        return AccountDTO.builder()
                .id(account.getId())
                .fiscaleCode(account.getFiscaleCode())
                .username(account.getUsername())
                .email(account.getEmail())
                .accountStatus(account.getAccountStatus())
                .matchingPassword(account.getMatchingPassword())
                .password(account.getPassword())
                .lastModifiedDate(account.getLastModifiedDate())
                .groupId(account.getGroupe().getId())
                .roles(account.getRoles())
                .createdDate(account.getCreatedDate())
                .build();
    }

    public static Account toEntity(AccountDTO dto) {

        Account account = new Account();
        account.setId(dto.getId());
        account.setAccountStatus(dto.getAccountStatus());
        account.setUsername(dto.getUsername());
        account.setEmail(dto.getEmail());
        account.setPassword(dto.getPassword());
        account.setFiscaleCode(dto.getFiscaleCode());
         account.setMatchingPassword(dto.getMatchingPassword());
        account.setCreatedDate(dto.getCreatedDate());
        account.setLastModifiedDate(dto.getLastModifiedDate());
        account.setRoles(dto.getRoles());
        Groupe groupe = new Groupe();
        groupe.setId(dto.getGroupId());
        account.setGroupe(groupe);
        return account;
    }


}