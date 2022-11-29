package v9;

import androidx.compose.ui.platform.z;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import jo.f0;
import jo.p;
import jo.q;
import l0.l1;
import wn.v;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f57058w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f57058w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f57058w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f57059w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f57060x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f57061y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f57062z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f57059w = aVar;
            this.f57060x = aVar2;
            this.f57061y = aVar3;
            this.f57062z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f57062z;
            vq.a aVar2 = this.f57059w;
            io.a aVar3 = this.f57060x;
            return kq.c.a(this.f57061y, new kq.b(f0.b(t9.d.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f57063w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f57064x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, int i10) {
            super(2);
            this.f57063w = hVar;
            this.f57064x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            k.a(this.f57063w, iVar, this.f57064x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t9.d f57065w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h f57066x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t9.d dVar, h hVar) {
            super(1);
            this.f57065w = dVar;
            this.f57066x = hVar;
        }

        public final void a(int i10) {
            EmomoQuestEquipmentGachaResultsResponse f10 = this.f57065w.u().f();
            if (f10 != null) {
                this.f57066x.A(f10, i10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f57067w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.f57067w = hVar;
        }

        public final void a() {
            this.f57067w.close();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f57068w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f57069x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h hVar, int i10) {
            super(2);
            this.f57068w = hVar;
            this.f57069x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            k.a(this.f57068w, iVar, this.f57069x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(h hVar, l0.i iVar, int i10) {
        int i11;
        p.h(hVar, "navigation");
        l0.i h10 = iVar.h(-1631065462);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
        } else {
            h10.x(-12298959);
            Object G = h10.G(z.g());
            p.f(G, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.h hVar2 = (androidx.fragment.app.h) G;
            h10.x(1509148303);
            xq.a b10 = pq.b.f48484a.get().e().b();
            h10.x(-1688186670);
            kq.a a10 = hVar2 == null ? null : kq.a.f38937c.a(hVar2);
            if (a10 == null) {
                h10.x(-1688186362);
                a10 = iq.a.a(h10, 0);
            } else {
                h10.x(-1688186404);
            }
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new s0(f0.b(t9.d.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            h10.O();
            t9.d dVar = (t9.d) ((q0) ((s0) y10).getValue());
            v9.c value = dVar.v().getValue();
            if (value == null) {
                hVar.close();
                l1 l10 = h10.l();
                if (l10 == null) {
                    return;
                }
                l10.a(new c(hVar, i10));
                return;
            }
            n.a(null, value, new d(dVar, hVar), new e(hVar), h10, 0, 1);
        }
        l1 l11 = h10.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(hVar, i10));
    }
}
