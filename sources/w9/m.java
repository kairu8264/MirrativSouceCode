package w9;

import android.content.Context;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import java.util.List;
import jo.f0;
import kf.x;
import kotlin.KotlinNothingValueException;
import org.json.JSONObject;
import uo.q0;
import xo.w;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f58372w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f58372w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f58372w.b().U();
            jo.p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f58373w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f58374x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f58375y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f58376z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f58373w = aVar;
            this.f58374x = aVar2;
            this.f58375y = aVar3;
            this.f58376z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f58376z;
            vq.a aVar2 = this.f58373w;
            io.a aVar3 = this.f58374x;
            return kq.c.a(this.f58375y, new kq.b(f0.b(r.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingPageKt$EmomoQuestRankingPage$1", f = "EmomoQuestRankingPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ r B;
        public final /* synthetic */ MRLogger C;
        public final /* synthetic */ kf.m D;
        public final /* synthetic */ x E;
        public final /* synthetic */ Context F;

        /* renamed from: w  reason: collision with root package name */
        public int f58377w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f58378x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ w9.c f58379y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f58380z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingPageKt$EmomoQuestRankingPage$1$1", f = "EmomoQuestRankingPage.kt", l = {44}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ x A;
            public final /* synthetic */ String B;
            public final /* synthetic */ int C;

            /* renamed from: w  reason: collision with root package name */
            public int f58381w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r f58382x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ MRLogger f58383y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ kf.m f58384z;

            /* renamed from: w9.m$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0962a implements xo.d<l> {
                public final /* synthetic */ int A;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ MRLogger f58385w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ kf.m f58386x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ x f58387y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ String f58388z;

                public C0962a(MRLogger mRLogger, kf.m mVar, x xVar, String str, int i10) {
                    this.f58385w = mRLogger;
                    this.f58386x = mVar;
                    this.f58387y = xVar;
                    this.f58388z = str;
                    this.A = i10;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(l lVar, ao.d<? super wn.v> dVar) {
                    MRLogger mRLogger = this.f58385w;
                    MRLog.Companion companion = MRLog.Companion;
                    kf.m mVar = this.f58386x;
                    x xVar = this.f58387y;
                    String str = this.f58388z;
                    int i10 = this.A;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_QUEST_RANKING_IMP);
                    builder.setTargetId(MRLog.TARGET_ID_IMP);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rank", lVar.b());
                    jSONObject.put("score", lVar.c());
                    jSONObject.put("grade", lVar.a());
                    jSONObject.put("gift_event_id", i10);
                    wn.v vVar = wn.v.f59242a;
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, mVar.b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, xVar.T4()), wn.q.a(MRLog.PAYLOAD_KEY_WHERE, str), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                    mRLogger.sendLog(builder.build());
                    return vVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, MRLogger mRLogger, kf.m mVar, x xVar, String str, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f58382x = rVar;
                this.f58383y = mRLogger;
                this.f58384z = mVar;
                this.A = xVar;
                this.B = str;
                this.C = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f58382x, this.f58383y, this.f58384z, this.A, this.B, this.C, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58381w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    w<l> j10 = this.f58382x.j();
                    C0962a c0962a = new C0962a(this.f58383y, this.f58384z, this.A, this.B, this.C);
                    this.f58381w = 1;
                    if (j10.a(c0962a, this) == c10) {
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

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingPageKt$EmomoQuestRankingPage$1$2", f = "EmomoQuestRankingPage.kt", l = {65}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f58389w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r f58390x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f58391y;

            /* loaded from: classes.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Context f58392w;

                public a(Context context) {
                    this.f58392w = context;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                    if (mRError instanceof MRError.Failure) {
                        of.n.f45411a.B(this.f58392w, ((MRError.Failure) mRError).getErrorMessage(), false);
                    } else if (mRError instanceof MRError.Blocked) {
                        of.n.f45411a.B(this.f58392w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                    } else {
                        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                            of.n.f45411a.l(this.f58392w, mRError);
                        } else if (mRError instanceof MRError.Network) {
                            of.n.z(this.f58392w);
                        }
                    }
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r rVar, Context context, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f58390x = rVar;
                this.f58391y = context;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f58390x, this.f58391y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f58389w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    w<MRError> i11 = this.f58390x.i();
                    a aVar = new a(this.f58391y);
                    this.f58389w = 1;
                    if (i11.a(aVar, this) == c10) {
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
        public c(w9.c cVar, String str, int i10, r rVar, MRLogger mRLogger, kf.m mVar, x xVar, Context context, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f58379y = cVar;
            this.f58380z = str;
            this.A = i10;
            this.B = rVar;
            this.C = mRLogger;
            this.D = mVar;
            this.E = xVar;
            this.F = context;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f58379y, this.f58380z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
            cVar.f58378x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58377w == 0) {
                wn.m.b(obj);
                q0 q0Var = (q0) this.f58378x;
                this.f58379y.c(this.f58380z, this.A);
                uo.l.d(q0Var, null, null, new a(this.B, this.C, this.D, this.E, this.f58380z, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.B, this.F, null), 3, null);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<Integer, List<? extends aa.e>, wn.v> f58393w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r f58394x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.p<? super Integer, ? super List<? extends aa.e>, wn.v> pVar, r rVar) {
            super(1);
            this.f58393w = pVar;
            this.f58394x = rVar;
        }

        public final void a(int i10) {
            this.f58393w.invoke(Integer.valueOf(i10), this.f58394x.l().getValue());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<Integer, List<? extends aa.e>, wn.v> f58395w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r f58396x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.p<? super Integer, ? super List<? extends aa.e>, wn.v> pVar, r rVar) {
            super(1);
            this.f58395w = pVar;
            this.f58396x = rVar;
        }

        public final void a(int i10) {
            this.f58395w.invoke(Integer.valueOf(i10), this.f58396x.k().getValue());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<String, wn.v> A;
        public final /* synthetic */ io.l<Integer, wn.v> B;
        public final /* synthetic */ io.p<Integer, List<? extends aa.e>, wn.v> C;
        public final /* synthetic */ io.p<Integer, List<? extends aa.e>, wn.v> D;
        public final /* synthetic */ io.a<wn.v> E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f58397w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f58398x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f58399y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f58400z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(String str, int i10, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.l<? super Integer, wn.v> lVar3, io.p<? super Integer, ? super List<? extends aa.e>, wn.v> pVar, io.p<? super Integer, ? super List<? extends aa.e>, wn.v> pVar2, io.a<wn.v> aVar, int i11) {
            super(2);
            this.f58397w = str;
            this.f58398x = i10;
            this.f58399y = z10;
            this.f58400z = lVar;
            this.A = lVar2;
            this.B = lVar3;
            this.C = pVar;
            this.D = pVar2;
            this.E = aVar;
            this.F = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f58397w, this.f58398x, this.f58399y, this.f58400z, this.A, this.B, this.C, this.D, this.E, iVar, this.F | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
        if (r3 == l0.i.f39065a.a()) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r28, int r29, boolean r30, io.l<? super java.lang.String, wn.v> r31, io.l<? super java.lang.String, wn.v> r32, io.l<? super java.lang.Integer, wn.v> r33, io.p<? super java.lang.Integer, ? super java.util.List<? extends aa.e>, wn.v> r34, io.p<? super java.lang.Integer, ? super java.util.List<? extends aa.e>, wn.v> r35, io.a<wn.v> r36, l0.i r37, int r38) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.m.a(java.lang.String, int, boolean, io.l, io.l, io.l, io.p, io.p, io.a, l0.i, int):void");
    }
}
