package ud;

import android.content.Context;
import java.util.List;
import ud.j3;

/* loaded from: classes2.dex */
public final class k3 implements j3 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f55090h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f55091i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j3.a f55092a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55093b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55094c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55095d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55096e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55097f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f55098g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k3 a(Context context, boolean z10, List<String> list, String str) {
            String string;
            jo.p.h(context, "context");
            jo.p.h(list, "streamerIconUrls");
            jo.p.h(str, "streamerNumText");
            if (list.isEmpty()) {
                string = context.getString(sb.c.text_shooter_matching_accept_matching_disabled);
            } else {
                string = context.getString(sb.c.text_shooter_matching_accept_matching_streamers, str);
            }
            String str2 = string;
            jo.p.g(str2, "if (streamerIconUrls.isE…merNumText)\n            }");
            return new k3(null, str2, !list.isEmpty(), !z10, z10, !list.isEmpty(), list, 1, null);
        }
    }

    public k3(j3.a aVar, String str, boolean z10, boolean z11, boolean z12, boolean z13, List<String> list) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "acceptMatchingStreamersText");
        jo.p.h(list, "streamerIconUrls");
        this.f55092a = aVar;
        this.f55093b = str;
        this.f55094c = z10;
        this.f55095d = z11;
        this.f55096e = z12;
        this.f55097f = z13;
        this.f55098g = list;
    }

    public final String a() {
        return this.f55093b;
    }

    public final List<String> b() {
        return this.f55098g;
    }

    public final boolean c() {
        return this.f55094c;
    }

    public final boolean d() {
        return this.f55097f;
    }

    public final boolean e() {
        return this.f55096e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k3) {
            k3 k3Var = (k3) obj;
            return getType() == k3Var.getType() && jo.p.c(this.f55093b, k3Var.f55093b) && this.f55094c == k3Var.f55094c && this.f55095d == k3Var.f55095d && this.f55096e == k3Var.f55096e && this.f55097f == k3Var.f55097f && jo.p.c(this.f55098g, k3Var.f55098g);
        }
        return false;
    }

    public final boolean f() {
        return this.f55095d;
    }

    @Override // ud.j3
    public j3.a getType() {
        return this.f55092a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((getType().hashCode() * 31) + this.f55093b.hashCode()) * 31;
        boolean z10 = this.f55094c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55095d;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55096e;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f55097f;
        return ((i15 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + this.f55098g.hashCode();
    }

    public String toString() {
        return "ShooterCandidateMatchingBindModel(type=" + getType() + ", acceptMatchingStreamersText=" + this.f55093b + ", isEnabledAcceptMatchingButton=" + this.f55094c + ", isVisibleRequestMatchingButton=" + this.f55095d + ", isVisibleCancelMatchingButton=" + this.f55096e + ", isVisibleAcceptMatchingStreamersView=" + this.f55097f + ", streamerIconUrls=" + this.f55098g + ')';
    }

    public /* synthetic */ k3(j3.a aVar, String str, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? j3.a.MATCHING : aVar, str, z10, z11, z12, z13, list);
    }
}
