package z9;

import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventDetailResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventResponse;
import com.dena.mirrorman.net.api.Referer;
import pd.q;
import uo.g1;
import uo.i2;
import uo.k0;

/* loaded from: classes.dex */
public final class a extends q0 implements uo.q0 {
    public final ao.g A;

    /* renamed from: y  reason: collision with root package name */
    public final EmomoApi f62791y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f62792z;

    @co.f(c = "com.dena.mirrativ.emomo.giftranking.GiftRankingActionCreator$fetchGiftEvent$1", f = "GiftRankingActionCreator.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: z9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1085a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f62793w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1085a(int i10, ao.d<? super C1085a> dVar) {
            super(2, dVar);
            this.f62795y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C1085a(this.f62795y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C1085a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62793w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.f62791y;
                    int i11 = this.f62795y;
                    this.f62793w = 1;
                    obj = emomoApi.getGiftRankingEventAsync(Referer.Event.GIFT_RANKING, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f62792z.a(new q.b((GiftRankingEventResponse) obj));
            } catch (Throwable th2) {
                a.this.f62792z.a(new q.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.giftranking.GiftRankingActionCreator$fetchGiftEventRanking$1", f = "GiftRankingActionCreator.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ boolean B;

        /* renamed from: w  reason: collision with root package name */
        public int f62796w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62798y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62799z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, int i12, boolean z10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f62798y = i10;
            this.f62799z = i11;
            this.A = i12;
            this.B = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f62798y, this.f62799z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f62796w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.f62791y;
                    int i11 = this.f62798y;
                    int i12 = this.f62799z;
                    int i13 = this.A;
                    Integer d10 = i13 > 0 ? co.b.d(i13) : null;
                    this.f62796w = 1;
                    obj = emomoApi.getGiftRankingEventDetailAsync(Referer.Event.GIFT_RANKING, i11, i12, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f62792z.a(new q.f((GiftRankingEventDetailResponse) obj));
                if (this.B) {
                    a.this.f62792z.a(new q.k(this.A > 0));
                    q8.a aVar = a.this.f62792z;
                    if (this.A <= 0) {
                        z10 = false;
                    }
                    aVar.a(new q.j(z10));
                }
            } catch (Throwable th2) {
                try {
                    a.this.f62792z.a(new q.g(MRErrorKt.convertMRException(th2).getError()));
                } catch (Throwable th3) {
                    a.this.f62792z.a(q.d.f47115a);
                    throw th3;
                }
            }
            a.this.f62792z.a(q.d.f47115a);
            return wn.v.f59242a;
        }
    }

    public a(EmomoApi emomoApi, q8.a aVar) {
        uo.b0 b10;
        jo.p.h(emomoApi, "mirrativRequest");
        jo.p.h(aVar, "dispatcher");
        this.f62791y = emomoApi;
        this.f62792z = aVar;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public static /* synthetic */ void k(a aVar, int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = false;
        }
        aVar.j(i10, i11, i12, z10);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final void h(boolean z10) {
        this.f62792z.a(new q.i(z10));
    }

    public final void i(int i10) {
        uo.l.d(this, null, null, new C1085a(i10, null), 3, null);
    }

    public final void j(int i10, int i11, int i12, boolean z10) {
        this.f62792z.a(q.e.f47116a);
        uo.l.d(this, null, null, new b(i10, i11, i12, z10, null), 3, null);
    }

    public final void l() {
        this.f62792z.a(q.h.f47119a);
    }

    public final void m(int i10) {
        this.f62792z.a(new q.a(i10));
    }

    public final void n(boolean z10) {
        this.f62792z.a(new q.j(z10));
    }

    public final void o(boolean z10) {
        this.f62792z.a(new q.k(z10));
    }
}
