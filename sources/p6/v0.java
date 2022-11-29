package p6;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f46124a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f46125b = false;

    /* renamed from: c  reason: collision with root package name */
    public String f46126c;

    /* renamed from: d  reason: collision with root package name */
    public String f46127d;

    /* renamed from: e  reason: collision with root package name */
    public String f46128e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f46129f;

    /* renamed from: g  reason: collision with root package name */
    public b f46130g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f46131h;

    /* renamed from: i  reason: collision with root package name */
    public f f46132i;

    /* renamed from: j  reason: collision with root package name */
    public Long f46133j;

    /* renamed from: k  reason: collision with root package name */
    public Long f46134k;

    /* renamed from: l  reason: collision with root package name */
    public Long f46135l;

    /* renamed from: m  reason: collision with root package name */
    public c f46136m;

    /* renamed from: n  reason: collision with root package name */
    public Map<String, String> f46137n;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46138a;

        static {
            int[] iArr = new int[b.values().length];
            f46138a = iArr;
            try {
                iArr[b.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46138a[b.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46138a[b.ATTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46138a[b.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static v0 a(c cVar, Map<String, String> map) {
        v0 z0Var;
        b a10 = cVar.a();
        int i10 = a.f46138a[a10.ordinal()];
        if (i10 == 1) {
            z0Var = new z0(cVar);
        } else if (i10 == 2) {
            z0Var = new x0();
        } else if (i10 == 3) {
            z0Var = new s();
        } else if (i10 != 4) {
            z0Var = new v0();
        } else {
            z0Var = new v(cVar);
        }
        z0Var.f46130g = a10;
        z0Var.f46136m = cVar;
        z0Var.f46137n = map;
        return z0Var;
    }

    public String toString() {
        return c1.k("message:%s timestamp:%s json:%s", this.f46127d, this.f46128e, this.f46129f);
    }
}
