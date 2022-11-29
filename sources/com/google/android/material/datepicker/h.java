package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import o3.c0;

/* loaded from: classes3.dex */
public final class h<S> extends p<S> {
    public static final Object I0 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object J0 = "NAVIGATION_PREV_TAG";
    public static final Object K0 = "NAVIGATION_NEXT_TAG";
    public static final Object L0 = "SELECTOR_TOGGLE_TAG";
    public com.google.android.material.datepicker.a A0;
    public com.google.android.material.datepicker.l B0;
    public k C0;
    public com.google.android.material.datepicker.c D0;
    public RecyclerView E0;
    public RecyclerView F0;
    public View G0;
    public View H0;

    /* renamed from: y0  reason: collision with root package name */
    public int f27541y0;

    /* renamed from: z0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f27542z0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f27543w;

        public a(int i10) {
            this.f27543w = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.F0.x1(this.f27543w);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends o3.a {
        public b() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            cVar.d0(null);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends q {

        /* renamed from: e0  reason: collision with root package name */
        public final /* synthetic */ int f27546e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f27546e0 = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void V1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.f27546e0 == 0) {
                iArr[0] = h.this.F0.getWidth();
                iArr[1] = h.this.F0.getWidth();
                return;
            }
            iArr[0] = h.this.F0.getHeight();
            iArr[1] = h.this.F0.getHeight();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements l {
        public d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j10) {
            if (h.this.A0.f().p0(j10)) {
                h.this.f27542z0.N1(j10);
                Iterator<o<S>> it = h.this.f27592x0.iterator();
                while (it.hasNext()) {
                    it.next().a((S) h.this.f27542z0.H1());
                }
                h.this.F0.getAdapter().notifyDataSetChanged();
                if (h.this.E0 != null) {
                    h.this.E0.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final Calendar f27549a = s.k();

        /* renamed from: b  reason: collision with root package name */
        public final Calendar f27550b = s.k();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int width;
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (n3.d<Long, Long> dVar : h.this.f27542z0.W0()) {
                    Long l10 = dVar.f41559a;
                    if (l10 != null && dVar.f41560b != null) {
                        this.f27549a.setTimeInMillis(l10.longValue());
                        this.f27550b.setTimeInMillis(dVar.f41560b.longValue());
                        int c10 = tVar.c(this.f27549a.get(1));
                        int c11 = tVar.c(this.f27550b.get(1));
                        View N = gridLayoutManager.N(c10);
                        View N2 = gridLayoutManager.N(c11);
                        int f32 = c10 / gridLayoutManager.f3();
                        int f33 = c11 / gridLayoutManager.f3();
                        int i10 = f32;
                        while (i10 <= f33) {
                            View N3 = gridLayoutManager.N(gridLayoutManager.f3() * i10);
                            if (N3 != null) {
                                int top = N3.getTop() + h.this.D0.f27531d.c();
                                int bottom = N3.getBottom() - h.this.D0.f27531d.b();
                                int left = i10 == f32 ? N.getLeft() + (N.getWidth() / 2) : 0;
                                if (i10 == f33) {
                                    width = N2.getLeft() + (N2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, h.this.D0.f27535h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends o3.a {
        public f() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            String U0;
            super.g(view, cVar);
            if (h.this.H0.getVisibility() == 0) {
                U0 = h.this.U0(wi.j.f58902s);
            } else {
                U0 = h.this.U0(wi.j.f58900q);
            }
            cVar.o0(U0);
        }
    }

    /* loaded from: classes3.dex */
    public class g extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f27553a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MaterialButton f27554b;

        public g(n nVar, MaterialButton materialButton) {
            this.f27553a = nVar;
            this.f27554b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                CharSequence text = this.f27554b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int l22;
            if (i10 < 0) {
                l22 = h.this.z3().i2();
            } else {
                l22 = h.this.z3().l2();
            }
            h.this.B0 = this.f27553a.b(l22);
            this.f27554b.setText(this.f27553a.c(l22));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC0244h implements View.OnClickListener {
        public View$OnClickListenerC0244h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.E3();
        }
    }

    /* loaded from: classes3.dex */
    public class i implements View.OnClickListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f27557w;

        public i(n nVar) {
            this.f27557w = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i22 = h.this.z3().i2() + 1;
            if (i22 < h.this.F0.getAdapter().getItemCount()) {
                h.this.C3(this.f27557w.b(i22));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f27559w;

        public j(n nVar) {
            this.f27559w = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int l22 = h.this.z3().l2() - 1;
            if (l22 >= 0) {
                h.this.C3(this.f27559w.b(l22));
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* loaded from: classes3.dex */
    public interface l {
        void a(long j10);
    }

    public static <T> h<T> A3(com.google.android.material.datepicker.d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.i());
        hVar.V2(bundle);
        return hVar;
    }

    public static int y3(Context context) {
        return context.getResources().getDimensionPixelSize(wi.d.I);
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        if (bundle == null) {
            bundle = n0();
        }
        this.f27541y0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f27542z0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final void B3(int i10) {
        this.F0.post(new a(i10));
    }

    public void C3(com.google.android.material.datepicker.l lVar) {
        n nVar = (n) this.F0.getAdapter();
        int d10 = nVar.d(lVar);
        int d11 = d10 - nVar.d(this.B0);
        boolean z10 = Math.abs(d11) > 3;
        boolean z11 = d11 > 0;
        this.B0 = lVar;
        if (z10 && z11) {
            this.F0.p1(d10 - 3);
            B3(d10);
        } else if (z10) {
            this.F0.p1(d10 + 3);
            B3(d10);
        } else {
            B3(d10);
        }
    }

    public void D3(k kVar) {
        this.C0 = kVar;
        if (kVar == k.YEAR) {
            this.E0.getLayoutManager().G1(((t) this.E0.getAdapter()).c(this.B0.f27577y));
            this.G0.setVisibility(0);
            this.H0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.G0.setVisibility(8);
            this.H0.setVisibility(0);
            C3(this.B0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(q0(), this.f27541y0);
        this.D0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l j10 = this.A0.j();
        if (com.google.android.material.datepicker.i.Q3(contextThemeWrapper)) {
            i10 = wi.h.f58879q;
            i11 = 1;
        } else {
            i10 = wi.h.f58877o;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(wi.f.f58858x);
        c0.r0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(j10.f27578z);
        gridView.setEnabled(false);
        this.F0 = (RecyclerView) inflate.findViewById(wi.f.A);
        this.F0.setLayoutManager(new c(q0(), i11, false, i11));
        this.F0.setTag(I0);
        n nVar = new n(contextThemeWrapper, this.f27542z0, this.A0, new d());
        this.F0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(wi.g.f58862b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(wi.f.B);
        this.E0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.E0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.E0.setAdapter(new t(this));
            this.E0.g(t3());
        }
        if (inflate.findViewById(wi.f.f58852r) != null) {
            s3(inflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.Q3(contextThemeWrapper)) {
            new y().b(this.F0);
        }
        this.F0.p1(nVar.d(this.B0));
        return inflate;
    }

    public void E3() {
        k kVar = this.C0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            D3(k.DAY);
        } else if (kVar == k.DAY) {
            D3(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        super.b2(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27541y0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f27542z0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.B0);
    }

    @Override // com.google.android.material.datepicker.p
    public boolean j3(o<S> oVar) {
        return super.j3(oVar);
    }

    public final void s3(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(wi.f.f58852r);
        materialButton.setTag(L0);
        c0.r0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(wi.f.f58854t);
        materialButton2.setTag(J0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(wi.f.f58853s);
        materialButton3.setTag(K0);
        this.G0 = view.findViewById(wi.f.B);
        this.H0 = view.findViewById(wi.f.f58857w);
        D3(k.DAY);
        materialButton.setText(this.B0.n(view.getContext()));
        this.F0.k(new g(nVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC0244h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    public final RecyclerView.o t3() {
        return new e();
    }

    public com.google.android.material.datepicker.a u3() {
        return this.A0;
    }

    public com.google.android.material.datepicker.c v3() {
        return this.D0;
    }

    public com.google.android.material.datepicker.l w3() {
        return this.B0;
    }

    public com.google.android.material.datepicker.d<S> x3() {
        return this.f27542z0;
    }

    public LinearLayoutManager z3() {
        return (LinearLayoutManager) this.F0.getLayoutManager();
    }
}
