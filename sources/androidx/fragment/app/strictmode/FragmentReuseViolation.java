package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: x  reason: collision with root package name */
    public final String f15383x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        p.h(fragment, "fragment");
        p.h(str, "previousFragmentId");
        this.f15383x = str;
    }
}
