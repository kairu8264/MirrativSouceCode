package ai;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes3.dex */
public final class np0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f7431w;

    public np0(JsPromptResult jsPromptResult) {
        this.f7431w = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f7431w.cancel();
    }
}
