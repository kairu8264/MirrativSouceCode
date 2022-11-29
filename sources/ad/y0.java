package ad;

/* loaded from: classes2.dex */
public enum y0 {
    MAJOR(null, 0),
    INDEX_A(Integer.valueOf(nc.i.text_contract_bank_index1), 1),
    INDEX_KA(Integer.valueOf(nc.i.text_contract_bank_index2), 2),
    INDEX_SA(Integer.valueOf(nc.i.text_contract_bank_index3), 3),
    INDEX_TA(Integer.valueOf(nc.i.text_contract_bank_index4), 4),
    INDEX_NA(Integer.valueOf(nc.i.text_contract_bank_index5), 5),
    INDEX_HA(Integer.valueOf(nc.i.text_contract_bank_index6), 6),
    INDEX_MA(Integer.valueOf(nc.i.text_contract_bank_index7), 7),
    INDEX_YA(Integer.valueOf(nc.i.text_contract_bank_index8), 8),
    INDEX_RA(Integer.valueOf(nc.i.text_contract_bank_index9), 9),
    INDEX_WA(Integer.valueOf(nc.i.text_contract_bank_index10), 10);
    
    private final int index;
    private final Integer title;

    y0(Integer num, int i10) {
        this.title = num;
        this.index = i10;
    }

    public final int c() {
        return this.index;
    }

    public final Integer e() {
        return this.title;
    }
}
