package xm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q DEFAULT;
    public static final q STRING;

    /* loaded from: classes4.dex */
    public enum a extends q {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        q qVar = new q("STRING", 1) { // from class: xm.q.b
        };
        STRING = qVar;
        $VALUES = new q[]{aVar, qVar};
    }

    public q(String str, int i10) {
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
