package h2;

import android.text.style.TtsSpan;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import y1.f0;
import y1.g0;

/* loaded from: classes.dex */
public final class g {
    public static final TtsSpan a(f0 f0Var) {
        p.h(f0Var, "<this>");
        if (f0Var instanceof g0) {
            return b((g0) f0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(g0 g0Var) {
        p.h(g0Var, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(g0Var.a()).build();
        p.g(build, "builder.build()");
        return build;
    }
}
