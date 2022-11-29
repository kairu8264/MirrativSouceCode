package z1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62428a = new a();

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        jo.p.h(charSequence, "text");
        jo.p.h(textPaint, "paint");
        jo.p.h(metrics, "metrics");
        jo.p.h(alignment, "alignment");
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (truncateAt == null) {
                    return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10);
                }
                return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        jo.p.h(charSequence, "text");
        jo.p.h(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
