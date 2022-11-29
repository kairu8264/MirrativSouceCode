package cl;

import cl.c0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f19995a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19996b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19997c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19998d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19999e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20000f;

    /* renamed from: g  reason: collision with root package name */
    public final int f20001g;

    /* renamed from: h  reason: collision with root package name */
    public final String f20002h;

    /* renamed from: i  reason: collision with root package name */
    public final String f20003i;

    public y(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f19995a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f19996b = str;
        this.f19997c = i11;
        this.f19998d = j10;
        this.f19999e = j11;
        this.f20000f = z10;
        this.f20001g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f20002h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f20003i = str3;
    }

    @Override // cl.c0.b
    public int a() {
        return this.f19995a;
    }

    @Override // cl.c0.b
    public int b() {
        return this.f19997c;
    }

    @Override // cl.c0.b
    public long d() {
        return this.f19999e;
    }

    @Override // cl.c0.b
    public boolean e() {
        return this.f20000f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.b) {
            c0.b bVar = (c0.b) obj;
            return this.f19995a == bVar.a() && this.f19996b.equals(bVar.g()) && this.f19997c == bVar.b() && this.f19998d == bVar.j() && this.f19999e == bVar.d() && this.f20000f == bVar.e() && this.f20001g == bVar.i() && this.f20002h.equals(bVar.f()) && this.f20003i.equals(bVar.h());
        }
        return false;
    }

    @Override // cl.c0.b
    public String f() {
        return this.f20002h;
    }

    @Override // cl.c0.b
    public String g() {
        return this.f19996b;
    }

    @Override // cl.c0.b
    public String h() {
        return this.f20003i;
    }

    public int hashCode() {
        long j10 = this.f19998d;
        long j11 = this.f19999e;
        return ((((((((((((((((this.f19995a ^ 1000003) * 1000003) ^ this.f19996b.hashCode()) * 1000003) ^ this.f19997c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f20000f ? 1231 : 1237)) * 1000003) ^ this.f20001g) * 1000003) ^ this.f20002h.hashCode()) * 1000003) ^ this.f20003i.hashCode();
    }

    @Override // cl.c0.b
    public int i() {
        return this.f20001g;
    }

    @Override // cl.c0.b
    public long j() {
        return this.f19998d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f19995a + ", model=" + this.f19996b + ", availableProcessors=" + this.f19997c + ", totalRam=" + this.f19998d + ", diskSpace=" + this.f19999e + ", isEmulator=" + this.f20000f + ", state=" + this.f20001g + ", manufacturer=" + this.f20002h + ", modelClass=" + this.f20003i + "}";
    }
}
