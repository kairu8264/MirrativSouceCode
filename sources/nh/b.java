package nh;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class b extends DialogFragment {

    /* renamed from: w  reason: collision with root package name */
    public Dialog f43526w;

    /* renamed from: x  reason: collision with root package name */
    public DialogInterface.OnCancelListener f43527x;

    /* renamed from: y  reason: collision with root package name */
    public Dialog f43528y;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) rh.p.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f43526w = dialog2;
        if (onCancelListener != null) {
            bVar.f43527x = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f43527x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f43526w;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f43528y == null) {
                this.f43528y = new AlertDialog.Builder((Context) rh.p.i(getActivity())).create();
            }
            return this.f43528y;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
