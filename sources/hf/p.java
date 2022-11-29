package hf;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35585b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35586c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kf.g f35587a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends en.a<List<? extends String>> {
    }

    /* loaded from: classes2.dex */
    public static final class c extends en.a<List<? extends String>> {
    }

    public p(kf.g gVar) {
        jo.p.h(gVar, "emokaraPreference");
        this.f35587a = gVar;
    }

    public final void a(String str) {
        jo.p.h(str, "searchHistory");
        ArrayList<String> d10 = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d10) {
            if (!jo.p.c((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        List<String> D0 = xn.a0.D0(arrayList);
        D0.add(str);
        if (D0.size() > 5) {
            D0.remove(0);
        }
        e(D0);
    }

    public final void b(String str) {
        jo.p.h(str, "searchHistory");
        ArrayList<String> d10 = d();
        if (d10.contains(str)) {
            d10.remove(str);
        }
        e(d10);
    }

    public final List<String> c() {
        return xn.a0.B0(d());
    }

    public final ArrayList<String> d() {
        if (this.f35587a.M0().length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = (ArrayList) new xm.e().j(this.f35587a.M0(), new b().getType());
        if (arrayList == null) {
            return new ArrayList<>();
        }
        jo.p.g(arrayList, "fromJson<ArrayList<Strin…typeToken) ?: ArrayList()");
        return arrayList;
    }

    public final void e(List<String> list) {
        Type type = new c().getType();
        kf.g gVar = this.f35587a;
        String t10 = new xm.e().t(list, type);
        jo.p.g(t10, "Gson().toJson(searchHistoryList, typeToken)");
        gVar.D4(t10);
    }
}
