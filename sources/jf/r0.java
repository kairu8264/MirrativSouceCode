package jf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r0 implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public int f37976w;

    /* renamed from: x  reason: collision with root package name */
    public final int f37977x;

    /* renamed from: y  reason: collision with root package name */
    public int f37978y;

    public r0(int i10, int i11, int i12) {
        this.f37976w = i10;
        this.f37977x = i11;
        this.f37978y = i12;
    }

    public final int a() {
        return this.f37978y;
    }

    public final int b() {
        return this.f37976w;
    }

    public final int c() {
        return this.f37977x;
    }

    public final void d(int i10) {
        this.f37978y = i10;
    }

    public final void e(int i10) {
        this.f37976w = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return this.f37976w == r0Var.f37976w && this.f37977x == r0Var.f37977x && this.f37978y == r0Var.f37978y;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f37976w) * 31) + Integer.hashCode(this.f37977x)) * 31) + Integer.hashCode(this.f37978y);
    }

    public String toString() {
        return "SpeedInfo(speed=" + this.f37976w + ", startTime=" + this.f37977x + ", endTime=" + this.f37978y + ')';
    }
}
