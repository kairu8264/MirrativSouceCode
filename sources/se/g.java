package se;

import ae.x2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import java.io.Serializable;
import jo.p;
import nd.b1;
import nd.f1;
import nd.y0;

/* loaded from: classes2.dex */
public final class g extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public x2 N0;
    public b O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(l lVar) {
            p.h(lVar, "giftCodeType");
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_gift_code_type", lVar);
            gVar.V2(bundle);
            return gVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void B2();
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52680a;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.ITUNES.ordinal()] = 1;
            iArr[l.PLAY_STORE.ordinal()] = 2;
            f52680a = iArr;
        }
    }

    public static final void D3(g gVar, View view) {
        p.h(gVar, "this$0");
        gVar.m3();
    }

    public final x2 C3() {
        x2 x2Var = this.N0;
        if (x2Var != null) {
            return x2Var;
        }
        p.v("binding");
        return null;
    }

    public final void E3(x2 x2Var) {
        p.h(x2Var, "<set-?>");
        this.N0 = x2Var;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.O0 = null;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        b bVar = this.O0;
        if (bVar != null) {
            bVar.B2();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog r32 = super.r3(bundle);
        p.g(r32, "super.onCreateDialog(savedInstanceState)");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_gift_code_selection_approved, null, false);
        p.g(e10, "inflate(LayoutInflater.f…on_approved, null, false)");
        E3((x2) e10);
        C3().D.setOnClickListener(new View.OnClickListener() { // from class: se.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.D3(g.this, view);
            }
        });
        Serializable serializable = M2().getSerializable("extra_gift_code_type");
        p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.feature.passbook.orb.GiftCodeType");
        int i10 = c.f52680a[((l) serializable).ordinal()];
        if (i10 == 1) {
            C3().F.setImageResource(y0.itunes_gift_card_oblique);
            C3().B.setText(U0(f1.text_trademark_apple));
        } else if (i10 == 2) {
            C3().F.setImageResource(y0.play_store_gift_card_oblique);
            C3().B.setText(U0(f1.text_trademark_logo_google));
        }
        Window window = r32.getWindow();
        p.e(window);
        window.requestFeature(1);
        r32.setContentView(C3().u());
        Window window2 = r32.getWindow();
        p.e(window2);
        window2.setBackgroundDrawable(new ColorDrawable(0));
        Window window3 = r32.getWindow();
        p.e(window3);
        window3.setLayout(-1, -1);
        Window window4 = r32.getWindow();
        p.e(window4);
        window4.clearFlags(2);
        return r32;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.O0 = (b) context;
    }
}
