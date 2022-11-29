package ai;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class j93 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5667a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5668b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5669c;

    public j93(String str, boolean z10, boolean z11) {
        this.f5667a = str;
        this.f5668b = z10;
        this.f5669c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == j93.class) {
            j93 j93Var = (j93) obj;
            if (TextUtils.equals(this.f5667a, j93Var.f5667a) && this.f5668b == j93Var.f5668b && this.f5669c == j93Var.f5669c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5667a.hashCode() + 31) * 31) + (true != this.f5668b ? 1237 : 1231)) * 31) + (true == this.f5669c ? 1231 : 1237);
    }
}
