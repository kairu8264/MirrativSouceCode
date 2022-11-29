package mc;

import com.dena.mirrorman.net.api.response.live.LiveWatchedUsersResponse;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import java.util.ArrayList;
import java.util.List;
import mc.n;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40850e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f40851f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f40852a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40853b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40854c;

    /* renamed from: d  reason: collision with root package name */
    public final int f40855d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(LiveWatchedUsersResponse liveWatchedUsersResponse) {
            jo.p.h(liveWatchedUsersResponse, "response");
            List<UserBasicWithGraphParams> users = liveWatchedUsersResponse.getUsers();
            ArrayList arrayList = new ArrayList(xn.t.u(users, 10));
            for (UserBasicWithGraphParams userBasicWithGraphParams : users) {
                arrayList.add(n.a.b(n.M, userBasicWithGraphParams, false, 2, null));
            }
            return new y(arrayList, false, liveWatchedUsersResponse.getCurrentPage(), liveWatchedUsersResponse.getNextPage(), 2, null);
        }
    }

    public y() {
        this(null, false, 0, 0, 15, null);
    }

    public y(List<n> list, boolean z10, int i10, int i11) {
        jo.p.h(list, "users");
        this.f40852a = list;
        this.f40853b = z10;
        this.f40854c = i10;
        this.f40855d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y b(y yVar, List list, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = yVar.f40852a;
        }
        if ((i12 & 2) != 0) {
            z10 = yVar.f40853b;
        }
        if ((i12 & 4) != 0) {
            i10 = yVar.f40854c;
        }
        if ((i12 & 8) != 0) {
            i11 = yVar.f40855d;
        }
        return yVar.a(list, z10, i10, i11);
    }

    public final y a(List<n> list, boolean z10, int i10, int i11) {
        jo.p.h(list, "users");
        return new y(list, z10, i10, i11);
    }

    public final int c() {
        return this.f40854c;
    }

    public final boolean d() {
        return this.f40853b;
    }

    public final int e() {
        return this.f40855d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return jo.p.c(this.f40852a, yVar.f40852a) && this.f40853b == yVar.f40853b && this.f40854c == yVar.f40854c && this.f40855d == yVar.f40855d;
        }
        return false;
    }

    public final List<n> f() {
        return this.f40852a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f40852a.hashCode() * 31;
        boolean z10 = this.f40853b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + Integer.hashCode(this.f40854c)) * 31) + Integer.hashCode(this.f40855d);
    }

    public String toString() {
        return "LiveWatchedUsersInfo(users=" + this.f40852a + ", doneFollowedAllUsers=" + this.f40853b + ", currentPage=" + this.f40854c + ", nextPage=" + this.f40855d + ')';
    }

    public /* synthetic */ y(List list, boolean z10, int i10, int i11, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? xn.s.k() : list, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
