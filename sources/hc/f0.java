package hc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import ha.a;
import java.util.Iterator;
import java.util.List;
import kq.a;

/* loaded from: classes2.dex */
public final class f0 extends androidx.fragment.app.e implements uo.q0 {
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f P0;
    public final wn.f Q0;
    public nf.h0 R0;
    public final wn.f S0;
    public final wn.f T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {jo.f0.d(new jo.s(f0.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentGroupShotMemberSettingBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f0 a(String str) {
            jo.p.h(str, "liveId");
            f0 f0Var = new f0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_LIVE_ID", str);
            f0Var.V2(bundle);
            return f0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<uq.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f35088w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(jf.x.LIVE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<uq.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f35089w = new c();

        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(jf.x.LIVE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = f0.this.M2().getString("EXTRA_KEY_LIVE_ID");
            jo.p.e(string);
            return string;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotMemberSettingDialogFragment$observeStoreValues$1", f = "GroupShotMemberSettingDialogFragment.kt", l = {229}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35091w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35092x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35093y;

        /* renamed from: z  reason: collision with root package name */
        public int f35094z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:16:0x0053, B:18:0x005c, B:19:0x0082, B:21:0x0088, B:23:0x0096, B:24:0x009c, B:26:0x00a8, B:27:0x00ac, B:28:0x00b4), top: B:39:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:39:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r13.f35094z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r13.f35093y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r13.f35092x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r13.f35091w
                hc.f0 r4 = (hc.f0) r4
                wn.m.b(r14)     // Catch: java.lang.Throwable -> Lc6
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r13
                goto L53
            L20:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L28:
                wn.m.b(r14)
                hc.f0 r14 = hc.f0.this
                nf.u r14 = hc.f0.J3(r14)
                wo.x r3 = r14.i()
                hc.f0 r14 = hc.f0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc6
                r4 = r14
                r14 = r13
            L3d:
                r14.f35091w = r4     // Catch: java.lang.Throwable -> Lc6
                r14.f35092x = r3     // Catch: java.lang.Throwable -> Lc6
                r14.f35093y = r1     // Catch: java.lang.Throwable -> Lc6
                r14.f35094z = r2     // Catch: java.lang.Throwable -> Lc6
                java.lang.Object r5 = r1.a(r14)     // Catch: java.lang.Throwable -> Lc6
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r12 = r0
                r0 = r14
                r14 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r12
            L53:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> Lc3
                boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> Lc3
                r6 = 0
                if (r14 == 0) goto Lbd
                java.lang.Object r14 = r3.next()     // Catch: java.lang.Throwable -> Lc3
                java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> Lc3
                ac.u0 r7 = hc.f0.H3(r5)     // Catch: java.lang.Throwable -> Lc3
                androidx.recyclerview.widget.RecyclerView r7 = r7.G     // Catch: java.lang.Throwable -> Lc3
                androidx.recyclerview.widget.RecyclerView$h r7 = r7.getAdapter()     // Catch: java.lang.Throwable -> Lc3
                java.lang.String r8 = "null cannot be cast to non-null type com.dena.mirrativ.streaming.groupshot.GroupShotMemberAdapter"
                jo.p.f(r7, r8)     // Catch: java.lang.Throwable -> Lc3
                hc.x r7 = (hc.x) r7     // Catch: java.lang.Throwable -> Lc3
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc3
                r9 = 10
                int r9 = xn.t.u(r14, r9)     // Catch: java.lang.Throwable -> Lc3
                r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc3
                java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> Lc3
            L82:
                boolean r9 = r14.hasNext()     // Catch: java.lang.Throwable -> Lc3
                if (r9 == 0) goto Lb4
                java.lang.Object r9 = r14.next()     // Catch: java.lang.Throwable -> Lc3
                com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser r9 = (com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser) r9     // Catch: java.lang.Throwable -> Lc3
                hc.y$a r10 = hc.y.f35320g     // Catch: java.lang.Throwable -> Lc3
                nf.h0 r11 = hc.f0.M3(r5)     // Catch: java.lang.Throwable -> Lc3
                if (r11 != 0) goto L9c
                java.lang.String r11 = "streamEmomoStore"
                jo.p.v(r11)     // Catch: java.lang.Throwable -> Lc3
                r11 = r6
            L9c:
                androidx.lifecycle.LiveData r11 = r11.C()     // Catch: java.lang.Throwable -> Lc3
                java.lang.Object r11 = r11.f()     // Catch: java.lang.Throwable -> Lc3
                java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> Lc3
                if (r11 != 0) goto Lac
                java.util.List r11 = xn.s.k()     // Catch: java.lang.Throwable -> Lc3
            Lac:
                hc.y r9 = r10.a(r9, r11)     // Catch: java.lang.Throwable -> Lc3
                r8.add(r9)     // Catch: java.lang.Throwable -> Lc3
                goto L82
            Lb4:
                r7.h(r8)     // Catch: java.lang.Throwable -> Lc3
                r14 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lbd:
                wo.n.a(r4, r6)
                wn.v r14 = wn.v.f59242a
                return r14
            Lc3:
                r14 = move-exception
                r3 = r4
                goto Lc7
            Lc6:
                r14 = move-exception
            Lc7:
                throw r14     // Catch: java.lang.Throwable -> Lc8
            Lc8:
                r0 = move-exception
                wo.n.a(r3, r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.f0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            f0.this.O3().e("", f0.this.Q3());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35096w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f35096w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f35096w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f35096w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35097w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f35097w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35097w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35098w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35099x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35100y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35101z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35098w = aVar;
            this.f35099x = aVar2;
            this.f35100y = aVar3;
            this.f35101z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35098w;
            vq.a aVar2 = this.f35099x;
            io.a aVar3 = this.f35100y;
            xq.a aVar4 = this.f35101z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35102w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f35102w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35102w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<Integer, wn.v> {
        public k() {
            super(1);
        }

        public final void a(int i10) {
            boolean z10;
            LiveGiftRankingUser liveGiftRankingUser = (LiveGiftRankingUser) xn.a0.a0(f0.this.P3().h(), i10);
            if (liveGiftRankingUser != null) {
                f0 f0Var = f0.this;
                nf.h0 h0Var = f0Var.R0;
                nf.h0 h0Var2 = null;
                if (h0Var == null) {
                    jo.p.v("streamEmomoStore");
                    h0Var = null;
                }
                List<LiveGiftRankingUser> f10 = h0Var.C().f();
                if (f10 != null) {
                    jo.p.g(f10, "groupShotMembers");
                    int i11 = 0;
                    if (!f10.isEmpty()) {
                        for (LiveGiftRankingUser liveGiftRankingUser2 : f10) {
                            if (jo.p.c(liveGiftRankingUser2.getUser().getUserId(), liveGiftRankingUser.getUser().getUserId())) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        od.n0 R3 = f0Var.R3();
                        List<LiveGiftRankingUser> D0 = xn.a0.D0(f10);
                        Iterator<LiveGiftRankingUser> it = f10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i11 = -1;
                                break;
                            } else if (jo.p.c(it.next().getUser().getUserId(), liveGiftRankingUser.getUser().getUserId())) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        D0.remove(i11);
                        R3.s(D0);
                        return;
                    }
                    int size = f10.size();
                    nf.h0 h0Var3 = f0Var.R0;
                    if (h0Var3 == null) {
                        jo.p.v("streamEmomoStore");
                        h0Var3 = null;
                    }
                    Integer f11 = h0Var3.A().f();
                    if (f11 == null) {
                        f11 = 0;
                    }
                    jo.p.g(f11, "streamEmomoStore.groupSh…umberOfMembers.value ?: 0");
                    if (size < f11.intValue()) {
                        od.n0 R32 = f0Var.R3();
                        nf.h0 h0Var4 = f0Var.R0;
                        if (h0Var4 == null) {
                            jo.p.v("streamEmomoStore");
                        } else {
                            h0Var2 = h0Var4;
                        }
                        List<LiveGiftRankingUser> f12 = h0Var2.C().f();
                        if (f12 == null) {
                            f12 = xn.s.k();
                        }
                        R32.s(xn.a0.o0(f12, xn.r.d(liveGiftRankingUser)));
                    }
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<od.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35104w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35105x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35106y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35104w = componentCallbacks;
            this.f35105x = aVar;
            this.f35106y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.v] */
        @Override // io.a
        public final od.v invoke() {
            ComponentCallbacks componentCallbacks = this.f35104w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.v.class), this.f35105x, this.f35106y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<nf.u> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35107w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35108x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35107w = componentCallbacks;
            this.f35108x = aVar;
            this.f35109y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.u] */
        @Override // io.a
        public final nf.u invoke() {
            ComponentCallbacks componentCallbacks = this.f35107w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.u.class), this.f35108x, this.f35109y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<od.n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35110w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35111x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35112y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35110w = componentCallbacks;
            this.f35111x = aVar;
            this.f35112y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.n0, java.lang.Object] */
        @Override // io.a
        public final od.n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f35110w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.n0.class), this.f35111x, this.f35112y);
        }
    }

    public f0() {
        b bVar = b.f35088w;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new l(this, null, bVar));
        this.Q0 = wn.g.b(iVar, new m(this, null, c.f35089w));
        this.S0 = wn.g.b(iVar, new n(this, null, null));
        this.T0 = wn.g.a(new d());
    }

    public static final void T3(f0 f0Var, ha.a aVar) {
        jo.p.h(f0Var, "this$0");
        if (aVar instanceof a.d) {
            f0Var.N3().J.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            f0Var.N3().J.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                f0Var.N3().J.b(new StatusView.b.d(f0Var.U0(xb.r.T0), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && f0Var.P3().h().isEmpty()) {
                StatusView statusView = f0Var.N3().J;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = f0Var.U0(xb.r.f60070c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new f()));
            }
        }
    }

    public static final void U3(f0 f0Var, List list) {
        List<y> b10;
        boolean z10;
        jo.p.h(f0Var, "this$0");
        int size = list.size();
        nf.h0 h0Var = f0Var.R0;
        nf.h0 h0Var2 = null;
        if (h0Var == null) {
            jo.p.v("streamEmomoStore");
            h0Var = null;
        }
        Integer f10 = h0Var.A().f();
        if (f10 == null) {
            f10 = 0;
        }
        if (size >= f10.intValue()) {
            f0Var.N3().F.setVisibility(0);
        } else {
            f0Var.N3().F.setVisibility(8);
        }
        RecyclerView.h adapter = f0Var.N3().G.getAdapter();
        x xVar = adapter instanceof x ? (x) adapter : null;
        if (xVar != null && (b10 = xVar.b()) != null) {
            for (y yVar : b10) {
                androidx.lifecycle.e0<Boolean> e10 = yVar.e();
                jo.p.g(list, "groupShotMembers");
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (jo.p.c(((LiveGiftRankingUser) it.next()).getUser().getUserId(), yVar.c())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                e10.p(Boolean.valueOf(z10));
            }
        }
        nf.h0 h0Var3 = f0Var.R0;
        if (h0Var3 == null) {
            jo.p.v("streamEmomoStore");
        } else {
            h0Var2 = h0Var3;
        }
        Integer f11 = h0Var2.A().f();
        if (f11 == null) {
            f11 = 0;
        }
        int intValue = f11.intValue();
        if (intValue == 0) {
            f0Var.N3().E.setVisibility(8);
            f0Var.N3().I.setVisibility(8);
            f0Var.N3().L.setVisibility(8);
        } else if (intValue == 1) {
            f0Var.N3().I.setVisibility(8);
            f0Var.N3().L.setVisibility(8);
        } else if (intValue == 2) {
            f0Var.N3().L.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = f0Var.N3().E;
        int i10 = xb.n.oval_gray_boder1;
        appCompatImageView.setImageResource(i10);
        f0Var.N3().I.setImageResource(i10);
        f0Var.N3().L.setImageResource(i10);
        f0Var.N3().D.setVisibility(8);
        f0Var.N3().H.setVisibility(8);
        f0Var.N3().K.setVisibility(8);
        jo.p.g(list, "groupShotMembers");
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                xn.s.t();
            }
            LiveGiftRankingUser liveGiftRankingUser = (LiveGiftRankingUser) obj;
            if (i11 == 0) {
                AppCompatImageView appCompatImageView2 = f0Var.N3().E;
                jo.p.g(appCompatImageView2, "binding.firstViewerImageView");
                td.a.u(appCompatImageView2, liveGiftRankingUser.getUser().getProfileImageUrl());
                f0Var.N3().D.setVisibility(0);
            } else if (i11 == 1) {
                AppCompatImageView appCompatImageView3 = f0Var.N3().I;
                jo.p.g(appCompatImageView3, "binding.secondViewerImageView");
                td.a.u(appCompatImageView3, liveGiftRankingUser.getUser().getProfileImageUrl());
                f0Var.N3().H.setVisibility(0);
            } else if (i11 == 2) {
                AppCompatImageView appCompatImageView4 = f0Var.N3().L;
                jo.p.g(appCompatImageView4, "binding.thirdViewerImageView");
                td.a.u(appCompatImageView4, liveGiftRankingUser.getUser().getProfileImageUrl());
                f0Var.N3().K.setVisibility(0);
            }
            i11 = i12;
        }
    }

    public static final void X3(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        nf.h0 h0Var = f0Var.R0;
        if (h0Var == null) {
            jo.p.v("streamEmomoStore");
            h0Var = null;
        }
        List<LiveGiftRankingUser> f10 = h0Var.C().f();
        if (f10 == null || f10.size() <= 2) {
            return;
        }
        od.n0 R3 = f0Var.R3();
        List<LiveGiftRankingUser> D0 = xn.a0.D0(f10);
        D0.remove(2);
        R3.s(D0);
    }

    public static final void Y3(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        f0Var.m3();
    }

    public static final void Z3(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        nf.h0 h0Var = f0Var.R0;
        if (h0Var == null) {
            jo.p.v("streamEmomoStore");
            h0Var = null;
        }
        List<LiveGiftRankingUser> f10 = h0Var.C().f();
        if (f10 == null || !(!f10.isEmpty())) {
            return;
        }
        od.n0 R3 = f0Var.R3();
        List<LiveGiftRankingUser> D0 = xn.a0.D0(f10);
        D0.remove(0);
        R3.s(D0);
    }

    public static final void a4(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        nf.h0 h0Var = f0Var.R0;
        if (h0Var == null) {
            jo.p.v("streamEmomoStore");
            h0Var = null;
        }
        List<LiveGiftRankingUser> f10 = h0Var.C().f();
        if (f10 == null || f10.size() <= 1) {
            return;
        }
        od.n0 R3 = f0Var.R3();
        List<LiveGiftRankingUser> D0 = xn.a0.D0(f10);
        D0.remove(1);
        R3.s(D0);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        g gVar = new g(this);
        xq.a a10 = gq.a.a(this);
        h hVar = new h(gVar);
        this.R0 = (nf.h0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.h0.class), new j(hVar), new i(gVar, null, null, a10)).getValue());
    }

    public final ac.u0 N3() {
        return (ac.u0) this.O0.b(this, V0[0]);
    }

    public final od.v O3() {
        return (od.v) this.P0.getValue();
    }

    public final nf.u P3() {
        return (nf.u) this.Q0.getValue();
    }

    public final String Q3() {
        return (String) this.T0.getValue();
    }

    public final od.n0 R3() {
        return (od.n0) this.S0.getValue();
    }

    public final void S3() {
        nf.h0 h0Var = null;
        uo.l.d(this, null, null, new e(null), 3, null);
        P3().k().i(this, new androidx.lifecycle.f0() { // from class: hc.d0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f0.T3(f0.this, (ha.a) obj);
            }
        });
        nf.h0 h0Var2 = this.R0;
        if (h0Var2 == null) {
            jo.p.v("streamEmomoStore");
        } else {
            h0Var = h0Var2;
        }
        h0Var.C().i(this, new androidx.lifecycle.f0() { // from class: hc.e0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f0.U3(f0.this, (List) obj);
            }
        });
    }

    public final void V3(ac.u0 u0Var) {
        this.O0.a(this, V0[0], u0Var);
    }

    public final void W3() {
        N3().G.setLayoutManager(new LinearLayoutManager(N2()));
        RecyclerView recyclerView = N3().G;
        x xVar = new x(this);
        xVar.g(new k());
        recyclerView.setAdapter(xVar);
        nf.h0 h0Var = this.R0;
        if (h0Var == null) {
            jo.p.v("streamEmomoStore");
            h0Var = null;
        }
        Integer f10 = h0Var.A().f();
        if (f10 != null) {
            int intValue = f10.intValue();
            if (intValue == 0) {
                m3();
            } else if (intValue == 1) {
                N3().I.setVisibility(8);
                N3().L.setVisibility(8);
            } else if (intValue == 2) {
                N3().L.setVisibility(8);
            }
        }
        N3().E.setOnClickListener(new View.OnClickListener() { // from class: hc.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.Z3(f0.this, view);
            }
        });
        N3().I.setOnClickListener(new View.OnClickListener() { // from class: hc.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.a4(f0.this, view);
            }
        });
        N3().L.setOnClickListener(new View.OnClickListener() { // from class: hc.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.X3(f0.this, view);
            }
        });
        N3().C.setOnClickListener(new View.OnClickListener() { // from class: hc.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.Y3(f0.this, view);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), xb.p.dialog_fragment_group_shot_member_setting, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        V3((ac.u0) e10);
        W3();
        S3();
        O3().e("", Q3());
        Dialog dialog = new Dialog(N2(), xb.s.f60094a);
        dialog.setContentView(N3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 320), -2);
        }
        return dialog;
    }
}
