package ud;

import com.dena.mirrorman.net.api.response.GroupShotBackground;
import ud.h1;

/* loaded from: classes2.dex */
public final class k1 implements h1 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55084e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55085a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55086b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55087c;

    /* renamed from: d  reason: collision with root package name */
    public final h1.a f55088d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ k1 b(a aVar, GroupShotBackground groupShotBackground, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(groupShotBackground, z10);
        }

        public final k1 a(GroupShotBackground groupShotBackground, boolean z10) {
            jo.p.h(groupShotBackground, "background");
            return new k1(groupShotBackground.getImageUrl(), groupShotBackground.getIconUrl(), z10, null, 8, null);
        }
    }

    public k1(String str, String str2, boolean z10, h1.a aVar) {
        jo.p.h(str, "backgroundImageUrl");
        jo.p.h(str2, "iconUrl");
        jo.p.h(aVar, "type");
        this.f55085a = str;
        this.f55086b = str2;
        this.f55087c = z10;
        this.f55088d = aVar;
    }

    public final String a() {
        return this.f55085a;
    }

    public final String b() {
        return this.f55086b;
    }

    public final boolean c() {
        return this.f55087c;
    }

    @Override // ud.h1
    public h1.a getType() {
        return this.f55088d;
    }

    public /* synthetic */ k1(String str, String str2, boolean z10, h1.a aVar, int i10, jo.h hVar) {
        this(str, str2, z10, (i10 & 8) != 0 ? h1.a.IMAGE : aVar);
    }
}
