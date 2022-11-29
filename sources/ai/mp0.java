package ai;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes3.dex */
public final class mp0 implements DialogInterface.OnCancelListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f6995w;

    public mp0(JsPromptResult jsPromptResult) {
        this.f6995w = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6995w.cancel();
    }
}
