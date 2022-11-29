package y9;

import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.f;
import co.l;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jo.f0;
import jo.p;
import jo.q;
import kf.m;
import kf.x;
import kotlin.KotlinNothingValueException;
import l0.c0;
import l0.i;
import l0.l1;
import org.json.JSONObject;
import uo.q0;
import w9.r;
import wn.v;
import xn.s;
import xo.w;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f61322w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f61322w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f61322w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f61323w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f61324x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f61325y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f61326z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f61323w = aVar;
            this.f61324x = aVar2;
            this.f61325y = aVar3;
            this.f61326z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f61326z;
            vq.a aVar2 = this.f61323w;
            io.a aVar3 = this.f61324x;
            return kq.c.a(this.f61325y, new kq.b(f0.b(r.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.dialog.EmomoQuestRankingPageKt$EmomoQuestRankingPage$1", f = "EmomoQuestRankingPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ r B;
        public final /* synthetic */ MRLogger C;
        public final /* synthetic */ m D;
        public final /* synthetic */ x E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public int f61327w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f61328x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w9.c f61329y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f61330z;

        @f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.dialog.EmomoQuestRankingPageKt$EmomoQuestRankingPage$1$1", f = "EmomoQuestRankingPage.kt", l = {36}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements io.p<q0, ao.d<? super v>, Object> {
            public final /* synthetic */ x A;
            public final /* synthetic */ String B;
            public final /* synthetic */ int C;
            public final /* synthetic */ int D;

            /* renamed from: w  reason: collision with root package name */
            public int f61331w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r f61332x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ MRLogger f61333y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ m f61334z;

            /* renamed from: y9.d$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1044a implements xo.d<w9.l> {
                public final /* synthetic */ int A;
                public final /* synthetic */ int B;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ MRLogger f61335w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ m f61336x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ x f61337y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ String f61338z;

                public C1044a(MRLogger mRLogger, m mVar, x xVar, String str, int i10, int i11) {
                    this.f61335w = mRLogger;
                    this.f61336x = mVar;
                    this.f61337y = xVar;
                    this.f61338z = str;
                    this.A = i10;
                    this.B = i11;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(w9.l lVar, ao.d<? super v> dVar) {
                    MRLogger mRLogger = this.f61335w;
                    MRLog.Companion companion = MRLog.Companion;
                    m mVar = this.f61336x;
                    x xVar = this.f61337y;
                    String str = this.f61338z;
                    int i10 = this.A;
                    int i11 = this.B;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_QUEST_RANKING_IMP);
                    builder.setTargetId(MRLog.TARGET_ID_IMP);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rank", lVar.b());
                    jSONObject.put("score", lVar.c());
                    jSONObject.put("grade", lVar.a());
                    jSONObject.put("gift_event_id", i10);
                    jSONObject.put("game_no", i11);
                    v vVar = v.f59242a;
                    builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, mVar.b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, xVar.T4()), wn.q.a(MRLog.PAYLOAD_KEY_WHERE, str), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                    mRLogger.sendLog(builder.build());
                    return vVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, MRLogger mRLogger, m mVar, x xVar, String str, int i10, int i11, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f61332x = rVar;
                this.f61333y = mRLogger;
                this.f61334z = mVar;
                this.A = xVar;
                this.B = str;
                this.C = i10;
                this.D = i11;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f61332x, this.f61333y, this.f61334z, this.A, this.B, this.C, this.D, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f61331w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    w<w9.l> j10 = this.f61332x.j();
                    C1044a c1044a = new C1044a(this.f61333y, this.f61334z, this.A, this.B, this.C, this.D);
                    this.f61331w = 1;
                    if (j10.a(c1044a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w9.c cVar, String str, int i10, r rVar, MRLogger mRLogger, m mVar, x xVar, int i11, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f61329y = cVar;
            this.f61330z = str;
            this.A = i10;
            this.B = rVar;
            this.C = mRLogger;
            this.D = mVar;
            this.E = xVar;
            this.F = i11;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f61329y, this.f61330z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
            cVar.f61328x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f61327w == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f61328x;
                this.f61329y.c(this.f61330z, this.A);
                uo.l.d(q0Var, null, null, new a(this.B, this.C, this.D, this.E, this.f61330z, this.A, this.F, null), 3, null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: y9.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1045d extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f61339w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f61340x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f61341y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f61342z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1045d(String str, int i10, int i11, io.a<v> aVar, int i12) {
            super(2);
            this.f61339w = str;
            this.f61340x = i10;
            this.f61341y = i11;
            this.f61342z = aVar;
            this.A = i12;
        }

        public final void a(i iVar, int i10) {
            d.a(this.f61339w, this.f61340x, this.f61341y, this.f61342z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(String str, int i10, int i11, io.a<v> aVar, i iVar, int i12) {
        int i13;
        p.h(str, "referer");
        p.h(aVar, "onClickClose");
        i h10 = iVar.h(37950568);
        if ((i12 & 14) == 0) {
            i13 = (h10.P(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= h10.d(i10) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= h10.d(i11) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= h10.P(aVar) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i14 & 5851) == 1170 && h10.j()) {
            h10.I();
        } else {
            h10.x(1509148303);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new s0(f0.b(r.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            r rVar = (r) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == i.f39065a.a()) {
                y11 = b11.c(f0.b(w9.c.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            w9.c cVar = (w9.c) y11;
            h10.x(-909571169);
            xq.a b12 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P3 = h10.P(null) | h10.P(null);
            Object y12 = h10.y();
            if (P3 || y12 == i.f39065a.a()) {
                y12 = b12.c(f0.b(MRLogger.class), null, null);
                h10.q(y12);
            }
            h10.O();
            h10.O();
            MRLogger mRLogger = (MRLogger) y12;
            h10.x(-909571169);
            xq.a b13 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P4 = h10.P(null) | h10.P(null);
            Object y13 = h10.y();
            if (P4 || y13 == i.f39065a.a()) {
                y13 = b13.c(f0.b(m.class), null, null);
                h10.q(y13);
            }
            h10.O();
            h10.O();
            m mVar = (m) y13;
            h10.x(-909571169);
            xq.a b14 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P5 = h10.P(null) | h10.P(null);
            Object y14 = h10.y();
            if (P5 || y14 == i.f39065a.a()) {
                y14 = b14.c(f0.b(x.class), null, null);
                h10.q(y14);
            }
            h10.O();
            h10.O();
            c0.c(v.f59242a, new c(cVar, str, i10, rVar, mRLogger, mVar, (x) y14, i11, null), h10, 64);
            e.a(rVar.m(), rVar.h(), aVar, h10, (i14 >> 3) & 896);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C1045d(str, i10, i11, aVar, i12));
    }
}
