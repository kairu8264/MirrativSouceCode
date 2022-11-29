package hf;

import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.net.retrofit.MRRequest;

/* loaded from: classes2.dex */
public final class t0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final MRRequest f35603a;

    /* renamed from: b  reason: collision with root package name */
    public final v0 f35604b;

    /* renamed from: c  reason: collision with root package name */
    public final q0 f35605c;

    @co.f(c = "com.dena.mirrorman.helper.TwitterUseCaseImpl", f = "TwitterUseCaseImpl.kt", l = {19, 21, 30}, m = ApiUtil.TWITTER_SIGNUP_TYPE_LOGIN)
    /* loaded from: classes2.dex */
    public static final class a extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f35606w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35607x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35608y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f35609z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f35609z = obj;
            this.B |= Integer.MIN_VALUE;
            return t0.this.a(null, this);
        }
    }

    public t0(MRRequest mRRequest, v0 v0Var, q0 q0Var) {
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(q0Var, "twitterSessionRepository");
        this.f35603a = mRRequest;
        this.f35604b = v0Var;
        this.f35605c = q0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(2:3|(8:5|6|7|(1:(1:(1:(5:12|13|14|15|(4:17|(1:19)(2:23|(1:25)(1:26))|20|21)(4:27|(2:34|35)|30|31))(2:36|37))(5:38|39|40|15|(0)(0)))(4:41|42|43|44))(4:78|79|80|(1:82)(1:83))|45|46|47|(2:49|(1:51)(4:52|40|15|(0)(0)))(3:53|54|(2:56|(1:58)(4:59|14|15|(0)(0)))(2:60|61))))|46|47|(0)(0))|88|6|7|(0)(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #1 {all -> 0x0193, blocks: (B:34:0x008c, B:36:0x0098, B:43:0x00e3, B:45:0x00eb, B:68:0x0188, B:69:0x0192), top: B:86:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:14:0x003f, B:49:0x0120, B:50:0x0122, B:52:0x012a, B:54:0x0132, B:59:0x015a, B:55:0x0135, B:57:0x013b, B:58:0x0158, B:60:0x015e, B:66:0x0180, B:63:0x0165, B:65:0x016b, B:19:0x0058, B:40:0x00de), top: B:89:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:14:0x003f, B:49:0x0120, B:50:0x0122, B:52:0x012a, B:54:0x0132, B:59:0x015a, B:55:0x0135, B:57:0x013b, B:58:0x0158, B:60:0x015e, B:66:0x0180, B:63:0x0165, B:65:0x016b, B:19:0x0058, B:40:0x00de), top: B:89:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ao.d, hf.t0$a] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // hf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r20, ao.d<? super jf.s0> r21) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.t0.a(java.lang.String, ao.d):java.lang.Object");
    }

    public final boolean b(String str) {
        if (!jo.p.c(str, "Authorize failed.")) {
            if (!(str != null ? so.o.H(str, "request was canceled", false, 2, null) : false)) {
                return false;
            }
        }
        return true;
    }
}
