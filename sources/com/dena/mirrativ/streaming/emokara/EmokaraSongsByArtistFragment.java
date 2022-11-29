package com.dena.mirrativ.streaming.emokara;

import ac.z2;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
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
import bc.a2;
import bc.d0;
import bc.e2;
import bc.m2;
import bc.n2;
import bc.s;
import ce.t;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.streaming.emokara.EmokaraSongsByArtistFragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.Karaokes;
import com.dena.mirrorman.net.api.response.RecommendSingers;
import com.dena.mirrorman.net.api.response.Singer;
import com.dena.mirrorman.net.fme.FmeParser;
import com.dena.mirrorman.net.fme.KaraokeConverter;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.ArrayList;
import java.util.List;
import jf.v;
import jo.f0;
import uo.b3;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import xn.a0;

/* loaded from: classes2.dex */
public final class EmokaraSongsByArtistFragment extends Fragment implements d0 {
    public final wn.f A0;
    public d2 B0;
    public s C0;
    public final androidx.navigation.g D0;
    public v E0;
    public bc.f F0;
    public e0<List<Karaoke>> G0;
    public Integer H0;
    public boolean I0;
    public List<Karaoke> J0;
    public List<Singer> K0;

    /* renamed from: x0  reason: collision with root package name */
    public final AutoClearedValue f23032x0 = nd.a.a(this);

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f23033y0 = wn.g.a(q.f23063w);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f23034z0;
    public static final /* synthetic */ qo.h<Object>[] M0 = {f0.d(new jo.s(EmokaraSongsByArtistFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/FragmentEmokaraSongsByArtistBinding;", 0))};
    public static final a L0 = new a(null);
    public static final int N0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByArtistFragment$convertKaraokeModel$1", f = "EmokaraSongsByArtistFragment.kt", l = {311}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23035w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ KaraokeDetail f23037y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KaraokeDetail karaokeDetail, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f23037y = karaokeDetail;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f23037y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23035w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest W3 = EmokaraSongsByArtistFragment.this.W3();
                        String fmeUrl = this.f23037y.getFmeUrl();
                        this.f23035w = 1;
                        obj = W3.getFmeData(fmeUrl, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    v karaokeModel = KaraokeConverter.INSTANCE.getKaraokeModel(FmeParser.Companion.parse(((ep.e0) obj).c()));
                    EmokaraSongsByArtistFragment.this.E0 = karaokeModel;
                    EmokaraSongsByArtistFragment.this.X3().j().m(karaokeModel);
                } catch (Exception e10) {
                    g9.a.c(e10);
                    EmokaraSongsByArtistFragment.this.X3().f().m(co.b.a(true));
                    EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
                }
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByArtistFragment$fetchKaraokeDetail$1", f = "EmokaraSongsByArtistFragment.kt", l = {292}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23038w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f23040y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f23041z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f23040y = str;
            this.f23041z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f23040y, this.f23041z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23038w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest W3 = EmokaraSongsByArtistFragment.this.W3();
                    String str = this.f23040y;
                    int i11 = this.f23041z;
                    String c11 = EmokaraSongsByArtistFragment.this.V3().c();
                    this.f23038w = 1;
                    obj = W3.getKaraokeDetail(str, i11, c11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                KaraokeDetail karaokeDetail = (KaraokeDetail) obj;
                EmokaraSongsByArtistFragment.this.X3().h().m(karaokeDetail);
                EmokaraSongsByArtistFragment.this.O3(karaokeDetail);
            } catch (Exception e10) {
                g9.a.c(e10);
                EmokaraSongsByArtistFragment.this.X3().f().m(co.b.a(true));
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByArtistFragment$fetchRecommendSingerList$2", f = "EmokaraSongsByArtistFragment.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23042w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23042w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest W3 = EmokaraSongsByArtistFragment.this.W3();
                        String c11 = EmokaraSongsByArtistFragment.this.S3().c();
                        this.f23042w = 1;
                        obj = W3.getRecommendSingersBySinger(c11, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    EmokaraSongsByArtistFragment.this.X3().n().m(((RecommendSingers) obj).getRecommendSingers());
                } catch (Exception e10) {
                    g9.a.c(e10);
                    EmokaraSongsByArtistFragment.this.X3().n().m(xn.s.k());
                }
                return wn.v.f59242a;
            } finally {
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSongsByArtistFragment$fetchSongListByArtist$1", f = "EmokaraSongsByArtistFragment.kt", l = {251}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23044w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f23045x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f23047z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f23047z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            e eVar = new e(this.f23047z, dVar);
            eVar.f23045x = obj;
            return eVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            wn.v vVar;
            Object c10 = bo.c.c();
            int i10 = this.f23044w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        q0 q0Var = (q0) this.f23045x;
                        MRRequest W3 = EmokaraSongsByArtistFragment.this.W3();
                        String c11 = EmokaraSongsByArtistFragment.this.V3().c();
                        String c12 = EmokaraSongsByArtistFragment.this.S3().c();
                        int i11 = this.f23047z;
                        this.f23045x = q0Var;
                        this.f23044w = 1;
                        obj = MRRequest.DefaultImpls.getSongListBySinger$default(W3, c11, c12, i11, null, this, 8, null);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        q0 q0Var2 = (q0) this.f23045x;
                        wn.m.b(obj);
                    }
                    Karaokes karaokes = (Karaokes) obj;
                    EmokaraSongsByArtistFragment.this.I0 = false;
                    EmokaraSongsByArtistFragment.this.H0 = karaokes.getNextPage();
                    List list = EmokaraSongsByArtistFragment.this.J0;
                    if (list != null) {
                        EmokaraSongsByArtistFragment emokaraSongsByArtistFragment = EmokaraSongsByArtistFragment.this;
                        a0.D0(list).addAll(karaokes.getKaraokes());
                        emokaraSongsByArtistFragment.J0 = list;
                        vVar = wn.v.f59242a;
                    } else {
                        vVar = null;
                    }
                    if (vVar == null) {
                        EmokaraSongsByArtistFragment.this.J0 = karaokes.getKaraokes();
                    }
                    EmokaraSongsByArtistFragment.this.G0.m(EmokaraSongsByArtistFragment.this.J0);
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSongsByArtistFragment.this.X3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends androidx.recyclerview.widget.k {
        public f(Context context, int i10) {
            super(context, i10);
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            bc.f fVar = EmokaraSongsByArtistFragment.this.F0;
            if (fVar != null) {
                int f02 = recyclerView.f0(view);
                int itemViewType = fVar.getItemViewType(f02);
                int i10 = f02 + 1;
                if (p(itemViewType, fVar.getItemCount() == i10 ? -1 : fVar.getItemViewType(i10))) {
                    super.g(rect, view, recyclerView, b0Var);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            }
        }

        public final boolean p(int i10, int i11) {
            return i10 == 3 && i11 == 3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<Singer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f23049w = new g();

        public g() {
            super(1);
        }

        public final void a(Singer singer) {
            jo.p.h(singer, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Singer singer) {
            a(singer);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<Karaoke, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f23050w = new h();

        public h() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<Karaoke, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f23051w = new i();

        public i() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<Singer, wn.v> {
        public j() {
            super(1);
        }

        public final void a(Singer singer) {
            jo.p.h(singer, "singer");
            w.b(EmokaraSongsByArtistFragment.this.Q2()).r(a2.f17255a.a(singer.getName(), singer.getId(), KaraokeLog.ARTIST_PAGE, EmokaraSongsByArtistFragment.this.S3().c()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Singer singer) {
            a(singer);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<Karaoke, wn.v> {
        public k() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            EmokaraSongsByArtistFragment emokaraSongsByArtistFragment = EmokaraSongsByArtistFragment.this;
            emokaraSongsByArtistFragment.P3(KaraokeLog.Companion.createArtistReferer(emokaraSongsByArtistFragment.S3().a(), EmokaraSongsByArtistFragment.this.S3().c(), EmokaraSongsByArtistFragment.this.S3().d()), karaoke.getId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<Karaoke, wn.v> {
        public l() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            s sVar = EmokaraSongsByArtistFragment.this.C0;
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
    public static final class m extends RecyclerView.u {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            int U3 = EmokaraSongsByArtistFragment.this.U3() + 50;
            bc.f fVar = EmokaraSongsByArtistFragment.this.F0;
            if (U3 > (fVar != null ? fVar.getItemCount() : 0)) {
                EmokaraSongsByArtistFragment.this.a4();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23056w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23057x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23058y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23056w = componentCallbacks;
            this.f23057x = aVar;
            this.f23058y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f23056w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f23057x, this.f23058y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23059w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23060x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23061y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23059w = componentCallbacks;
            this.f23060x = aVar;
            this.f23061y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23059w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d0.class), this.f23060x, this.f23061y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<Bundle> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f23062w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Fragment fragment) {
            super(0);
            this.f23062w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final Bundle invoke() {
            Bundle n02 = this.f23062w.n0();
            if (n02 != null) {
                return n02;
            }
            throw new IllegalStateException("Fragment " + this.f23062w + " has null arguments");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final q f23063w = new q();

        public q() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public EmokaraSongsByArtistFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f23034z0 = wn.g.b(iVar, new n(this, null, null));
        this.A0 = wn.g.b(iVar, new o(this, null, null));
        this.B0 = b3.b(null, 1, null);
        this.D0 = new androidx.navigation.g(f0.b(m2.class), new p(this));
        this.G0 = new e0<>();
    }

    public static final void J3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, Boolean bool) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                emokaraSongsByArtistFragment.h4();
            } else {
                emokaraSongsByArtistFragment.Y3();
            }
        }
    }

    public static final void K3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, List list) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        emokaraSongsByArtistFragment.K0 = list;
        emokaraSongsByArtistFragment.d4();
    }

    public static final void L3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, List list) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        emokaraSongsByArtistFragment.d4();
    }

    public static final void M3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, v vVar) {
        s sVar;
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        KaraokeDetail f10 = emokaraSongsByArtistFragment.X3().h().f();
        if (f10 == null || (sVar = emokaraSongsByArtistFragment.C0) == null) {
            return;
        }
        jo.p.g(vVar, "karaokeModel");
        sVar.N0(f10, vVar);
    }

    public static final void N3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, Boolean bool) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        if (bool != null) {
            bool.booleanValue();
            s sVar = emokaraSongsByArtistFragment.C0;
            if (sVar != null) {
                sVar.O0();
            }
        }
    }

    public static final void Z3(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        emokaraSongsByArtistFragment.T3().H.setVisibility(8);
    }

    public static final void b4(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment, View view) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        w.b(emokaraSongsByArtistFragment.Q2()).r(n2.f17391a.a());
    }

    public static final void c4(View view) {
        w.b(view).t();
    }

    public static final void i4(EmokaraSongsByArtistFragment emokaraSongsByArtistFragment) {
        jo.p.h(emokaraSongsByArtistFragment, "this$0");
        emokaraSongsByArtistFragment.T3().H.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        z2 T = z2.T(LayoutInflater.from(q0()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        T.C.setText(S3().d());
        T.I.setOnClickListener(new View.OnClickListener() { // from class: bc.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSongsByArtistFragment.b4(EmokaraSongsByArtistFragment.this, view);
            }
        });
        T.B.setOnClickListener(e2.f17300w);
        RecyclerView recyclerView = T.F;
        f fVar = new f(q0(), new LinearLayoutManager(j0()).w2());
        Drawable f10 = c3.a.f(N2(), xb.n.divider_left_margin16_white_two);
        if (f10 != null) {
            fVar.n(f10);
        }
        recyclerView.g(fVar);
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        bc.f fVar2 = new bc.f(N2, new ArrayList(), new ArrayList(), g.f23049w, h.f23050w, i.f23051w);
        this.F0 = fVar2;
        T.F.setAdapter(fVar2);
        f4(T);
        g4();
        I3();
        e4();
        Q3();
        Puree.d(KaraokeLog.Companion.createOpenSingerLog(V3().c(), S3().c(), S3().d(), S3().a(), S3().b()));
        View u10 = T3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        d2.a.a(this.B0, null, 1, null);
        super.F1();
    }

    @Override // bc.d0
    public void G() {
        bc.f fVar;
        if (this.C0 == null || (fVar = this.F0) == null) {
            return;
        }
        fVar.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.C0 = null;
        super.I1();
    }

    public final void I3() {
        this.G0.i(a1(), new androidx.lifecycle.f0() { // from class: bc.j2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByArtistFragment.L3(EmokaraSongsByArtistFragment.this, (List) obj);
            }
        });
        X3().j().i(a1(), new androidx.lifecycle.f0() { // from class: bc.f2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByArtistFragment.M3(EmokaraSongsByArtistFragment.this, (jf.v) obj);
            }
        });
        X3().f().i(a1(), new androidx.lifecycle.f0() { // from class: bc.g2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByArtistFragment.N3(EmokaraSongsByArtistFragment.this, (Boolean) obj);
            }
        });
        X3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.h2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByArtistFragment.J3(EmokaraSongsByArtistFragment.this, (Boolean) obj);
            }
        });
        X3().n().i(a1(), new androidx.lifecycle.f0() { // from class: bc.i2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongsByArtistFragment.K3(EmokaraSongsByArtistFragment.this, (List) obj);
            }
        });
    }

    public final void O3(KaraokeDetail karaokeDetail) {
        d2 d10;
        d10 = uo.l.d(r0.a(g1.c()), null, null, new b(karaokeDetail, null), 3, null);
        this.B0 = d10;
    }

    public final void P3(String str, int i10) {
        d2 d10;
        d10 = uo.l.d(r0.a(g1.c()), null, null, new c(str, i10, null), 3, null);
        this.B0 = d10;
        dq.c.c().l(t.g.f19478a);
    }

    public final void Q3() {
        d2 d10;
        List<Singer> f10 = X3().m().f();
        if (f10 != null) {
            X3().m().m(f10);
            return;
        }
        X3().l().m(Boolean.TRUE);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new d(null), 3, null);
        this.B0 = d10;
    }

    public final void R3(int i10) {
        d2 d10;
        X3().l().m(Boolean.TRUE);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new e(i10, null), 3, null);
        this.B0 = d10;
    }

    public final m2 S3() {
        return (m2) this.D0.getValue();
    }

    public final z2 T3() {
        return (z2) this.f23032x0.b(this, M0[0]);
    }

    public final int U3() {
        RecyclerView.p layoutManager = T3().F.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).l2();
    }

    public final hf.d0 V3() {
        return (hf.d0) this.A0.getValue();
    }

    public final MRRequest W3() {
        return (MRRequest) this.f23034z0.getValue();
    }

    public final rf.b X3() {
        return (rf.b) this.f23033y0.getValue();
    }

    public final void Y3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.k2
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongsByArtistFragment.Z3(EmokaraSongsByArtistFragment.this);
                }
            });
        }
    }

    public final void a4() {
        Integer num = this.H0;
        if (num == null || this.I0 || num == null) {
            return;
        }
        int intValue = num.intValue();
        this.I0 = true;
        R3(intValue);
    }

    public final void d4() {
        if (this.K0 == null || this.J0 == null) {
            return;
        }
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        List<Singer> list = this.K0;
        jo.p.e(list);
        List<Karaoke> list2 = this.J0;
        jo.p.e(list2);
        this.F0 = new bc.f(N2, list, list2, new j(), new k(), new l());
        T3().F.setAdapter(this.F0);
    }

    public final void e4() {
        d2.a.a(this.B0, null, 1, null);
        this.H0 = 1;
        this.I0 = false;
        a4();
    }

    public final void f4(z2 z2Var) {
        this.f23032x0.a(this, M0[0], z2Var);
    }

    public final void g4() {
        T3().F.k(new m());
    }

    public final void h4() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.l2
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongsByArtistFragment.i4(EmokaraSongsByArtistFragment.this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.C0 = context instanceof s ? (s) context : null;
    }
}
