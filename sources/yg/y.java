package yg;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class y implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ z f61998w;

    public y(z zVar) {
        this.f61998w = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        wg.t.d();
        d2.x(this.f61998w.f62002w, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
