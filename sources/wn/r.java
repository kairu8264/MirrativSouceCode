package wn;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes4.dex */
public final class r implements Comparable<r> {

    /* renamed from: x  reason: collision with root package name */
    public static final a f59236x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final byte f59237w;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public /* synthetic */ r(byte b10) {
        this.f59237w = b10;
    }

    public static final /* synthetic */ r a(byte b10) {
        return new r(b10);
    }

    public static byte c(byte b10) {
        return b10;
    }

    public static boolean e(byte b10, Object obj) {
        return (obj instanceof r) && b10 == ((r) obj).l();
    }

    public static int h(byte b10) {
        return b10;
    }

    public static String i(byte b10) {
        return String.valueOf(b10 & TagConstant.TAG_CAT_RESERVED);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(r rVar) {
        return jo.p.j(l() & TagConstant.TAG_CAT_RESERVED, rVar.l() & TagConstant.TAG_CAT_RESERVED);
    }

    public boolean equals(Object obj) {
        return e(this.f59237w, obj);
    }

    public int hashCode() {
        return h(this.f59237w);
    }

    public final /* synthetic */ byte l() {
        return this.f59237w;
    }

    public String toString() {
        return i(this.f59237w);
    }
}
