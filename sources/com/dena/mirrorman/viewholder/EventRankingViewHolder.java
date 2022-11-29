package com.dena.mirrorman.viewholder;

import ae.wf;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.g2;
import de.m;
import io.l;
import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.w0;
import rd.i0;
import ud.q1;
import ud.r1;
import wn.v;

/* loaded from: classes3.dex */
public final class EventRankingViewHolder extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final c f26242c = new c(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f26243d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wf f26244a;

    /* renamed from: b  reason: collision with root package name */
    public g2 f26245b;

    /* loaded from: classes3.dex */
    public static final class a extends q implements l<Integer, v> {
        public a() {
            super(1);
        }

        public final void a(int i10) {
            g2 g2Var = EventRankingViewHolder.this.f26245b;
            if (g2Var != null) {
                g2Var.G(i10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q implements l<String, v> {
        public b() {
            super(1);
        }

        public final void a(String str) {
            p.h(str, "liveId");
            g2 g2Var = EventRankingViewHolder.this.f26245b;
            if (g2Var != null) {
                g2Var.u1(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(h hVar) {
            this();
        }

        public final EventRankingViewHolder a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_landing_page_ranking_list, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new EventRankingViewHolder((wf) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends ViewOutlineProvider {
        public d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            p.h(view, "view");
            p.h(outline, "outline");
            outline.setRoundRect(0, -m.a(EventRankingViewHolder.this, 12), view.getWidth(), view.getHeight(), m.a(EventRankingViewHolder.this, 12));
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends ViewOutlineProvider {
        public e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            p.h(view, "view");
            p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), m.a(EventRankingViewHolder.this, 12));
        }
    }

    public EventRankingViewHolder(wf wfVar) {
        super(wfVar.u());
        this.f26244a = wfVar;
        wfVar.E.setLayoutManager(new LinearLayoutManager(wfVar.u().getContext()) { // from class: com.dena.mirrorman.viewholder.EventRankingViewHolder.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        RecyclerView recyclerView = wfVar.E;
        i0 i0Var = new i0();
        i0Var.c(new a());
        i0Var.b(new b());
        recyclerView.setAdapter(i0Var);
    }

    public /* synthetic */ EventRankingViewHolder(wf wfVar, h hVar) {
        this(wfVar);
    }

    public final void b(q1 q1Var, g2 g2Var) {
        ViewOutlineProvider eVar;
        p.h(q1Var, "bindModel");
        this.f26245b = g2Var;
        this.f26244a.T(q1Var);
        List<r1> f10 = q1Var.h().f();
        if (f10 != null) {
            RecyclerView.h adapter = this.f26244a.E.getAdapter();
            p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LandingPageRankingUserAdapter");
            ((i0) adapter).d(f10);
        }
        Boolean f11 = q1Var.d().f();
        Boolean bool = Boolean.TRUE;
        if (p.c(f11, bool)) {
            eVar = new d();
        } else {
            eVar = new e();
        }
        this.f26244a.C.setOutlineProvider(eVar);
        this.f26244a.C.setClipToOutline(true);
        if (p.c(q1Var.c().f(), bool)) {
            if (p.c(q1Var.d().f(), bool)) {
                View view = this.f26244a.B;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setStroke(m.a(this, 2), c3.a.d(this.f26244a.u().getContext(), w0.f42229d));
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, m.a(this, 12), m.a(this, 12), m.a(this, 12), m.a(this, 12)});
                view.setBackground(gradientDrawable);
                return;
            }
            View view2 = this.f26244a.B;
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(m.a(this, 2), c3.a.d(this.f26244a.u().getContext(), w0.f42229d));
            gradientDrawable2.setCornerRadius(m.a(this, 12));
            view2.setBackground(gradientDrawable2);
        }
    }
}
