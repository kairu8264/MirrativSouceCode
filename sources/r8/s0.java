package r8;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.CarouselView;
import java.util.List;
import s8.a;

/* loaded from: classes.dex */
public final class s0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f50012a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends s8.a> f50013b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f50014c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super s8.a, wn.v> f50015d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f50016e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f50017f;

    /* renamed from: g  reason: collision with root package name */
    public v f50018g;

    /* renamed from: h  reason: collision with root package name */
    public h0 f50019h;

    /* renamed from: i  reason: collision with root package name */
    public io.l<? super String, wn.v> f50020i;

    /* renamed from: j  reason: collision with root package name */
    public c f50021j;

    /* renamed from: k  reason: collision with root package name */
    public m0 f50022k;

    /* renamed from: l  reason: collision with root package name */
    public i f50023l;

    /* renamed from: m  reason: collision with root package name */
    public m f50024m;

    /* loaded from: classes.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f50025w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0 f50026x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f50027y;

        public a(RecyclerView.e0 e0Var, s0 s0Var, int i10) {
            this.f50025w = e0Var;
            this.f50026x = s0Var;
            this.f50027y = i10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f50025w.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            io.l<Integer, wn.v> a10 = this.f50026x.a();
            if (a10 != null) {
                a10.invoke(Integer.valueOf(this.f50027y));
            }
        }
    }

    public s0(androidx.lifecycle.u uVar) {
        jo.p.h(uVar, "lifecycleOwner");
        this.f50012a = uVar;
        this.f50013b = xn.s.k();
    }

    public final io.l<Integer, wn.v> a() {
        return this.f50014c;
    }

    public final List<s8.a> b() {
        return this.f50013b;
    }

    public final void c(io.l<? super String, wn.v> lVar) {
        this.f50020i = lVar;
    }

    public final void d(io.l<? super s8.a, wn.v> lVar) {
        this.f50015d = lVar;
    }

    public final void f(i iVar) {
        this.f50023l = iVar;
    }

    public final void g(c cVar) {
        this.f50021j = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f50013b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f50013b.get(i10).getType().ordinal();
    }

    public final void h(m0 m0Var) {
        this.f50022k = m0Var;
    }

    public final void i(io.l<? super Integer, wn.v> lVar) {
        this.f50014c = lVar;
    }

    public final void j(m mVar) {
        this.f50024m = mVar;
    }

    public final void k(List<? extends s8.a> list) {
        jo.p.h(list, "value");
        this.f50013b = list;
        notifyDataSetChanged();
    }

    public final void l(v vVar) {
        this.f50018g = vVar;
    }

    public final void m(a0 a0Var) {
        this.f50016e = a0Var;
    }

    public final void n(h0 h0Var) {
        this.f50019h = h0Var;
    }

    public final void o(l0 l0Var) {
        this.f50017f = l0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        io.l<? super s8.a, wn.v> lVar = this.f50015d;
        if (lVar != null) {
            lVar.invoke(this.f50013b.get(i10));
        }
        e0Var.itemView.getViewTreeObserver().addOnGlobalLayoutListener(new a(e0Var, this, i10));
        if (e0Var instanceof z) {
            z zVar = (z) e0Var;
            s8.a aVar = this.f50013b.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogLiveSmallBindModel");
            zVar.f((s8.h) aVar, this.f50012a);
            a0 a0Var = this.f50016e;
            if (a0Var != null) {
                zVar.j(a0Var);
            }
        } else if (e0Var instanceof k0) {
            k0 k0Var = (k0) e0Var;
            s8.a aVar2 = this.f50013b.get(i10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogPrivateLiveSmallBindModel");
            k0Var.h((s8.j) aVar2);
            l0 l0Var = this.f50017f;
            if (l0Var != null) {
                k0Var.k(l0Var);
            }
        } else if (e0Var instanceof u) {
            u uVar = (u) e0Var;
            s8.a aVar3 = this.f50013b.get(i10);
            jo.p.f(aVar3, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogLiveLargeBindModel");
            uVar.d((s8.g) aVar3, this.f50012a);
            v vVar = this.f50018g;
            if (vVar != null) {
                uVar.f(vVar);
            }
        } else if (e0Var instanceof g0) {
            s8.a aVar4 = this.f50013b.get(i10);
            jo.p.f(aVar4, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogMirrativQBindModel");
            ((g0) e0Var).g((s8.i) aVar4, this.f50012a, this.f50019h);
        } else if (e0Var instanceof r) {
            s8.a aVar5 = this.f50013b.get(i10);
            jo.p.f(aVar5, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogLiveAnnouncementBindModel");
            ((r) e0Var).c((s8.f) aVar5, this.f50020i);
        } else if (e0Var instanceof f) {
            s8.a aVar6 = this.f50013b.get(i10);
            jo.p.f(aVar6, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogBannerBindModel");
            ((f) e0Var).c((s8.b) aVar6, this.f50021j);
        } else if (e0Var instanceof h) {
            CarouselView carouselView = ((h) e0Var).a().B;
            s8.a aVar7 = this.f50013b.get(i10);
            jo.p.f(aVar7, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogCarouselBindModel");
            carouselView.i(((s8.c) aVar7).a(), this.f50023l, this.f50021j, this.f50022k, this.f50019h, this.f50012a);
        } else if (e0Var instanceof l) {
            s8.a aVar8 = this.f50013b.get(i10);
            jo.p.f(aVar8, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogGroupShotListBindModel");
            ((l) e0Var).a((s8.d) aVar8, this.f50024m);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.b.LIVE.ordinal()) {
            return z.f50116c.a(viewGroup);
        }
        if (i10 == a.b.LIVE_PRIVATE.ordinal()) {
            return k0.f49950e.a(viewGroup);
        }
        if (i10 == a.b.LIVE_LARGE.ordinal()) {
            return u.f50030c.a(viewGroup);
        }
        if (i10 == a.b.MIRRATIV_Q.ordinal()) {
            return g0.f49906b.a(viewGroup);
        }
        if (i10 == a.b.LIVE_ANNOUNCEMENT.ordinal()) {
            return r.f49984b.a(viewGroup);
        }
        if (i10 == a.b.CATALOG_BANNER.ordinal()) {
            return f.f49896b.a(viewGroup);
        }
        if (i10 == a.b.CAROUSEL.ordinal()) {
            return h.f49915b.a(viewGroup);
        }
        if (i10 == a.b.GROUP_SHOT.ordinal()) {
            return l.f49959b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
