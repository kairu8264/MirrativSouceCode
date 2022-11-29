package gb;

import ae.g4;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequests;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import jo.f0;
import jo.p;
import jo.s;
import qo.h;
import vb.u;
import wa.k;

/* loaded from: classes2.dex */
public final class f extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public u O0;
    public static final /* synthetic */ h<Object>[] Q0 = {f0.d(new s(f.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentRewardPostResultBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ f b(a aVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return aVar.a(str, str2, str3, z10);
        }

        public final f a(String str, String str2, String str3, boolean z10) {
            p.h(str, "title");
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_REWARD_IMAGE_URL", str2);
            if (str3 != null) {
                bundle.putString("EXTRA_DESCRIPTION_TEXT", str3);
            }
            bundle.putBoolean("EXTRA_IS_SPECIAL_MISSION_REWARD", z10);
            fVar.V2(bundle);
            return fVar;
        }
    }

    public static final void D3(f fVar, View view) {
        p.h(fVar, "this$0");
        fVar.n3();
    }

    public final g4 C3() {
        return (g4) this.N0.b(this, Q0[0]);
    }

    public final void E3(g4 g4Var) {
        this.N0.a(this, Q0[0], g4Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        u uVar = this.O0;
        if (uVar != null) {
            uVar.H2(M2().getBoolean("EXTRA_IS_SPECIAL_MISSION_REWARD"));
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        g4 T = g4.T(LayoutInflater.from(q0()), null, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        E3(T);
        String string = M2().getString("EXTRA_DESCRIPTION_TEXT");
        if (string != null) {
            C3().D.setText(string);
            C3().D.setVisibility(0);
        }
        C3().G.setText(M2().getString("EXTRA_TITLE"));
        GlideRequests with = GlideApp.with(N2());
        Object string2 = M2().getString("EXTRA_REWARD_IMAGE_URL");
        if (string2 == null) {
            string2 = c3.a.f(N2(), wa.d.ic_coin_large);
        }
        with.load(string2).into(C3().E);
        C3().C.setOnClickListener(new View.OnClickListener() { // from class: gb.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.D3(f.this, view);
            }
        });
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        C3().H.startAnimation(rotateAnimation);
        Dialog dialog = new Dialog(N2(), k.f58560b);
        Window window = dialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        dialog.setContentView(C3().u());
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(wa.c.f58521m);
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

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.O0 = (u) context;
    }
}
