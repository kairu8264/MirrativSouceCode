package be;

import android.app.Dialog;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.feature.player.gifting.GiftParticleView;

/* loaded from: classes2.dex */
public final class y1 extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final wn.f N0;
    public final wn.f O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y1 a(String str, PointF pointF) {
            jo.p.h(str, "imageUrl");
            jo.p.h(pointF, "sourcePoint");
            y1 y1Var = new y1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_IMAGE_URL", str);
            bundle.putParcelable("EXTRA_KEY_SOURCE_POINT", pointF);
            y1Var.V2(bundle);
            return y1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = y1.this.M2().getString("EXTRA_KEY_IMAGE_URL");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ae.h3 f18308w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y1 f18309x;

        public c(ae.h3 h3Var, y1 y1Var) {
            this.f18308w = h3Var;
            this.f18309x = y1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            GiftParticleView giftParticleView = this.f18308w.B;
            jo.p.g(giftParticleView, "binding.giftParticleView");
            GiftParticleView.d(giftParticleView, this.f18309x.D3(), this.f18309x.E3(), 0, new d(), 4, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            y1.this.n3();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<PointF> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final PointF invoke() {
            Parcelable parcelable = y1.this.M2().getParcelable("EXTRA_KEY_SOURCE_POINT");
            jo.p.e(parcelable);
            return (PointF) parcelable;
        }
    }

    public y1() {
        super(nd.b1.dialog_fragment_gift_particle_view);
        this.N0 = wn.g.a(new b());
        this.O0 = wn.g.a(new e());
    }

    public final String D3() {
        return (String) this.N0.getValue();
    }

    public final PointF E3() {
        return (PointF) this.O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window = p33.getWindow()) != null) {
            window.addFlags(24);
        }
        ae.h3 T = ae.h3.T(view);
        GiftParticleView giftParticleView = T.B;
        jo.p.g(giftParticleView, "binding.giftParticleView");
        if (o3.c0.V(giftParticleView) && !giftParticleView.isLayoutRequested()) {
            GiftParticleView giftParticleView2 = T.B;
            jo.p.g(giftParticleView2, "binding.giftParticleView");
            GiftParticleView.d(giftParticleView2, D3(), E3(), 0, new d(), 4, null);
            return;
        }
        giftParticleView.addOnLayoutChangeListener(new c(T, this));
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        return dialog;
    }
}
