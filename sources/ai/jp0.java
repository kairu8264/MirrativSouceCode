package ai;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
public final class jp0 implements DialogInterface.OnCancelListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsResult f5879w;

    public jp0(JsResult jsResult) {
        this.f5879w = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5879w.cancel();
    }
}
