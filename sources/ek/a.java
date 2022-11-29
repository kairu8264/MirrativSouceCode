package ek;

import android.app.Activity;
import bo.c;
import co.d;
import co.f;
import com.google.android.play.core.review.ReviewInfo;
import jo.p;
import wn.v;

/* loaded from: classes3.dex */
public final class a {

    @f(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", l = {17}, m = "requestReview")
    /* renamed from: ek.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0305a extends d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f30630w;

        /* renamed from: x  reason: collision with root package name */
        public int f30631x;

        /* renamed from: y  reason: collision with root package name */
        public Object f30632y;

        public C0305a(ao.d dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f30630w = obj;
            this.f30631x |= Integer.MIN_VALUE;
            return a.b(null, this);
        }
    }

    public static final Object a(gk.a aVar, Activity activity, ReviewInfo reviewInfo, ao.d<? super v> dVar) {
        jk.d<Void> b10 = aVar.b(activity, reviewInfo);
        p.d(b10, "launchReviewFlow(activity, reviewInfo)");
        Object b11 = b.b(b10, null, dVar, 2, null);
        return b11 == c.c() ? b11 : v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(gk.a r4, ao.d<? super com.google.android.play.core.review.ReviewInfo> r5) {
        /*
            boolean r0 = r5 instanceof ek.a.C0305a
            if (r0 == 0) goto L13
            r0 = r5
            ek.a$a r0 = (ek.a.C0305a) r0
            int r1 = r0.f30631x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30631x = r1
            goto L18
        L13:
            ek.a$a r0 = new ek.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f30630w
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f30631x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f30632y
            gk.a r4 = (gk.a) r4
            wn.m.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            wn.m.b(r5)
            jk.d r5 = r4.a()
            java.lang.String r2 = "requestReviewFlow()"
            jo.p.d(r5, r2)
            r2 = 2
            r0.f30632y = r4
            r0.f30631x = r3
            r4 = 0
            java.lang.Object r5 = ek.b.b(r5, r4, r0, r2, r4)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r4 = "runTask(requestReviewFlow())"
            jo.p.d(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.a.b(gk.a, ao.d):java.lang.Object");
    }
}
