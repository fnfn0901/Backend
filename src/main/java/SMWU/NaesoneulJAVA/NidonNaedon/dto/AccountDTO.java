package SMWU.NaesoneulJAVA.NidonNaedon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@Schema(description = "계정 정보 DTO")
public class AccountDTO {

    @Schema(description = "가계부 ID", example = "ai/12345678-1234-1234-1234-123456789012")
    private String accountId;

    @Schema(description = "가계부 이름", example = "가족 계정")
    private String accountName;

    @Schema(description = "가계부 일정", example = "2023-01-01")
    private String accountSchedule;

    @Schema(description = "가계부 화폐", example = "KRW")
    private String accountCurrency;

    @Schema(description = "가계부 환율", example = "1.0")
    private Double accountExchangeRate;

    @Schema(description = "가계부 참여자 목록")
    private List<String> accountParticipantList;

    // Getters and Setters

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountSchedule() {
        return accountSchedule;
    }

    public void setAccountSchedule(String accountSchedule) {
        this.accountSchedule = accountSchedule;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public Double getAccountExchangeRate() {
        return accountExchangeRate;
    }

    public void setAccountExchangeRate(Double accountExchangeRate) {
        this.accountExchangeRate = accountExchangeRate;
    }

    public List<String> getAccountParticipantList() {
        return accountParticipantList;
    }

    public void setAccountParticipantList(List<String> accountParticipantList) {
        this.accountParticipantList = accountParticipantList;
    }
}
