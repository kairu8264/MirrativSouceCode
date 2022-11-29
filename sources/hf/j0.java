package hf;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public int f35554a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f35555b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Integer> f35556c = new LinkedHashSet();

    public final boolean a() {
        return this.f35555b > this.f35554a;
    }

    public final int b() {
        return this.f35554a;
    }

    public final void c() {
        this.f35555b = 1;
        this.f35554a = 1;
        this.f35556c.clear();
    }

    public final boolean d(int i10) {
        return this.f35556c.contains(Integer.valueOf(i10));
    }

    public final void e(int i10, boolean z10) {
        if (z10) {
            this.f35556c.add(Integer.valueOf(i10));
        } else {
            this.f35556c.remove(Integer.valueOf(i10));
        }
    }

    public final void f(int i10, int i11) {
        this.f35555b = i10;
        this.f35554a = i11;
    }
}
