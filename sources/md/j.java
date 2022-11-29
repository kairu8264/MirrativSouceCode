package md;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.Archive;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import java.util.Iterator;
import java.util.List;
import kq.a;
import pc.e2;
import ud.f2;
import ud.z1;

/* loaded from: classes2.dex */
public final class j extends Fragment {
    public final AutoClearedValue A0;
    public final z1 B0;
    public final wn.f C0;
    public final wn.f D0;
    public final androidx.activity.result.c<Intent> E0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f40976x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f40977y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f40978z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {jo.f0.d(new jo.s(j.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/FragmentLiveHistoriesBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(String str, String str2) {
            jo.p.h(str, "userId");
            jo.p.h(str2, "referer");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_USER_ID", str);
            bundle.putString("EXTRA_REFERER", str2);
            jVar.V2(bundle);
            return jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<String, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Intent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f40981w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar) {
                super(1);
                this.f40981w = jVar;
            }

            public final void a(Intent intent) {
                jo.p.h(intent, "intent");
                this.f40981w.E0.a(intent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Intent intent) {
                a(intent);
                return wn.v.f59242a;
            }
        }

        public c() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "liveId");
            List<LiveBasicParams> f10 = j.this.B3().p().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    j jVar = j.this;
                    Context N2 = jVar.N2();
                    jo.p.g(N2, "requireContext()");
                    new ce.x(N2, new a(jVar)).a(liveBasicParams, jVar.y3());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<String, wn.v> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "liveId");
            List<LiveBasicParams> f10 = j.this.B3().p().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    j jVar = j.this;
                    tb.c x32 = jVar.x3();
                    Context N2 = jVar.N2();
                    jo.p.g(N2, "requireContext()");
                    jVar.f3(x32.d(N2, liveBasicParams.getLiveId(), new df.a(liveBasicParams), false, false));
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.p<String, View, wn.v> {
        public e() {
            super(2);
        }

        public final void a(String str, View view) {
            Object obj;
            jo.p.h(str, "liveId");
            jo.p.h(view, "menuView");
            List<LiveBasicParams> f10 = j.this.B3().p().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((LiveBasicParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                LiveBasicParams liveBasicParams = (LiveBasicParams) obj;
                if (liveBasicParams != null) {
                    j.this.K3(liveBasicParams, view);
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(String str, View view) {
            a(str, view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.u {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            j.this.C3(linearLayoutManager.l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40985w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40986x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40987y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40985w = componentCallbacks;
            this.f40986x = aVar;
            this.f40987y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f40985w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f40986x, this.f40987y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40988w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f40988w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f40988w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f40988w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40989w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f40989w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40989w.invoke()).b();
        }
    }

    /* renamed from: md.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0603j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40990w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40991x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40992y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f40993z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0603j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40990w = aVar;
            this.f40991x = aVar2;
            this.f40992y = aVar3;
            this.f40993z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40990w;
            vq.a aVar2 = this.f40991x;
            io.a aVar3 = this.f40992y;
            xq.a aVar4 = this.f40993z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.t0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40994w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f40994w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f40994w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40995w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f40995w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f40995w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f40995w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40996w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f40996w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40996w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40997w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40998x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40999y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f41000z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40997w = aVar;
            this.f40998x = aVar2;
            this.f40999y = aVar3;
            this.f41000z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40997w;
            vq.a aVar2 = this.f40998x;
            io.a aVar3 = this.f40999y;
            xq.a aVar4 = this.f41000z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.o0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f41001w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f41001w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f41001w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<String> {
        public p() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j.this.M2().getString("EXTRA_USER_ID");
            jo.p.e(string);
            return string;
        }
    }

    public j() {
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar = new i(hVar);
        this.f40976x0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.t0.class), new k(iVar), new C0603j(hVar, null, null, a10));
        l lVar = new l(this);
        xq.a a11 = gq.a.a(this);
        m mVar = new m(lVar);
        this.f40977y0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.o0.class), new o(mVar), new n(lVar, null, null, a11));
        this.f40978z0 = wn.g.b(wn.i.SYNCHRONIZED, new g(this, null, null));
        this.A0 = nd.a.a(this);
        this.B0 = new z1(null, 1, null);
        this.C0 = wn.g.a(new p());
        this.D0 = wn.g.a(new b());
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: md.f
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                j.G3(j.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…erer, result.data))\n    }");
        this.E0 = I2;
    }

    public static final void E3(j jVar, Boolean bool) {
        jo.p.h(jVar, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            List<LiveBasicParams> f10 = jVar.B3().p().f();
            if ((f10 != null ? f10.size() : 0) > 0) {
                androidx.lifecycle.e0<List<ud.a>> a10 = jVar.B0.a();
                List<ud.a> f11 = jVar.B0.a().f();
                if (f11 == null) {
                    f11 = xn.s.k();
                }
                a10.p(xn.a0.o0(f11, xn.r.d(new f2(null, 1, null))));
                return;
            }
            jVar.B0.a().p(xn.r.d(new f2(null, 1, null)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void F3(md.j r10, java.util.List r11) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r10, r0)
            nf.o0 r0 = r10.B3()
            androidx.lifecycle.LiveData r0 = r0.F()
            java.lang.Object r0 = r0.f()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = jo.p.c(r0, r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            nf.o0 r0 = r10.B3()
            androidx.lifecycle.LiveData r0 = r0.B()
            java.lang.Object r0 = r0.f()
            com.dena.mirrorman.net.api.response.user.UserProfile r0 = (com.dena.mirrorman.net.api.response.user.UserProfile) r0
            if (r0 == 0) goto L58
            com.dena.mirrorman.net.api.response.live.LiveAnnouncement r0 = r0.getLiveAnnouncement()
            if (r0 == 0) goto L58
            java.lang.String r2 = r0.getBody()
            int r3 = r0.getStartAt()
            com.dena.mirrorman.net.api.response.App$AppParams r0 = r0.getApp()
            if (r0 == 0) goto L45
            ud.u1$a r1 = ud.u1.f55559e
            ud.u1 r0 = r1.a(r0)
            goto L46
        L45:
            r0 = 0
        L46:
            r4 = r0
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            ud.n2 r0 = new ud.n2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = xn.r.d(r0)
            if (r0 != 0) goto L5c
        L58:
            java.util.List r0 = xn.s.k()
        L5c:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L97
            ud.z1 r11 = r10.B0
            androidx.lifecycle.e0 r11 = r11.a()
            ud.o2$a r1 = ud.o2.E
            int r2 = nc.i.empty_live_history
            java.lang.String r2 = r10.U0(r2)
            java.lang.String r3 = "getString(R.string.empty_live_history)"
            jo.p.g(r2, r3)
            r3 = 0
            r4 = 48
            int r5 = de.e.b(r10, r4)
            int r10 = de.e.b(r10, r4)
            r6 = 0
            r7 = 0
            r8 = 50
            r9 = 0
            r4 = r5
            r5 = r10
            ud.o2 r10 = ud.o2.a.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r10 = xn.r.d(r10)
            java.util.List r10 = xn.a0.o0(r0, r10)
            r11.p(r10)
            goto Ld7
        L97:
            ud.z1 r1 = r10.B0
            androidx.lifecycle.e0 r1 = r1.a()
            java.lang.String r2 = "liveHistories"
            jo.p.g(r11, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = xn.t.u(r11, r3)
            r2.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        Lb1:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r11.next()
            com.dena.mirrorman.net.api.response.live.LiveBasicParams r3 = (com.dena.mirrorman.net.api.response.live.LiveBasicParams) r3
            ud.a2$a r4 = ud.a2.V
            android.content.Context r5 = r10.N2()
            java.lang.String r6 = "requireContext()"
            jo.p.g(r5, r6)
            ud.a2 r3 = r4.a(r5, r3)
            r2.add(r3)
            goto Lb1
        Ld0:
            java.util.List r10 = xn.a0.o0(r0, r2)
            r1.p(r10)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.j.F3(md.j, java.util.List):void");
    }

    public static final void G3(j jVar, androidx.activity.result.a aVar) {
        jo.p.h(jVar, "this$0");
        tb.c x32 = jVar.x3();
        Context N2 = jVar.N2();
        jo.p.g(N2, "requireContext()");
        jVar.f3(x32.x(N2, jVar.y3(), aVar.a()));
    }

    public static final boolean L3(LiveBasicParams liveBasicParams, j jVar, MenuItem menuItem) {
        jo.p.h(liveBasicParams, "$live");
        jo.p.h(jVar, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_share) {
            Puree.d(new Archive.Share(liveBasicParams, jVar.y3()));
            hf.b.f35490a.d().a();
            try {
                jVar.f3(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", liveBasicParams.getShareUrl()), jVar.U0(nc.i.f41880l2)).addFlags(268435456));
                return true;
            } catch (ActivityNotFoundException e10) {
                g9.a.c(e10);
                return true;
            }
        }
        return true;
    }

    public static final void v3(j jVar, List list) {
        jo.p.h(jVar, "this$0");
        RecyclerView.h adapter = jVar.w3().B.getAdapter();
        rd.l0 l0Var = adapter instanceof rd.l0 ? (rd.l0) adapter : null;
        if (l0Var == null) {
            return;
        }
        jo.p.g(list, "it");
        l0Var.j(list);
    }

    public final od.t0 A3() {
        return (od.t0) this.f40976x0.getValue();
    }

    public final nf.o0 B3() {
        return (nf.o0) this.f40977y0.getValue();
    }

    public final void C3(int i10) {
        Integer f10;
        List<ud.a> f11 = this.B0.a().f();
        if (f11 == null || (f10 = B3().t().f()) == null) {
            return;
        }
        int intValue = f10.intValue();
        if (jo.p.c(B3().F().f(), Boolean.TRUE) || intValue < 1 || f11.size() > i10 + 5) {
            return;
        }
        A3().v(z3(), y3(), intValue);
    }

    public final void D3() {
        B3().F().i(a1(), new androidx.lifecycle.f0() { // from class: md.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.E3(j.this, (Boolean) obj);
            }
        });
        B3().p().i(a1(), new androidx.lifecycle.f0() { // from class: md.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.F3(j.this, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        e2 T = e2.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        H3(T);
        View u10 = w3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void H3(e2 e2Var) {
        this.A0.a(this, G0[0], e2Var);
    }

    public final void I3() {
        w3().B.setAdapter(new rd.l0());
        w3().B.setLayoutManager(new LinearLayoutManager(q0()));
        w3().B.g(new p001if.c(de.e.b(this, 1), 0, 0, 0, de.e.b(this, 120), 0, 32, null));
    }

    public final void J3() {
        RecyclerView.h adapter = w3().B.getAdapter();
        rd.l0 l0Var = adapter instanceof rd.l0 ? (rd.l0) adapter : null;
        if (l0Var != null) {
            l0Var.i(new c());
            l0Var.h(new d());
            l0Var.l(new e());
        }
        w3().B.k(new f());
    }

    public final void K3(final LiveBasicParams liveBasicParams, View view) {
        PopupMenu popupMenu = new PopupMenu(N2(), view);
        popupMenu.getMenuInflater().inflate(nc.g.live_item_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: md.e
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean L3;
                L3 = j.L3(LiveBasicParams.this, this, menuItem);
                return L3;
            }
        });
        popupMenu.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        I3();
        J3();
        u3();
        D3();
        A3().y(z3(), y3());
    }

    public final void u3() {
        this.B0.a().i(a1(), new androidx.lifecycle.f0() { // from class: md.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.v3(j.this, (List) obj);
            }
        });
    }

    public final e2 w3() {
        return (e2) this.A0.b(this, G0[0]);
    }

    public final tb.c x3() {
        return (tb.c) this.f40978z0.getValue();
    }

    public final String y3() {
        return (String) this.D0.getValue();
    }

    public final String z3() {
        return (String) this.C0.getValue();
    }
}
