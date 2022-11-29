package ai;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
public final class lp0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsResult f6639w;

    public lp0(JsResult jsResult) {
        this.f6639w = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f6639w.confirm();
    }
}
