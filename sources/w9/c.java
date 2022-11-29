package w9;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEventResponse;
import uo.q0;
import w9.d;

/* loaded from: classes.dex */
public final class c implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f58274w;

    /* renamed from: x  reason: collision with root package name */
    public final EmomoApi f58275x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f58276y;

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingActionCreator$fetchEmomoQuestEvent$1", f = "EmomoQuestRankingActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58277w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f58279y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f58280z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f58279y = str;
            this.f58280z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f58279y, this.f58280z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58277w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = c.this.f58275x;
                    String str = this.f58279y;
                    int i11 = this.f58280z;
                    this.f58277w = 1;
                    obj = emomoApi.getEmomoQuestEvent(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                c.this.f58274w.a(new d.c((EmomoQuestEventResponse) obj));
            } catch (Throwable th2) {
                c.this.f58274w.a(new d.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public c(q8.a aVar, EmomoApi emomoApi) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(emomoApi, "api");
        this.f58274w = aVar;
        this.f58275x = emomoApi;
        this.f58276y = new da.b();
    }

    public final void c(String str, int i10) {
        jo.p.h(str, "referer");
        this.f58274w.a(d.b.f58282a);
        uo.l.d(this, null, null, new a(str, i10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f58276y.getCoroutineContext();
    }
}
