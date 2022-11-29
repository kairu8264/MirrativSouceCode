package com.dena.mirrativ.streaming.emokara;

import ac.b3;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.t0;
import androidx.navigation.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.b0;
import bc.d0;
import bc.p2;
import bc.s;
import bc.w2;
import bc.x2;
import ce.t;
import co.l;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.streaming.emokara.EmokaraSongsByGenreFragment;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.Karaokes;
import com.dena.mirrorman.net.fme.FmeParser;
import com.dena.mirrorman.net.fme.KaraokeConverter;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jf.v;
import jo.f0;
import jo.q;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.m;
import xb.n;

/* loaded from: classes2.dex */
public final class EmokaraSongsByGenreFragment extends Fragment implements d0 {
    public static final a J0 = new a(null);
    public static final int K0 = 8;
    public final wn.f A0;
    public s B0;
    public final androidx.navigation.g C0;
    public v D0;
    public b0 E0;
    public e0<List<Karaoke>> F0;
    public Integer G0;
    public boolean H0;
    public d2 I0;

    /* renamed from: x0  reason: collision with root package name */
    public b3 f23064x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f23065y0 = wn.g.a(k.f23087w);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f23066z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByGenreFragment$convertKaraokeModel$1", f = "EmokaraSongsByGenreFragment.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23067w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ KaraokeDetail f23069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KaraokeDetail karaokeDetail, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f23069y = karaokeDetail;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f23069y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23067w;
            try {
                try {
                    if (i10 == 0) {
                        m.b(obj);
                        MRRequest P3 = EmokaraSongsByGenreFragment.this.P3();
                        String fmeUrl = this.f23069y.getFmeUrl();
                        this.f23067w = 1;
                        obj = P3.getFmeData(fmeUrl, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m.b(obj);
                    }
                    v karaokeModel = KaraokeConverter.INSTANCE.getKaraokeModel(FmeParser.Companion.parse(((ep.e0) obj).c()));
                    EmokaraSongsByGenreFragment.this.D0 = karaokeModel;
                    EmokaraSongsByGenreFragment.this.Q3().j().m(karaokeModel);
                } catch (Exception e10) {
                    g9.a.c(e10);
                    EmokaraSongsByGenreFragment.this.Q3().f().m(co.b.a(true));
                    EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
                }
                EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByGenreFragment$fetchKaraokeDetail$1", f = "EmokaraSongsByGenreFragment.kt", l = {230}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23070w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f23072y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f23073z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f23072y = str;
            this.f23073z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f23072y, this.f23073z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23070w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest P3 = EmokaraSongsByGenreFragment.this.P3();
                    String str = this.f23072y;
                    int i11 = this.f23073z;
                    String c11 = EmokaraSongsByGenreFragment.this.O3().c();
                    this.f23070w = 1;
                    obj = P3.getKaraokeDetail(str, i11, c11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                KaraokeDetail karaokeDetail = (KaraokeDetail) obj;
                EmokaraSongsByGenreFragment.this.Q3().h().m(karaokeDetail);
                EmokaraSongsByGenreFragment.this.J3(karaokeDetail);
            } catch (Exception e10) {
                g9.a.c(e10);
                EmokaraSongsByGenreFragment.this.Q3().f().m(co.b.a(true));
                EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByGenreFragment$fetchSongListByGenre$1", f = "EmokaraSongsByGenreFragment.kt", l = {214}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23074w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f23076y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f23076y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f23076y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23074w;
            try {
                try {
                    if (i10 == 0) {
                        m.b(obj);
                        MRRequest P3 = EmokaraSongsByGenreFragment.this.P3();
                        String c11 = EmokaraSongsByGenreFragment.this.O3().c();
                        String a10 = EmokaraSongsByGenreFragment.this.M3().a();
                        int i11 = this.f23076y;
                        this.f23074w = 1;
                        obj = MRRequest.DefaultImpls.getSongListByGenre$default(P3, c11, a10, i11, null, this, 8, null);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m.b(obj);
                    }
                    Karaokes karaokes = (Karaokes) obj;
                    EmokaraSongsByGenreFragment.this.H0 = false;
                    EmokaraSongsByGenreFragment.this.G0 = karaokes.getNextPage();
                    b0 b0Var = EmokaraSongsByGenreFragment.this.E0;
                    if (b0Var != null) {
                        b0Var.c(karaokes.getKaraokes());
                    }
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSongsByGenreFragment.this.Q3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<Karaoke, wn.v> {
        public e() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            EmokaraSongsByGenreFragment emokaraSongsByGenreFragment = EmokaraSongsByGenreFragment.this;
            emokaraSongsByGenreFragment.K3(KaraokeLog.Companion.createGenreReferer(emokaraSongsByGenreFragment.M3().a(), EmokaraSongsByGenreFragment.this.M3().b()), karaoke.getId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.l<Karaoke, wn.v> {
        public f() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            s sVar = EmokaraSongsByGenreFragment.this.B0;
            if (sVar != null) {
                sVar.r0(karaoke, true);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends RecyclerView.u {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            int N3 = EmokaraSongsByGenreFragment.this.N3() + 50;
            b0 b0Var = EmokaraSongsByGenreFragment.this.E0;
            if (N3 > (b0Var != null ? b0Var.getItemCount() : 0)) {
                EmokaraSongsByGenreFragment.this.T3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23080w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23081x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23082y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23080w = componentCallbacks;
            this.f23081x = aVar;
            this.f23082y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f23080w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f23081x, this.f23082y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23083w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23084x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23085y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23083w = componentCallbacks;
            this.f23084x = aVar;
            this.f23085y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23083w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d0.class), this.f23084x, this.f23085y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<Bundle> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f23086w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f23086w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final Bundle invoke() {
            Bundle n02 = this.f23086w.n0();
            if (n02 != null) {
                return n02;
            }
            throw new IllegalStateException("Fragment " + this.f23086w + " has null arguments");
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f23087w = new k();

        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public EmokaraSongsByGenreFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f23066z0 = wn.g.b(iVar, new h(this, null, null));
        this.A0 = wn.g.b(iVar, new i(this, null, null));
        this.C0 = new androidx.navigation.g(f0.b(w2.class), new j(this));
        this.F0 = new e0<>();
        this.I0 = uo.b3.b(null, 1, null);
    }

    public static final void F3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment, Boolean bool) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                emokaraSongsByGenreFragment.Y3();
            } else {
                emokaraSongsByGenreFragment.R3();
            }
        }
    }

    public static final void G3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment, List list) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        b0 b0Var = emokaraSongsByGenreFragment.E0;
        if (b0Var != null) {
            jo.p.g(list, "it");
            b0Var.c(list);
        }
    }

    public static final void H3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment, v vVar) {
        s sVar;
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        KaraokeDetail f10 = emokaraSongsByGenreFragment.Q3().h().f();
        if (f10 == null || (sVar = emokaraSongsByGenreFragment.B0) == null) {
            return;
        }
        jo.p.g(vVar, "karaokeModel");
        sVar.N0(f10, vVar);
    }

    public static final void I3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment, Boolean bool) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        if (bool != null) {
            bool.booleanValue();
            s sVar = emokaraSongsByGenreFragment.B0;
            if (sVar != null) {
                sVar.O0();
            }
        }
    }

    public static final void S3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        b3 b3Var = emokaraSongsByGenreFragment.f23064x0;
        if (b3Var == null) {
            jo.p.v("binding");
            b3Var = null;
        }
        b3Var.H.setVisibility(8);
    }

    public static final void U3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment, View view) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        w.b(emokaraSongsByGenreFragment.Q2()).r(x2.f17513a.a());
    }

    public static final void V3(View view) {
        w.b(view).t();
    }

    public static final void Z3(EmokaraSongsByGenreFragment emokaraSongsByGenreFragment) {
        jo.p.h(emokaraSongsByGenreFragment, "this$0");
        b3 b3Var = emokaraSongsByGenreFragment.f23064x0;
        if (b3Var == null) {
            jo.p.v("binding");
            b3Var = null;
        }
        b3Var.H.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        b3 T = b3.T(LayoutInflater.from(q0()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        T.C.setText(M3().b());
        T.I.setOnClickListener(new View.OnClickListener() { // from class: bc.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSongsByGenreFragment.U3(EmokaraSongsByGenreFragment.this, view);
            }
        });
        T.B.setOnClickListener(p2.f17437w);
        RecyclerView recyclerView = T.F;
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k(q0(), new LinearLayoutManager(j0()).w2());
        Drawable f10 = c3.a.f(N2(), n.divider_left_margin16_white_two);
        if (f10 != null) {
            kVar.n(f10);
        }
        recyclerView.g(kVar);
        b0 b0Var = new b0(new ArrayList(), new e(), new f());
        this.E0 = b0Var;
        T.F.setAdapter(b0Var);
        this.f23064x0 = T;
        X3();
        E3();
        W3();
        Puree.d(KaraokeLog.Companion.createOpenCategoryPage(O3().c(), M3().a(), M3().b()));
        b3 b3Var = this.f23064x0;
        if (b3Var == null) {
            jo.p.v("binding");
            b3Var = null;
        }
        View u10 = b3Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3() {
        this.F0.i(a1(), new androidx.lifecycle.f0() { // from class: bc.t2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByGenreFragment.G3(EmokaraSongsByGenreFragment.this, (List) obj);
            }
        });
        Q3().j().i(a1(), new androidx.lifecycle.f0() { // from class: bc.q2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByGenreFragment.H3(EmokaraSongsByGenreFragment.this, (jf.v) obj);
            }
        });
        Q3().f().i(a1(), new androidx.lifecycle.f0() { // from class: bc.r2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByGenreFragment.I3(EmokaraSongsByGenreFragment.this, (Boolean) obj);
            }
        });
        Q3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.s2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByGenreFragment.F3(EmokaraSongsByGenreFragment.this, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        try {
            b3 b3Var = this.f23064x0;
            if (b3Var == null) {
                jo.p.v("binding");
                b3Var = null;
            }
            b3Var.F.t();
        } catch (Exception e10) {
            g9.a.c(e10);
        }
        super.F1();
    }

    @Override // bc.d0
    public void G() {
        b0 b0Var;
        if (this.B0 == null || (b0Var = this.E0) == null) {
            return;
        }
        b0Var.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        d2.a.a(this.I0, null, 1, null);
        this.B0 = null;
        super.I1();
    }

    public final void J3(KaraokeDetail karaokeDetail) {
        d2 d10;
        d10 = uo.l.d(r0.a(g1.c()), null, null, new b(karaokeDetail, null), 3, null);
        this.I0 = d10;
    }

    public final void K3(String str, int i10) {
        d2 d10;
        Q3().l().m(Boolean.TRUE);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new c(str, i10, null), 3, null);
        this.I0 = d10;
        dq.c.c().l(t.g.f19478a);
    }

    public final void L3(int i10) {
        d2 d10;
        Q3().l().m(Boolean.TRUE);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new d(i10, null), 3, null);
        this.I0 = d10;
    }

    public final w2 M3() {
        return (w2) this.C0.getValue();
    }

    public final int N3() {
        b3 b3Var = this.f23064x0;
        if (b3Var == null) {
            jo.p.v("binding");
            b3Var = null;
        }
        RecyclerView.p layoutManager = b3Var.F.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).l2();
    }

    public final hf.d0 O3() {
        return (hf.d0) this.A0.getValue();
    }

    public final MRRequest P3() {
        return (MRRequest) this.f23066z0.getValue();
    }

    public final rf.b Q3() {
        return (rf.b) this.f23065y0.getValue();
    }

    public final void R3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.v2
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongsByGenreFragment.S3(EmokaraSongsByGenreFragment.this);
                }
            });
        }
    }

    public final void T3() {
        Integer num = this.G0;
        if (num == null || this.H0 || num == null) {
            return;
        }
        int intValue = num.intValue();
        this.H0 = true;
        L3(intValue);
    }

    public final void W3() {
        d2.a.a(this.I0, null, 1, null);
        this.G0 = 1;
        this.H0 = false;
        T3();
    }

    public final void X3() {
        b3 b3Var = this.f23064x0;
        if (b3Var == null) {
            jo.p.v("binding");
            b3Var = null;
        }
        b3Var.F.k(new g());
    }

    public final void Y3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.u2
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongsByGenreFragment.Z3(EmokaraSongsByGenreFragment.this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.B0 = context instanceof s ? (s) context : null;
    }
}
