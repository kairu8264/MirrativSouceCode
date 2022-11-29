package z1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f62457a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final o f62458b;

    static {
        o pVar;
        if (Build.VERSION.SDK_INT >= 23) {
            pVar = new k();
        } else {
            pVar = new p();
        }
        f62458b = pVar;
    }

    public final StaticLayout a(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2) {
        jo.p.h(charSequence, "text");
        jo.p.h(textPaint, "paint");
        jo.p.h(textDirectionHeuristic, "textDir");
        jo.p.h(alignment, "alignment");
        return f62458b.a(new q(charSequence, i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, iArr, iArr2));
    }
}
