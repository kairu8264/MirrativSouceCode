package ab;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class h extends androidx.fragment.app.e {
    public static final a N0 = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a() {
            return new h();
        }
    }

    public static final void C3(DialogInterface dialogInterface, int i10) {
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(N2());
        builder.setMessage(wa.j.f58547d);
        builder.setCancelable(true);
        builder.setPositiveButton(wa.j.f58558z, g.f782w);
        AlertDialog create = builder.create();
        jo.p.g(create, "alertDialogBuilder.create()");
        return create;
    }
}
