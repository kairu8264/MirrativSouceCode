package ai;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class op0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f7874w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ EditText f7875x;

    public op0(JsPromptResult jsPromptResult, EditText editText) {
        this.f7874w = jsPromptResult;
        this.f7875x = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f7874w.confirm(this.f7875x.getText().toString());
    }
}
