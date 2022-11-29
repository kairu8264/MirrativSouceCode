package ai;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class qb0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ rb0 f8864w;

    public qb0(rb0 rb0Var) {
        this.f8864w = rb0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f8864w.b("Operation denied by user.");
    }
}
