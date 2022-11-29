package ai;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class jg {

    /* renamed from: a  reason: collision with root package name */
    public final String f5772a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5773b;

    public jg(String str, boolean z10) {
        this.f5772a = str;
        this.f5773b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == jg.class) {
            jg jgVar = (jg) obj;
            if (TextUtils.equals(this.f5772a, jgVar.f5772a) && this.f5773b == jgVar.f5773b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5772a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f5773b ? 1237 : 1231);
    }
}
