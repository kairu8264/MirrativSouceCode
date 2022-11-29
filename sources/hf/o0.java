package hf;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.twitter.sdk.android.core.TwitterException;
import oq.a;
import wn.l;

/* loaded from: classes2.dex */
public final class o0 implements uo.q0, oq.a {
    public static final a D = new a(null);
    public static final int E = 8;
    public final kf.x A;
    public final /* synthetic */ da.j B;
    public final wn.f C;

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f35573w;

    /* renamed from: x  reason: collision with root package name */
    public final v0 f35574x;

    /* renamed from: y  reason: collision with root package name */
    public final of.r f35575y;

    /* renamed from: z  reason: collision with root package name */
    public final kf.t f35576z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        Success,
        Failed,
        Cancelled
    }

    @co.f(c = "com.dena.mirrorman.helper.TwitterHelper$loginWithTwitter$2$1$1", f = "TwitterHelper.kt", l = {67, 72, 83, 117}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ androidx.fragment.app.h A;
        public final /* synthetic */ String B;
        public final /* synthetic */ ao.d<wn.p<? extends b, Social.SocialAccount, ? extends in.x>> C;
        public final /* synthetic */ FragmentManager D;

        /* renamed from: w  reason: collision with root package name */
        public Object f35577w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35578x;

        /* renamed from: y  reason: collision with root package name */
        public int f35579y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.fragment.app.h hVar, String str, ao.d<? super wn.p<? extends b, Social.SocialAccount, ? extends in.x>> dVar, FragmentManager fragmentManager, ao.d<? super c> dVar2) {
            super(2, dVar2);
            this.A = hVar;
            this.B = str;
            this.C = dVar;
            this.D = fragmentManager;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x010e A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:9:0x0024, B:53:0x01c9, B:14:0x0035, B:38:0x00ff, B:39:0x0102, B:41:0x010e, B:43:0x0120, B:45:0x015f, B:47:0x0165, B:49:0x01a7, B:17:0x0041, B:32:0x00b9, B:18:0x0049, B:26:0x0062, B:28:0x0071, B:33:0x00bc, B:35:0x00ca, B:54:0x01dd, B:23:0x0055), top: B:84:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c7  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 637
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.o0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends in.c<in.x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ao.d<in.x> f35581a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ao.d<? super in.x> dVar) {
            this.f35581a = dVar;
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            jo.p.h(twitterException, i7.e.f36387u);
            ao.d<in.x> dVar = this.f35581a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(wn.m.a(twitterException)));
        }

        @Override // in.c
        public void d(in.l<in.x> lVar) {
            jo.p.h(lVar, "result");
            ao.d<in.x> dVar = this.f35581a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(lVar.f36917a));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f35582w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35583x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f35582w = aVar;
            this.f35583x = aVar2;
            this.f35584y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f35582w;
            vq.a aVar2 = this.f35583x;
            io.a<? extends uq.a> aVar3 = this.f35584y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    public o0(MRRequest mRRequest, v0 v0Var, of.r rVar, kf.t tVar, kf.x xVar) {
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(rVar, "profileUtil");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(xVar, "userPreference");
        this.f35573w = mRRequest;
        this.f35574x = v0Var;
        this.f35575y = rVar;
        this.f35576z = tVar;
        this.A = xVar;
        this.B = new da.j();
        this.C = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final boolean h(TwitterException twitterException) {
        String message = twitterException.getMessage();
        return message != null && (jo.p.c(message, "Authorize failed.") || so.o.H(message, "request was canceled", false, 2, null));
    }

    public final tb.c i() {
        return (tb.c) this.C.getValue();
    }

    public final Object j(androidx.fragment.app.h hVar, FragmentManager fragmentManager, String str, ao.d<? super wn.p<? extends b, Social.SocialAccount, ? extends in.x>> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        uo.l.d(uo.r0.a(getCoroutineContext()), null, null, new c(hVar, str, iVar, fragmentManager, null), 3, null);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10;
    }

    public final void k() {
        this.f35576z.u3();
        this.A.R1("");
    }

    public final Object l(Activity activity, ao.d<? super in.x> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        new jn.f().a(activity, new d(iVar));
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10;
    }
}
