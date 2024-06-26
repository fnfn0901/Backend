package SMWU.NaesoneulJAVA.NidonNaedon.services;

import org.springframework.stereotype.Service;
import SMWU.NaesoneulJAVA.NidonNaedon.models.ExpenditureDetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SettlementService {
    // 정산 기능
    public Map<String, Double> calculateSettlement(List<ExpenditureDetails> expenditures) {
        Map<String, Double> balances = new HashMap<>();
        for (ExpenditureDetails expenditure : expenditures) {
            double amountPerParticipant = expenditure.getExpenditureAmount() / expenditure.getExpenditureParticipant().size();
            for (String participant : expenditure.getExpenditureParticipant()) {
                balances.put(participant, balances.getOrDefault(participant, 0.0) - amountPerParticipant);
            }
            Long accountId = expenditure.getAccountId();  // 수정된 부분
            balances.put(accountId.toString(), balances.getOrDefault(accountId.toString(), 0.0) + expenditure.getExpenditureAmount());
        }
        return balances;
    }
}
