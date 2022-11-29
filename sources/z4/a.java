package z4;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: w  reason: collision with root package name */
    public final String f62503w;

    /* renamed from: x  reason: collision with root package name */
    public final Object[] f62504x;

    public a(String str, Object[] objArr) {
        this.f62503w = str;
        this.f62504x = objArr;
    }

    public static void b(i iVar, int i10, Object obj) {
        if (obj == null) {
            iVar.y1(i10);
        } else if (obj instanceof byte[]) {
            iVar.l1(i10, (byte[]) obj);
        } else if (obj instanceof Float) {
            iVar.J(i10, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            iVar.J(i10, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            iVar.g1(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            iVar.g1(i10, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            iVar.g1(i10, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            iVar.g1(i10, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            iVar.S0(i10, (String) obj);
        } else if (obj instanceof Boolean) {
            iVar.g1(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void d(i iVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            b(iVar, i10, obj);
        }
    }

    @Override // z4.j
    public String a() {
        return this.f62503w;
    }

    @Override // z4.j
    public void c(i iVar) {
        d(iVar, this.f62504x);
    }

    public a(String str) {
        this(str, null);
    }
}
