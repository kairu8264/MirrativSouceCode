package yb;

import ac.u;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import ao.g;
import com.dena.mirrorman.customview.RoundedButtonView;
import da.j;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import uo.q0;
import uo.r0;
import wn.v;
import xb.s;
import yd.g1;

/* loaded from: classes2.dex */
public final class c extends e implements q0 {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final /* synthetic */ j N0;
    public io.a<v> O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a() {
            return new c();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            c.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public c() {
        super(xb.p.dialog_fragment_became_cheerleader_tutorial);
        this.N0 = new j();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        RoundedButtonView roundedButtonView = u.T(view).D;
        p.g(roundedButtonView, "binding.okButton");
        g1.a(roundedButtonView, new b());
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        io.a<v> aVar = this.O0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), s.f60094a);
    }
}
