package gc;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f32881a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32882b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32883c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32884d;

    public c(a aVar, int i10, int i11, int i12) {
        jo.p.h(aVar, "type");
        this.f32881a = aVar;
        this.f32882b = i10;
        this.f32883c = i11;
        this.f32884d = i12;
    }

    public final int a() {
        return this.f32882b;
    }

    public final int b() {
        return this.f32883c;
    }

    public final int c() {
        return this.f32884d;
    }

    public final a d() {
        return this.f32881a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f32881a == cVar.f32881a && this.f32882b == cVar.f32882b && this.f32883c == cVar.f32883c && this.f32884d == cVar.f32884d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f32881a.hashCode() * 31) + Integer.hashCode(this.f32882b)) * 31) + Integer.hashCode(this.f32883c)) * 31) + Integer.hashCode(this.f32884d);
    }

    public String toString() {
        return "FloatSettingData(type=" + this.f32881a + ", id=" + this.f32882b + ", imageRes=" + this.f32883c + ", textRes=" + this.f32884d + ')';
    }
}
