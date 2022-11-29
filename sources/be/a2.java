package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class a2 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public b2 N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a2 a(String str) {
            jo.p.h(str, "streamerUserName");
            a2 a2Var = new a2();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_STREAMER_USER_NAME", str);
            a2Var.V2(bundle);
            return a2Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b2 b2Var = a2.this.N0;
            if (b2Var != null) {
                b2Var.T0();
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
            b2 b2Var = a2.this.N0;
            if (b2Var != null) {
                b2Var.V0();
            }
            a2.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public a2() {
        super(nd.b1.dialog_fragment_invited_collab_call);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
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
        ae.l3 T = ae.l3.T(view);
        T.E.setText(V0(nd.f1.text_collab_talk_invitation_message, string));
        RoundedButtonView roundedButtonView = T.B;
        jo.p.g(roundedButtonView, "binding.callStartButtonView");
        yd.g1.a(roundedButtonView, new b());
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
        this.N0 = context instanceof b2 ? (b2) context : null;
    }
}
