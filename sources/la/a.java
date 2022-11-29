package la;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.v0;
import io.p;
import la.b;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class a implements q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f39749w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f39750x;

    /* renamed from: y  reason: collision with root package name */
    public final LiveGameApi f39751y;

    /* renamed from: z  reason: collision with root package name */
    public final v0 f39752z;

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailActionCreator$startPlay$1", f = "LiveGameDetailActionCreator.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: la.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0570a extends l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f39753w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f39755y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f39756z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0570a(String str, String str2, String str3, ao.d<? super C0570a> dVar) {
            super(2, dVar);
            this.f39755y = str;
            this.f39756z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0570a(this.f39755y, this.f39756z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0570a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39753w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    if (a.this.f39752z.j()) {
                        a.this.f39749w.a(b.c.f39759a);
                        return v.f59242a;
                    }
                    LiveGameApi liveGameApi = a.this.f39751y;
                    String str = this.f39755y;
                    String str2 = this.f39756z;
                    String str3 = this.A;
                    this.f39753w = 1;
                    obj = liveGameApi.postLiveGameStart(str, str2, false, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f39749w.a(new b.C0571b((LiveGameStartResponse) obj));
            } catch (Throwable th2) {
                a.this.f39749w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, LiveGameApi liveGameApi, v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(liveGameApi, "liveGameApi");
        jo.p.h(v0Var, "userHelper");
        this.f39749w = aVar;
        this.f39750x = mRRequest;
        this.f39751y = liveGameApi;
        this.f39752z = v0Var;
        this.A = new da.b();
    }

    public final void d(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, TtmlNode.ATTR_ID);
        uo.l.d(this, null, null, new C0570a(str, str2, str3, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }
}
