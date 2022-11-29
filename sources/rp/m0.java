package rp;

/* loaded from: classes4.dex */
public final class m0 {
    public static final byte[] a(String str) {
        jo.p.h(str, "<this>");
        byte[] bytes = str.getBytes(so.c.f52772b);
        jo.p.g(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        return new String(bArr, so.c.f52772b);
    }
}
