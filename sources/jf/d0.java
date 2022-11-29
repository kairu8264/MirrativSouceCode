package jf;

import com.dena.mirrorman.net.api.response.App;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<App.AppParams> f37914a = new ArrayList();

    public final void a(App.AppParams appParams) {
        jo.p.h(appParams, "app");
        this.f37914a.add(appParams);
    }

    public final void b(List<App.AppParams> list) {
        jo.p.h(list, "newApps");
        List o02 = xn.a0.o0(list, this.f37914a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : o02) {
            if (hashSet.add(((App.AppParams) obj).getAppId())) {
                arrayList.add(obj);
            }
        }
        this.f37914a.clear();
        this.f37914a.addAll(arrayList);
    }

    public final void c(String str) {
        jo.p.h(str, "appId");
        if (jo.p.c(str, "")) {
            return;
        }
        List<App.AppParams> list = this.f37914a;
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (App.AppParams appParams : list) {
            arrayList.add(appParams.getAppId());
        }
        int indexOf = arrayList.indexOf(str);
        if (indexOf < 0) {
            return;
        }
        this.f37914a.remove(indexOf);
    }

    public final void d() {
        this.f37914a.clear();
    }

    public final App.AppParams e(String str) {
        Object obj;
        jo.p.h(str, "appId");
        Iterator<T> it = this.f37914a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((App.AppParams) obj).getAppId(), str)) {
                break;
            }
        }
        return (App.AppParams) obj;
    }
}
