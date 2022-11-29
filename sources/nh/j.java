package nh;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes3.dex */
public class j extends androidx.fragment.app.e {
    public Dialog N0;
    public DialogInterface.OnCancelListener O0;
    public Dialog P0;

    public static j B3(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        Dialog dialog2 = (Dialog) rh.p.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.N0 = dialog2;
        if (onCancelListener != null) {
            jVar.O0 = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.O0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = this.N0;
        if (dialog == null) {
            x3(false);
            if (this.P0 == null) {
                this.P0 = new AlertDialog.Builder((Context) rh.p.i(q0())).create();
            }
            return this.P0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e
    public void z3(FragmentManager fragmentManager, String str) {
        super.z3(fragmentManager, str);
    }
}
