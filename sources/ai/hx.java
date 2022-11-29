package ai;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hx {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<gx<?>> f5018a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Collection<gx<String>> f5019b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Collection<gx<String>> f5020c = new ArrayList();

    public final void a(gx gxVar) {
        this.f5018a.add(gxVar);
    }

    public final void b(gx<String> gxVar) {
        this.f5019b.add(gxVar);
    }

    public final void c(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (gx<?> gxVar : this.f5018a) {
            if (gxVar.m() == 1) {
                gxVar.b(editor, gxVar.c(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            uj0.c("Flag Json is null.");
        }
    }

    public final List<String> d() {
        ArrayList arrayList = new ArrayList();
        for (gx<String> gxVar : this.f5019b) {
            String str = (String) ft.c().c(gxVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(px.a());
        return arrayList;
    }

    public final List<String> e() {
        List<String> d10 = d();
        for (gx<String> gxVar : this.f5020c) {
            String str = (String) ft.c().c(gxVar);
            if (!TextUtils.isEmpty(str)) {
                d10.add(str);
            }
        }
        d10.addAll(px.b());
        return d10;
    }
}
