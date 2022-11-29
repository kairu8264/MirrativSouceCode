package f3;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f31712e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f31713a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31714b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31715c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31716d;

    public b(int i10, int i11, int i12, int i13) {
        this.f31713a = i10;
        this.f31714b = i11;
        this.f31715c = i12;
        this.f31716d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f31713a, bVar2.f31713a), Math.max(bVar.f31714b, bVar2.f31714b), Math.max(bVar.f31715c, bVar2.f31715c), Math.max(bVar.f31716d, bVar2.f31716d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f31712e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f31713a, this.f31714b, this.f31715c, this.f31716d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31716d == bVar.f31716d && this.f31713a == bVar.f31713a && this.f31715c == bVar.f31715c && this.f31714b == bVar.f31714b;
    }

    public int hashCode() {
        return (((((this.f31713a * 31) + this.f31714b) * 31) + this.f31715c) * 31) + this.f31716d;
    }

    public String toString() {
        return "Insets{left=" + this.f31713a + ", top=" + this.f31714b + ", right=" + this.f31715c + ", bottom=" + this.f31716d + '}';
    }
}
