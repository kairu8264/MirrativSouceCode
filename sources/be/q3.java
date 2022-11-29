package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
public final class q3 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public static final String[] Q0 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public b N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final String[] a() {
            return q3.Q0;
        }

        public final boolean b(Context context) {
            jo.p.h(context, "context");
            String[] a10 = a();
            int length = a10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    return true;
                }
                if (!(c3.a.a(context, a10[i10]) == 0)) {
                    return false;
                }
                i10++;
            }
        }

        public final q3 c() {
            return new q3();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void E1();
    }

    public q3() {
        super(nd.b1.dialog_fragment_runtime_permission_setting);
    }

    public static final void D3(q3 q3Var, View view) {
        jo.p.h(q3Var, "this$0");
        b bVar = q3Var.N0;
        if (bVar != null) {
            bVar.E1();
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
        ae.i4.T(view).D.setOnClickListener(new View.OnClickListener() { // from class: be.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q3.D3(q3.this, view2);
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
