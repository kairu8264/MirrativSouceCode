package bc;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.a2;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.Singer;
import com.dena.mirrorman.net.api.response.Singers;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.ArrayList;
import java.util.List;
import uo.b3;
import uo.d2;

/* loaded from: classes2.dex */
public final class i extends Fragment {
    public static final a I0 = new a(null);
    public static final int J0 = 8;
    public s A0;
    public s1 B0;
    public Integer C0;
    public boolean D0;
    public final wn.f E0;
    public final wn.f F0;
    public uo.d2 G0;
    public io.l<? super Boolean, wn.v> H0;

    /* renamed from: x0  reason: collision with root package name */
    public ac.r2 f17335x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f17336y0 = wn.g.a(j.f17356w);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f17337z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraArtistsTabFragment$fetchSingerList$1", f = "EmokaraArtistsTabFragment.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17338w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f17339x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17341z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f17341z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f17341z, dVar);
            bVar.f17339x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17338w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    uo.q0 q0Var = (uo.q0) this.f17339x;
                    MRRequest C3 = i.this.C3();
                    int i11 = this.f17341z;
                    this.f17339x = q0Var;
                    this.f17338w = 1;
                    obj = MRRequest.DefaultImpls.getKaraokeSingers$default(C3, i11, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    uo.q0 q0Var2 = (uo.q0) this.f17339x;
                    wn.m.b(obj);
                }
                Singers singers = (Singers) obj;
                i.this.D0 = false;
                i.this.C0 = singers.getNextPage();
                ArrayList<Singer> arrayList = new ArrayList();
                List<Singer> f10 = i.this.D3().o().f();
                if (f10 != null) {
                    ArrayList<Singer> arrayList2 = new ArrayList();
                    for (Object obj2 : f10) {
                        if (((Singer) obj2).getId().length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (Singer singer : arrayList2) {
                        arrayList.add(singer);
                    }
                    for (Singer singer2 : singers.getSingers()) {
                        arrayList.add(singer2);
                    }
                } else {
                    for (Singer singer3 : singers.getSingers()) {
                        arrayList.add(singer3);
                    }
                }
                jo.e0 e0Var = new jo.e0();
                e0Var.f38136w = ((Singer) xn.a0.X(arrayList)).getInitial();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new Singer("", "", (String) e0Var.f38136w));
                for (Singer singer4 : arrayList) {
                    if (jo.p.c(e0Var.f38136w, singer4.getInitial())) {
                        arrayList3.add(singer4);
                    } else {
                        e0Var.f38136w = singer4.getInitial();
                        arrayList3.add(new Singer("", "", (String) e0Var.f38136w));
                        arrayList3.add(singer4);
                    }
                }
                i.this.D3().o().m(arrayList3);
                if (i.this.C0 != null) {
                    i.this.F3();
                } else {
                    i.this.D3().l().m(co.b.a(false));
                }
            } catch (Exception e10) {
                g9.a.c(e10);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends androidx.recyclerview.widget.k {
        public c(Context context, int i10) {
            super(context, i10);
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            s1 s1Var = i.this.B0;
            if (s1Var != null) {
                int f02 = recyclerView.f0(view);
                int itemViewType = s1Var.getItemViewType(f02);
                int i10 = f02 + 1;
                if (p(itemViewType, s1Var.getItemCount() == i10 ? 0 : s1Var.getItemViewType(i10))) {
                    super.g(rect, view, recyclerView, b0Var);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            }
        }

        public final boolean p(int i10, int i11) {
            a3 a3Var = a3.values()[i10];
            a3 a3Var2 = a3.SINGER;
            return a3Var == a3Var2 && a3.values()[i11] == a3Var2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<Singer, wn.v> {
        public d() {
            super(1);
        }

        public final void a(Singer singer) {
            jo.p.h(singer, "it");
            androidx.navigation.w.b(i.this.Q2()).r(a2.c.b(a2.f17255a, singer.getName(), singer.getId(), KaraokeLog.SONG_LIST, null, 8, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Singer singer) {
            a(singer);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements yd.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ac.r2 f17344a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f17345b;

        public e(ac.r2 r2Var, i iVar) {
            this.f17344a = r2Var;
            this.f17345b = iVar;
        }

        @Override // yd.j
        public void a(int i10, String str) {
            jo.p.h(str, "initial");
            this.f17344a.C.setVisibility(0);
            this.f17344a.C.setText(str);
            ViewGroup.LayoutParams layoutParams = this.f17344a.C.getLayoutParams();
            ac.r2 r2Var = this.f17344a;
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int height = r2Var.D.getHeight() - r2Var.C.getHeight();
            int height2 = i10 - (r2Var.C.getHeight() / 2);
            if (height > height2) {
                height = height2;
            }
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = height;
            this.f17344a.y();
            this.f17345b.B3().sendLog(KaraokeLog.Companion.createInitialBarLog(this.f17345b.A3().c(), str));
        }

        @Override // yd.j
        public void b(int i10) {
            RecyclerView.p layoutManager = this.f17344a.D.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).J2(i10, 0);
            }
        }

        @Override // yd.j
        public void c() {
            this.f17344a.C.setVisibility(8);
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
            int z32 = i.this.z3() + 50;
            s1 s1Var = i.this.B0;
            if (z32 > (s1Var != null ? s1Var.getItemCount() : 0)) {
                i.this.F3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17347w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17348x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17349y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17347w = componentCallbacks;
            this.f17348x = aVar;
            this.f17349y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f17347w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f17348x, this.f17349y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17350w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17351x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17352y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17350w = componentCallbacks;
            this.f17351x = aVar;
            this.f17352y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f17350w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f17351x, this.f17352y);
        }
    }

    /* renamed from: bc.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0111i extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17353w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17354x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17355y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0111i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17353w = componentCallbacks;
            this.f17354x = aVar;
            this.f17355y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17353w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f17354x, this.f17355y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f17356w = new j();

        public j() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public i() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f17337z0 = wn.g.b(iVar, new g(this, null, null));
        this.C0 = 1;
        this.E0 = wn.g.b(iVar, new h(this, null, null));
        this.F0 = wn.g.b(iVar, new C0111i(this, null, null));
        this.G0 = b3.b(null, 1, null);
    }

    public static final void w3(i iVar, List list) {
        jo.p.h(iVar, "this$0");
        if (list != null) {
            s1 s1Var = iVar.B0;
            if (s1Var != null) {
                s1Var.f(list);
            }
            ac.r2 r2Var = iVar.f17335x0;
            if (r2Var == null) {
                jo.p.v("binding");
                r2Var = null;
            }
            r2Var.B.setSingerList(list);
        }
    }

    public static final void x3(i iVar, Boolean bool) {
        jo.p.h(iVar, "this$0");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            io.l<? super Boolean, wn.v> lVar = iVar.H0;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(booleanValue));
            }
        }
    }

    public final hf.d0 A3() {
        return (hf.d0) this.F0.getValue();
    }

    public final MRLogger B3() {
        return (MRLogger) this.E0.getValue();
    }

    public final MRRequest C3() {
        return (MRRequest) this.f17337z0.getValue();
    }

    public final rf.b D3() {
        return (rf.b) this.f17336y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.r2 T = ac.r2.T(LayoutInflater.from(q0()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        RecyclerView recyclerView = T.D;
        c cVar = new c(q0(), new LinearLayoutManager(j0()).w2());
        Drawable f10 = c3.a.f(N2(), xb.n.divider_left_margin16_white_two);
        if (f10 != null) {
            cVar.n(f10);
        }
        recyclerView.g(cVar);
        s1 s1Var = new s1(new ArrayList(), new d());
        this.B0 = s1Var;
        T.D.setAdapter(s1Var);
        ac.r2 r2Var = null;
        if (bundle != null) {
            RecyclerView.p layoutManager = T.D.getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                layoutManager.G1(bundle.getInt("scroll_position"));
            }
            int i10 = bundle.getInt("nextPage", -1);
            this.C0 = i10 == -1 ? null : Integer.valueOf(i10);
        }
        T.B.setFastScrollListener(new e(T, this));
        this.f17335x0 = T;
        H3();
        v3();
        E3();
        ac.r2 r2Var2 = this.f17335x0;
        if (r2Var2 == null) {
            jo.p.v("binding");
        } else {
            r2Var = r2Var2;
        }
        View u10 = r2Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void E3() {
        d2.a.a(this.G0, null, 1, null);
        this.D0 = false;
        F3();
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        d2.a.a(this.G0, null, 1, null);
        super.F1();
    }

    public final void F3() {
        Integer num = this.C0;
        if (num == null || this.D0 || num == null) {
            return;
        }
        int intValue = num.intValue();
        this.D0 = true;
        y3(intValue);
    }

    public final void G3(io.l<? super Boolean, wn.v> lVar) {
        this.H0 = lVar;
    }

    public final void H3() {
        ac.r2 r2Var = this.f17335x0;
        if (r2Var == null) {
            jo.p.v("binding");
            r2Var = null;
        }
        r2Var.D.k(new f());
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.A0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        jo.p.h(bundle, "outState");
        super.b2(bundle);
        ac.r2 r2Var = this.f17335x0;
        wn.v vVar = null;
        if (r2Var == null) {
            jo.p.v("binding");
            r2Var = null;
        }
        RecyclerView.p layoutManager = r2Var.D.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            bundle.putInt("scroll_position", ((LinearLayoutManager) layoutManager).i2());
        }
        Integer num = this.C0;
        if (num != null) {
            bundle.putInt("nextPage", num.intValue());
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            bundle.remove("nextPage");
        }
    }

    public final void v3() {
        D3().o().i(a1(), new androidx.lifecycle.f0() { // from class: bc.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i.w3(i.this, (List) obj);
            }
        });
        D3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i.x3(i.this, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.A0 = context instanceof s ? (s) context : null;
    }

    public final void y3(int i10) {
        uo.d2 d10;
        D3().l().m(Boolean.TRUE);
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new b(i10, null), 3, null);
        this.G0 = d10;
    }

    public final int z3() {
        ac.r2 r2Var = this.f17335x0;
        if (r2Var == null) {
            jo.p.v("binding");
            r2Var = null;
        }
        RecyclerView.p layoutManager = r2Var.D.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).l2();
    }
}
