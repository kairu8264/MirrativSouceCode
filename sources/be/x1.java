package be;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.AutoClearedValue;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x1 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(x1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentGiftItemDetailBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x1 a(ArrayList<ud.w0> arrayList, int i10) {
            jo.p.h(arrayList, "eventGiftBoxRewards");
            x1 x1Var = new x1();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EXTRA_EVENT_GIFT_BOX_REWARDS", arrayList);
            bundle.putInt("EXTRA_ITEM_POSITION", i10);
            x1Var.V2(bundle);
            return x1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f18299w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x1 f18300x;

        public b(DisplayMetrics displayMetrics, x1 x1Var) {
            this.f18299w = displayMetrics;
            this.f18300x = x1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            float measuredHeight = (this.f18299w.heightPixels - view.getMeasuredHeight()) / 2.0f;
            view.setY(measuredHeight);
            this.f18300x.D3().B.setY(this.f18300x.D3().B.getY() + measuredHeight);
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
            x1.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            x1.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public static final void E3(x1 x1Var, int i10, androidx.recyclerview.widget.y yVar) {
        jo.p.h(x1Var, "this$0");
        jo.p.h(yVar, "$snapHelper");
        RecyclerView.p layoutManager = x1Var.D3().C.getLayoutManager();
        jo.p.e(layoutManager);
        View N = layoutManager.N(i10);
        if (N == null) {
            return;
        }
        RecyclerView.p layoutManager2 = x1Var.D3().C.getLayoutManager();
        jo.p.e(layoutManager2);
        int[] c10 = yVar.c(layoutManager2, N);
        if (c10 == null) {
            return;
        }
        if (c10[0] == 0 && c10[1] == 0) {
            return;
        }
        x1Var.D3().C.scrollBy(c10[0], c10[1]);
    }

    public final ae.f3 D3() {
        return (ae.f3) this.N0.b(this, P0[0]);
    }

    public final void F3(ae.f3 f3Var) {
        this.N0.a(this, P0[0], f3Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ae.f3 T = ae.f3.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        F3(T);
        ArrayList parcelableArrayList = M2().getParcelableArrayList("EXTRA_EVENT_GIFT_BOX_REWARDS");
        if (parcelableArrayList != null) {
            D3().C.setAdapter(new rd.d0(parcelableArrayList));
        }
        final androidx.recyclerview.widget.y yVar = new androidx.recyclerview.widget.y();
        yVar.b(D3().C);
        final int i10 = M2().getInt("EXTRA_ITEM_POSITION");
        D3().C.p1(i10);
        D3().C.post(new Runnable() { // from class: be.w1
            @Override // java.lang.Runnable
            public final void run() {
                x1.E3(x1.this, i10, yVar);
            }
        });
        D3().C.k(new c());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = N2().getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int b10 = (displayMetrics.widthPixels - de.e.b(this, 280)) / 2;
        D3().C.g(new p001if.c(de.e.b(this, 20), b10, 0, b10, 0, 0));
        RecyclerView recyclerView = D3().C;
        jo.p.g(recyclerView, "binding.recyclerView");
        if (o3.c0.V(recyclerView) && !recyclerView.isLayoutRequested()) {
            float measuredHeight = (displayMetrics.heightPixels - recyclerView.getMeasuredHeight()) / 2.0f;
            recyclerView.setY(measuredHeight);
            D3().B.setY(D3().B.getY() + measuredHeight);
        } else {
            recyclerView.addOnLayoutChangeListener(new b(displayMetrics, this));
        }
        AppCompatImageView appCompatImageView = D3().B;
        jo.p.g(appCompatImageView, "binding.closeButton");
        yd.g1.a(appCompatImageView, new d());
        ConstraintLayout constraintLayout = D3().D;
        jo.p.g(constraintLayout, "binding.rootContainer");
        yd.g1.a(constraintLayout, new e());
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        dialog.setContentView(D3().u());
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nd.w0.Q0);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.clearFlags(2);
        }
        return dialog;
    }
}
