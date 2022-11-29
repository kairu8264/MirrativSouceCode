package w9;

import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;
import ha.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import w9.d;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class r extends q0 implements uo.q0 {
    public final s0<ha.a> A;
    public final c2<ha.a> B;
    public final s0<x9.a> C;
    public final c2<x9.a> D;
    public final s0<List<aa.e>> E;
    public final c2<List<aa.e>> F;
    public final s0<List<aa.e>> G;
    public final c2<List<aa.e>> H;
    public final xo.r<l> I;
    public final w<l> J;
    public final xo.r<MRError> K;
    public final w<MRError> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f58430y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f58431z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58432a;

        static {
            int[] iArr = new int[GiftItemEffectType.values().length];
            iArr[GiftItemEffectType.EMOMO_QUEST.ordinal()] = 1;
            f58432a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingStore$on$3", f = "EmomoQuestRankingStore.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58433w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d.c f58435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d.c cVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f58435y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f58435y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58433w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = r.this.I;
                l a10 = l.f58368d.a(this.f58435y.a());
                this.f58433w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingStore$on$4", f = "EmomoQuestRankingStore.kt", l = {104}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58436w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d.a f58438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f58438y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f58438y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58436w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = r.this.K;
                MRError a10 = this.f58438y.a();
                this.f58436w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public r(q8.a aVar) {
        s0<ha.a> e10;
        s0<x9.a> e11;
        s0<List<aa.e>> e12;
        s0<List<aa.e>> e13;
        jo.p.h(aVar, "dispatcher");
        this.f58430y = aVar;
        this.f58431z = r0.b();
        aVar.b(this);
        e10 = z1.e(a.d.f34697b, null, 2, null);
        this.A = e10;
        this.B = e10;
        e11 = z1.e(null, null, 2, null);
        this.C = e11;
        this.D = e11;
        e12 = z1.e(xn.s.k(), null, 2, null);
        this.E = e12;
        this.F = e12;
        e13 = z1.e(xn.s.k(), null, 2, null);
        this.G = e13;
        this.H = e13;
        xo.r<l> b10 = y.b(0, 0, null, 7, null);
        this.I = b10;
        this.J = xo.e.b(b10);
        xo.r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.K = b11;
        this.L = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f58430y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f58431z.getCoroutineContext();
    }

    public final c2<x9.a> h() {
        return this.D;
    }

    public final w<MRError> i() {
        return this.L;
    }

    public final w<l> j() {
        return this.J;
    }

    public final c2<List<aa.e>> k() {
        return this.H;
    }

    public final c2<List<aa.e>> l() {
        return this.F;
    }

    public final c2<ha.a> m() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.b bVar) {
        jo.p.h(bVar, "event");
        this.A.setValue(a.b.f34695b);
        this.C.setValue(null);
        this.E.setValue(xn.s.k());
        this.G.setValue(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.c cVar) {
        aa.e a10;
        aa.e a11;
        jo.p.h(cVar, "event");
        this.A.setValue(a.d.f34697b);
        this.C.setValue(x9.a.f59811f.a(cVar.a()));
        s0<List<aa.e>> s0Var = this.E;
        List<EmomoQuestReward> stageRewards = cVar.a().getStageRewards();
        ArrayList arrayList = new ArrayList(xn.t.u(stageRewards, 10));
        Iterator<T> it = stageRewards.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EmomoQuestReward emomoQuestReward = (EmomoQuestReward) it.next();
            GiftItemEffect effect = emomoQuestReward.getEffect();
            GiftItemEffectType type = effect != null ? effect.getType() : null;
            if ((type != null ? a.f58432a[type.ordinal()] : -1) == 1) {
                a11 = aa.b.M.a(emomoQuestReward, cVar.a().getAchievedImageUrl());
            } else {
                a11 = aa.d.H.a(emomoQuestReward, cVar.a().getAchievedImageUrl());
            }
            arrayList.add(a11);
        }
        s0Var.setValue(arrayList);
        s0<List<aa.e>> s0Var2 = this.G;
        List<EmomoQuestReward> rewards = cVar.a().getRankReward().getRewards();
        ArrayList arrayList2 = new ArrayList(xn.t.u(rewards, 10));
        for (EmomoQuestReward emomoQuestReward2 : rewards) {
            GiftItemEffect effect2 = emomoQuestReward2.getEffect();
            GiftItemEffectType type2 = effect2 != null ? effect2.getType() : null;
            if ((type2 == null ? -1 : a.f58432a[type2.ordinal()]) == 1) {
                a10 = aa.b.M.a(emomoQuestReward2, cVar.a().getAchievedImageUrl());
            } else {
                a10 = aa.d.H.a(emomoQuestReward2, cVar.a().getAchievedImageUrl());
            }
            arrayList2.add(a10);
        }
        s0Var2.setValue(arrayList2);
        uo.l.d(this, null, null, new b(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(d.a aVar) {
        jo.p.h(aVar, "event");
        this.A.setValue(a.d.f34697b);
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }
}
