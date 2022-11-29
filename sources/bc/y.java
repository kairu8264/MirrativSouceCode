package bc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class y extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0 = wn.g.b(wn.i.SYNCHRONIZED, new b(this, null, null));
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(y.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentEmokaraHeadsetAlertBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a() {
            return new y();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17514w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17515x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17516y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17514w = componentCallbacks;
            this.f17515x = aVar;
            this.f17516y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f17514w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f17515x, this.f17516y);
        }
    }

    public static final void E3(y yVar, View view) {
        jo.p.h(yVar, "this$0");
        yVar.m3();
    }

    public final ac.e0 C3() {
        return (ac.e0) this.N0.b(this, Q0[0]);
    }

    public final kf.v D3() {
        return (kf.v) this.O0.getValue();
    }

    public final void F3(ac.e0 e0Var) {
        this.N0.a(this, Q0[0], e0Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.dialog_fragment_emokara_headset_alert, null, false);
        ac.e0 e0Var = (ac.e0) e10;
        e0Var.B.setOnClickListener(new View.OnClickListener() { // from class: bc.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.E3(y.this, view);
            }
        });
        D3().m2(false);
        jo.p.g(e10, "inflate<DialogFragmentEm…raAlert = false\n        }");
        F3(e0Var);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
