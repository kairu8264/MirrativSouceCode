package ak;

/* loaded from: classes3.dex */
public final class v0 extends t3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f13685a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13686b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13687c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13688d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13689e;

    public v0(int i10, String str, long j10, long j11, int i11) {
        this.f13685a = i10;
        this.f13686b = str;
        this.f13687c = j10;
        this.f13688d = j11;
        this.f13689e = i11;
    }

    @Override // ak.t3
    public final int a() {
        return this.f13685a;
    }

    @Override // ak.t3
    public final int b() {
        return this.f13689e;
    }

    @Override // ak.t3
    public final long c() {
        return this.f13687c;
    }

    @Override // ak.t3
    public final long d() {
        return this.f13688d;
    }

    @Override // ak.t3
    public final String e() {
        return this.f13686b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.f13685a == t3Var.a() && ((str = this.f13686b) != null ? str.equals(t3Var.e()) : t3Var.e() == null) && this.f13687c == t3Var.c() && this.f13688d == t3Var.d() && this.f13689e == t3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f13685a ^ 1000003) * 1000003;
        String str = this.f13686b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f13687c;
        long j11 = this.f13688d;
        return ((((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13689e;
    }

    public final String toString() {
        int i10 = this.f13685a;
        String str = this.f13686b;
        long j10 = this.f13687c;
        long j11 = this.f13688d;
        int i11 = this.f13689e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 157);
        sb2.append("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(i10);
        sb2.append(", filePath=");
        sb2.append(str);
        sb2.append(", fileOffset=");
        sb2.append(j10);
        sb2.append(", remainingBytes=");
        sb2.append(j11);
        sb2.append(", previousChunk=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
