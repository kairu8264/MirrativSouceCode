package ud;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleColor;

/* loaded from: classes2.dex */
public final class v implements o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f55585d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f55586e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f55587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55588b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f55589c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(ClosetAvatarSimpleColor closetAvatarSimpleColor, boolean z10) {
            jo.p.h(closetAvatarSimpleColor, "closetAvatarSimpleColor");
            return new v(closetAvatarSimpleColor.getId(), closetAvatarSimpleColor.getColor(), z10);
        }
    }

    public v(int i10, int i11, boolean z10) {
        this.f55587a = i10;
        this.f55588b = i11;
        this.f55589c = z10;
    }

    @Override // ud.o
    public void a(boolean z10) {
        this.f55589c = z10;
    }

    @Override // ud.o
    public int b() {
        return this.f55588b;
    }

    @Override // ud.o
    public boolean c() {
        return this.f55589c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return getId() == vVar.getId() && b() == vVar.b() && c() == vVar.c();
        }
        return false;
    }

    @Override // ud.o
    public int getId() {
        return this.f55587a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(getId()) * 31) + Integer.hashCode(b())) * 31;
        boolean c10 = c();
        ?? r12 = c10;
        if (c10) {
            r12 = 1;
        }
        return hashCode + r12;
    }

    public String toString() {
        return "ColorPickerBindModel(id=" + getId() + ", color=" + b() + ", selected=" + c() + ')';
    }
}
