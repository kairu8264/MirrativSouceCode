package ak;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class c0 implements u4 {

    /* renamed from: g  reason: collision with root package name */
    public static final dk.f f13318g = new dk.f("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    public static final Intent f13319h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final String f13320a;

    /* renamed from: b  reason: collision with root package name */
    public final t1 f13321b;

    /* renamed from: c  reason: collision with root package name */
    public final i3 f13322c;

    /* renamed from: d  reason: collision with root package name */
    public dk.r<dk.l0> f13323d;

    /* renamed from: e  reason: collision with root package name */
    public dk.r<dk.l0> f13324e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f13325f = new AtomicBoolean();

    public c0(Context context, t1 t1Var, i3 i3Var) {
        this.f13320a = context.getPackageName();
        this.f13321b = t1Var;
        this.f13322c = i3Var;
        if (dk.v.b(context)) {
            Context a10 = dk.t.a(context);
            dk.f fVar = f13318g;
            Intent intent = f13319h;
            v4 v4Var = v4.f13698a;
            this.f13323d = new dk.r<>(a10, fVar, "AssetPackService", intent, v4Var, null);
            this.f13324e = new dk.r<>(dk.t.a(context), fVar, "AssetPackService-keepAlive", intent, v4Var, null);
        }
        f13318g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle B(int i10, String str) {
        Bundle j10 = j(i10);
        j10.putString("module_name", str);
        return j10;
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11002);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static Bundle j(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    public static <T> jk.d<T> k() {
        f13318g.b("onError(%d)", -11);
        return jk.f.b(new AssetPackException(-11));
    }

    public static /* bridge */ /* synthetic */ Bundle m(int i10, String str, String str2, int i11) {
        Bundle B = B(i10, str);
        B.putString("slice_id", str2);
        B.putInt("chunk_number", i11);
        return B;
    }

    public static /* bridge */ /* synthetic */ Bundle p(Map map) {
        Bundle i10 = i();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        i10.putParcelableArrayList("installed_asset_module", arrayList);
        return i10;
    }

    public static /* bridge */ /* synthetic */ ArrayList x(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List y(c0 c0Var, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = e.c((Bundle) it.next(), c0Var.f13321b, c0Var.f13322c).a().values().iterator().next();
            if (next == null) {
                f13318g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (n0.a(next.d())) {
                arrayList.add(next.c());
            }
        }
        return arrayList;
    }

    @Override // ak.u4
    public final synchronized void a() {
        if (this.f13324e == null) {
            f13318g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        dk.f fVar = f13318g;
        fVar.d("keepAlive", new Object[0]);
        if (!this.f13325f.compareAndSet(false, true)) {
            fVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        jk.o<?> oVar = new jk.o<>();
        this.f13324e.q(new q(this, oVar, oVar), oVar);
    }

    @Override // ak.u4
    public final void b(int i10, String str) {
        l(i10, str, 10);
    }

    @Override // ak.u4
    public final jk.d<ParcelFileDescriptor> c(int i10, String str, String str2, int i11) {
        if (this.f13323d == null) {
            return k();
        }
        f13318g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new p(this, oVar, i10, str, str2, i11, oVar), oVar);
        return oVar.a();
    }

    @Override // ak.u4
    public final jk.d<e> d(List<String> list, List<String> list2, Map<String, Long> map) {
        if (this.f13323d == null) {
            return k();
        }
        f13318g.d("startDownload(%s)", list2);
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new i(this, oVar, list2, map, oVar, list), oVar);
        oVar.a().e(new jk.c() { // from class: ak.g
            @Override // jk.c
            public final void onSuccess(Object obj) {
                e eVar = (e) obj;
                c0.this.a();
            }
        });
        return oVar.a();
    }

    @Override // ak.u4
    public final jk.d<e> e(List<String> list, l0 l0Var, Map<String, Long> map) {
        if (this.f13323d == null) {
            return k();
        }
        f13318g.d("getPackStates(%s)", list);
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new l(this, oVar, list, map, oVar, l0Var), oVar);
        return oVar.a();
    }

    @Override // ak.u4
    public final void f(int i10, String str, String str2, int i11) {
        if (this.f13323d != null) {
            f13318g.d("notifyChunkTransferred", new Object[0]);
            jk.o<?> oVar = new jk.o<>();
            this.f13323d.q(new m(this, oVar, i10, str, str2, i11, oVar), oVar);
            return;
        }
        throw new p1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // ak.u4
    public final jk.d<List<String>> g(Map<String, Long> map) {
        if (this.f13323d == null) {
            return k();
        }
        f13318g.d("syncPacks", new Object[0]);
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new k(this, oVar, map, oVar), oVar);
        return oVar.a();
    }

    @Override // ak.u4
    public final void h(String str) {
        if (this.f13323d == null) {
            return;
        }
        f13318g.d("removePack(%s)", str);
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new h(this, oVar, str, oVar), oVar);
    }

    public final void l(int i10, String str, int i11) {
        if (this.f13323d != null) {
            f13318g.d("notifyModuleCompleted", new Object[0]);
            jk.o<?> oVar = new jk.o<>();
            this.f13323d.q(new n(this, oVar, i10, str, oVar, i11), oVar);
            return;
        }
        throw new p1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // ak.u4
    public final void q0(int i10) {
        if (this.f13323d != null) {
            f13318g.d("notifySessionFailed", new Object[0]);
            jk.o<?> oVar = new jk.o<>();
            this.f13323d.q(new o(this, oVar, i10, oVar), oVar);
            return;
        }
        throw new p1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // ak.u4
    public final void v0(List<String> list) {
        if (this.f13323d == null) {
            return;
        }
        f13318g.d("cancelDownloads(%s)", list);
        jk.o<?> oVar = new jk.o<>();
        this.f13323d.q(new j(this, oVar, list, oVar), oVar);
    }
}
