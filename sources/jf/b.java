package jf;

import com.dena.mirrorman.net.fme.ChangeColorFlag;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Serializable {
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public int f37828w;

    /* renamed from: x  reason: collision with root package name */
    public int f37829x;

    /* renamed from: y  reason: collision with root package name */
    public final ChangeColorFlag f37830y;

    /* renamed from: z  reason: collision with root package name */
    public final String f37831z;

    public b(int i10, int i11, ChangeColorFlag changeColorFlag, String str, int i12) {
        jo.p.h(changeColorFlag, "changeColorFlag");
        jo.p.h(str, "character");
        this.f37828w = i10;
        this.f37829x = i11;
        this.f37830y = changeColorFlag;
        this.f37831z = str;
        this.A = i12;
    }

    public final ChangeColorFlag a() {
        return this.f37830y;
    }

    public final String b() {
        return this.f37831z;
    }

    public final int c() {
        return this.f37828w;
    }

    public final int d() {
        return this.f37829x;
    }

    public final int e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f37828w == bVar.f37828w && this.f37829x == bVar.f37829x && this.f37830y == bVar.f37830y && jo.p.c(this.f37831z, bVar.f37831z) && this.A == bVar.A;
        }
        return false;
    }

    public final boolean f() {
        return this.f37830y == ChangeColorFlag.NOT_CHANGE;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f37828w) * 31) + Integer.hashCode(this.f37829x)) * 31) + this.f37830y.hashCode()) * 31) + this.f37831z.hashCode()) * 31) + Integer.hashCode(this.A);
    }

    public String toString() {
        return this.f37828w + ", " + this.f37831z + '[' + this.A + ']';
    }
}
