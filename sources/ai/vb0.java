package ai;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class vb0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ wb0 f11014w;

    public vb0(wb0 wb0Var) {
        this.f11014w = wb0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f11014w.b("User canceled the download.");
    }
}
