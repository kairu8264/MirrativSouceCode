package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class m3 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public static final String Q0 = m3.class.getSimpleName();
    public b N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final String a() {
            return m3.Q0;
        }

        public final boolean b(Context context) {
            jo.p.h(context, "context");
            if (Build.VERSION.SDK_INT >= 27) {
                return Settings.canDrawOverlays(context);
            }
            if (Settings.canDrawOverlays(context)) {
                return true;
            }
            try {
                Object systemService = context.getSystemService("window");
                jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) systemService;
                View view = new View(context);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 2038, 24, -2);
                view.setLayoutParams(layoutParams);
                windowManager.addView(view, layoutParams);
                windowManager.removeView(view);
                return true;
            } catch (Exception e10) {
                g9.a.c(e10);
                return false;
            }
        }

        public final m3 c() {
            return new m3();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void Q1();
    }

    public m3() {
        super(nd.b1.dialog_fragment_overlay_permission_setting);
    }

    public static final void D3(m3 m3Var, View view) {
        jo.p.h(m3Var, "this$0");
        b bVar = m3Var.N0;
        if (bVar != null) {
            bVar.Q1();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.w3.T(view).D.setOnClickListener(new View.OnClickListener() { // from class: be.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m3.D3(m3.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof b ? (b) context : null;
    }
}
