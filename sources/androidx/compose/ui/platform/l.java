package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;

/* loaded from: classes.dex */
public final class l implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f14494a;

    public l(ClipboardManager clipboardManager) {
        jo.p.h(clipboardManager, "clipboardManager");
        this.f14494a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.m0
    public y1.a a() {
        ClipData primaryClip = this.f14494a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return m.a(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.m0
    public void b(y1.a aVar) {
        jo.p.h(aVar, "annotatedString");
        this.f14494a.setPrimaryClip(ClipData.newPlainText("plain text", m.b(aVar)));
    }

    public final boolean c() {
        ClipDescription primaryClipDescription = this.f14494a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            jo.p.h(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            java.util.Objects.requireNonNull(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.l.<init>(android.content.Context):void");
    }
}
