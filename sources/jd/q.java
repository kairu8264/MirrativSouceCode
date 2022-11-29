package jd;

import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import java.util.List;
import jo.f0;
import l0.c0;
import l0.c2;
import l0.l1;
import uo.q0;
import wn.v;

/* loaded from: classes2.dex */
public final class q {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f37637w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f37637w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f37637w.b().U();
            jo.p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f37638w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f37639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f37640y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f37641z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f37638w = aVar;
            this.f37639x = aVar2;
            this.f37640y = aVar3;
            this.f37641z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f37641z;
            vq.a aVar2 = this.f37638w;
            io.a aVar3 = this.f37639x;
            return kq.c.a(this.f37640y, new kq.b(f0.b(r.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditPageKt$ProfileEditPage$1", f = "ProfileEditPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37642w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i f37643x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<RibbonResponse> f37644y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, List<RibbonResponse> list, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f37643x = iVar;
            this.f37644y = list;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f37643x, this.f37644y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f37642w == 0) {
                wn.m.b(obj);
                this.f37643x.h(this.f37644y);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<RibbonResponse> f37645w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s f37646x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f37647y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<RibbonResponse> list, s sVar, int i10) {
            super(2);
            this.f37645w = list;
            this.f37646x = sVar;
            this.f37647y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            q.a(this.f37645w, this.f37646x, iVar, this.f37647y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(List<RibbonResponse> list, s sVar, l0.i iVar, int i10) {
        jo.p.h(list, "ribbons");
        jo.p.h(sVar, "uiEvent");
        l0.i h10 = iVar.h(-946406277);
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
        if (P || y10 == l0.i.f39065a.a()) {
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
        if (P2 || y11 == l0.i.f39065a.a()) {
            y11 = b11.c(f0.b(i.class), null, null);
            h10.q(y11);
        }
        h10.O();
        h10.O();
        c0.c(v.f59242a, new c((i) y11, list, null), h10, 64);
        c2<o> h11 = rVar.h();
        p c10 = c(t0.b.b(rVar.i(), h10, 8));
        if (c10 != null) {
            t.a(b(h11), c10, sVar, h10, (i10 << 3) & 896);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(list, sVar, i10));
    }

    public static final o b(c2<o> c2Var) {
        return c2Var.getValue();
    }

    public static final p c(c2<p> c2Var) {
        return c2Var.getValue();
    }
}
