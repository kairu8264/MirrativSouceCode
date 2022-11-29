package ai;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes3.dex */
public final class kp0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsResult f6302w;

    public kp0(JsResult jsResult) {
        this.f6302w = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f6302w.cancel();
    }
}
