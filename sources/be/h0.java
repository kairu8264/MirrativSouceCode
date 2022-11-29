package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.MRUrl;

/* loaded from: classes2.dex */
public final class h0 extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public i0 N0;
    public final wn.f O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h0 a(boolean z10) {
            h0 h0Var = new h0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_STREAMING_COLLAB_ENABLED", z10);
            h0Var.V2(bundle);
            return h0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i0 i0Var = h0.this.N0;
            if (i0Var != null) {
                i0Var.H0();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i0 i0Var = h0.this.N0;
            if (i0Var != null) {
                i0Var.x0();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f17855w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(1);
            this.f17855w = view;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            WebViewActivity.a aVar = WebViewActivity.X;
            Context context = this.f17855w.getContext();
            jo.p.g(context, "view.context");
            this.f17855w.getContext().startActivity(WebViewActivity.a.b(aVar, context, MRUrl.HelpCollab.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17856w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17857x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17856w = componentCallbacks;
            this.f17857x = aVar;
            this.f17858y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f17856w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f17857x, this.f17858y);
        }
    }

    public h0() {
        super(nd.b1.dialog_fragment_collab_start);
        this.O0 = wn.g.b(wn.i.SYNCHRONIZED, new e(this, null, null));
    }

    public static final void E3(h0 h0Var, View view) {
        jo.p.h(h0Var, "this$0");
        h0Var.m3();
    }

    public final nd.i1 D3() {
        return (nd.i1) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.x1 T = ae.x1.T(view);
        if (M2().getBoolean("EXTRA_IS_STREAMING_COLLAB_ENABLED")) {
            T.F.setVisibility(0);
            T.G.setVisibility(0);
            T.H.setVisibility(0);
        } else {
            T.F.setVisibility(8);
            T.G.setVisibility(8);
            T.H.setVisibility(8);
        }
        if (D3().a().d()) {
            T.D.setVisibility(8);
            T.E.setVisibility(8);
        } else {
            T.D.setVisibility(0);
            T.E.setVisibility(0);
        }
        AppCompatImageView appCompatImageView = T.F;
        jo.p.g(appCompatImageView, "binding.collabLiveImageView");
        yd.g1.a(appCompatImageView, new b());
        AppCompatImageView appCompatImageView2 = T.D;
        jo.p.g(appCompatImageView2, "binding.collabCallImageView");
        yd.g1.a(appCompatImageView2, new c());
        AppCompatImageView appCompatImageView3 = T.H;
        jo.p.g(appCompatImageView3, "binding.helpImageView");
        yd.g1.a(appCompatImageView3, new d(view));
        T.B.setOnClickListener(new View.OnClickListener() { // from class: be.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h0.E3(h0.this, view2);
            }
        });
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(de.e.b(this, 300), -2);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof i0 ? (i0) context : null;
    }
}
