package s8;

import android.content.Context;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import s8.a;
import xn.t;

/* loaded from: classes.dex */
public final class d implements s8.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f52322d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f52323e = 8;

    /* renamed from: b  reason: collision with root package name */
    public final a.b f52324b;

    /* renamed from: c  reason: collision with root package name */
    public final List<v8.a> f52325c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(Context context, List<GroupShotItem> list) {
            p.h(context, "context");
            p.h(list, "groupShots");
            ArrayList arrayList = new ArrayList(t.u(list, 10));
            for (GroupShotItem groupShotItem : list) {
                arrayList.add(v8.a.H.a(context, groupShotItem));
            }
            return new d(null, arrayList, 1, null);
        }
    }

    public d(a.b bVar, List<v8.a> list) {
        p.h(bVar, "type");
        p.h(list, "bindModels");
        this.f52324b = bVar;
        this.f52325c = list;
    }

    public final List<v8.a> a() {
        return this.f52325c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return getType() == dVar.getType() && p.c(this.f52325c, dVar.f52325c);
        }
        return false;
    }

    @Override // s8.a
    public a.b getType() {
        return this.f52324b;
    }

    public int hashCode() {
        return (getType().hashCode() * 31) + this.f52325c.hashCode();
    }

    public String toString() {
        return "CatalogGroupShotListBindModel(type=" + getType() + ", bindModels=" + this.f52325c + ')';
    }

    public /* synthetic */ d(a.b bVar, List list, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.b.GROUP_SHOT : bVar, list);
    }
}
