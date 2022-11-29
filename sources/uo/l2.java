package uo;

/* loaded from: classes4.dex */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    public static final zo.k0 f56053a = new zo.k0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final zo.k0 f56054b = new zo.k0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    public static final zo.k0 f56055c = new zo.k0("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    public static final zo.k0 f56056d = new zo.k0("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    public static final zo.k0 f56057e = new zo.k0("SEALED");

    /* renamed from: f  reason: collision with root package name */
    public static final l1 f56058f = new l1(false);

    /* renamed from: g  reason: collision with root package name */
    public static final l1 f56059g = new l1(true);

    public static final Object g(Object obj) {
        return obj instanceof x1 ? new y1((x1) obj) : obj;
    }

    public static final Object h(Object obj) {
        x1 x1Var;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        return (y1Var == null || (x1Var = y1Var.f56099a) == null) ? obj : x1Var;
    }
}
