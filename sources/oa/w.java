package oa;

import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingRanking;
import ha.a;
import java.util.ArrayList;
import l0.c2;
import l0.s0;
import l0.z1;
import oa.s;
import org.greenrobot.eventbus.ThreadMode;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;
import xn.a0;

/* loaded from: classes.dex */
public final class w extends q0 implements uo.q0 {
    public final s0<t> A;
    public final c2<t> B;
    public final s0<ha.a> C;
    public final c2<ha.a> D;
    public final s0<String> E;
    public final c2<String> F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f44563y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f44564z;

    public w(q8.a aVar) {
        b0 b10;
        s0<t> e10;
        s0<ha.a> e11;
        s0<String> e12;
        jo.p.h(aVar, "dispatcher");
        this.f44563y = aVar;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f44564z = c10.plus(b10);
        e10 = z1.e(null, null, 2, null);
        this.A = e10;
        this.B = e10;
        e11 = z1.e(a.b.f34695b, null, 2, null);
        this.C = e11;
        this.D = e11;
        e12 = z1.e(null, null, 2, null);
        this.E = e12;
        this.F = e12;
        aVar.b(this);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f44563y.c(this);
        super.d();
    }

    public final c2<t> f() {
        return this.B;
    }

    public final c2<String> g() {
        return this.F;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44564z;
    }

    public final c2<ha.a> h() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.a aVar) {
        jo.p.h(aVar, "event");
        this.C.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.c cVar) {
        jo.p.h(cVar, "event");
        this.C.setValue(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.e eVar) {
        jo.p.h(eVar, "event");
        this.A.setValue(t.f44508c.a(eVar.a()));
        this.C.setValue(a.d.f34697b);
        this.E.setValue(eVar.a().getNextCursor());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.d dVar) {
        o a10;
        jo.p.h(dVar, "event");
        t value = this.A.getValue();
        if (value == null) {
            return;
        }
        if (!dVar.a().getRanking().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (o oVar : value.c()) {
                a10 = oVar.a((r35 & 1) != 0 ? oVar.f44423a : null, (r35 & 2) != 0 ? oVar.f44424b : 0L, (r35 & 4) != 0 ? oVar.f44425c : 0, (r35 & 8) != 0 ? oVar.f44426d : null, (r35 & 16) != 0 ? oVar.f44427e : null, (r35 & 32) != 0 ? oVar.f44428f : null, (r35 & 64) != 0 ? oVar.f44429g : false, (r35 & 128) != 0 ? oVar.f44430h : null, (r35 & 256) != 0 ? oVar.f44431i : false, (r35 & 512) != 0 ? oVar.f44432j : null, (r35 & 1024) != 0 ? oVar.f44433k : null, (r35 & 2048) != 0 ? oVar.f44434l : false, (r35 & 4096) != 0 ? oVar.f44435m : null, (r35 & 8192) != 0 ? oVar.f44436n : false, (r35 & 16384) != 0 ? oVar.f44437o : null, (r35 & 32768) != 0 ? oVar.f44438p : true);
                arrayList.add(a10);
            }
            GiftRankingRanking giftRankingRanking = (GiftRankingRanking) a0.i0(dVar.a().getRanking());
            for (GiftRankingRanking giftRankingRanking2 : dVar.a().getRanking()) {
                arrayList.add(o.f44421q.a(giftRankingRanking2, !jo.p.c(giftRankingRanking2.getUserName(), giftRankingRanking.getUserName())));
            }
            this.A.setValue(t.b(value, arrayList, null, 2, null));
        }
        this.C.setValue(a.d.f34697b);
        this.E.setValue(dVar.a().getNextCursor());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(s.b bVar) {
        jo.p.h(bVar, "event");
        this.C.setValue(a.e.f34698b);
    }
}
