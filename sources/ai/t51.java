package ai;

/* loaded from: classes3.dex */
public final class t51 {

    /* renamed from: e  reason: collision with root package name */
    public static final t51 f10147e = new t51(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f10148a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10149b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10150c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10151d;

    public t51(int i10, int i11, int i12) {
        this.f10148a = i10;
        this.f10149b = i11;
        this.f10150c = i12;
        this.f10151d = sb.p(i12) ? sb.s(i12, i11) : -1;
    }

    public final String toString() {
        int i10 = this.f10148a;
        int i11 = this.f10149b;
        int i12 = this.f10150c;
        StringBuilder sb2 = new StringBuilder(83);
        sb2.append("AudioFormat[sampleRate=");
        sb2.append(i10);
        sb2.append(", channelCount=");
        sb2.append(i11);
        sb2.append(", encoding=");
        sb2.append(i12);
        sb2.append(']');
        return sb2.toString();
    }
}
