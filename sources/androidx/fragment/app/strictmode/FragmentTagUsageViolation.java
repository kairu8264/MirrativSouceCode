package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: x  reason: collision with root package name */
    public final ViewGroup f15384x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        p.h(fragment, "fragment");
        this.f15384x = viewGroup;
    }
}
