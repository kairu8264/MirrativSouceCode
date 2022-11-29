package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final Fragment f15386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        p.h(fragment, "fragment");
        this.f15386w = fragment;
    }

    public final Fragment a() {
        return this.f15386w;
    }
}
