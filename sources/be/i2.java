package be;

import ae.w5;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class i2 extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final androidx.recyclerview.widget.y P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i2 a(List<ud.s1> list, int i10) {
            jo.p.h(list, "listItems");
            i2 i2Var = new i2();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EXTRA_LIST_ITEMS", new ArrayList<>(list));
            bundle.putInt("EXTRA_SELECTED_INDEX", i10);
            i2Var.V2(bundle);
            return i2Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<ArrayList<ud.s1>> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ArrayList<ud.s1> invoke() {
            ArrayList<ud.s1> parcelableArrayList = i2.this.M2().getParcelableArrayList("EXTRA_LIST_ITEMS");
            jo.p.e(parcelableArrayList);
            return parcelableArrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.u {
        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (measuredHeight > recyclerView.getMinimumHeight()) {
                recyclerView.setMinimumHeight(measuredHeight);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i2.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f17919w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ w5 f17920x;

        public e(DisplayMetrics displayMetrics, w5 w5Var) {
            this.f17919w = displayMetrics;
            this.f17920x = w5Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            float measuredHeight = (this.f17919w.heightPixels - view.getMeasuredHeight()) / 2.0f;
            view.setY(measuredHeight);
            AppCompatImageView appCompatImageView = this.f17920x.B;
            appCompatImageView.setY(appCompatImageView.getY() + measuredHeight);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<Integer> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(i2.this.M2().getInt("EXTRA_SELECTED_INDEX"));
        }
    }

    public i2() {
        super(nd.b1.dialog_landing_page_reward_list);
        this.N0 = wn.g.a(new b());
        this.O0 = wn.g.a(new f());
        this.P0 = new androidx.recyclerview.widget.y();
    }

    public static final void E3(w5 w5Var, i2 i2Var, int i10, int i11) {
        jo.p.h(i2Var, "this$0");
        RecyclerView.p layoutManager = w5Var.C.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.J2(i2Var.D3(), i10 - (i11 / 2));
        }
    }

    public final List<ud.s1> C3() {
        Object value = this.N0.getValue();
        jo.p.g(value, "<get-listItems>(...)");
        return (List) value;
    }

    public final int D3() {
        return ((Number) this.O0.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        final w5 T = w5.T(view);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = N2().getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        final int b10 = (displayMetrics.widthPixels - de.e.b(this, 280)) / 2;
        final int b11 = de.e.b(this, 20);
        this.P0.b(T.C);
        T.C.setLayoutManager(new LinearLayoutManager(T.u().getContext(), 0, false));
        T.C.g(new p001if.c(b11, b10, 0, b10, 0, 0));
        RecyclerView recyclerView = T.C;
        rd.h0 h0Var = new rd.h0();
        h0Var.f(C3(), new Runnable() { // from class: be.h2
            @Override // java.lang.Runnable
            public final void run() {
                i2.E3(w5.this, this, b10, b11);
            }
        });
        recyclerView.setAdapter(h0Var);
        T.C.k(new c());
        RecyclerView recyclerView2 = T.C;
        jo.p.g(recyclerView2, "rewardRecyclerView");
        if (o3.c0.V(recyclerView2) && !recyclerView2.isLayoutRequested()) {
            float measuredHeight = (displayMetrics.heightPixels - recyclerView2.getMeasuredHeight()) / 2.0f;
            recyclerView2.setY(measuredHeight);
            AppCompatImageView appCompatImageView = T.B;
            appCompatImageView.setY(appCompatImageView.getY() + measuredHeight);
        } else {
            recyclerView2.addOnLayoutChangeListener(new e(displayMetrics, T));
        }
        AppCompatImageView appCompatImageView2 = T.B;
        jo.p.g(appCompatImageView2, "closeButton");
        yd.g1.a(appCompatImageView2, new d());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
