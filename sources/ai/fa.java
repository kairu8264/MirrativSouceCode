package ai;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class fa {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f3975a;

    public final int a() {
        return this.f3975a.size();
    }

    public final int b(int i10) {
        u9.c(i10, 0, this.f3975a.size());
        return this.f3975a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fa) {
            fa faVar = (fa) obj;
            if (sb.f9778a < 24) {
                if (this.f3975a.size() == faVar.f3975a.size()) {
                    for (int i10 = 0; i10 < this.f3975a.size(); i10++) {
                        if (b(i10) != faVar.b(i10)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.f3975a.equals(faVar.f3975a);
        }
        return false;
    }

    public final int hashCode() {
        if (sb.f9778a < 24) {
            int size = this.f3975a.size();
            for (int i10 = 0; i10 < this.f3975a.size(); i10++) {
                size = (size * 31) + b(i10);
            }
            return size;
        }
        return this.f3975a.hashCode();
    }
}
