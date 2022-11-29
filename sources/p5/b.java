package p5;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45792a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45793b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45794c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45795d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f45792a = z10;
        this.f45793b = z11;
        this.f45794c = z12;
        this.f45795d = z13;
    }

    public boolean a() {
        return this.f45792a;
    }

    public boolean b() {
        return this.f45794c;
    }

    public boolean c() {
        return this.f45795d;
    }

    public boolean d() {
        return this.f45793b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f45792a == bVar.f45792a && this.f45793b == bVar.f45793b && this.f45794c == bVar.f45794c && this.f45795d == bVar.f45795d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f45792a;
        int i10 = r02;
        if (this.f45793b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f45794c) {
            i11 = i10 + 256;
        }
        return this.f45795d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f45792a), Boolean.valueOf(this.f45793b), Boolean.valueOf(this.f45794c), Boolean.valueOf(this.f45795d));
    }
}
