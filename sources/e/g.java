package e;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class g extends androidx.fragment.app.e {
    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new f(q0(), q3());
    }

    @Override // androidx.fragment.app.e
    public void y3(Dialog dialog, int i10) {
        if (dialog instanceof f) {
            f fVar = (f) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            fVar.d(1);
            return;
        }
        super.y3(dialog, i10);
    }
}
