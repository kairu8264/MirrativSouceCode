package ai;

/* loaded from: classes3.dex */
public final class vw2 extends uw2 {

    /* renamed from: a  reason: collision with root package name */
    public final char f11400a;

    public vw2(char c10) {
        this.f11400a = c10;
    }

    @Override // ai.yw2
    public final boolean a(char c10) {
        return c10 == this.f11400a;
    }

    public final String toString() {
        int i10 = this.f11400a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
