package rb;

import ae.a4;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.fragment.app.e;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.customview.RoundedButtonView;
import hb.c2;
import hb.x1;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import qo.h;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class b extends e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public InterfaceC0775b O0;
    public static final /* synthetic */ h<Object>[] Q0 = {f0.d(new s(b.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentQuizPopupBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(String str, String str2, String str3, String str4, int i10, InterfaceC0775b interfaceC0775b) {
            p.h(str, "titleHtml");
            p.h(str2, "bodyText");
            p.h(str3, "yesButtonTitle");
            p.h(str4, "noButtonTitle");
            p.h(interfaceC0775b, "listener");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE_HTML", str);
            bundle.putString("EXTRA_BODY_TEXT", str2);
            bundle.putString("EXTRA_YES_BUTTON_TITLE", str3);
            bundle.putString("EXTRA_NO_BUTTON_TITLE", str4);
            bundle.putInt("EXTRA_TOP_IMAGE_RESOURCE_ID", i10);
            bVar.V2(bundle);
            bVar.O0 = interfaceC0775b;
            return bVar;
        }
    }

    /* renamed from: rb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0775b {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            InterfaceC0775b interfaceC0775b = b.this.O0;
            if (interfaceC0775b != null) {
                interfaceC0775b.b();
            }
            b.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            InterfaceC0775b interfaceC0775b = b.this.O0;
            if (interfaceC0775b != null) {
                interfaceC0775b.a();
            }
            b.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public final a4 D3() {
        return (a4) this.N0.b(this, Q0[0]);
    }

    public final void E3(a4 a4Var) {
        this.N0.a(this, Q0[0], a4Var);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        this.O0 = null;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = f.e(LayoutInflater.from(q0()), x1.f35034e, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        E3((a4) e10);
        String string = M2().getString("EXTRA_TITLE_HTML");
        String string2 = M2().getString("EXTRA_BODY_TEXT");
        String string3 = M2().getString("EXTRA_YES_BUTTON_TITLE");
        String string4 = M2().getString("EXTRA_NO_BUTTON_TITLE");
        int i10 = M2().getInt("EXTRA_TOP_IMAGE_RESOURCE_ID");
        if (string != null) {
            D3().H.setText(m3.b.a(string, 0));
        }
        if (string2 != null) {
            D3().B.setText(string2);
        }
        D3().D.setTitle(string4);
        D3().E.setTitle(string3);
        D3().I.setImageResource(i10);
        RoundedButtonView roundedButtonView = D3().D;
        p.g(roundedButtonView, "binding.optionButton1");
        g1.a(roundedButtonView, new c());
        RoundedButtonView roundedButtonView2 = D3().E;
        p.g(roundedButtonView2, "binding.optionButton2");
        g1.a(roundedButtonView2, new d());
        Dialog dialog = new Dialog(N2(), 16973835);
        dialog.requestWindowFeature(1);
        dialog.setContentView(D3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-2, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(c2.f34739b);
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }
}
