package ba;

import ba.u;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import uo.q0;

/* loaded from: classes.dex */
public final class t implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f17192w;

    /* renamed from: x  reason: collision with root package name */
    public final EmomoApi f17193x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f17194y;

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunRankingDialogActionCreator$fetchEmomoRunEvent$1", f = "EmomoRunRankingDialogActionCreator.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17195w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17197y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17198z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f17197y = str;
            this.f17198z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f17197y, this.f17198z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17195w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = t.this.f17193x;
                    String str = this.f17197y;
                    int i11 = this.f17198z;
                    this.f17195w = 1;
                    obj = emomoApi.getEmomoRunEvent(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                t.this.f17192w.a(new u.c((EmomoRunEventResponse) obj));
            } catch (Throwable th2) {
                t.this.f17192w.a(new u.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public t(q8.a aVar, EmomoApi emomoApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(emomoApi, "emomoApi");
        this.f17192w = aVar;
        this.f17193x = emomoApi;
        this.f17194y = new da.b();
    }

    public final void c(String str, int i10) {
        jo.p.h(str, "referer");
        this.f17192w.a(u.b.f17200a);
        uo.l.d(this, null, null, new a(str, i10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f17194y.getCoroutineContext();
    }
}
