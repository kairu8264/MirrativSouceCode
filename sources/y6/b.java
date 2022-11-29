package y6;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f61247a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61248b;

    /* renamed from: c  reason: collision with root package name */
    public final float f61249c;

    /* renamed from: d  reason: collision with root package name */
    public final a f61250d;

    /* renamed from: e  reason: collision with root package name */
    public final int f61251e;

    /* renamed from: f  reason: collision with root package name */
    public final float f61252f;

    /* renamed from: g  reason: collision with root package name */
    public final float f61253g;

    /* renamed from: h  reason: collision with root package name */
    public final int f61254h;

    /* renamed from: i  reason: collision with root package name */
    public final int f61255i;

    /* renamed from: j  reason: collision with root package name */
    public final float f61256j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f61257k;

    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        this.f61247a = str;
        this.f61248b = str2;
        this.f61249c = f10;
        this.f61250d = aVar;
        this.f61251e = i10;
        this.f61252f = f11;
        this.f61253g = f12;
        this.f61254h = i11;
        this.f61255i = i12;
        this.f61256j = f13;
        this.f61257k = z10;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f61247a.hashCode() * 31) + this.f61248b.hashCode()) * 31) + this.f61249c)) * 31) + this.f61250d.ordinal()) * 31) + this.f61251e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f61252f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f61254h;
    }
}
