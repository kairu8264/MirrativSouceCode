package ma;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameGiftHelpResponse;
import io.p;
import ma.b;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f40628w;

    /* renamed from: x  reason: collision with root package name */
    public final LiveGameApi f40629x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f40630y;

    @co.f(c = "com.dena.mirrativ.livegame.gifthelp.LiveGameGiftHelpActionCreator$fetchLiveGameGiftHelp$1", f = "LiveGameGiftHelpActionCreator.kt", l = {17}, m = "invokeSuspend")
    /* renamed from: ma.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0593a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40631w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40633y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40634z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0593a(String str, String str2, ao.d<? super C0593a> dVar) {
            super(2, dVar);
            this.f40633y = str;
            this.f40634z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0593a(this.f40633y, this.f40634z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0593a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40631w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    LiveGameApi liveGameApi = a.this.f40629x;
                    String str = this.f40633y;
                    String str2 = this.f40634z;
                    this.f40631w = 1;
                    obj = liveGameApi.getLiveGameGiftHelp(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f40628w.a(new b.C0594b((LiveGameGiftHelpResponse) obj));
            } catch (Throwable th2) {
                a.this.f40628w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, LiveGameApi liveGameApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(liveGameApi, "liveGameApi");
        this.f40628w = aVar;
        this.f40629x = liveGameApi;
        this.f40630y = new da.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveGameId");
        uo.l.d(this, null, null, new C0593a(str, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f40630y.getCoroutineContext();
    }
}
