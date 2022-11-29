package ai;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class pb0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ rb0 f8368w;

    public pb0(rb0 rb0Var) {
        this.f8368w = rb0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        Intent j10 = this.f8368w.j();
        wg.t.d();
        context = this.f8368w.f9386d;
        yg.d2.p(context, j10);
    }
}
