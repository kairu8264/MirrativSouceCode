package hd;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum COIN_GIFT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p CASH_BONUS;
    public static final p COIN_GIFT;
    public static final p REWARD;
    public static final p TAX;
    private final int stringResource;
    private final int type;

    static {
        int i10 = nc.i.text_monthly_rank_member_passbook_reward_history_coin_gift;
        COIN_GIFT = new p("COIN_GIFT", 0, i10, 1);
        REWARD = new p("REWARD", 1, nc.i.text_monthly_rank_member_passbook_reward_history_amount_of_money, 3);
        TAX = new p("TAX", 2, i10, 5);
        CASH_BONUS = new p("CASH_BONUS", 3, nc.i.text_menu_cash_bonus_history_title, 6);
        $VALUES = a();
    }

    public p(String str, int i10, int i11, int i12) {
        this.stringResource = i11;
        this.type = i12;
    }

    public static final /* synthetic */ p[] a() {
        return new p[]{COIN_GIFT, REWARD, TAX, CASH_BONUS};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final int c() {
        return this.type;
    }
}
