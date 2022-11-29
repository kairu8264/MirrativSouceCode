package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes.dex */
public final class SetUserVisibleHintViolation extends Violation {

    /* renamed from: x  reason: collision with root package name */
    public final boolean f15385x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        p.h(fragment, "fragment");
        this.f15385x = z10;
    }
}
