package ai;

/* loaded from: classes3.dex */
public final class rn0 extends d54 {

    /* renamed from: c  reason: collision with root package name */
    public static final rn0 f9507c = new rn0();

    @Override // ai.d54
    public final h54 b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new j54();
        }
        if ("mvhd".equals(str)) {
            return new k54();
        }
        return new l54(str);
    }
}
