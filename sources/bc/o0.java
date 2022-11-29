package bc;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.a2;
import ce.t;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.net.api.response.Genre;
import com.dena.mirrorman.net.api.response.Genres;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.Karaokes;
import com.dena.mirrorman.net.api.response.RecommendSingers;
import com.dena.mirrorman.net.api.response.Singer;
import com.dena.mirrorman.net.fme.FmeParser;
import com.dena.mirrorman.net.fme.KaraokeConverter;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0 extends Fragment implements d0, uo.q0 {
    public static final /* synthetic */ qo.h<Object>[] J0 = {jo.f0.d(new jo.s(o0.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/FragmentEmokaraPopularTabBinding;", 0))};
    public static final int K0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public s C0;
    public h0 D0;
    public List<Karaoke> E0;
    public List<Genre> F0;
    public List<Singer> G0;
    public jf.v H0;
    public io.l<? super Boolean, wn.v> I0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f17393x0 = uo.r0.b();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f17394y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f17395z0 = wn.g.a(m.f17420w);

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraPopularTabFragment$convertKaraokeModel$1", f = "EmokaraPopularTabFragment.kt", l = {297}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17396w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ KaraokeDetail f17398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KaraokeDetail karaokeDetail, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f17398y = karaokeDetail;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f17398y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17396w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest L3 = o0.this.L3();
                        String fmeUrl = this.f17398y.getFmeUrl();
                        this.f17396w = 1;
                        obj = L3.getFmeData(fmeUrl, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    jf.v karaokeModel = KaraokeConverter.INSTANCE.getKaraokeModel(FmeParser.Companion.parse(((ep.e0) obj).c()));
                    o0.this.H0 = karaokeModel;
                    o0.this.M3().j().m(karaokeModel);
                } catch (Exception e10) {
                    g9.a.c(e10);
                    o0.this.M3().f().m(co.b.a(true));
                    o0.this.M3().l().m(co.b.a(false));
                }
                o0.this.M3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                o0.this.M3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraPopularTabFragment$fetchGenreList$2", f = "EmokaraPopularTabFragment.kt", l = {225}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17399w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17399w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest L3 = o0.this.L3();
                        this.f17399w = 1;
                        obj = L3.getKaraokeCategories(this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    o0.this.M3().g().m(((Genres) obj).getGenres());
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                o0.this.M3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                o0.this.M3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraPopularTabFragment$fetchKaraokeDetail$1", f = "EmokaraPopularTabFragment.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17401w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17403y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17404z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f17403y = str;
            this.f17404z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f17403y, this.f17404z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17401w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest L3 = o0.this.L3();
                    String str = this.f17403y;
                    int i11 = this.f17404z;
                    String c11 = o0.this.K3().c();
                    this.f17401w = 1;
                    obj = L3.getKaraokeDetail(str, i11, c11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                KaraokeDetail karaokeDetail = (KaraokeDetail) obj;
                o0.this.M3().h().m(karaokeDetail);
                o0.this.E3(karaokeDetail);
            } catch (Exception e10) {
                g9.a.c(e10);
                o0.this.M3().f().m(co.b.a(true));
                o0.this.M3().l().m(co.b.a(false));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraPopularTabFragment$fetchKaraokeList$2", f = "EmokaraPopularTabFragment.kt", l = {264}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17405w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17405w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest L3 = o0.this.L3();
                        String c11 = o0.this.K3().c();
                        this.f17405w = 1;
                        obj = L3.getKaraokeList(c11, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    o0.this.M3().i().m(((Karaokes) obj).getKaraokes());
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                o0.this.M3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                o0.this.M3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraPopularTabFragment$fetchRecommendSingerList$2", f = "EmokaraPopularTabFragment.kt", l = {244}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17407w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17407w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest L3 = o0.this.L3();
                        String c11 = o0.this.K3().c();
                        this.f17407w = 1;
                        obj = L3.getRecommendSingers(c11, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    o0.this.M3().m().m(((RecommendSingers) obj).getRecommendSingers());
                } catch (Exception e10) {
                    g9.a.c(e10);
                    o0.this.M3().m().m(xn.s.k());
                }
                return wn.v.f59242a;
            } finally {
                o0.this.M3().l().m(co.b.a(false));
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
            h0 h0Var = o0.this.D0;
            if (h0Var != null) {
                int f02 = recyclerView.f0(view);
                int itemViewType = h0Var.getItemViewType(f02);
                int i10 = f02 + 1;
                if (p(itemViewType, h0Var.getItemCount() == i10 ? -1 : h0Var.getItemViewType(i10))) {
                    super.g(rect, view, recyclerView, b0Var);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            }
        }

        public final boolean p(int i10, int i11) {
            return (i10 == 3 && i11 == 3) || (i10 == 5 && i11 == 5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<Karaoke, wn.v> {
        public g() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            o0.this.G3(KaraokeLog.Companion.createPopularReferer(), karaoke.getId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<Genre, wn.v> {
        public h() {
            super(1);
        }

        public final void a(Genre genre) {
            jo.p.h(genre, "genre");
            androidx.navigation.w.b(o0.this.Q2()).r(a2.f17255a.c(genre.getName(), genre.getId()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Genre genre) {
            a(genre);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<Singer, wn.v> {
        public i() {
            super(1);
        }

        public final void a(Singer singer) {
            jo.p.h(singer, "singer");
            androidx.navigation.w.b(o0.this.Q2()).r(a2.c.b(a2.f17255a, singer.getName(), singer.getId(), KaraokeLog.SONG_LIST_RECOMMENDED_SINGER, null, 8, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Singer singer) {
            a(singer);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<Karaoke, wn.v> {
        public j() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            jo.p.h(karaoke, "karaoke");
            s sVar = o0.this.C0;
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
    public static final class k extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17414w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17415x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17416y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17414w = componentCallbacks;
            this.f17415x = aVar;
            this.f17416y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f17414w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f17415x, this.f17416y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17417w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17418x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17417w = componentCallbacks;
            this.f17418x = aVar;
            this.f17419y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17417w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f17418x, this.f17419y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f17420w = new m();

        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public o0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new k(this, null, null));
        this.B0 = wn.g.b(iVar, new l(this, null, null));
    }

    public static final void A3(o0 o0Var, Boolean bool) {
        jo.p.h(o0Var, "this$0");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            io.l<? super Boolean, wn.v> lVar = o0Var.I0;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(booleanValue));
            }
        }
    }

    public static final void B3(o0 o0Var, List list) {
        jo.p.h(o0Var, "this$0");
        if (list != null) {
            o0Var.E0 = list;
            o0Var.N3();
        }
    }

    public static final void C3(o0 o0Var, List list) {
        jo.p.h(o0Var, "this$0");
        if (list != null) {
            o0Var.F0 = list;
            o0Var.N3();
        }
    }

    public static final void D3(o0 o0Var, List list) {
        jo.p.h(o0Var, "this$0");
        if (list != null) {
            o0Var.G0 = list;
            o0Var.N3();
        }
    }

    public static final void y3(o0 o0Var, jf.v vVar) {
        s sVar;
        jo.p.h(o0Var, "this$0");
        KaraokeDetail f10 = o0Var.M3().h().f();
        if (f10 == null || (sVar = o0Var.C0) == null) {
            return;
        }
        jo.p.g(vVar, "karaokeModel");
        sVar.N0(f10, vVar);
    }

    public static final void z3(o0 o0Var, Boolean bool) {
        jo.p.h(o0Var, "this$0");
        if (bool != null) {
            bool.booleanValue();
            s sVar = o0Var.C0;
            if (sVar != null) {
                sVar.O0();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.t2 T = ac.t2.T(LayoutInflater.from(q0()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        RecyclerView recyclerView = T.B;
        f fVar = new f(q0(), new LinearLayoutManager(j0()).w2());
        Drawable f10 = c3.a.f(N2(), xb.n.divider_left_margin16_white_two);
        if (f10 != null) {
            fVar.n(f10);
        }
        recyclerView.g(fVar);
        O3(T);
        x3();
        F3();
        I3();
        H3();
        View u10 = J3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3(KaraokeDetail karaokeDetail) {
        uo.l.d(this, null, null, new a(karaokeDetail, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        uo.r0.d(this, null, 1, null);
        super.F1();
    }

    public final void F3() {
        List<Genre> f10 = M3().g().f();
        if (f10 != null) {
            M3().g().m(f10);
            return;
        }
        M3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // bc.d0
    public void G() {
        h0 h0Var;
        if (this.C0 == null || (h0Var = this.D0) == null) {
            return;
        }
        h0Var.notifyDataSetChanged();
    }

    public final void G3(String str, int i10) {
        M3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new c(str, i10, null), 3, null);
        dq.c.c().l(t.g.f19478a);
    }

    public final void H3() {
        List<Karaoke> f10 = M3().i().f();
        if (f10 != null) {
            M3().i().m(f10);
            return;
        }
        M3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.C0 = null;
        super.I1();
    }

    public final void I3() {
        List<Singer> f10 = M3().m().f();
        if (f10 != null) {
            M3().m().m(f10);
            return;
        }
        M3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final ac.t2 J3() {
        return (ac.t2) this.f17394y0.b(this, J0[0]);
    }

    public final hf.d0 K3() {
        return (hf.d0) this.B0.getValue();
    }

    public final MRRequest L3() {
        return (MRRequest) this.A0.getValue();
    }

    public final rf.b M3() {
        return (rf.b) this.f17395z0.getValue();
    }

    public final void N3() {
        if (this.E0 == null || this.F0 == null || this.G0 == null) {
            return;
        }
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        List<Karaoke> list = this.E0;
        jo.p.e(list);
        List<Genre> list2 = this.F0;
        jo.p.e(list2);
        List<Singer> list3 = this.G0;
        jo.p.e(list3);
        this.D0 = new h0(N2, list, list2, list3, new g(), new h(), new i(), new j());
        J3().B.setAdapter(this.D0);
    }

    public final void O3(ac.t2 t2Var) {
        this.f17394y0.a(this, J0[0], t2Var);
    }

    public final void P3(io.l<? super Boolean, wn.v> lVar) {
        this.I0 = lVar;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f17393x0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.C0 = context instanceof s ? (s) context : null;
    }

    public final void x3() {
        M3().i().i(a1(), new androidx.lifecycle.f0() { // from class: bc.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.B3(o0.this, (List) obj);
            }
        });
        M3().g().i(a1(), new androidx.lifecycle.f0() { // from class: bc.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.C3(o0.this, (List) obj);
            }
        });
        M3().m().i(a1(), new androidx.lifecycle.f0() { // from class: bc.n0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.D3(o0.this, (List) obj);
            }
        });
        M3().j().i(a1(), new androidx.lifecycle.f0() { // from class: bc.i0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.y3(o0.this, (jf.v) obj);
            }
        });
        M3().f().i(a1(), new androidx.lifecycle.f0() { // from class: bc.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.z3(o0.this, (Boolean) obj);
            }
        });
        M3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.k0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                o0.A3(o0.this, (Boolean) obj);
            }
        });
    }
}
