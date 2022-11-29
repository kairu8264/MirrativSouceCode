package ai;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class da {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f3187a = new SparseBooleanArray();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3188b;

    public final da a(int i10) {
        u9.d(!this.f3188b);
        this.f3187a.append(i10, true);
        return this;
    }

    public final fa b() {
        u9.d(!this.f3188b);
        this.f3188b = true;
        return new fa(this.f3187a, null);
    }
}
