package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        p.h(fragment, "fragment");
    }
}
