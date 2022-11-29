package ai;

/* loaded from: classes3.dex */
public class t34 {

    /* renamed from: x  reason: collision with root package name */
    public static final t34 f10093x;
    @Deprecated

    /* renamed from: y  reason: collision with root package name */
    public static final t34 f10094y;

    /* renamed from: z  reason: collision with root package name */
    public static final x2<t34> f10095z;

    /* renamed from: a  reason: collision with root package name */
    public final int f10096a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public final int f10097b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final int f10098c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public final int f10099d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public final int f10100e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f10101f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final int f10102g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final int f10103h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f10104i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10105j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10106k;

    /* renamed from: l  reason: collision with root package name */
    public final zz2<String> f10107l;

    /* renamed from: m  reason: collision with root package name */
    public final zz2<String> f10108m;

    /* renamed from: n  reason: collision with root package name */
    public final int f10109n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10110o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10111p;

    /* renamed from: q  reason: collision with root package name */
    public final zz2<String> f10112q;

    /* renamed from: r  reason: collision with root package name */
    public final zz2<String> f10113r;

    /* renamed from: s  reason: collision with root package name */
    public final int f10114s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f10115t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f10116u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f10117v;

    /* renamed from: w  reason: collision with root package name */
    public final j03<Integer> f10118w;

    static {
        t34 t34Var = new t34(new x24());
        f10093x = t34Var;
        f10094y = t34Var;
        f10095z = w14.f11460a;
    }

    public t34(x24 x24Var) {
        int i10;
        int i11;
        boolean z10;
        zz2<String> zz2Var;
        zz2<String> zz2Var2;
        zz2<String> zz2Var3;
        zz2<String> zz2Var4;
        int i12;
        j03<Integer> j03Var;
        i10 = x24Var.f11846a;
        this.f10104i = i10;
        i11 = x24Var.f11847b;
        this.f10105j = i11;
        z10 = x24Var.f11848c;
        this.f10106k = z10;
        zz2Var = x24Var.f11849d;
        this.f10107l = zz2Var;
        zz2Var2 = x24Var.f11850e;
        this.f10108m = zz2Var2;
        this.f10109n = 0;
        this.f10110o = Integer.MAX_VALUE;
        this.f10111p = Integer.MAX_VALUE;
        zz2Var3 = x24Var.f11851f;
        this.f10112q = zz2Var3;
        zz2Var4 = x24Var.f11852g;
        this.f10113r = zz2Var4;
        i12 = x24Var.f11853h;
        this.f10114s = i12;
        this.f10115t = false;
        this.f10116u = false;
        this.f10117v = false;
        j03Var = x24Var.f11854i;
        this.f10118w = j03Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t34 t34Var = (t34) obj;
            if (this.f10106k == t34Var.f10106k && this.f10104i == t34Var.f10104i && this.f10105j == t34Var.f10105j && this.f10107l.equals(t34Var.f10107l) && this.f10108m.equals(t34Var.f10108m) && this.f10112q.equals(t34Var.f10112q) && this.f10113r.equals(t34Var.f10113r) && this.f10114s == t34Var.f10114s && this.f10118w.equals(t34Var.f10118w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f10106k ? 1 : 0) - 1048002209) * 31) + this.f10104i) * 31) + this.f10105j) * 31) + this.f10107l.hashCode()) * 31) + this.f10108m.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f10112q.hashCode()) * 31) + this.f10113r.hashCode()) * 31) + this.f10114s) * 923521) + this.f10118w.hashCode();
    }
}
