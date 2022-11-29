package e2;

import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public final class q {
    public static final ExtractedText a(a0 a0Var) {
        jo.p.h(a0Var, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a0Var.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a0Var.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = y1.b0.l(a0Var.g());
        extractedText.selectionEnd = y1.b0.k(a0Var.g());
        extractedText.flags = !so.o.G(a0Var.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
