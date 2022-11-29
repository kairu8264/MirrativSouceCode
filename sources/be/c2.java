package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class c2 extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final wn.f N0;
    public d2 O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c2 a(String str) {
            jo.p.h(str, "streamerUserName");
            c2 c2Var = new c2();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_STREAMER_USER_NAME", str);
            c2Var.V2(bundle);
            return c2Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            d2 d2Var = c2.this.O0;
            if (d2Var != null) {
                d2Var.k2();
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
            d2 d2Var = c2.this.O0;
            if (d2Var != null) {
                d2Var.C2();
            }
            c2.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17766w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17767x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17768y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17766w = componentCallbacks;
            this.f17767x = aVar;
            this.f17768y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f17766w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f17767x, this.f17768y);
        }
    }

    public c2() {
        super(nd.b1.dialog_fragment_invited_collab_live);
        this.N0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
    }

    public final nd.i1 C3() {
        return (nd.i1) this.N0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String U0;
        Window window;
        Window window2;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(de.e.b(this, 300), -2);
        }
        Dialog p33 = p3();
        if (p33 != null && (window = p33.getWindow()) != null) {
            window.setBackgroundDrawableResource(nd.y0.rectangle_corner12_whitethree);
        }
        String string = M2().getString("EXTRA_KEY_STREAMER_USER_NAME");
        ae.n3 T = ae.n3.T(view);
        T.E.setText(V0(nd.f1.text_collab_streaming_invitation_message, string));
        RoundedButtonView roundedButtonView = T.C;
        if (C3().a().d()) {
            U0 = U0(nd.f1.text_start_streaming_collab_setting_during_cast);
        } else {
            U0 = U0(nd.f1.text_start_streaming_collab_setting);
        }
        roundedButtonView.setTitle(U0);
        RoundedButtonView roundedButtonView2 = T.C;
        jo.p.g(roundedButtonView2, "binding.liveStartButtonView");
        yd.g1.a(roundedButtonView2, new b());
        AppCompatTextView appCompatTextView = T.D;
        jo.p.g(appCompatTextView, "binding.rejectTextView");
        yd.g1.a(appCompatTextView, new c());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof d2 ? (d2) context : null;
    }
}
