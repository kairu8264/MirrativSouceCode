package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final int f15670a;

    public a(int i10) {
        this.f15670a = i10;
    }

    @Override // androidx.navigation.p
    public int a() {
        return this.f15670a;
    }

    @Override // androidx.navigation.p
    public Bundle b() {
        return new Bundle();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && a() == ((a) obj).a();
    }

    public int hashCode() {
        return 31 + a();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + a() + ")";
    }
}
