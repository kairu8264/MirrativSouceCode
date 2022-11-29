package ad;

/* loaded from: classes2.dex */
public enum b1 {
    REQUIRED_CONFIRM_IDENTIFICATION_DOCUMENT(Integer.valueOf(nc.i.text_monthly_rank_member_alert_pending_identification_document)),
    REQUIRED_REGISTER_BANK_ACCOUNT(Integer.valueOf(nc.i.text_monthly_rank_member_alert_register_cash_payment)),
    REQUIRED_REGISTER_IDENTIFICATION(Integer.valueOf(nc.i.text_monthly_rank_member_alert_register_identification_and_cash_payment)),
    ENABLED_CONTRACT_START(null);
    
    private final Integer textResourceId;

    b1(Integer num) {
        this.textResourceId = num;
    }

    public final Integer c() {
        return this.textResourceId;
    }
}
