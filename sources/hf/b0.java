package hf;

import com.dena.mirrorman.net.retrofit.MRRequest;

/* loaded from: classes2.dex */
public final class b0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final MRRequest f35498a;

    /* renamed from: b  reason: collision with root package name */
    public final w0 f35499b;

    @co.f(c = "com.dena.mirrorman.helper.GetUserMeRepositoryImpl", f = "GetUserMeRepository.kt", l = {22}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f35500w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f35501x;

        /* renamed from: z  reason: collision with root package name */
        public int f35503z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f35501x = obj;
            this.f35503z |= Integer.MIN_VALUE;
            return b0.this.a(null, false, this);
        }
    }

    public b0(MRRequest mRRequest, w0 w0Var) {
        jo.p.h(mRRequest, "request");
        jo.p.h(w0Var, "userMeCache");
        this.f35498a = mRRequest;
        this.f35499b = w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // hf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r5, boolean r6, ao.d<? super com.dena.mirrorman.net.api.response.user.UserMe> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof hf.b0.a
            if (r0 == 0) goto L13
            r0 = r7
            hf.b0$a r0 = (hf.b0.a) r0
            int r1 = r0.f35503z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35503z = r1
            goto L18
        L13:
            hf.b0$a r0 = new hf.b0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35501x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f35503z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f35500w
            hf.b0 r5 = (hf.b0) r5
            wn.m.b(r7)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            wn.m.b(r7)
            if (r6 == 0) goto L3f
            hf.w0 r6 = r4.f35499b
            r6.clear()
        L3f:
            hf.w0 r6 = r4.f35499b
            com.dena.mirrorman.net.api.response.user.UserMe r6 = r6.get()
            if (r6 == 0) goto L48
            return r6
        L48:
            com.dena.mirrorman.net.retrofit.MRRequest r6 = r4.f35498a
            r0.f35500w = r4
            r0.f35503z = r3
            java.lang.Object r7 = r6.getUserMe(r5, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r5 = r4
        L56:
            com.dena.mirrorman.net.api.response.user.UserMe r7 = (com.dena.mirrorman.net.api.response.user.UserMe) r7
            hf.w0 r5 = r5.f35499b
            r5.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b0.a(java.lang.String, boolean, ao.d):java.lang.Object");
    }
}
