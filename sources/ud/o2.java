package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class o2 implements ud.a {
    public static final a E = new a(null);
    public final int A;
    public final int B;
    public final int C;
    public final a.EnumC0862a D;

    /* renamed from: w  reason: collision with root package name */
    public final String f55285w;

    /* renamed from: x  reason: collision with root package name */
    public final Integer f55286x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f55287y;

    /* renamed from: z  reason: collision with root package name */
    public final int f55288z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ o2 b(a aVar, String str, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                num = Integer.valueOf(nd.y0.no_contents_mirrabit);
            }
            return aVar.a(str, num, (i14 & 4) != 0 ? 0 : i10, (i14 & 8) != 0 ? 0 : i11, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0 : i13);
        }

        public final o2 a(String str, Integer num, int i10, int i11, int i12, int i13) {
            jo.p.h(str, "message");
            return new o2(str, num, true, i10, i11, i12, i13, null, 128, null);
        }
    }

    public o2(String str, Integer num, boolean z10, int i10, int i11, int i12, int i13, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "message");
        jo.p.h(enumC0862a, "type");
        this.f55285w = str;
        this.f55286x = num;
        this.f55287y = z10;
        this.f55288z = i10;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = enumC0862a;
    }

    public final Integer a() {
        return this.f55286x;
    }

    public final String b() {
        return this.f55285w;
    }

    public final int c() {
        return this.A;
    }

    public final int d() {
        return this.C;
    }

    public final int e() {
        return this.B;
    }

    public final int f() {
        return this.f55288z;
    }

    public final boolean g() {
        return this.f55287y;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.D;
    }

    public /* synthetic */ o2(String str, Integer num, boolean z10, int i10, int i11, int i12, int i13, a.EnumC0862a enumC0862a, int i14, jo.h hVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : num, z10, i10, i11, i12, i13, (i14 & 128) != 0 ? a.EnumC0862a.NO_CONTENTS : enumC0862a);
    }
}
